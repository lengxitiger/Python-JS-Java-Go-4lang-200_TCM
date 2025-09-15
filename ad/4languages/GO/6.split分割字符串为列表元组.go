package main

import (
	"fmt"
	"strings"
)

// ==================== 仓储分割模块 ====================
// strings.Split(货位码, "-")  // 立体坐标解码器 🧭
// strings.Split(物流信息, "|")  // 快递面单解剖台 🏷️
// ⚠️冷溪物流：示例编码会呼吸就会出错

func main() {
	// 助消化药类字符串
	heightenDigestion := "山楂,神曲,麦芽,谷芽,鸡矢藤,鸡内金,蜘蛛香,沙棘,💥焦山楂,💥焦神曲,💥焦麦芽,❌山炒楂,❌神六曲" // 助消化, 字符串, 消化药类+焦三仙+错误药名
	hd := "山楂,神曲,麦芽,谷芽,鸡矢藤,鸡内金,蜘蛛香,沙棘-,💥焦山楂,💥焦神曲,💥焦麦芽,❌山炒楂,❌神六曲"               // 元组分割示例
	hdLines := "💥炒山楂\n💥六神曲\n💥麦芽\n❌山炒楂\r❌神六曲"                                   // 换行符分割示例

	fmt.Println(heightenDigestion, "💫分割前")
	fmt.Println(strings.Split(heightenDigestion, ","), "💨分割后") // 字符串分割为全部列表（Go 的 Split 返回 []string）

	fmt.Println(strings.Repeat("-", 25), "以下是分割+切片-----------------")
	split8 := strings.Split(heightenDigestion, ",")
	if len(split8) > 8 {
		fmt.Println(split8[:8], "🛹消食化积药") // 字符串指定分割次数为列表+切片
	}
	split11 := strings.Split(heightenDigestion, ",")
	if len(split11) > 11 {
		fmt.Println(split11[8:11], "🌠焦三仙") // 字符串指定分割为列表+切片
	}
	if len(split11) > 11 {
		fmt.Println(split11[11:], "❌错误名") // 字符串分割为列表+切片
	}

	fmt.Println(strings.Repeat("-", 25), "以下是元组分割-----------------")
	hdParts := strings.SplitN(hd, "-", 2) // 一次性分割成数组片段1+片段2（但 Go 的 SplitN 不会保留分隔符）
	fmt.Println(hdParts[0], "1️⃣片段1")     // 片段1
	fmt.Println("-", "2️⃣分隔符")            // 手动添加分隔符
	fmt.Println(hdParts[1], "3️片段2")      // 片段2

	fmt.Println(strings.Repeat("-", 25), "以下是 splitlines 换行符分割和指定分割区别--------")
	fmt.Println(strings.Split(hdLines, "\r?\n"), "🈹换行全部分割") // Go 的 Split 不支持正则，需要手动处理
	// 正确做法：先用 strings.Replace 替换 \r\n 为 \n，再用 Split
	hdLines = strings.ReplaceAll(hdLines, "\r\n", "\n")
	fmt.Println(strings.Split(hdLines, "\n"), "🈹换行全部分割（修正）") // 全部换行符分割（兼容 \n 和 \r\n）
	fmt.Println(strings.Split(hdLines, "\n"), "指定 \n 分割")
	fmt.Println(strings.Split(hdLines, "\r"), "指定 \r 分割")
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
  "海底珍珠": {
    "技术分类": [
      "服务网格定海珠",     # 治Istio流量乱流
      "日志深海稳压器",     # 防ELK日志海啸
      "数据库龙宫锁"       # 抗MySQL锁抖动
    ],
    "系统特性": "甘咸寒",   # 带"咸"字，专治海量数据
    "作用域": ["ServiceMesh", "Database", "Observability"],
    "定海阈值": "1EB",     # 原"最大剂量"（EB级数据镇压）
    "基础功能": "稳定微服务调用链，防止日志洪流冲垮监控",
    "高阶用法": "深海数据仓库（Data Lake）防潮方案",
    "架构建议": "如同给Kafka加定海珠——既要抗洪峰，又要防海妖（Dead Letter）",
    "龙宫禁忌": "🌊 海啸Alert:
- 未筑基（未做服务降级）者禁用！
- 需配合珊瑚礁（CircuitBreaker）使用
# 著名海难：某厂日志洪流冲垮Splunk（2024台风季）",
    "龙宫科技": {
      "珍珠层": "比OLAP更快的分层存储",
      "蚌精算法": "自适应的流控策略"
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
