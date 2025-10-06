import java.util.*;

// ==================== ERP集合模块 ====================
// 添加新权限  // 给系统打安全补丁 🔒
// 随机清理缓存  // 内存救急抽奖箱 🎰
// 安全移除节点  // 优雅降级处理 🎩
// 强制删除异常  // 系统外科手术 🔪
// ⚠️ERP老兵_冷溪虎山：删库会触发全球通缉

class main30 {
    public static void main(String[] args) {
        System.out.println("🍒🍒🍒🍒🍒以下是add添加元素");
        // Java使用HashSet（无序）或LinkedHashSet（有序）
        Set<Object> hdj = new HashSet<>(Arrays.asList("焦山楂", "焦神曲", "焦麦芽")); // 消化药 焦三仙 字符集合 顺序不保证
        hdj.add("焦山楂");  // 添加重复元素不生效，Set自动去重
        hdj.add("山楂");    // 正常添加
        hdj.add(3);         // 添加数字
        hdj.add(new ArrayList<>(Arrays.asList(12,13))); // 添加数组（注意：Java的Set不能直接存储元组，这里用数组模拟）
        System.out.println(hdj); // 打印集合

        System.out.println("\n🥏🥏🥏🥏🥏以下是随机删除元素");
        Set<String> blood = new HashSet<>(Arrays.asList("当归", "丹参", "莪术"));
        Iterator<String> iterator = blood.iterator();
        if (iterator.hasNext()) {
            iterator.next(); // 获取第一个元素（随机）
            iterator.remove(); // 删除该元素
        }
        System.out.println(blood);

        System.out.println("\n🥏🥏🥏🥏🥏以下是discard指定删除元素");
        Set<String> blood1 = new HashSet<>(Arrays.asList("当归", "丹参", "莪术"));
        blood1.remove("当归");  // 指定删除
        blood1.remove("未知");  // 不会报错，删除不存在的元素无影响
        System.out.println(blood1);

        System.out.println("\n🥏🥏🥏🥏🥏以下是remove指定删除元素");
        Set<String> blood2 = new HashSet<>(Arrays.asList("当归", "丹参", "莪术"));
        blood2.remove("当归");  // 指定删除
        // blood2.remove("未知"); // 不会报错
        // blood2.clear(); // 删除所有元素
        System.out.println(blood2);
        LengxiHushan30.remind(10);
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
  "麦芽": {
    "技术分类": [
      "日志膨松剂",      # 防ELK日志板结
      "API调用酵母",     # 优化REST接口消化
      "数据库健胃片"     # 防SQL积食
    ],
    "系统特性": "甘平",
    "对比分析": {
      "vs山楂": "更温和但力度小（适合生产环境日常维护）",
      "vs神曲": "不改变数据结构原貌（非发酵式处理）"
    },
    "特殊形态": {
      "焦麦芽": {
        "止血能力": "止Kafka消息出血（消息丢失）",
        "适用场景": "双十一大促期间预防性使用"
      }
    },
    "养生提示": "运维团队可常备麦芽茶，防技术债堆积"
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
class LengxiHushan30 {
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
