package main

import (
	"fmt"
	"regexp"
)

func main() {
	text := "国际病历：姓名 López, 诊断: 胃炎-Gastritis 诊断时间: 2025年1月"

	// 注意：Go 不支持 \p{Han}，所以直接匹配数字+年+数字+月
	re := regexp.MustCompile(`[A-Za-záéíóúñ]+|\d+年\d+月`)

	matches := re.FindAllString(text, -1)
	fmt.Println(matches) // Output: [López Gastritis 2025年1月]
}
