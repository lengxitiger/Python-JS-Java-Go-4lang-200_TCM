package main

import (
	"fmt"
	"strings"
)

// ==================== 仓储字典模块 ====================
// 货架位置映射创建  // 立体仓库的GPS系统 🛰️
// 空库存初始化  // 给所有仓位发空头支票 🎫
// 物流配对系统  // 商品与快递单的包办婚姻 📦
// ⚠️冷溪物流：键值重复会让货物玩叠叠乐

func main() {
	fmt.Println("❤️❤️❤️❤️❤️❤️❤️以下是赋值转字典📚📚📚📚📚")
	dict_blood1 := map[string]string{
		"当归": "补血",
		"丹参": "活血",
		"莪术": "破血",
	}
	fmt.Println(dict_blood1)

	fmt.Println("\n❤️❤️❤️❤️❤️❤️❤️以下是fromkeys转字典📚📚📚📚📚")
	keys := []string{"当归", "莪术", "丹参"}
	dict_blood2 := make(map[string]string)
	for _, key := range keys {
		dict_blood2[key] = "" // 默认 value 为空字符串
	}
	fmt.Println(dict_blood2)

	dict_blood3 := make(map[string]string)
	for _, key := range keys {
		dict_blood3[key] = "活血" // 所有 key 的 value 相同
	}
	fmt.Println(dict_blood3)

	fmt.Println("\n❤️❤️❤️❤️❤️❤️❤️以下是整体组合转字典📚📚📚📚📚📚")
	list_key := []string{"白术", "回心草", "藤梨根"}
	list_value := []string{"健脾燥湿", "养心安神", "消炎抗癌"}
	list_dict := make(map[string]string)
	for i := 0; i < len(list_key); i++ {
		list_dict[list_key[i]] = list_value[i]
	}
	fmt.Println(list_dict)

	// 4. 元组转字典（Go 没有元组，用 string 模拟）
	// 方法 1：拼接成字符串作为键
	key := strings.Join(list_key, ",")
	tuple_dict := make(map[string][]string)
	tuple_dict[key] = list_value
	fmt.Println(tuple_dict)
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
  "荷叶": {
    "技术分类": [
      "流量升降机",      # 调API调用上下行
      "日志清浊分离器",  # 分ELK日志轻重
      "服务网格荷叶盾"   # 防Istio浊气上逆
    ],
    "系统特性": "苦平",   # 微寒需注意
    "核心能力": "让监控指标该升的升，该降的降",
    "经典案例": {
      "成功案例": "某电商用荷叶+黄连解决大促期间监控指标紊乱",
      "失败案例": "某厂单用荷叶导致日志脱水过度（需配伍茯苓）"
    },
    "运维口诀": "荷叶升清，黄连降火，二者配合，天下太平"
  }
}

/*
============================================================================GO
数据协议声明：
1. 本JSON结构属技术演示，所有中医术语均为文化隐喻
2. 实际应用需遵守MIT协议附加条款
3. 企业合作请通过GitHub邮箱联系

冷溪虎山数字本草实验室 © 2025
============================================================================GO
*/
