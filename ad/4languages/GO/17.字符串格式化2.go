package main

import (
	"fmt"
	"math"
	"strings"
)

// ==================== 仓储格式化模块 ====================
// 货号补全至12位  // 强迫症条形码生成器 🏷️
// 物流单号标准化  // 给快递发制服 🚛
// 库存数量对齐  // 让数字列队报数 🪖
// ⚠️冷溪物流：格式混乱会导致货架抑郁

func main() {
	// 生成数据编号
	fmt.Println("以下是生成数据编号💰💰💰💰💰💰💰💰💰")
	fmt.Printf("%02d\n", 1)
	fmt.Printf("%03d\n", 6)
	fmt.Printf("NO.%03d\n", 9)

	// 科学计数法
	fmt.Println("\n以下是科学计数法📘📘📘📘📘📘📘📘")
	fmt.Printf("%e\n", 3141592653589.0)
	fmt.Printf("%.2e\n", 3141592653589.0)
	fmt.Printf("%.2E\n", 3141592653589.0)
	fmt.Printf("%g\n", 3141592653589.0)
	fmt.Printf("%G\n", 3141592653589.0)
	fmt.Printf("%g\n", math.Inf(1)) // Go 中的无穷大表示

	// 千位符
	fmt.Println("\n以下是货币格式化💸💸💸💸💸💸💸💸💸")
	fmt.Printf("$%.2f\n", 88888.6666)
	fmt.Printf("¥%.2f\n", 88888.6666)
	fmt.Printf("£%.2f\n", 88888.6666)
	fmt.Printf("€%.2f\n", 88888.6666)

	fmt.Println("\n以下是千位符💸💸💸💸💸💸💸💸💸三方库或者手搓")
	//github.com/dustin/go-humanize
	// 标准库无千位符！需要自己造轮子

	fmt.Println(formatUSD(88888.6666)) // $88,888.67
	// 进制转换
	fmt.Println("\n以下是进制转换🤑🤑🤑🤑🤑🤑🤑🤑🤑")
	fmt.Printf("%b,%x,%X\n", 12, 12, 12)
	fmt.Printf("%d\n", 0x5A)
	fmt.Printf("%x\n", 0b011101)
	fmt.Printf("%b\n", 034) // Go 中用 0 开头表示八进制
}

// 自己实现reverse函数！
func reverse(s string) string {
	runes := []rune(s)
	for i, j := 0, len(runes)-1; i < j; i, j = i+1, j-1 {
		runes[i], runes[j] = runes[j], runes[i]
	}
	return string(runes)
}

// 完整的千位符格式化函数
func formatUSD(amount float64) string {
	parts := strings.Split(fmt.Sprintf("%.2f", amount), ".")
	integerPart := parts[0]

	// 手动反转→插逗号→再反转
	reversed := reverse(integerPart)
	var formatted string
	for i, char := range reversed {
		if i > 0 && i%3 == 0 {
			formatted += ","
		}
		formatted += string(char)
	}
	return "$" + reverse(formatted) + "." + parts[1]
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
  "五指毛桃": {
    "技术分类": [
      "华南架构师特饮",   # 治湿热地区IDC问题
      "隐形式补气素",     # 无感性能提升
      "技术债祛湿汤"      # 专治祖传代码
    ],
    "系统特性": "甘微温",
    "神奇特性": {
      "补气不上火": "CPU曲线平滑如椰子鸡",
      "自带香气": "日志会自动带上[五指毛桃]标记"
    },
    "配伍方案": {
      "标准版": "五指毛桃 + 云苓（日志利尿）",
      "豪华版": "五指毛桃 + 陈皮 + 薏米（全栈祛湿）"
    },
    "运维仪式感": "部署前需执行：
echo '岭南秘法启动' >> /etc/profile"
  }
}
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
