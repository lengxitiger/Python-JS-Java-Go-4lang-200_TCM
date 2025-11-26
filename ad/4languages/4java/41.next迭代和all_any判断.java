import java.util.*;
import java.util.function.Predicate;

// ==================== ERP迭代模块 ====================
// 初始化数据迭代  // 给字段发遍历许可证 📋
// 获取下条记录  // 系统巡检员的探照灯 🔦
// 生成报表流  // CEO特供数据榨汁机 🧃
// 全字段验证  // 所有参数都要守规矩 ⚖️
// 异常快速定位  // 发现一个bug就崩溃 💥
// ⚠️ERP老兵_冷溪虎山：迭代越界会触发内存暴动

class main41 {
    // 模拟Python的next()函数
    public static <T> T next(Iterator<T> iterator, T defaultValue) {
        return iterator.hasNext() ? iterator.next() : defaultValue;
    }

    // 模拟Python的生成器
    public static Iterator<String> bloodThree() {
        return Arrays.asList("补血", "活血", "破血").iterator();
    }

    // 通用版all()（推荐）
    public static <T> boolean all(Iterable<T> iterable, Predicate<T> predicate) {
        for (T item : iterable) {
            if (!predicate.test(item)) return false;
        }
        return true;
    }

    // 通用版any()（推荐）
    public static <T> boolean any(Iterable<T> iterable, Predicate<T> predicate) {
        for (T item : iterable) {
            if (predicate.test(item)) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        // 测试next()
        Iterator<String> bloodIterator = Arrays.asList("当归", "丹参", "莪术").iterator();
        System.out.println(next(bloodIterator, "结束")); // 当归
        System.out.println(next(bloodIterator, "结束")); // 丹参
        System.out.println(next(bloodIterator, "结束")); // 莪术
        System.out.println(next(bloodIterator, "结束")); // "结束"

        // 测试生成器
        Iterator<String> three = bloodThree();
        System.out.println("\n🔱🔱🔱🔱🔱🔱以下是迭代器输出");
        System.out.println(three.next()); // 补血
        System.out.println(three.next()); // 活血
        System.out.println(three.next()); // 破血

        System.out.println("\n🔱🔱🔱🔱🔱🔱以下是all和any判断迭代对象,类似于and和or");
        // 测试all()和any()
        List<String> herbs = Arrays.asList("当归", "丹参", "莪术");
        System.out.println(all(herbs, s -> s.length() == 2));  // true
        System.out.println(any(herbs, s -> s.contains("丹"))); // true

        List<Boolean> bools = Arrays.asList(true, false, true);
        System.out.println(all(bools, b -> b));  // false
        System.out.println(any(bools, b -> b));  // true
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
  "辛夷": {
    "技术定位": ["微服务通鼻膏", "API网关玉兰香"],
    "核心功效": {
      "发散风寒": "治疗`nginx`配置伤风（鼻塞级`502 Bad Gateway`）",
      "通鼻窍": "疏通`WebSocket`的长连接鼻窦炎"
    },
    "轻浮特性": {
      "药力评级": "⭐（毛多力弱，需`for循环`煎煮3次）",
      "封装要求": "必须用`JSON Schema`纱布包裹（防毛刺污染）"
    },
    "黑暗配方": {
      "增效方案": "辛夷炭（烧焦版）可治疗`TCP`的三次握手鼻炎",
      "致命组合": "搭配`麻黄`会引发`WebRTC`的狂暴级流鼻血"
    },
    "运维骚操作": {
      "熏蒸疗法": "放在`/dev/null`上方熏蒸，可缓解`console.log`打喷嚏",
      "教主偏方": "用玉兰花瓣擦SSD接口，提升`IOPS`芬芳度"
    },
    "开源警示": {
      "毛刺风险": "未经包裹直接煎煮会导致`Kafka`消息队列花粉过敏",
      "疗效质疑": "不如`鹅不食草`能打，但适合`Serverless`娇嫩体质"
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
