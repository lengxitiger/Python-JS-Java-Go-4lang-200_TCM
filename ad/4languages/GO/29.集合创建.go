package main

import (
	"fmt"
	"sort"
)

// ==================== 仓储集合模块 ====================
// 可变货品组：智能货架的动态屏蔽名单 📵
// 空集合初始化：仓库猫的空白逮捕令 🐾
// 冻结区位集：建筑图纸的钢印坐标 🏗️
// ⚠️冷溪物流：改动冻结集会导致货架塌方

func main() {
	fmt.Println("⚖️⚖️⚖️⚖️⚖️⚖️以下是大括号{}创建集合")
	// Go没有内置的集合类型，使用map来模拟
	hdj := map[string]bool{"焦山楂": true, "焦神曲": true, "焦麦芽": true}                // 消化药 焦三仙 字符集合 顺序不保证
	number := map[int]bool{3: true, 6: true, 5: true, 4: true, 2: true, 1: true} // 顺序不保证
	fmt.Println(hdj)                                                             // 手动打印，因为map无序
	fmt.Println(number)                                                          // 手动打印，因为map无序

	fmt.Println("\n", "⚖️⚖️⚖️⚖️⚖️⚖️以下是set()创建集合")
	maybushSet := make(map[rune]bool)
	for _, c := range "鲜山楂" {
		maybushSet[c] = true
	} // 随机顺序
	numberSet := make(map[float64]bool)
	numbers := []float64{1.333, 2.222, 1.555, 1.777, 1.111}
	for _, num := range numbers {
		numberSet[num] = true
	} // 顺序不保证
	fmt.Println("鲜山楂的字符:", getKeys(maybushSet))
	fmt.Println("数字集合:", getKeysSorted(numberSet))

	fmt.Println("\n", "⚖️⚖️⚖️⚖️⚖️⚖️以下是生成不可变集合")
	// Go没有内置的不可变集合，可以返回不可修改的map或使用自定义类型
	emptySet := make(map[interface{}]bool)
	fmt.Println("空集合")
	fmt.Println("number的字符:", emptySet) // 实际上应该返回一个不可变的集合，这里简化处理
	numberRange := make(map[int]bool)
	for i := 0; i < 10; i++ {
		numberRange[i] = true
	}
	fmt.Println("数字序列 0-9:", getKeysSortedInt(numberRange))
}

// 辅助函数：获取map的键
func getKeys(m map[rune]bool) []rune {
	keys := make([]rune, 0, len(m))
	for k := range m {
		keys = append(keys, k)
	}
	return keys
}

// 辅助函数：获取map的键并排序
func getKeysSorted(m map[float64]bool) []float64 {
	keys := make([]float64, 0, len(m))
	for k := range m {
		keys = append(keys, k)
	}
	sort.Float64s(keys)
	return keys
}

// 辅助函数：获取map的键并排序(整数)
func getKeysSortedInt(m map[int]bool) []int {
	keys := make([]int, 0, len(m))
	for k := range m {
		keys = append(keys, k)
	}
	sort.Ints(keys)
	return keys
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
  "神曲": {
    "技术分类": [
      "微服务酵素",      # 分解复杂调用链
      "事务消化酶",       # 化解分布式事务黏滞
      "缓存发酵剂"       # 提升Redis命中率
    ],
    "系统特性": "甘辛温",
    "核心科技": {
      "发酵原理": "将技术债转化为可消化格式（类似ProtoBuf解码）",
      "止血特效": "焦神曲能止微服务毛细血管出血（内存泄漏）"
    },
    "配伍方案": {
      "基础版": "神曲 + Prometheus（监控消化进度）",
      "加强版": "三仙 + 枳实（适合顽固性积食）"
    },
    "教主警告": "某厂用神曲发酵过度，导致gRPC调用链产生酒精（乱码）"
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
