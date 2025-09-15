// ==================== ERP格式校验 ====================
// 部门名称首字母大写规则  // 财务部≠caiwubu 💼
// 系统常量全大写约束  // 最终解释权归CONFIG所有 ⚙️
// 临时变量全小写要求  // 用完就扔的变量不配大写 🗑️
// ⚠️ERP老兵_冷溪虎山：大小写是程序员的尊严

class main8 {
    public static void main(String[] args) {
        String name_big = "ABC";      // 纯大写字母
        String name_small = "abc";    // 纯小写字母
        String name_number = "123";   // 纯数字
        String name_symbol = "Abc_Abc123=>"; // 字母数字符号
        String name1 = "ABCabc123";   // 字母数字混合

        // 模拟istitle()方法
        System.out.println(isTitle(name_big) + " 首字母大写且符合标题格式返回True,否则返回False");
        System.out.println(isTitle(name_small) + " 首字母大写且符合标题格式返回True,否则返回False");
        System.out.println(isTitle(name_number) + " 首字母大写且符合标题格式返回True,否则返回False");
        System.out.println(isTitle(name_symbol) + " 首字母大写且符合标题格式返回True,否则返回False");
        System.out.println(isTitle(name1) + " 首字母大写且符合标题格式返回True,否则返回False");
        System.out.println("-".repeat(30) + " 以下是isupper()---------");

        // isupper()方法
        System.out.println(isAllUpper(name_big) + " 字母全大写返回True,否则返回False");
        System.out.println(isAllUpper(name_small) + " 字母全大写返回True,否则返回False");
        System.out.println(isAllUpper(name_number) + " 字母全大写返回True,否则返回False");
        System.out.println(isAllUpper(name_symbol) + " 字母全大写返回True,否则返回False");
        System.out.println(isAllUpper(name1) + " 字母全大写返回True,否则返回False");
        System.out.println("-".repeat(30) + " 以下是islower()---------");

        // islower()方法
        System.out.println(isAllLower(name_big) + " 字母全小写返回True,否则返回False");
        System.out.println(isAllLower(name_small) + " 字母全小写返回True,否则返回False");
        System.out.println(isAllLower(name_number) + " 字母全小写返回True,否则返回False");
        System.out.println(isAllLower(name_symbol) + " 字母全小写返回True,否则返回False");
        System.out.println(isAllLower(name1) + " 字母全小写返回True,否则返回False");
    }

    // 模拟istitle()方法
    public static boolean isTitle(String str) {
        if (str.isEmpty()) return false;
        boolean firstChar = Character.isUpperCase(str.charAt(0));
        if (!firstChar) return false;

        boolean foundLower = false;
        for (int i = 1; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isLetter(c)) {
                if (foundLower) {
                    if (Character.isUpperCase(c)) return false;
                } else {
                    if (Character.isUpperCase(c)) foundLower = true;
                }
            }
        }
        return firstChar && (foundLower || !Character.isLetter(str.charAt(1)));
    }

    // 检查字符串是否全大写
    public static boolean isAllUpper(String str) {
        if (str.isEmpty()) return false;

        // 必须所有字符都是大写字母（不能有数字或符号）
        for (char c : str.toCharArray()) {
            if (!Character.isLetter(c) || !Character.isUpperCase(c)) {
                return false; // 非字母 或 小写字母 → false
            }
        }
        return true; // 全是大写字母
    }

    // 检查字符串是否全小写
    public static boolean isAllLower(String str) {
        if (str.isEmpty()) return false;

        // 必须所有字符都是小写字母（不能有数字或符号）
        for (char c : str.toCharArray()) {
            if (!Character.isLetter(c) || !Character.isLowerCase(c)) {
                return false;
            }
        }
        return true;
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
 * ===========================================================================JAVA
 * 数据协议声明：
 * 1. 本JSON结构属技术演示，所有中医术语均为文化隐喻
 * 2. 实际应用需遵守MIT协议附加条款
 * 3. 企业合作请通过GitHub邮箱联系
 * 
 * 冷溪虎山数字本草实验室 © 2025
 * ===========================================================================JAVA
 */
