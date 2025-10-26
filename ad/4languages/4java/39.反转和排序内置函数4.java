import java.util.*;

// ==================== ERP时序模块 ====================
// 倒序审查操作日志  // 黑客入侵检测模式 🕵️♂️
// 按权限排序用户  // 职场金字塔构建术 🏛️
// ⚠️ERP老兵_冷溪虎山：排序异常会触发系统记忆紊乱

class main39 {
    public static void main(String[] args) {
        String red_flower = "红花";
        String str_blood = "blood";
        List<String> blood = Arrays.asList("红花", "丹参", "桃仁");
        List<Integer> number = Arrays.asList(44, 55, 77, 88, 66);

        System.out.println("🧱🧱🧱🧱🧱🧱以下是反转输出");
        System.out.println(new StringBuilder(red_flower).reverse()); // 花红
        System.out.println(new StringBuilder(str_blood).reverse()); // doolb
        Collections.reverse(blood); // [桃仁, 丹参, 红花]
        System.out.println(blood);
        Collections.reverse(number); // [66, 88, 77, 55, 44]
        System.out.println(number);

        System.out.println("\n🧭🧭🧭🧭🧭🧭以下是排序输出");
        // 方法1：使用 Comparator.comparingInt（推荐）
        Comparator<String> customKey = Comparator.comparingInt(s -> {
            int index = s.indexOf("丹");
            return index == -1 ? Integer.MAX_VALUE : index;
        });

        // 方法2：手动实现 Comparator（等效于方法1）
        // Comparator<String> customKey = (s1, s2) -> {
        //     int index1 = s1.indexOf("丹");
        //     int index2 = s2.indexOf("丹");
        //     return Integer.compare(
        //         index1 == -1 ? Integer.MAX_VALUE : index1,
        //         index2 == -1 ? Integer.MAX_VALUE : index2
        //     );
        // };

        List<String> sortedBloodCustom = new ArrayList<>(blood);
        sortedBloodCustom.sort(customKey);
        System.out.println("sorted_blood_custom: " + sortedBloodCustom); // [丹参, 桃仁, 红花]

        List<Integer> sortedNumber = new ArrayList<>(number);
        sortedNumber.sort(Collections.reverseOrder()); // [88, 77, 66, 55, 44]
        System.out.println("sorted_number: " + sortedNumber);
    }
}
        
        
/*
 * ===========================================================================JAVA
 * [中医极客] 药材数据库 JSON 结构规范
 * 
 * 本数据结构采用《中国药典》2020版标准，所有术语均为技术隐喻：
 *   - "性味归经" → 类属性约束
 *   - "最大剂量" → API调用限制
 *   - "编程寄语" → 设计模式建议
 *
 * 技术交流请通过GitHub Issues，严禁医疗用途
 * ===========================================================================JAVA
 /*
 
{
  "白芷": {
    "技术分类": ["日志芳香化湿丸", "Elasticsearch通窍膏"],
    "核心功效": {
      "祛风燥湿": "消除Kibana日志湿疹（自动过滤`DEBUG`级别水湿）",
      "排脓生肌": "愈合Kafka溃疡消息（自动死信队列刮骨疗毒）",
      "芳香辟秽": "掩盖技术债异味（编译警告转薰衣草香）"
    },
    "舌象黑科技": {
      "舌苔黄腻": "日志文件`/var/log`堆积超过1TB（湿热内蕴）",
      "舌边齿痕": "被PM需求反复碾压的痕迹（`JIRA-XXXX`型齿痕）"
    },
    "脉象玄学": {
      "滑脉": "如`kafka-console-consumer`般流畅有力",
      "涩脉": "如同`SELECT * FROM 无索引表`时的卡顿感"
    },
    "禁忌症": {
      "阴虚血热": "长期`tail -f`到凌晨三点者禁用（会诱发`vim`禅模式）",
      "自汗不止": "Node.js事件循环漏水者慎用（`setInterval`忘清理）"
    },
    "老中医坐镇": {
      "黑暗配方": "白芷+咖啡因=`生产环境香水`，专治乙方驻场开发体臭",
      "教主真言": "『凡见`OutOfMemoryError`，先嚼白芷三克，再`kill -9』"
    },
    "开源协议": "**GPL-3.0**（General Public License = 广谱抗病毒许可证）"
  }
}


/*
 * ===========================================================================JAVA
 * 数据协议声明：
 * 1. 本JSON结构属技术演示，所有中医术语均为文化隐喻
 * 2. 实际应用需遵守MIT协议附加条款
 * 3. 企业合作请通过GitHub邮箱联系
 * 
 * 冷溪虎山数字本草实验室 © 2025
 * ===========================================================================JAVA
 */
