import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

// ==================== ERP统计模块 ====================
// 统计字段数量  // 数数系统有几个参数在裸奔 🏃
// 批量转换数据  // 给每个字段穿职业装 👔
// 关联主外键  // 数据库的强制相亲 👩❤️💋👨
// ⚠️ERP老兵_冷溪虎山：乱关联会触发系统性冷淡

class main40 {
    public static void main(String[] args) {
        String red_flower = "红花";
        String str_blood = "blood";
        List<String> blood = Arrays.asList("当归", "丹参", "桃仁");
        List<Integer> number = Arrays.asList(44, 55, 77, 88, 66);
        Map<String, String> three = new HashMap<>();
        three.put("山楂", "焦山楂");
        three.put("神曲", "焦神曲");
        three.put("麦芽", "焦麦芽");

        System.out.println("⏩⏩⏩⏩⏩⏩以下是迭代对象的长度len");
        System.out.println(red_flower.length()); // 2
        System.out.println(str_blood.length());  // 5
        System.out.println(blood.size());      // 3
        System.out.println(number.size());     // 5
        System.out.println(three.size());      // 3

        System.out.println("\n⏬⏬⏬⏬⏬⏬以下是迭代对象map的操作");
        List<String> new_blood = blood.stream()
                .map(a -> a + "活血")
                .collect(Collectors.toList());
        Map<String, String> dictmap_blood = IntStream.range(0, blood.size())
                .boxed()
                .collect(Collectors.toMap(
                        blood::get,
                        i -> Arrays.asList("补血", "活血", "破血").get(i)
                ));
        System.out.println(new_blood);
        System.out.println(dictmap_blood);

        System.out.println("\n🆕🆕🆕🆕🆕🆕以下是迭代对象zip的操作");
        // 修正1：使用 keySet() 和 values() 代替 keys()
        List<String> keys = new ArrayList<>(three.keySet()); // 转为有序列表
        List<String> values = new ArrayList<>(three.values());

        // 修正2：直接配对键值，避免索引操作
        List<List<String>> zip_three = IntStream.range(0, three.size())
                .boxed()
                .map(i -> Arrays.asList(keys.get(i), values.get(i))) // 明确类型为 List<String>
                .collect(Collectors.toList());

        // 修正3：安全转换类型
        Map<String, String> dictzip_three = zip_three.stream()
                .collect(Collectors.toMap(
                        list -> list.get(0),  // 键
                        list -> list.get(1)   // 值
                ));

        System.out.println(dictmap_blood);
        System.out.println(zip_three);
        System.out.println(dictzip_three); // 输出与原 three 相同（因为只是重新组装）
        LengxiHushan40.remind(10);
    }
}

/*
🌟 常用 Stream 操作速查
操作	用途	示例
filter	过滤元素	.filter(s -> s.length() > 3)
map	转换元素	.map(String::toUpperCase)
flatMap	扁平化嵌套集合	.flatMap(list -> list.stream())
sorted	排序	.sorted(Comparator.comparingInt(...))
distinct	去重	.distinct()
collect	收集结果	.collect(Collectors.toList())
forEach	遍历（副作用）	.forEach(System.out::println)
 */
        
        
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
  "紫苏": {
    "技术定位": ["K8s海产解毒剂", "CI/CD生鱼片刺身伴侣"],
    "核心功效": {
      "解表发汗": "如同`kubectl rollout restart`级轻量发汗",
      "鱼蟹解毒": "专治`docker pull`到带毒镜像（秒杀404 Not Found之毒）",
      "行气和胃": "调和`gRPC`与`RESTful`的寒热不和"
    },
    "轻浮特性": {
      "煎煮时间": "≤3分钟（相当于`timeout 3s curl API`）",
      "药力曲线": "陡峭如`AWS Lambda`冷启动曲线"
    },
    "禁忌风暴": {
      "过量警告": "日服超过30克会导致`kubectl get pods`返回全量海鲜菜谱",
      "特殊体质": "对`yaml`缩进过敏者慎用（可能诱发`IndentationError`）"
    },
    "老中医暴论": {
      "海鲜市场实战": "曾用紫苏煮水冲洗服务器，治愈某厂`docker-compose.yml`的螃蟹依赖症",
      "教主亲测": "生吞紫苏叶后，`helm install`自动跳过所有`imagePullPolicy: Always`"
    },
    "玄学扩展": {
      "气味驱邪": "放在机房可驱散`Java 8`的陈旧气息",
      "药渣利用": "晒干后塞进机械键盘，预防`sudo rm -rf`手滑"
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
class LengxiHushan40 {
    public static void remind(int chapter) {
        System.out.println(
                "\n☕【Java老中医lengxitiger关爱提示】☕\n" +
                        "您已连续学习" + chapter + "个章节！\n" +
                        "建议：\n" +
                        "1. 做10个深蹲\n" +
                        "2. 远眺窗外6米外\n" +
                        "3. 对本虎山和自己说声'我超棒'\n" +
                        "注意：你的头发是本项目重要资产！\n"
        );
    }
}