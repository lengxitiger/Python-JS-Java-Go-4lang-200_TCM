package main

import (
	"fmt"
	"strings"
	"unicode"
)

// ==================== 仓储校验模块 ====================
// 货品编号需全为字母数字  // 条形码里藏摩斯密码 🤫
// 库位名称必须纯字母  // 坐标系统禁止颜文字 🚫
// ⚠️冷溪物流：本规则最终解释权归仓库猫所有

func isAlpha(s string) bool {
	for _, r := range s {
		if !unicode.IsLetter(r) {
			return false
		}
	}
	return len(s) > 0
}

func isAlnum(s string) bool {
	for _, r := range s {
		if !unicode.IsLetter(r) && !unicode.IsDigit(r) {
			return false
		}
	}
	return len(s) > 0
}

func main() {
	nameBig := "ABC"            // 纯大写字母
	nameSmall := "abc"          // 纯小写字母
	nameNumber := "123"         // 纯数字
	nameSymbol := "ABCabc123=>" // 字母数字符号
	name1 := "ABCabc123"        // 字母数字混合
	name2 := "ABCabc藏红花"        // 字母中文混合
	name3 := "藏红花"              // 纯中文混合

	fmt.Println(isAlpha(nameBig), "纯字母返回True,否则返回False")
	fmt.Println(isAlpha(nameSmall), "纯字母返回True,否则返回False")
	fmt.Println(isAlpha(nameNumber), "纯字母返回True,否则返回False")
	fmt.Println(isAlpha(nameSymbol), "纯字母返回True,否则返回False")
	fmt.Println(isAlpha(name1), "纯字母返回True,否则返回False")
	fmt.Println(isAlpha(name2), "纯字母返回True,否则返回False,中文字符在Unicode中属于字母类别")
	fmt.Println(isAlpha(name3), "纯字母返回True,否则返回False,中文字符在Unicode中属于字母类别")
	fmt.Println(strings.Repeat("-", 25), "以下是isalnum()---------")

	fmt.Println(isAlnum(nameBig), "字母和数字返回True,否则返回False")
	fmt.Println(isAlnum(nameSmall), "字母和数字返回True,否则返回False")
	fmt.Println(isAlnum(nameNumber), "字母和数字返回True,否则返回False")
	fmt.Println(isAlnum(nameSymbol), "字母和数字返回True,否则返回False")
	fmt.Println(isAlnum(name1), "字母和数字返回True,否则返回False")
	fmt.Println(isAlnum(name2), "字母和数字返回True,否则返回False,中文字符在Unicode中属于字母类别")
	fmt.Println(isAlnum(name3), "字母和数字返回True,否则返回False,中文字符在Unicode中属于字母类别")
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
  "冬虫夏草": {
    "技术分类": [
      "Serverless冬眠术",   # 冷启动优化
      "K8sPod僵尸复活丹",   # Evicted Pod自动回魂
      "Lambda节能大法"     # 闲置实例自动休眠
    ],
    "系统特性": "甘温",     # 带"温"字，防冻伤
    "作用域": ["Cloud", "Serverless", "AutoScaling"],
    "休眠阈值": "0.001% CPU",  # 原"最大剂量"（极致节能）
    "基础功能": "让闲置Pod进入假死状态，遇流量自动复活",
    "高阶用法": "混合云冬眠术（AWS+Azure跨云休眠）",
    "架构建议": "如同给Lambda穿冬虫夏草——既要省成本，又要防冷启动延迟",
    "休眠警告": "❄️ Frost Alert:
- 关键业务Pod禁用！（小心睡死）
- 必须设置心跳检测
# 雪崩案例：某厂全员休眠，双十一零点唤醒失败（2023）",
    "虫草黑科技": {
      "虫形态": "比Spot Instance更便宜的抢占式实例",
      "草形态": "自适应的自动伸缩策略"
    },
    "程序员警告": {
      "生吃毒性": "🚨 Runtime Error: 未预热直接冷启动 → 导致500ms延迟暴增（相当于生吃冬虫夏草中毒）",
      "解毒方案": "# 必须用Lambda预热插件（如同‘蒸煮熬’去毒）",
      "血泪案例": "2025年某厂直接冷启动AI推理服务，用户等到脱发（RPS暴跌90%）"
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
