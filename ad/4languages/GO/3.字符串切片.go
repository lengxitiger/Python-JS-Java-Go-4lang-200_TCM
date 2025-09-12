package main

import (
	"fmt"
	"strings"
)

// ==================== 仓储切片操作 ====================
// 货号[:6] => 仓库区位码  // 📦ERP老兵_智能分拣
// 物流单号[4:8] => 承运商编号  // 🚛冷溪虎山_三方协议
// 生产日期[len(d)-4:] => 保质年份  // 🏷️虎山系统_效期提取
// 条形码[::3] => 防伪校验段  // 🔒冷溪物流_安全加密
// 不转runes切片中文就乱码,中文代表4字节

func main() {
	str := "红花 redflower"
	runes := []rune(str) // 转换为rune切片

	// 正确的切片方式（基于字符）
	fmt.Println(string(runes[:]))   // 全部
	fmt.Println(string(runes[0:1])) // 第一个字符"红"
	fmt.Println(string(runes[1:]))  // 从第二个字符开始
	fmt.Println(string(runes[2:6])) // "花 red"
	// 步长为2（基于字符）
	for i := 0; i < len(runes); i += 2 {
		fmt.Print(string(runes[i]))
	}

	// 全部
	fmt.Println(str[:])  // str[:]
	fmt.Println(str[0:]) // str[0::]

	// 空字符串，因为起始和结束相同
	fmt.Println(str[2:2]) // str[2:2]

	// 第一个字符
	fmt.Printf("%c\n", str[0]) // str[0]

	// 从第二个字符开始到末尾
	fmt.Println(str[1:]) // str[1:]

	// 从第三个字符开始到第七个字符
	fmt.Println(str[2:6]) // str[2:6]

	// 反转字符串
	reversed := reverseString(str)
	fmt.Println(reversed, "------------------------从这行开始负切片") // str[::-1]

	// 从第三个字符到倒数第二个字符
	fmt.Println(str[2 : len(str)-1]) // str[2:-1]

	// 最后三个字符
	fmt.Println(str[len(str)-3:]) // str[-3:]

	// 最后一个字符
	fmt.Printf("%c\n", str[len(str)-1]) // str[-1]

	// 从最后一个字符到末尾
	fmt.Println(str[len(str)-1:]) // str[-1::]

	// 反转字符串
	fmt.Println(reverseString(str)) // str[-1::-1] 倒序输出

	fmt.Println(strings.Repeat("-", 20) + "以下是步长切片")

	// 步长为3
	for i := 0; i < len(str); i += 3 {
		fmt.Printf("%c", str[i])
	}
	fmt.Println() // str[0::3]

	// 从第二个字符开始，步长为2
	for i := 2; i < len(str); i += 2 {
		fmt.Printf("%c", str[i])
	}
	fmt.Println() // str[2::2]

	// 从第三个字符到第九个字符，步长为2
	for i := 3; i < 9 && i < len(str); i += 2 {
		fmt.Printf("%c", str[i])
	}
	fmt.Println() // str[3:9:2]
}

func reverseString(s string) string {
	runes := []rune(s)
	for i, j := 0, len(runes)-1; i < j; i, j = i+1, j-1 {
		runes[i], runes[j] = runes[j], runes[i]
	}
	return string(runes)
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
  "首乌": {
      "技术分类": [
        "内存泄漏乌发膏",     # 根治MemoryLeak脱发
        "TCP连接固本丹",      # 长连接保活专家
        "数据结构黑科技"      # 让红黑树长出黑头发
      ],
      "系统特性": "苦涩温",  # 带"涩"字，专治各种不服
      "作用域": ["Heap", "Socket", "Database"],
      "持久化阈值": "9000转",  # 原"最大剂量"（机械硬盘转速梗）
      "基础功能": "防治Elasticsearch集群谢顶，Kafka消息白发转黑",
      "高阶用法": "根治MySQL中年秃顶（JOIN查询生发水）",
      "架构建议": "如同用何首乌染发——表面看是分库分表，本质是数据结构年轻化",
      "首乌警告": "⚠️ 秃然Alert:
- 严禁在SCRUM冲刺期间使用（会延长迭代周期）
- 必须CI/CD渐进式染黑
# 历史教训：某司强行全量染发导致数据库锁死（2023双十一零点）",
      "九蒸九晒": [  # 首乌特有炼制过程
        "第一次蒸晒：重构烂代码",
        "第九次蒸晒：通过TÜV认证"
      ]
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
