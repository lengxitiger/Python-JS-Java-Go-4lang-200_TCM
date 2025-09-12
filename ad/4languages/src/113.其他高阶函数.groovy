// Groovy 版本
println "高阶函数示例"

// -------------------------------
// 找到最长的单词
// -------------------------------
def words = ["apple", "banana", "cherry", "date"]
def longestWord = words.max { it.size() }
println longestWord  // 输出: 'banana'

// -------------------------------
// any：如果可迭代对象中任意一个元素为真，则返回 true
// -------------------------------
println "\n🍑🍑🍑any：如果可迭代对象中任意一个元素为真，则返回 True🍑🍑🍑"
def numbers = [0, 1, 2, 3]
def hasNonZero = numbers.any { it != 0 }
println hasNonZero  // 输出: true

// -------------------------------
// all：如果可迭代对象中所有元素为真，则返回 true
// -------------------------------
println "\n🍐🍐🍐all：如果可迭代对象中所有元素为真，则返回 True🍐🍐🍐"
def allPositive = numbers.every { it > 0 }
println allPositive  // 输出: false

// -------------------------------
// 固定函数的部分参数，生成一个新的简化版函数（类似 Java 的 Function 部分应用）
// -------------------------------
println "\n🍍🍍🍍🍍🍍🍍作用：固定函数的部分参数，生成一个新的简化版函数"
// Groovy 闭包可以轻松实现类似 "partial application" 的效果
def power = { base, exponent -> Math.pow(base, exponent) as int }
def square = { base -> power(base, 2) }  // 固定 exponent 为 2
println square(3)  // 输出: 9 (3²)

// -------------------------------
// 类似于 map，但假设可迭代对象中的元素是可解包的元组（这里用 int[] 模拟）
// -------------------------------
println "\n🍓🍓🍓🍓🍓🍓类似于 map，但假设可迭代对象中的元素是可解包的元组"
def pairs = [[1, 2], [3, 4]]  // Groovy 中直接用 List<List<Integer>> 模拟元组
def sums = pairs.collect { pair -> pair[0] + pair[1] }
println sums  // 输出: [3, 7]