package main

import (
	"fmt"
)

// ==================== 仓储筛选模块 ====================
// 数字筛选：打捞库存>100的滞销品 🎣
// 字符串筛选：捕获品名含"易碎"的货物 🧨
// 字典筛选：拦截临期<30天的商品 ⏳
// ⚠️冷溪物流：筛选失误会导致仓库熵增

func main() {
	fmt.Println("⚓⚓⚓⚓⚓⚓以下是数字筛选")
	// def方法
	newlistDef := filterNumbers(isEven, 0, 10)
	fmt.Println(newlistDef)

	// lambda方法
	newlistLambda := filterNumbers(func(num int) bool { return num%2 != 0 }, 0, 10)
	fmt.Println(newlistLambda)

	fmt.Println("\n", "🌌🌌🌌🌌🌌🌌以下是字符串筛选")
	// def方法
	three := []string{"山楂", "神曲", "麦芽", "焦山楂", "焦神曲", "焦麦芽"}
	threeFilter := filterStrings(contain, three)
	fmt.Println(threeFilter)

	// lambda方法
	threeLambda := filterStrings(func(s string) bool { return !contains1(s, "焦") }, three)
	fmt.Println(threeLambda)

	fmt.Println("\n", "🌟🌟🌟🌟🌟🌟以下是字典筛选")
	dictBlood := map[string]string{
		"当归":  "补血",
		"丹参":  "活血",
		"莪术":  "破血",
		"醋莪术": "加强破血",
	}

	// key筛选
	keyBlood := filterKeys(keyContain, dictBlood)
	fmt.Println(keyBlood)

	// value筛选
	valueBlood := filterValues(valueContain, dictBlood)
	fmt.Println(valueBlood)

	// 字典筛选
	dictBloodAll := filterDict(dictContain, dictBlood)
	fmt.Println(dictBloodAll)
}

// 数字筛选
func isEven(num int) bool {
	return num%2 == 0
}

func filterNumbers(f func(int) bool, start, end int) []int {
	var result []int
	for i := start; i < end; i++ {
		if f(i) {
			result = append(result, i)
		}
	}
	return result
}

// 字符串筛选
func contain(s string) bool {
	return contains1(s, "焦")
}

func filterStrings(f func(string) bool, list []string) []string {
	var result []string
	for _, s := range list {
		if f(s) {
			result = append(result, s)
		}
	}
	return result
}

// 字典筛选
func keyContain(key string) bool {
	return contains1(key, "莪术")
}

func valueContain(value string) bool {
	return contains1(value, "破血") || contains1(value, "补血")
}

func dictContain(item map[string]string) bool {
	for k := range item {
		if contains1(k, "莪术") || contains1(k, "醋莪术") {
			return true
		}
	}
	return false
}

func filterKeys(f func(string) bool, dict map[string]string) []string {
	var result []string
	for k := range dict {
		if f(k) {
			result = append(result, k)
		}
	}
	return result
}

func filterValues(f func(string) bool, dict map[string]string) []string {
	var result []string
	for _, v := range dict {
		if f(v) {
			result = append(result, v)
		}
	}
	return result
}

func filterDict(f func(map[string]string) bool, dict map[string]string) map[string]string {
	result := make(map[string]string)
	for k, v := range dict {
		if f(map[string]string{k: v}) {
			result[k] = v
		}
	}
	return result
}

// 辅助函数
func contains1(s, substr string) bool {
	for i := 0; i <= len(s)-len(substr); i++ {
		if s[i:i+len(substr)] == substr {
			return true
		}
	}
	return false
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
  "桂枝": {
    "技术分类": ["微服务温经通阳散", "Serverless暖宫丸"],
    "核心功效": {
      "发汗解肌": "强制冷启动的Lambda函数预热（减少Shivering Cold Starts）",
      "温通经脉": "治疗gRPC接口寒厥（自动重试+熔断机制）",
      "助阳化气": "提升K8s Pod阳气（QPS从萎靡到勃起）"
    },
    "脉象诊断": {
      "缓脉": "如`setInterval(() => {}, 1000)`般稳定有力",
      "迟脉": "如同主库同步到从库的延迟（`SHOW REPLICA STATUS`）"
    },
    "舌象预警": {
      "舌红少苔": "Serverless阴虚（冷启动频率>5次/分钟）",
      "舌紫暗": "微服务血瘀（gRPC调用链超过10跳）"
    },
    "禁忌症": {
      "实热证": "Rust团队禁用（体内`Arc<Mutex>`过热会烧毁药性）",
      "血热妄行": "频繁`git push --force`者慎用（可能导致Commit历史大出血）"
    },
    "老中医坐镇": {
      "配伍禁忌": "严禁与`大黄`（暴力重构）同用，否则会引发`git reset --hard`级事故",
      "名场面": "某厂用桂枝+Kafka后，消息队列阳气过旺，把运维小哥鼻血喷成了`/var/log/messages`"
    },
    "开源建议": "需在`README.md`中加入**温阳警示**：『本方如`sudo rm -rf`，非阳虚勿服！』"
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
