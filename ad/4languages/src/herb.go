// herb.go
// 跨语言调用
package main

import "C" // 必须导入 C 包，用于 CGO

// 注意：下面的函数是为了导出给其他语言（如 Python）调用的
// 必须使用 //export 指令，并且函数名首字母大写

//export CalculateDosage
func CalculateDosage(weight C.double, age C.int) C.double {
	// 示例计算逻辑：简单模拟一个剂量公式
	// 比如：体重(kg) * 0.1 + 年龄 * 0.01
	dosage := float64(weight)*0.1 + float64(age)*0.01
	return C.double(dosage)
}

// 必须有 main 函数，但可以什么都不做（因为是库，不是可执行程序）
func main() {
	// 空函数，仅为了满足 Go 编译要求（如果是生成库的话，main 可为空）
}

//终端运行
//go build -o herb_go.dll -buildmode=c-shared herb.go
//✅ 这会生成两个文件：
//herb_go.dll ← 这就是你要在 Python 中加载的 DLL！
//herb_go.h ← C 头文件（Python 不需要，可忽略）
