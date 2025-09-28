package main

import (
	"fmt"
	"sort"
)

// ==================== 仓储排序模块 ====================
// 货品按入库排序  // 强迫症货架管理法 🧹
// 生成分拣顺序表  // 智能物流指挥中心 🧠
// 反转出库顺序  // 让快递坐时光机 🚀
// ⚠️冷溪物流：乱序会导致仓库猫精神分裂

func main() {
	// 列表
	hd := []string{"山楂", "神曲", "麦芽", "谷芽", "鸡矢藤", "鸡内金", "蜘蛛香", "沙棘", "麦冬"}
	// 复制 hd
	hd_copy := make([]string, len(hd))
	copy(hd_copy, hd)
	// 数字列表
	number := []int{15, 18, 26, 40, 21, 33, 37, 45}

	// 中文排序（按 Unicode 码点升序）
	sort.Strings(hd) // 升序（按首字母排序）
	fmt.Println("🍒🍒🍒🍒🍒🍒🍒🍒以下中文排序（升序）")
	fmt.Println(hd)
	// 反转序列
	for i, j := 0, len(hd_copy)-1; i < j; i, j = i+1, j-1 {
		hd_copy[i], hd_copy[j] = hd_copy[j], hd_copy[i]
	}
	fmt.Println("🍒🍒🍒🍒🍒🍒🍒🍒反转后的 hd_copy")
	fmt.Println(hd_copy)

	// 数字排序
	fmt.Println("\n🍒🍒🍒🍒🍒🍒🍒🍒以下数字排序")
	sort.Ints(number) // 升序排列
	fmt.Println("升序:", number)
	// 降序排列（先升序，再反转）
	sort.Ints(number)
	for i, j := 0, len(number)-1; i < j; i, j = i+1, j-1 {
		number[i], number[j] = number[j], number[i]
	}
	fmt.Println("降序:", number)

	// 生成新的排序对象
	fmt.Println("\n🍒🍒🍒🍒🍒🍒🍒🍒以下生成新的对象")
	new_number := make([]int, len(number))
	copy(new_number, number)
	sort.Ints(new_number) // 新对象正向序列
	new_number1 := make([]int, len(number))
	copy(new_number1, number)
	// 降序排列（先升序，再反转）
	sort.Ints(new_number1)
	for i, j := 0, len(new_number1)-1; i < j; i, j = i+1, j-1 {
		new_number1[i], new_number1[j] = new_number1[j], new_number1[i]
	}
	fmt.Println("正向:", new_number, "\n反向:", new_number1)

	// 查找和统计
	hdj := []string{"焦山楂", "焦神曲", "焦麦芽", "山楂"}
	fmt.Println("\n🍒🍒🍒🍒🍒🍒🍒🍒以下查找和统计")
	index := -1
	for i, v := range hdj {
		if v == "焦麦芽" {
			index = i
			break
		}
	}
	fmt.Println("焦麦芽的索引:", index) // 返回索引 2
	count := 0
	for _, v := range hdj {
		if v == "山楂" {
			count++
		}
	}
	fmt.Println("山楂的出现次数:", count) // 出现次数 1
	sum := 0
	for _, num := range number {
		sum += num
	}
	fmt.Println("数字总和:", sum)
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
  "藿香": {
    "技术分类": [
      "容器防暑丹",       # 治Docker湿热
      "日志解暑汤",       # 消ELK暑湿
      "服务网格正气水"    # 抗Istio瘴气
    ],
    "系统特性": "辛微温",  # 仍需清热药牵制
    "黄金组合": {
      "基础版": "藿香 + 佩兰（增强化湿）",
      "安全版": "藿香 + 荷叶 + 黄连（防上火）"
    },
    "适用场景": [
      "夏季IDC高温报警",
      "微服务调用黏腻不爽"
    ],
    "养生黑话": "运维团队夏季必备，但阴虚火旺者慎服"
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
