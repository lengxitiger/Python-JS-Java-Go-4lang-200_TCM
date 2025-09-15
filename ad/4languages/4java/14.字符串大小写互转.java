// ==================== ERP格式转换 ====================
// 常量转大写  // 系统界的咆哮体 📢
// 变量转小写  // 临时工不配大写 🪑
// 首字母大写  // 给字段发正式工牌 💼
// 报表标题格式化  // CEO最爱的大标题 📑
// 大小写反转  // 防止黑客规律破解 🕵️♂️
// 全小写兼容  // 跨系统通信必备 📡
// ⚠️ERP老兵_冷溪虎山：格式不规范，运维两行泪

class main14 {
    public static void main(String[] args) {
        String language = "python JS GO Java";

        System.out.println(language.toUpperCase() + " 英文全部大写"); // 英文全部大写
        System.out.println(language.toLowerCase() + " 英文全部小写"); // 英文全部小写
        System.out.println(capitalize(language) + " 单词首字母大写"); // 单词首字母大写（注意：此实现是整个字符串的首字母大写）
        System.out.println(toTitleCase(language) + " 句子首字母大写"); // 句子首字母大写
        System.out.println(swapCase(language) + " 大小写互转"); // 大小写互转
        System.out.println(language.toLowerCase() + " 全部小写"); // 全部小写（Java没有casefold，但toLowerCase类似）
    }

    public static String capitalize(String s) {
        if (s == null || s.isEmpty()) {
            return s;
        }
        return s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase();
    }

    public static String toTitleCase(String s) {
        StringBuilder converted = new StringBuilder();
        boolean convertNext = true;
        for (char ch : s.toCharArray()) {
            if (Character.isSpaceChar(ch)) {
                convertNext = true;
            } else if (convertNext) {
                ch = Character.toTitleCase(ch);
                convertNext = false;
            } else {
                ch = Character.toLowerCase(ch);
            }
            converted.append(ch);
        }
        return converted.toString();
    }

    public static String swapCase(String s) {
        StringBuilder swapped = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isUpperCase(c)) {
                swapped.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                swapped.append(Character.toUpperCase(c));
            } else {
                swapped.append(c);
            }
        }
        return swapped.toString();
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
  "太子参": {
    "技术分类": [
      "线程池小儿补剂",  # 适合初创公司
      "低配ECS益气丹",   # 1核1G专属
      "IoT设备参片"     # 树莓派也能跑
    ],
    "系统特性": "甘微苦平",
    "vs西洋参": {
      "优势": "不会引发监控指标上火（CPU<50%适用）",
      "劣势": "618大促时不如西洋参给力"
    },
    "经典配伍": {
      "基础版": "太子参 + Prometheus轻量Exporter",
      "进阶版": "太子参 + 陈皮（防消息队列积食）"
    },
    "教主警告": "某厂误当西洋参用于双十一，补气不足反被流量踩踏"
  }
}
根据系统体质选药
if [[ $(kubectl get nodes -o json | jq '.items[].status.conditions[] | select(.type=="MemoryPressure") | .status' ) == "True" ]]; then
    echo "选用西洋参+麦冬（气阴双补）"
else
    echo "可尝试红景天+陈皮（平稳抗压）"
fi

# 永远记住
echo "气有余便是火 → QPS突增必熔断！"

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
