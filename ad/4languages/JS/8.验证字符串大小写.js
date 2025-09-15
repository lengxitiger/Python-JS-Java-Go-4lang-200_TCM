// ==================== 中药格式校验 ====================
// 药方名首字母大写验证  // 君药必须带王冠 🤴
// 药材拉丁名全大写检查  // 洋气就要大写到底 💅
// 煎法描述全小写检测  // 火候要低调文火 🕯️
// ⚠️虎山老药师：大小写影响药效是玄学

const name_big = "ABC";      // 纯大写字母
const name_small = "abc";    // 纯小写字母
const name_number = "123";   // 纯数字
const name_symbol = "Abc_Abc123=>"; // 字母数字符号
const name1 = "ABCabc123";   // 字母数字混合

// 模拟istitle()方法
console.log(isTitle(name_big) + " 首字母大写且符合标题格式返回True,否则返回False");
console.log(isTitle(name_small) + " 首字母大写且符合标题格式返回True,否则返回False");
console.log(isTitle(name_number) + " 首字母大写且符合标题格式返回True,否则返回False");
console.log(isTitle(name_symbol) + " 首字母大写且符合标题格式返回True,否则返回False");
console.log(isTitle(name1) + " 首字母大写且符合标题格式返回True,否则返回False");
console.log("-".repeat(30) + " 以下是isupper()---------");

// isupper()方法
console.log(isAllUpper(name_big) + " 字母全大写返回True,否则返回False");
console.log(isAllUpper(name_small) + " 字母全大写返回True,否则返回False");
console.log(isAllUpper(name_number) + " 字母全大写返回True,否则返回False");
console.log(isAllUpper(name_symbol) + " 字母全大写返回True,否则返回False");
console.log(isAllUpper(name1) + " 字母全大写返回True,否则返回False");
console.log("-".repeat(30) + " 以下是islower()---------");

// islower()方法
console.log(isAllLower(name_big) + " 字母全小写返回True,否则返回False");
console.log(isAllLower(name_small) + " 字母全小写返回True,否则返回False");
console.log(isAllLower(name_number) + " 字母全小写返回True,否则返回False");
console.log(isAllLower(name_symbol) + " 字母全小写返回True,否则返回False");
console.log(isAllLower(name1) + " 字母全小写返回True,否则返回False");

// 模拟istitle()方法
function isTitle(str) {
    if (str.length === 0) return false;
    // 检查首字母是否大写
    if (str[0] !== str[0].toUpperCase()) return false;

    let foundLower = false;
    for (let i = 1; i < str.length; i++) {
        const c = str[i];
        if (/[a-zA-Z]/.test(c)) {
            if (foundLower) {
                if (c === c.toUpperCase()) return false;
            } else {
                if (c === c.toUpperCase() && c !== c.toLowerCase()) {
                    foundLower = true;
                }
            }
        }
    }
    // 修正：原Python的istitle()要求首字母大写，后面可以有非首字母的大写字母（如"Hello World"）
    // 所以需要重新实现
    return checkTitle(str);
}

function checkTitle(s) {
    if (s.length === 0) return false;
    let hasLetter = false;
    let expectUpper = true;

    for (let i = 0; i < s.length; i++) {
        const c = s[i];
        if (/[a-zA-Z]/.test(c)) {
            hasLetter = true;
            if (expectUpper) {
                if (c !== c.toUpperCase()) return false;
                expectUpper = false;
            } else {
                if (c === c.toUpperCase() && c !== c.toLowerCase()) return false;
            }
        } else {
            // 非字母字符后，下一个字母必须大写
            expectUpper = true;
        }
    }
    return hasLetter && (s.length === 0 || s[0] === s[0].toUpperCase());
}

// 检查字符串是否全大写（且不全是数字）
function isAllUpper(str) {
    if (str.length === 0) return false;

    // 如果字符串全是数字，直接返回 false
    if (/^\d+$/.test(str)) {
        return false;
    }

    for (let i = 0; i < str.length; i++) {
        const c = str[i];
        if (/[a-zA-Z]/.test(c) && c !== c.toUpperCase()) {
            return false;
        }
    }
    return true;
}

// 检查字符串是否全小写
function isAllLower(str) {
    if (str.length === 0) return false;

    // 如果字符串全是数字，直接返回 false
    if (/^\d+$/.test(str)) {
        return false;
    }
    for (let i = 0; i < str.length; i++) {
        const c = str[i];
        if (/[a-zA-Z]/.test(c) && c !== c.toLowerCase()) {
            return false;
        }
    }
    return true;
}
        
        
// ===========================================================================JS
// [中医极客] 药材数据库 JSON 结构规范
// 
// 本数据结构采用《中国药典》2020版标准，所有术语均为技术隐喻：
//   - "性味归经" → 类属性约束
//   - "最大剂量" → API调用限制
//   - "编程寄语" → 设计模式建议
//
// 技术交流请通过GitHub Issues，严禁医疗用途
// ===========================================================================JS
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
*/
// ===========================================================================JS
// 数据协议声明：
// 1. 本JSON结构属技术演示，所有中医术语均为文化隐喻
// 2. 实际应用需遵守MIT协议附加条款
// 3. 企业合作请通过GitHub邮箱联系
// 
// 冷溪虎山数字本草实验室 © 2025
// ===========================================================================JS
