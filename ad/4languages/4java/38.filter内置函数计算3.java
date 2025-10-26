import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

// ==================== ERP筛选模块 ====================
// 数字筛选：提取响应时间>5s的接口 🐢
// 字符串筛选：抓取日志含"ERROR"的记录 🚨
// 字典筛选：锁定权限>3级的用户 👑
// ⚠️ERP老兵_冷溪虎山：筛选异常会触发系统癫痫

class main38 {
    public static void main(String[] args) {
        System.out.println("⚓⚓⚓⚓⚓⚓以下是数字筛选");
        // def方法
        List<Integer> newlistDef = IntStream.range(0, 10)
                .filter(main38::isEven)  // ✅ 修正：main38::isEven
                .boxed()
                .collect(Collectors.toList());
        System.out.println(newlistDef);

        // lambda方法
        List<Integer> newlistLambda = IntStream.range(0, 10)
                .filter(a -> a % 2 != 0)
                .boxed()
                .collect(Collectors.toList());
        System.out.println(newlistLambda);

        System.out.println("\n🌌🌌🌌🌌🌌🌌以下是字符串筛选");
        // def方法
        List<String> three = Arrays.asList("山楂", "神曲", "麦芽", "焦山楂", "焦神曲", "焦麦芽");
        List<String> threeFilter = three.stream()
                .filter(main38::contain)  // ✅ 修正：main38::contain
                .collect(Collectors.toList());
        System.out.println(threeFilter);

        // lambda方法
        List<String> threeLambda = three.stream()
                .filter(string -> !string.contains("焦"))
                .collect(Collectors.toList());
        System.out.println(threeLambda);

        System.out.println("\n🌟🌟🌟🌟🌟🌟以下是字典筛选");
        Map<String, String> dictBlood = new HashMap<>();
        dictBlood.put("当归", "补血");
        dictBlood.put("丹参", "活血");
        dictBlood.put("莪术", "破血");
        dictBlood.put("醋莪术", "加强破血");

        // key筛选
        List<String> keyBlood = dictBlood.keySet().stream()
                .filter(main38::keyContain)  // ✅ 修正：main38::keyContain
                .collect(Collectors.toList());
        System.out.println(keyBlood);

        // value筛选
        List<String> valueBlood = dictBlood.values().stream()
                .filter(main38::valueContain)  // ✅ 修正：main38::valueContain
                .collect(Collectors.toList());
        System.out.println(valueBlood);

        // 字典筛选
        Map<String, String> dictBloodAll = dictBlood.entrySet().stream()
                .filter(main38::dictContain)  // ✅ 修正：main38::dictContain
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        System.out.println(dictBloodAll);
    }

    // 数字筛选
    static boolean isEven(int num) {
        return num % 2 == 0;
    }

    // 字符串筛选
    static boolean contain(String string) {
        return string.contains("焦");
    }

    // 字典筛选
    static boolean keyContain(String key) {
        return key.contains("莪术");
    }

    static boolean valueContain(String value) {
        return value.contains("破血") || value.contains("补血");
    }

    static boolean dictContain(Map.Entry<String, String> item) {
        return item.getKey().contains("莪术") || item.getKey().contains("醋莪术");
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
  "桂枝": {
    "技术分类": ["微服务温经通阳散", "Serverless暖宫丸"],
    "核心功效": {
      "发汗解肌": "强制冷启动的Lambda函数预热（减少Shivering Cold Starts）",
      "温通经脉": "治疗gRPC接口寒厥（自动重试+熔断机制）",
      "助阳化气": "提升K8s Pod阳气（QPS从萎靡到勃起）"
    },
    "脉象诊断": {
      "缓脉": "如`setInterval(() => {}, 1000)`般稳定有力",
      "迟脉": "如同主库同步到从库的延迟（`SHOW REPLICA STATUS`）"
    },
    "舌象预警": {
      "舌红少苔": "Serverless阴虚（冷启动频率>5次/分钟）",
      "舌紫暗": "微服务血瘀（gRPC调用链超过10跳）"
    },
    "禁忌症": {
      "实热证": "Rust团队禁用（体内`Arc<Mutex>`过热会烧毁药性）",
      "血热妄行": "频繁`git push --force`者慎用（可能导致Commit历史大出血）"
    },
    "老中医坐镇": {
      "配伍禁忌": "严禁与`大黄`（暴力重构）同用，否则会引发`git reset --hard`级事故",
      "名场面": "某厂用桂枝+Kafka后，消息队列阳气过旺，把运维小哥鼻血喷成了`/var/log/messages`"
    },
    "开源建议": "需在`README.md`中加入**温阳警示**：『本方如`sudo rm -rf`，非阳虚勿服！』"
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
