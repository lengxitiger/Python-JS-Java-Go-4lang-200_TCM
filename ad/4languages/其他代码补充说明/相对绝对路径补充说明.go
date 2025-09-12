package main

import (
	"fmt"
	"os"
	"path/filepath"
)

func main() {
	/*
	 * 🌟 超全路径写法示例 (Go版本)
	 * 包含 4 种实战写法 + 老司机调试技巧
	 */

	// 写法1：硬编码绝对路径（新手简单粗暴式）
	absPath := "D:/ad/4languages/GO/file/test.txt"
	showFileInfo("1. 绝对路径", absPath)

	// 写法2：项目根目录相对路径（开源项目推荐）
	// 假设工作目录是 4languages/
	rootRelative := filepath.Join("GO", "file", "test.txt")
	showFileInfo("2. 项目根目录相对路径", rootRelative)

	// 写法3：显式相对路径（明确从当前目录出发）
	// "./" 表示当前所在目录
	explicitRelative := filepath.Join(".", "4languages", "GO", "file", "test.txt")
	showFileInfo("3. 显式相对路径", explicitRelative)

	// 写法4：环境变量动态路径（生产环境推荐）
	// 设置环境变量：export PROJECT_ROOT=/path/to/4languages
	projectRoot := os.Getenv("PROJECT_ROOT")
	if projectRoot == "" {
		projectRoot = "." // 默认当前目录
	}
	envPath := filepath.Join(projectRoot, "GO", "file", "test.txt")
	showFileInfo("4. 环境变量路径", envPath)

	/*
	 * 🔧 老司机调试工具箱
	 */
	printSection("调试信息")

	// 获取当前工作目录（关键！）
	if wd, err := os.Getwd(); err == nil {
		fmt.Printf("当前工作目录: %s\n", wd)
	}

	// 检查文件是否存在（标准写法）
	fileToCheck := rootRelative
	if _, err := os.Stat(fileToCheck); err == nil {
		fmt.Printf("文件存在: %s\n", fileToCheck)
	} else if os.IsNotExist(err) {
		fmt.Printf("文件不存在: %s (提示：检查工作目录设置)\n", fileToCheck)
	} else {
		fmt.Printf("文件检查出错: %v\n", err)
	}

	// 获取绝对路径终极方法
	if abs, err := filepath.Abs(rootRelative); err == nil {
		fmt.Printf("绝对路径转换: %s → %s\n", rootRelative, abs)
	}
}

func showFileInfo(desc string, path string) {
	printSection(desc)
	fmt.Printf("路径格式: %s\n", path)

	// 尝试获取文件信息
	if info, err := os.Stat(path); err == nil {
		fmt.Printf("文件大小: %d bytes\n", info.Size())
		fmt.Printf("最后修改: %s\n", info.ModTime().Format("2025-08-20 15:04:05"))
	} else {
		fmt.Printf("文件访问错误: %v\n", err)
		fmt.Println("💡 提示：可能工作目录设置不正确")
	}
}

func printSection(title string) {
	fmt.Printf("\n=== %s ===\n", title)
}
