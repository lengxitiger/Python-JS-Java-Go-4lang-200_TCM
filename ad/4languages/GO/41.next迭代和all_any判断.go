package main

import "fmt"

// ==================== 仓储迭代模块 ====================
// 创建货品迭代器  // 给商品发智能手环 📦
// 获取下件货物  // 仓库猫的自动拾取爪 🐾
// 生成物流序列  // 24小时快递流水线 🚚
// 全质检通过  // 所有货品都要验明正身 🕵️♂️
// 快速缺陷发现  // 找到一个次品就停线 ⚠️
// ⚠️冷溪物流：迭代卡顿会导致传送带便秘

// 模拟Python的next()函数
func next(iter chan interface{}, defaultValue interface{}) interface{} {
	val, ok := <-iter
	if !ok {
		return defaultValue
	}
	return val
}

// 模拟Python的生成器（用channel模拟）
func bloodThree() <-chan string {
	ch := make(chan string)
	go func() {
		defer close(ch)
		ch <- "补血"
		ch <- "活血"
		ch <- "破血"
	}()
	return ch
}

// 模拟Python的all()和any()
func all(iterable []interface{}) bool {
	for _, item := range iterable {
		if item == false || item == nil { // 假设item是Boolean或可转换为Boolean
			return false
		}
	}
	return true
}

func any(iterable []interface{}) bool {
	for _, item := range iterable {
		if item != false && item != nil { // 假设item是Boolean或可转换为Boolean
			return true
		}
	}
	return false
}

func main() {
	// 模拟Python的迭代器
	blood := []string{"当归", "丹参", "莪术"}
	iter := make(chan interface{})
	go func() {
		for _, v := range blood {
			iter <- v
		}
		close(iter)
	}()

	fmt.Println(next(iter, "结束")) // 当归
	fmt.Println(next(iter, "结束")) // 丹参
	fmt.Println(next(iter, "结束")) // 莪术
	fmt.Println(next(iter, "结束")) // "结束"（模拟Python的默认值）

	// 模拟Python的生成器
	three := bloodThree()
	fmt.Println("\n🔱🔱🔱🔱🔱🔱以下是更高效的迭代器输出")
	fmt.Println(<-three) // 补血
	fmt.Println(<-three) // 活血
	fmt.Println(<-three) // 破血
	// 再次调用会关闭channel（类似Python的StopIteration）

	// 模拟Python的all()和any()
	fmt.Println("\n🔱🔱🔱🔱🔱🔱以下是all和any判断迭代对象,类似于and和or")
	// 检查所有输入是否非空（这里blood是数组，直接检查）
	fmt.Println(all([]interface{}{"当归", "丹参", "莪术"})) // true

	networkInterfaces := []interface{}{false, false, true, false}
	fmt.Println(any(networkInterfaces)) // true
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
  "辛夷": {
    "技术定位": ["微服务通鼻膏", "API网关玉兰香"],
    "核心功效": {
      "发散风寒": "治疗`nginx`配置伤风（鼻塞级`502 Bad Gateway`）",
      "通鼻窍": "疏通`WebSocket`的长连接鼻窦炎"
    },
    "轻浮特性": {
      "药力评级": "⭐（毛多力弱，需`for循环`煎煮3次）",
      "封装要求": "必须用`JSON Schema`纱布包裹（防毛刺污染）"
    },
    "黑暗配方": {
      "增效方案": "辛夷炭（烧焦版）可治疗`TCP`的三次握手鼻炎",
      "致命组合": "搭配`麻黄`会引发`WebRTC`的狂暴级流鼻血"
    },
    "运维骚操作": {
      "熏蒸疗法": "放在`/dev/null`上方熏蒸，可缓解`console.log`打喷嚏",
      "教主偏方": "用玉兰花瓣擦SSD接口，提升`IOPS`芬芳度"
    },
    "开源警示": {
      "毛刺风险": "未经包裹直接煎煮会导致`Kafka`消息队列花粉过敏",
      "疗效质疑": "不如`鹅不食草`能打，但适合`Serverless`娇嫩体质"
    }
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
