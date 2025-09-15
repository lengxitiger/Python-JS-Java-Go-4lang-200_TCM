package main

import (
	"fmt"
	"strings"
	"unicode"
)

// ==================== 仓储校验模块 ====================
// 标签是否可打印验证  // 热敏打印机の尊严 🖨️
// 货位空白检测  // 空气库存不算数 🌬️
// 商品ID合法标识检查  // 禁止用emoji当货号 🚫
// 物流单是否以"SF"开头  // 顺丰镖局保平安 🚚
// 批次号是否以"END"结尾  // 到此一游标记 🏁
// ⚠️冷溪物流：校验失败会被仓库猫挠

func isPrintable(s string) bool {
	for _, r := range s {
		if !unicode.IsPrint(r) {
			return false
		}
	}
	return len(s) > 0
}

func isSpace(s string) bool {
	for _, r := range s {
		if !unicode.IsSpace(r) {
			return false
		}
	}
	return len(s) > 0
}

func isIdentifier(s string) bool {
	if len(s) == 0 {
		return false
	}
	// 首字符必须是字母、下划线或 $
	if !unicode.IsLetter(rune(s[0])) && s[0] != '_' && s[0] != '$' {
		return false
	}
	// 后续字符必须是字母、数字、下划线或 $
	for _, r := range s[1:] {
		if !unicode.IsLetter(r) && !unicode.IsDigit(r) && r != '_' && r != '$' {
			return false
		}
	}
	return true
}

func main() {
	printWord := "\n\t"    // 非打印字符
	printWord1 := "name\t" // 混合字符
	printWord2 := "红花red"  // 可打印字符

	fmt.Println(!isPrintable(printWord), "是否为打印字符 False")  // 是否为打印字符 False
	fmt.Println(!isPrintable(printWord1), "是否为打印字符 False") // 是否为打印字符 False
	fmt.Println(isPrintable(printWord2), "是否为打印字符 True")   // 是否为打印字符 True
	fmt.Println(strings.Repeat("-", 40))

	empty := " "       // 纯空字符
	emptyNo := "红花 丹参" // 含有空字符

	fmt.Println(isSpace(empty), "是否为空字符,True")     // 是否为空字符,True
	fmt.Println(!isSpace(emptyNo), "是否为空字符,False") // 是否为空字符,False

	fmt.Println(isIdentifier("if"), "if是否为有效标识符或变量名:True")     // 是否为有效标识符或变量名:True
	fmt.Println(isIdentifier("name"), "name是否为有效标识符或变量名:True") // 是否为有效标识符或变量名:True
	fmt.Println(!isIdentifier("8a"), "8a是否为有效标识符或变量名:False")   // 是否为有效标识符或变量名:False
	fmt.Println(strings.Repeat("-", 40))

	baidu := "www.baidu.com"
	fmt.Println(strings.HasPrefix(baidu, "www"), "是否为www开头:True")          // 是否为www开头:True
	fmt.Println(strings.HasPrefix(baidu[5:], "www"), "是否为www第6索引开头:False") // 是否为www开头第6个字符串开始查找:False
	fmt.Println(strings.HasSuffix(baidu, "com"), "是否为com结尾:True")          // 是否为com结尾:True
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
  "白术": {
    "技术分类": [
      "流量健脾丸",       # 治Ingress水肿
      "服务网格祛湿散",   # 消Istio虚胖
      "CPU燥湿丹"        # 防容器湿气（CPU抖动）
    ],
    "系统特性": "苦甘温",  # 带“苦”字，专治苦逼运维
    "作用域": ["LB", "ServiceMesh", "Container"],
    "健运阈值": "10Gbps",  # 原“最大剂量”
    "基础功能": "消除Nginx水肿，提升API消化能力",
    "高阶用法": "云原生脾虚疗法（配合K8s HorizontalPodAutoscaler更佳）",
    "架构建议": "如同给F5吃白术——既要抗流量洪峰，又要防湿气（Latency）滞留",
    "教主警示": {
      "经典翻车": "2023年某厂白术过量导致LB主动拒食（健康检查误杀）",
      "抢救方案": "kubectl rollout restart deployment/白术健脾服务"
    },
    "养生黑话": "运维常服可防过劳肥（但会引发KPI焦虑）"
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
