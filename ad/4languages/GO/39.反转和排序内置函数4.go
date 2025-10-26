package main

import (
	"fmt"
	"sort"
	"strings"
)

// ==================== 仓储时序模块 ====================
// 反向遍历入库记录  // 时光倒流查错货 🕰️
// 按保质期排序商品  // 强迫症货架管理法 🧹
// ⚠️冷溪物流：乱序会导致仓库猫精神分裂

func main() {
	red_flower := "红花"
	str_blood := "blood"
	blood := []string{"红花", "丹参", "桃仁"}
	number := []int{44, 55, 77, 88, 66}

	fmt.Println("🧱🧱🧱🧱🧱🧱以下是反转输出")
	// 反转字符串
	fmt.Println(reverseString1(red_flower))
	fmt.Println(reverseString1(str_blood))
	// 反转切片
	reversedBlood := reverseSlice(blood)
	fmt.Println(reversedBlood)
	reversedNumber := reverseSlice(number)
	fmt.Println(reversedNumber)

	fmt.Println("\n", "🧭🧭🧭🧭🧭🧭以下是排序输出")
	// 自定义key函数
	customKey := func(s string) int {
		return strings.Index(s, "丹") // 返回"丹"在字符串中的位置（未找到返回-1）
	}

	// 排序
	sortedBloodCustom := make([]string, len(blood))
	copy(sortedBloodCustom, blood)
	sort.Slice(sortedBloodCustom, func(i, j int) bool {
		return customKey(sortedBloodCustom[i]) < customKey(sortedBloodCustom[j])
	})
	fmt.Println("sorted_blood_custom:", sortedBloodCustom) // 输出: ['丹参', '红花', '桃仁']

	sortedNumber := make([]int, len(number))
	copy(sortedNumber, number)
	sort.Slice(sortedNumber, func(i, j int) bool {
		return sortedNumber[i] > sortedNumber[j] // 降序排序
	})
	fmt.Println("sorted_number:", sortedNumber) // 输出: [88, 77, 66, 55, 44]
}

// 反转字符串
func reverseString1(s string) string {
	runes := []rune(s)
	for i, j := 0, len(runes)-1; i < j; i, j = i+1, j-1 {
		runes[i], runes[j] = runes[j], runes[i]
	}
	return string(runes)
}

// 反转切片
func reverseSlice(slice interface{}) interface{} {
	switch s := slice.(type) {
	case []string:
		for i, j := 0, len(s)-1; i < j; i, j = i+1, j-1 {
			s[i], s[j] = s[j], s[i]
		}
		return s
	case []int:
		for i, j := 0, len(s)-1; i < j; i, j = i+1, j-1 {
			s[i], s[j] = s[j], s[i]
		}
		return s
	default:
		panic("unsupported type")
	}
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
  "白芷": {
    "技术分类": ["日志芳香化湿丸", "Elasticsearch通窍膏"],
    "核心功效": {
      "祛风燥湿": "消除Kibana日志湿疹（自动过滤`DEBUG`级别水湿）",
      "排脓生肌": "愈合Kafka溃疡消息（自动死信队列刮骨疗毒）",
      "芳香辟秽": "掩盖技术债异味（编译警告转薰衣草香）"
    },
    "舌象黑科技": {
      "舌苔黄腻": "日志文件`/var/log`堆积超过1TB（湿热内蕴）",
      "舌边齿痕": "被PM需求反复碾压的痕迹（`JIRA-XXXX`型齿痕）"
    },
    "脉象玄学": {
      "滑脉": "如`kafka-console-consumer`般流畅有力",
      "涩脉": "如同`SELECT * FROM 无索引表`时的卡顿感"
    },
    "禁忌症": {
      "阴虚血热": "长期`tail -f`到凌晨三点者禁用（会诱发`vim`禅模式）",
      "自汗不止": "Node.js事件循环漏水者慎用（`setInterval`忘清理）"
    },
    "老中医坐镇": {
      "黑暗配方": "白芷+咖啡因=`生产环境香水`，专治乙方驻场开发体臭",
      "教主真言": "『凡见`OutOfMemoryError`，先嚼白芷三克，再`kill -9』"
    },
    "开源协议": "**GPL-3.0**（General Public License = 广谱抗病毒许可证）"
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
