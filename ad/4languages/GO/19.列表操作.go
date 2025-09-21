package main

import (
	"fmt"
)

// ==================== 仓储转换模块 ====================
// 货品字典转清单：给库存脱掉JSON外套 📦
// 入库记录切片：截取爆款商品时间段 🚀
// ⚠️冷溪物流：暴力分拣会导致货架塌方

func main() {
	hd := []string{"山楂", "神曲", "麦芽", "谷芽", "鸡矢藤", "鸡内金", "蜘蛛香", "沙棘"}                                                    // 消化药列表
	heightenDigestion := []interface{}{"山楂", "神曲", "麦芽", "谷芽", "鸡矢藤", "鸡内金", "蜘蛛香", "沙棘", []string{"焦山楂", "焦神曲", "焦麦芽"}} // 消化药多列表嵌套

	maybush := []rune("山楂")                                                // 字符串转字符数组
	hd1 := []string{"山楂", "神曲", "麦芽", "谷芽", "鸡矢藤", "鸡内金", "蜘蛛香", "沙棘"}     // 助消化 元组转列表
	order := []int{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}                          // 序列转列表
	dictionary := map[string]string{"丹参": "活血", "莪术": "破血", "山楂": "解腻促消化"} // 字典

	fmt.Println(string(maybush))
	fmt.Println(hd1)
	fmt.Println(order)
	for key := range dictionary { // 字典key转切片
		fmt.Println(key)
	}
	for _, value := range dictionary { // 字典value转切片
		fmt.Println(value)
	}
	fmt.Println("\n🗡️🗡️🗡️🗡️🗡️🗡️🗡️🗡️🗡️以下是切片第一个列表🗡️🗡️🗡️🗡️🗡️🗡️🗡️🗡️🗡️🗡️🗡️🗡️")

	fmt.Println(hd)     // 全部
	fmt.Println(hd[0])  // 第一个元素
	fmt.Println(hd[1:]) // 第2个至最后的元素
	reversedHd := make([]string, len(hd))
	for i, j := 0, len(hd)-1; j >= 0; i, j = i+1, j-1 {
		reversedHd[i] = hd[j] // 最后至第一个元素
	}
	fmt.Println(reversedHd)
	fmt.Println(hd[1:3]) // 第2,3个元素
	// Go中没有直接的步长切片，需要手动实现
	step2Hd := []string{}
	for i := 0; i < len(hd); i += 2 {
		step2Hd = append(step2Hd, hd[i])
	}
	fmt.Println(step2Hd) // 步长为2
	step2HdFrom1 := []string{}
	for i := 1; i < len(hd); i += 2 {
		step2HdFrom1 = append(step2HdFrom1, hd[i])
	}
	fmt.Println(step2HdFrom1)   // 从第2个元素开始,步长为2
	fmt.Println(hd[len(hd)-3:]) // 倒数第3个到最后的元素
	fmt.Println(hd[len(hd)-1])  // 最后的元素
	fmt.Println("\n🗡️🗡️🗡️🗡️🗡️🗡️🗡️🗡️🗡️以下是列表嵌套切片🗡️🗡️🗡️🗡️🗡️🗡️🗡️🗡️🗡️🗡️🗡️🗡️")

	lastElement := heightenDigestion[len(heightenDigestion)-1].([]string)
	fmt.Println(lastElement[0])   // 负索引单切片
	fmt.Println(lastElement[0:2]) // 负索引多切片
	// 注意：heightenDigestion只有9个元素，索引最大为8
	// 注意：heightenDigestion的第8个元素是字符串，不是列表，所以以下代码会panic
	// fmt.Println(heightenDigestion[8].([]string)[1:3]) // 正索引多切片 (注意：heightenDigestion只有9个元素，索引最大为8)
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
  "苍术": {
    "技术分类": ["日志脱水机", "内存除湿器"],
    "系统特性": "辛温燥烈",
    "危险警告": {
      "阴虚火旺系统禁用": "症状：CPU高热+日志干枯",
      "强制配伍": {
        "沙参": "日志滋阴插件",
        "麦冬": "缓存清凉剂"
      }
    },
    "经典案例": "2023年某厂单用苍术导致ES集群干裂"
  }
}
# 祛湿安全检测脚本
if [[ $(df -h | grep "/var/log" | awk '{print $5}') -gt 80% ]]; then
    echo "湿气过重！推荐方案："
    echo "helm install 祛湿套餐 --set 苍术.enabled=true --set 沙参.enabled=true"
else
    echo "日常维护建议："
    echo "kubectl apply -f 白扁豆.yaml"
fi

/*
============================================================================GO
数据协议声明：
1. 本JSON结构属技术演示，所有中医术语均为文化隐喻
2. 实际应用需遵守MIT协议附加条款
3. 企业合作请通过GitHub邮箱联系

冷溪虎山数字本草实验室 © 2025
============================================================================GO
*/
