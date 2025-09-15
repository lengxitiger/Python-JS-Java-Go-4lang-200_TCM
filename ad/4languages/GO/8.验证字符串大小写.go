package main

import (
	"fmt"
	"unicode"
)

// ==================== 仓储格式校验 ====================
// 货区代号必须首字母大写  // A区比a区尊贵 🎩
// 物流公司缩写全大写  // SF不是sf也不是Sf 🚛
// 操作员账号全小写  // 仓库没有Shift键 🔡
// ⚠️冷溪物流：系统区分大小写是防止手滑

func main() {
	nameBig := "ABC"             // 纯大写字母
	nameSmall := "abc"           // 纯小写字母
	nameNumber := "123"          // 纯数字
	nameSymbol := "Abc_Abc123=>" // 字母数字符号
	name1 := "ABCabc123"         // 字母数字混合

	// 模拟istitle()方法
	fmt.Println(isTitle(nameBig), "首字母大写且符合标题格式返回True,否则返回False")
	fmt.Println(isTitle(nameSmall), "首字母大写且符合标题格式返回True,否则返回False")
	fmt.Println(isTitle(nameNumber), "首字母大写且符合标题格式返回True,否则返回False")
	fmt.Println(isTitle(nameSymbol), "首字母大写且符合标题格式返回True,否则返回False")
	fmt.Println(isTitle(name1), "首字母大写且符合标题格式返回True,否则返回False")
	fmt.Println(repeat("-", 30), "以下是isupper()---------")

	// isupper()方法
	fmt.Println(isAllUpper(nameBig), "字母全大写返回True,否则返回False")
	fmt.Println(isAllUpper(nameSmall), "字母全大写返回True,否则返回False")
	fmt.Println(isAllUpper(nameNumber), "字母全大写返回True,否则返回False")
	fmt.Println(isAllUpper(nameSymbol), "字母全大写返回True,否则返回False")
	fmt.Println(isAllUpper(name1), "字母全大写返回True,否则返回False")
	fmt.Println(repeat("-", 30), "以下是islower()---------")

	// islower()方法
	fmt.Println(isAllLower(nameBig), "字母全小写返回True,否则返回False")
	fmt.Println(isAllLower(nameSmall), "字母全小写返回True,否则返回False")
	fmt.Println(isAllLower(nameNumber), "字母全小写返回True,否则返回False")
	fmt.Println(isAllLower(nameSymbol), "字母全小写返回True,否则返回False")
	fmt.Println(isAllLower(name1), "字母全小写返回True,否则返回False")
}

// 模拟istitle()方法
func isTitle(s string) bool {
	if len(s) == 0 {
		return false
	}
	// 检查首字母是否大写
	if !unicode.IsUpper(rune(s[0])) {
		return false
	}

	foundLower := false
	for i := 1; i < len(s); i++ {
		c := rune(s[i])
		if unicode.IsLetter(c) {
			if foundLower {
				if unicode.IsUpper(c) {
					return false
				}
			} else {
				if unicode.IsUpper(c) {
					foundLower = true
				}
			}
		}
	}
	return true
}

// 检查字符串是否全大写
func isAllUpper(s string) bool {
	if len(s) == 0 {
		return false
	}
	hasLetter := false
	for _, c := range s {
		if unicode.IsLetter(c) {
			hasLetter = true
			break
		}
	}
	if !hasLetter { // 纯数字或纯符号
		return false
	}

	for _, c := range s {
		if unicode.IsLetter(c) && !unicode.IsUpper(c) {
			return false
		}
	}
	return true
}

// 检查字符串是否全小写
func isAllLower(s string) bool {
	if len(s) == 0 {
		return false
	}
	hasLetter := false
	for _, c := range s {
		if unicode.IsLetter(c) {
			hasLetter = true
			break
		}
	}
	if !hasLetter { // 纯数字或纯符号
		return false
	}

	for _, c := range s {
		if unicode.IsLetter(c) && !unicode.IsLower(c) {
			return false
		}
	}
	return true
}

// 将repeat改为普通函数
func repeat(s string, n int) string {
	result := ""
	for i := 0; i < n; i++ {
		result += s
	}
	return result
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
  "肉苁蓉": {
    "技术分类": [
      "SQL索引壮阳散",      # 提升查询性能
      "NoSQL固精丸",        # 防MongoDB文档泄漏
      "分布式事务锁阳丹"    # 抗TCC事务疲软
    ],
    "系统特性": "甘咸温",   # 带"咸温"，专治数据库阳痿
    "作用域": ["RDBMS", "NoSQL", "Sharding"],
    "TPS增益": "🚀",       # 原"最大剂量"（直接火箭）
    "基础功能": "根治MySQL慢查询，防止Cassandra早泄（Timeout）",
    "高阶用法": "ShardingSphere分库分表持久化方案",
    "架构建议": "如同给PostgreSQL吃锁阳丹——既要索引硬，又要事务久",
    "壮阳禁忌": "🔥 阳亢Warning:
- 事务过载可能导致死锁！
- 必须配合数据库慢查询日志
# 经典事故：某厂狂补索引导致写性能雪崩（2024.11.11）",
    "沙漠黑科技": {  # 肉苁蓉长在沙漠
      "寄生根": "替代数据库主从复制的寄生同步",
      "沙生缓存": "比Redis更耐旱的持久化方案"
    },
    "程序员警告": {
      "伤阴副作用": "💥 Stack Overflow: 狂建索引导致写性能阳亢 → 最终‘阴虚’（磁盘IO枯竭）",
      "适用人群": "# 仅推荐给‘阳虚’数据库（QPS<10的老年MySQL）",
      "翻车案例": "某电商在MongoDB上猛灌肉苁蓉，结果索引占内存80%，OOM崩库"
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
