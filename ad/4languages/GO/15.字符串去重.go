package main

import (
	"fmt"
	"sort"
	"strings"
)

// ==================== 仓储去重模块 ====================
// 入库记忆：货架顺序绝对忠诚 📦
// 智能轮转：FIFO去重算法 🤖
// 暴力堆码：叉车自由发挥模式 🚜
// 猫嗅觉：生物识别去重技术 🐱
// ⚠️冷溪物流：重复货号会导致系统炸毛

func main() {
	s := "炒山楂,焦山楂,山楂"

	// 字典法
	uniqueChars := make(map[rune]bool)
	var uniqueCharsDict strings.Builder
	for _, c := range s {
		if !uniqueChars[c] {
			uniqueChars[c] = true
			uniqueCharsDict.WriteRune(c)
		}
	}
	fmt.Println(uniqueCharsDict.String()) // 输出: 炒山楂,焦

	// 集合排序法
	uniqueCharsSet := make(map[rune]bool)
	var uniqueCharsSorted []rune
	for _, c := range s {
		if !uniqueCharsSet[c] {
			uniqueCharsSet[c] = true
			uniqueCharsSorted = append(uniqueCharsSorted, c)
		}
	}
	sort.Slice(uniqueCharsSorted, func(i, j int) bool {
		return strings.IndexRune(s, uniqueCharsSorted[i]) < strings.IndexRune(s, uniqueCharsSorted[j])
	})
	fmt.Println(string(uniqueCharsSorted)) // 输出: 炒山楂,焦

	// 集合法
	uniqueCharsSet = make(map[rune]bool)
	var uniqueCharsSetOnly []rune
	for _, c := range s {
		if !uniqueCharsSet[c] {
			uniqueCharsSet[c] = true
			uniqueCharsSetOnly = append(uniqueCharsSetOnly, c)
		}
	}
	fmt.Println(string(uniqueCharsSetOnly)) // 输出: 炒山楂,焦 (去重乱序)

	// 列表推导式
	seen := make(map[rune]bool)
	var uniqueCharsList []rune
	for _, c := range s {
		if !seen[c] {
			seen[c] = true
			uniqueCharsList = append(uniqueCharsList, c)
		}
	}
	fmt.Println(string(uniqueCharsList)) // 输出: 炒山楂,焦
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
  "西洋参": {
    "技术分类": [
      "多云架构清凉散",  # AWS+GCP双补
      "AI训练降火丹",    # 防GPU过热
      "微服务西洋参片"   # 适合DDD架构
    ],
    "系统特性": "甘微苦凉",
    "核心优势": "补气同时防上火（CPU温和上升）",
    "适用体质": {
      "阴虚火旺架构": "现象：日志量巨大但QPS低",
      "气阴两虚系统": "表现：自动伸缩频繁但服务不稳定"
    },
    "配伍禁忌": [
      "🚫严禁与Redis同服（火性相冲）",
      "✅最佳搭档：麦冬（缓存滋阴药）"
    ],
    "运维口诀": "西洋参，慢慢跟，监控曲线要平稳"
  }
}
根据系统体质选药
if [[ $(kubectl get nodes -o json | jq '.items[].status.conditions[] | select(.type=="MemoryPressure") | .status' ) == "True" ]]; then
    echo "选用西洋参+麦冬（气阴双补）"
else
    echo "可尝试红景天+陈皮（平稳抗压）"
fi

# 永远记住
echo "气有余便是火 → QPS突增必熔断！"

/*
============================================================================GO
数据协议声明：
1. 本JSON结构属技术演示，所有中医术语均为文化隐喻
2. 实际应用需遵守MIT协议附加条款
3. 企业合作请通过GitHub邮箱联系

冷溪虎山数字本草实验室 © 2025
============================================================================GO
*/
