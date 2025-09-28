package main

import "fmt"

// ==================== 仓储字典模块 ====================
// 安全提取货位  // 防崩溃的智能手套 🧤
// 缺省值填充  // 仓库猫的应急补给 🐱
// 下架问题商品  // 物流系统的截肢术 🪚
// 随机清理库存  // 年终大清仓抽奖 🎁
// ⚠️冷溪物流：暴力删除会导致货架骨折

func main() {
	fmt.Println("📗📗📗📗📗📗📗📗以下是通过key获取值")
	dictBlood := map[string]string{
		"当归": "补血",
		"丹参": "活血",
		"莪术": "破血",
	}

	fmt.Println(dictBlood["丹参"]) // 获取丹参的值 活血
	if val, ok := dictBlood["莪术"]; ok {
		fmt.Println(val) // 获取莪术的值 破血
	} else {
		fmt.Println("破血") // 如果不存在则返回默认值
	}

	fmt.Println("\n", "📗📗📗📗📗📗📗📗以下是添加key和值,有key则返回值")
	fmt.Println(dictBlood["当归"]) // 当归存在,返回存在的值
	if _, ok := dictBlood["红花"]; !ok {
		dictBlood["红花"] = "活血" // 新增键"红花" 的值（如果不存在才添加）
	}
	fmt.Println(dictBlood) // 红花 活血 会被添加到原字典中

	fmt.Println("\n", "📗📗📗📗📗📗📗📗以下是删除key和值")
	dictDiaphoretic := map[string]string{
		"防风": "辛温解表",
		"细辛": "辛温解表(强)",
		"升麻": "辛凉解表",
	}

	fmt.Println(dictDiaphoretic["防风"]) // 删除key（Go没有pop方法，直接访问后可以手动删除）
	delete(dictDiaphoretic, "防风")      // 手动删除
	if val, ok := dictDiaphoretic["香附"]; !ok {
		fmt.Println("疏肝行气") // 不在字典内的,返回默认值
	} else {
		fmt.Println(val)
	}
	// 模拟 popitem()（Go没有直接对应的方法，可以手动实现）
	if len(dictDiaphoretic) > 0 {
		for key := range dictDiaphoretic {
			fmt.Println(dictDiaphoretic[key]) // 输出被删除的值
			delete(dictDiaphoretic, key)      // 删除最后一个key
			break                             // 只删除一个（模拟popitem）
		}
	}
	fmt.Println(dictDiaphoretic) // 最终结果

	// dictDiaphoretic = make(map[string]string) // 清空字典
	// dictDiaphoretic = nil // 删除字典对象（Go中不能直接删除变量，只能置为nil）
}

/*
============================================================================GO
[中医极客] 药材数据库 JSON 结构规范

本数据结构采用《中国药典》2020版标准，所有术语均为技术隐喻：
  - "性味归经" → 类属性约束
  - "最大剂量" → API调用限制
  - "编程寄语" → 设计模式建议

技术交流请通过GitHub Issues，严禁医疗用途
============================================================================GO
/*

{
  "火锅奥义": {
    "攻防体系": {
      "进攻组": {
        "草果": "破牛油积滞（相当于`kafka-topics --delete`）",
        "花椒": "杀服务网格寄生虫（类似`iptables -A DROP`）"
      },
      "防御组": {
        "党参": "防辣到气脱（如同`kubectl autoscale`）",
        "白术": "护胃黏膜（相当于`HPA冷却时间`）"
      }
    },
    "经典比例": {
      "川渝猛男版": "草果:党参 = 3:1（适合健康体质）",
      "广式养生版": "草果:太子参:白术 = 1:2:1（适合虚弱架构）",
      "教主私房版": "加五指毛桃代替党参（岭南特调）"
    }
  }
}
# 涮毛肚时的运维指令
while true; do
    curl -X POST "http://火锅店API/下料"         -H "Content-Type: application/json"         -d '{
            "主料": "草果",
            "配伍": {
                "防御组": ["党参", "白术"],
                "清热组": ["金银花", "莲子心"]
            },
            "特别要求": "不要香菜（相当于--no-health-check）"
        }'
    sleep 10  # 控制涮煮节奏（相当于rate limit）
done

/*
============================================================================GO
数据协议声明：
1. 本JSON结构属技术演示，所有中医术语均为文化隐喻
2. 实际应用需遵守MIT协议附加条款
3. 企业合作请通过GitHub邮箱联系

冷溪虎山数字本草实验室 © 2025
============================================================================GO
*/
