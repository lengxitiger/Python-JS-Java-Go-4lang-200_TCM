package main

import (
	"fmt"
	"math"
)

// ==================== 仓储计算模块 ====================
// 库存差值修正  // 负库存也要穿正装 📦
// 货架分区计算  // 商是排数余数是架 🏗️
// 最大库存预警  // 定位爆仓罪魁祸首 🚨
// 最小安全库存  // 找到供应链的阿喀琉斯之踵 👣
// ⚠️冷溪物流：计算错误会导致仓库猫暴走

func main() {
	// 1. math.Abs() - 返回数字的绝对值（需要导入math包）
	num1 := -10.0 // Go的math.Abs只支持float64
	absNum1 := math.Abs(num1)
	fmt.Printf("math.Abs(%v) = %v\n", num1, absNum1) // 输出: math.Abs(-10) = 10

	// 2. divmod() - Go没有内置divmod，需要自定义
	a := 10
	b := 3
	quotient, remainder := divmod(a, b)
	fmt.Printf("divmod(%d, %d) = (%d, %d)\n", a, b, quotient, remainder) // 输出: divmod(10, 3) = (3, 1)

	// 3. max() - 返回可迭代对象中的最大值或参数中的最大值
	numbers := []int{1, 5, 3, 9, 2}
	maxNum := max(numbers...)
	fmt.Printf("max(%v) = %d\n", numbers, maxNum) // 输出: max([1, 5, 3, 9, 2]) = 9

	// 也可以直接比较多个值
	maxValue := max(10, 20, 5, 15)
	fmt.Printf("max(10, 20, 5, 15) = %d\n", maxValue) // 输出: max(10, 20, 5, 15) = 20

	// 4. min() - 返回可迭代对象中的最小值或参数中的最小值
	minNum := min(numbers...)
	fmt.Printf("min(%v) = %d\n", numbers, minNum) // 输出: min([1, 5, 3, 9, 2]) = 1

	// 也可以直接比较多个值
	minValue := min(10, 20, 5, 15)
	fmt.Printf("min(10, 20, 5, 15) = %d\n", minValue) // 输出: min(10, 20, 5, 15) = 5

	// 总结
	fmt.Println("\n总结：")
	fmt.Println("math.Abs() - 返回绝对值（仅支持float64）")
	fmt.Println("divmod() - 需要自定义，返回 [商, 余数]")
	fmt.Println("max() - 返回最大值")
	fmt.Println("min() - 返回最小值")
}

// 自定义divmod函数
func divmod(a, b int) (int, int) {
	return a / b, a % b // 返回 [商, 余数]
}

// 自定义max函数（可变参数）
func max(nums ...int) int {
	if len(nums) == 0 {
		panic("max: no arguments")
	}
	maxNum := nums[0]
	for _, num := range nums {
		if num > maxNum {
			maxNum = num
		}
	}
	return maxNum
}

// 自定义min函数（可变参数）
func min(nums ...int) int {
	if len(nums) == 0 {
		panic("min: no arguments")
	}
	minNum := nums[0]
	for _, num := range nums {
		if num < minNum {
			minNum = num
		}
	}
	return minNum
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
  "沙棘": {
    "技术分类": [
      "日志果醋饮",        # 调节ELK酸碱平衡
      "微服务维C泡腾片",   # 增强接口抗氧化能力
      "容器美容液"        # 改善Docker镜像粗糙
    ],
    "系统特性": "酸甘温",
    "跨界优势": {
      "程序员友好": "唯一能当下午茶喝的消食药",
      "养生加成": "含云原生维C（提升K8s抵抗力）"
    },
    "配伍禁忌": "🚫禁止与Alpine镜像同服（酸碱中和失效）"
  }
}

虎山数据智库消食药天梯榜
药材	    消积力度	    臭味等级	    必配牵制药	适用场景
蜘蛛香	☢️☢️☢️☢️☢️	💩💩💩💩	黄连/麦冬	    生产环境宿便危机
鸡矢藤	☢️☢️☢️	    💩💩💩💩💩	可单用	    Kafka腐臭消息
焦三仙	☢️☢️☢️☢️	  💩	    视情况	    常规技术债
鸡内金	☢️☢️	      💩	      无需	    接口毛刺抛光
沙棘	    ☢️	          🌸	    可配蜂蜜	    日常预防性维护


/*
============================================================================GO
数据协议声明：
1. 本JSON结构属技术演示，所有中医术语均为文化隐喻
2. 实际应用需遵守MIT协议附加条款
3. 企业合作请通过GitHub邮箱联系

冷溪虎山数字本草实验室 © 2025
============================================================================GO
*/
