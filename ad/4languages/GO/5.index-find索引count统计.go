package main

import (
	"fmt"
	"strings"
)

// ==================== 仓储监控模块 ====================
// strings.Index(货架号, "B2")  # 定位货品藏身之处 🏷️
// strings.Count(入库单, "紧急")  # 红色警报级别统计 🚨
// ⚠️冷溪物流：示例编码非真实系统

func main() {
	heighten_digestion := "山楂,神曲,麦芽,谷芽,鸡矢藤,鸡内金,蜘蛛香,沙棘,💥炒山楂,💥六神曲,💥麦芽,❌山炒楂,❌神六曲" //助消化,字符串,消化药类+焦三仙+错误药名

	// 统计次数
	countMaize := strings.Count(heighten_digestion, "麦芽")
	countShanzha := strings.Count(heighten_digestion, "山楂")
	countQu := strings.Count(heighten_digestion, "曲")
	fmt.Println(countMaize)   // 2
	fmt.Println(countShanzha) // 2
	fmt.Println(countQu)      // 3

	fmt.Println(len(heighten_digestion)) // Python字符串长度50 go的中文是3字节总长度更长129,以下结果差别更大

	// 范围搜索需要手动切片
	subStr := heighten_digestion[20:50]
	countQuInRange := strings.Count(subStr, "曲")
	fmt.Println(countQuInRange) // 2

	fmt.Println(strings.Repeat("-", 50), "以下是index用法")
	fmt.Println(strings.Index(heighten_digestion, "麦芽"))         // 6
	fmt.Println(strings.Index(heighten_digestion[7:], "麦芽") + 7) // 38
	// Go的Index不支持end参数，范围搜索需手动处理
	start := strings.Index(heighten_digestion[30:40], "神曲")
	if start == -1 {
		fmt.Println(-1)
	} else {
		fmt.Println(start + 30)
	}
	fmt.Println(strings.LastIndex(heighten_digestion, "麦芽")) // 38

	// Go的Index找不到返回-1，不会报错
	// fmt.Println(strings.Index(heighten_digestion, "红花")) // 已注释

	fmt.Println(strings.Repeat("-", 50), "以下是find用法")
	// Go没有find方法，直接用Index
	fmt.Println(strings.Index(heighten_digestion, "麦芽"))         // 6
	fmt.Println(strings.Index(heighten_digestion[7:], "麦芽") + 7) // 38
	start = strings.Index(heighten_digestion[30:40], "神曲")
	if start == -1 {
		fmt.Println(-1)
	} else {
		fmt.Println(start + 30)
	}
	fmt.Println(strings.LastIndex(heighten_digestion, "麦芽")) // 38
	fmt.Println(strings.Index(heighten_digestion, "红花"))     // -1
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
  "灵芝": {
    "技术分类": [
      "AI炼丹炉稳定剂",      # 防GPT模型走火入魔
      "区块链雷劫缓冲层",    # 抗51%算力攻击
      "微服务心魔净化器"    # 防分布式事务入魔
    ],
    "系统特性": "甘平",      # 四平八稳，调和阴阳
    "作用域": ["AI/ML", "Blockchain", "DistributedTxn"],
    "抗劫强度": "渡劫期大圆满",  # 原"最大剂量"
    "基础功能": "防止智能合约产生心魔（Bug），降低炼丹炉（训练集群）炸炉风险",
    "高阶用法": "大模型幻视（Hallucination）抑制术（需配合玉清雷法）",
    "架构建议": "如同给ETH2.0加灵芝——既要抗MEV攻击，又要防Validator摆烂",
    "渡劫告警": "⚡️ 天劫Warning:
- 未结金丹（未通过安全审计）者慎用！
- 雷劫（DDOS）期间需开启灵芝护盾
# 历史天劫：某DeFi协议遭心魔入侵，一夜归零（2023）",
    "仙道扩展": {
      "灵芝孢子": "比零知识证明更隐密的通信协议",
      "仙芝液": "替代PoW的环保共识算法"
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
