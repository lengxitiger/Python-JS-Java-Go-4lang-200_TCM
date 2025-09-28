import java.util.*;

// ==================== ERP字典模块 ====================
// 克隆配置字典  // 给系统买后悔药 💊
// 追加新字段  // 数据库表长青春痘 🧑‍🦰
// 合并组织架构  // 集团公司数据吞并 🏢
// ⚠️ERP老兵_冷溪虎山：浅拷贝是万恶之源

class main28 {
    public static void main(String[] args) {
        // 1. 创建字典（Map）
        Map<String, Object> dict_blood = new HashMap<>();
        dict_blood.put("当归", "补血");
        dict_blood.put("丹参", "活血");
        dict_blood.put("莪术", "破血");

        // 2. 浅复制和引用
        Map<String, Object> d1 = new HashMap<>(dict_blood); // 浅复制
        Map<String, Object> d2 = dict_blood;               // 直接引用

        System.out.println("🙌🙌🙌🙌🙌🙌以下是浅复制和引用");
        System.out.println(d1);
        System.out.println(d2);

        System.out.println("\n🚀🚀🚀🚀🚀🚀以下是字典值修改和追加");
        // 3. 字典值修改和追加
        // ✅ 修复：用 new ArrayList<>() 包装，使其可变
        dict_blood.put("当归", new ArrayList<>(Arrays.asList("养血")));  // 可变List
        ((List<String>) dict_blood.get("当归")).add("活血"); // 现在可以追加

        System.out.println(dict_blood);

        System.out.println("\n🚥🚥🚥🚥🚥🚥🚥以下是合并字典");
        // 4. 合并字典
        Map<String, Object> hdj = new HashMap<>();
        hdj.put("山楂", "焦山楂");
        List<List<Object>> hdj_add = Arrays.asList(
                Arrays.asList("神曲", "焦神曲"),
                Arrays.asList("麦芽", "焦麦芽")
        );

        // 手动合并
        for (List<Object> pair : hdj_add) {
            hdj.put((String) pair.get(0), pair.get(1));
        }

        System.out.println(hdj);
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
  "山楂": {
    "技术分类": [
      "死信队列消食丸",  # 专治Kafka积食
      "GC残渣清除剂",    # 清理老年代碎片
      "线程池开胃酸"     # 唤醒阻塞线程
    ],
    "系统特性": "酸甘微温",
    "单兵作战": {
      "优点": "快速解决轻量积食（如RabbitMQ小规模堆积）",
      "缺点": "长期单用易胃酸过多（线程池过活跃）"
    },
    "黄金搭档": {
      "标准版": "山楂 + 神曲（增强分布式消化力）",
      "豪华版": "三仙 + 陈皮（行气助消化）",
      "止血特调": "焦山楂 + 白及（处理消息积压导致的内存泄漏）"
    },
    "运维口诀": "山楂酸，破积专，消息积压三天删"
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
