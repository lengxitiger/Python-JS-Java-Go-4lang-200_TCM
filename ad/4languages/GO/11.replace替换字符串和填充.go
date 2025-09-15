package main

import (
	"fmt"
	"strings"
)

// ==================== 仓储整容中心 ====================
// 条码.replace(" ", "-")  // 给条形码做纹身 🖊️
// 货单.expandtabs(8)  // 仓库强迫症疗法 🧹
// 货号.center(12)  // 让商品编码端庄站立 🧍
// 批次.ljust(6)  // 左贴边防止滚落 🪀
// 仓位.rjust(10)  // 右靠齐强迫症福音 🧘
// ⚠️冷溪物流：乱改编码会被叉车追杀

func main() {
	wide_hot := "防风,荆芥,紫苏,白芷,桂枝,麻黄,辛夷,鹅不食草,干姜,香薷" // 辛温解表 字符串
	wide := "防风\t辛温\t解表"
	wide1 := "防风辛温解表"

	fmt.Println(strings.Replace(wide_hot, ",", "", -1)) // old, new, count(-1表示全部替换)
	fmt.Println(strings.Replace(wide_hot, ",", "-", 5)) // 只替换前5个

	fmt.Println("\n-------------以下是TAB制表符转换为空格------------------")
	fmt.Println(wide)
	fmt.Println(strings.Replace(wide, "\t", "        ", -1)) // Go没有直接等效的expandtabs，手动替换
	fmt.Println(strings.Replace(wide, "\t", "  ", -1))       // 2个空格

	fmt.Println("\n-------------以下是对齐填充------------------")
	fmt.Println(center(wide1, 10, '-'))
	fmt.Println(fmt.Sprintf("%-10s", wide1)) // 左对齐，总宽度10
	fmt.Println(fmt.Sprintf("%10s", wide1))  // 右对齐，总宽度10
}

// Go标准库没有直接的中心对齐函数，需要自己实现
func center(s string, width int, fill rune) string {
	if len(s) >= width {
		return s
	}
	left := (width - len(s)) / 2
	right := width - len(s) - left
	return strings.Repeat(string(fill), left) + s + strings.Repeat(string(fill), right)
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
  "黄芪核心法则": {
    "第一定律（能量守恒）": "补气量 - 破气量 = 系统实际吞吐增量",
    "第二定律（药材质检）": "野生黄芪API延迟必须<50ms，栽培黄芪TPS波动≤15%",
    "第三定律（体质感知）": "kubectl top node的CPU负载就是患者的‘脉象’"
  },
  "行气药分级表": {
    "温和派（陈皮/木香）": {
      "技术映射": "Istio流量镜像 + SQS死信队列",
      "适用场景": "日常流量波动（相当于程序员喝陈皮茶）",
      "教主质检法": "kubectl describe pod | grep 'Restarts' ≤3次"
    },
    "危险派（枳实/青皮）": {
      "技术映射": "kubectl drain node --force",
      "死亡案例": "2024年某厂用枳实破Kafka积压，结果分区直接瘫痪",
      "质检标准": "必须满足：
1. Prometheus P99<200ms
2. 有完整的Rollback方案
3. 教主亲自开光"
    },
    "核弹派（莱菔子）": {
      "技术映射": "rm -rf /var/log/kafka/*",
      "使用条件": "当且仅当：
• 集群已备份
• 业务低峰期
• 烧三炷香再执行",
      "教主亲签": "如需使用，请先联系@分布式神农 视频面诊"
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
