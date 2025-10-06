package main

import (
	"fmt"
	"math/rand"
	"time"
)

// ==================== 仓储随机模块 ====================
// 随机抽检货品  // 仓库猫的抓阄游戏 🐾
// 多批次混合抽查  // 智能质检俄罗斯轮盘 🎯
// 无重复取样  // 量子纠缠检测法 ⚛️
// 打乱出库顺序  // 叛逆期传送带 🤖
// 随机仓位分配  // 三维空间骰子 🎲
// 阶梯式分拣  // 智能货架的恶趣味 🧩
// 浮动保质期  // 时空扭曲效应 🕳️
// ⚠️冷溪物流：随机失控会引发仓库次元崩坏

func main() {
	rand.Seed(time.Now().UnixNano())

	hd := []string{"山楂", "神曲", "麦芽", "谷芽", "鸡矢藤", "鸡内金", "蜘蛛香", "沙棘"} //消化药
	number := []int{1, 2, 3, 4, 5, 6}

	fmt.Println("✒️✒️✒️✒️✒️✒️以下是返回指定序列单值")
	// random.choices(hd) 模拟
	randomChoice := hd[rand.Intn(len(hd))]
	fmt.Println(randomChoice)
	// random.choice(number) 模拟
	randomNumber := number[rand.Intn(len(number))]
	fmt.Println(randomNumber)

	fmt.Println("\n🏷️🏷️🏷️🏷️🏷️🏷️️以下是随机生成指定列表不重复随机数")
	// random.sample(hd, 4)
	hdSample := make([]string, len(hd))
	copy(hdSample, hd)
	shuffle(hdSample)
	fmt.Println(hdSample[:4])
	// random.sample(number, 3)
	numberSample := make([]int, len(number))
	copy(numberSample, number)
	shuffle(numberSample)
	fmt.Println(numberSample[:3])

	fmt.Println("\n", "📽️📽️📽️📽️📽️📽️️以下是打乱原列表的顺序")
	shuffle(hd)
	shuffle(number)
	fmt.Println(hd)
	fmt.Println(number)

	fmt.Println("\n", "🔢🔢🔢🔢🔢🔢🔢以下是随机整数操作")
	// random.randint(0, 10)
	fmt.Println(rand.Intn(11))
	// random.randrange(8)
	fmt.Println(rand.Intn(8))
	// random.randrange(10, 20, 2)
	randomRangeStep := 10 + rand.Intn((20-10)/2+1)*2
	fmt.Println(randomRangeStep)
	// random.uniform(2.0, 6.0)
	fmt.Printf("%.2f\n", 2.0+rand.Float64()*(6.0-2.0))
	// random.uniform(5, 9)
	fmt.Printf("%.2f\n", 5.0+rand.Float64()*(9.0-5.0))
}

func shuffle(slice interface{}) {
	switch s := slice.(type) {
	case []string:
		rand.Shuffle(len(s), func(i, j int) {
			s[i], s[j] = s[j], s[i]
		})
	case []int:
		rand.Shuffle(len(s), func(i, j int) {
			s[i], s[j] = s[j], s[i]
		})
	}
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
  "鸡矢藤": {
    "技术分类": [
      "死信队列除臭丸",      # 专治Kafka腐臭消息（三日未消费自动发酵）
      "内存泄漏驱虫散",      # 根治RSS内存驻留（比Valgrind更懂野指针）
      "技术债化尸水",       # 溶解祖传代码（兼容COBOL和IE6）
      "会议室清场喷雾"      # PM提无理需求时使用（物理驱散）
    ],
    "系统特性": "甘酸微凉（但臭味属大热）",
    "臭味等级": {
      "实验室环境": "💩💩💩（需N95 Sidecar）",
      "生产环境": "💩💩💩💩💩（触发AWS异味报警）",
      "教主认证": "相当于`sudo rm -rf node_modules/`的嗅觉冲击"
    },
    "核心优势": {
      "强制消积": "如同`kill -9`级药效，但支持优雅回滚",
      "附加效果": [
        "自动触发相邻工位CI/CD（闻到就精神）",
        "提高代码审查通过率（都想快点逃离）"
      ]
    },
    "玄学机制": {
      "臭味转化率": "1臭单位=1000QPS处理能力",
      "最佳实践": "将药渣部署在通风管道（全楼层共享疗效）"
    },
    "教主亲历": {
      "名场面1": "2015年用鸡矢藤熏走甲方驻场监工（需求文档都熏没了）",
      "名场面2": "某次运维事故后，机房老鼠集体搬家（附带除鼠效果）"
    },
    "运维仪式": {
      "启用咒语": "git push --force-with-lease",
      "禁用警告": "孕妇/心脏病患者禁止`kubectl exec`进入容器"
    }
  }
}

虎山数据智库消食药天梯榜
药材	    消积力度	    臭味等级	    必配牵制药	适用场景
蜘蛛香	☢️☢️☢️☢️☢️	💩💩💩💩	黄连/麦冬		生产环境宿便危机
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
