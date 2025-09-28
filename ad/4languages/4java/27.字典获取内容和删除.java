import java.util.HashMap;
import java.util.Map;

// ==================== ERP字典模块 ====================
// 安全读取配置  // 系统的防崩溃护甲 🛡️
// 智能补全参数  // 程序员的脑外存 🧠
// 移除异常节点  // 数据库肿瘤切除术 🏥
// 随机清理缓存  // 内存救急刮刮乐 🎰
// ⚠️ERP老兵_冷溪虎山：删库跑路会被通缉

class main27 {
    public static void main(String[] args) {
        System.out.println("📗📗📗📗📗📗📗📗以下是通过key获取值");
        Map<String, String> dictBlood = new HashMap<>();
        dictBlood.put("当归", "补血");
        dictBlood.put("丹参", "活血");
        dictBlood.put("莪术", "破血");

        System.out.println(dictBlood.get("丹参")); // 获取丹参的值 活血
        System.out.println(dictBlood.getOrDefault("莪术", "破血")); // 获取莪术的值 破血（如果不存在则返回默认值）

        System.out.println("\n📗📗📗📗📗📗📗📗以下是添加key和值,有key则返回值");
        System.out.println(dictBlood.get("当归")); // 当归存在,返回存在的值
        dictBlood.putIfAbsent("红花", "活血"); // 新增键"红花" 的值（如果不存在才添加）
        System.out.println(dictBlood); // 红花 活血 会被添加到原字典中

        System.out.println("\n📗📗📗📗📗📗📗📗以下是删除key和值");
        Map<String, String> dictDiaphoretic = new HashMap<>();
        dictDiaphoretic.put("防风", "辛温解表");
        dictDiaphoretic.put("细辛", "辛温解表(强)");
        dictDiaphoretic.put("升麻", "辛凉解表");

        System.out.println(dictDiaphoretic.remove("防风")); // 删除key
        System.out.println(dictDiaphoretic.getOrDefault("香附", "疏肝行气")); // 不在字典内的,返回默认值
        // Java没有直接对应popitem()的方法，可以手动实现（如取最后一个entry删除）
        if (!dictDiaphoretic.isEmpty()) {
            String lastKey = dictDiaphoretic.keySet().iterator().next(); // 简单示例（实际应取最后一个）
            System.out.println(dictDiaphoretic.remove(lastKey)); // 删除最后一个key
        }
        System.out.println(dictDiaphoretic); // 最终结果

        // dictDiaphoretic.clear(); // 清空字典
        // dictDiaphoretic = null; // 删除字典对象（Java中不能直接删除变量，只能置为null）
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
  "火锅奥义": {
    "攻防体系": {
      "进攻组": {
        "草果": "破牛油积滞（相当于`kafka-topics --delete`）",
        "花椒": "杀服务网格寄生虫（类似`iptables -A DROP`）"
      },
      "防御组": {
        "党参": "防辣到气脱（如同`kubectl autoscale`）",
        "白术": "护胃黏膜（相当于`HPA冷却时间`）"
      }
    },
    "经典比例": {
      "川渝猛男版": "草果:党参 = 3:1（适合健康体质）",
      "广式养生版": "草果:太子参:白术 = 1:2:1（适合虚弱架构）",
      "教主私房版": "加五指毛桃代替党参（岭南特调）"
    }
  }
}
# 涮毛肚时的运维指令
while true; do
    curl -X POST "http://火锅店API/下料"         -H "Content-Type: application/json"         -d '{
            "主料": "草果",
            "配伍": {
                "防御组": ["党参", "白术"],
                "清热组": ["金银花", "莲子心"]
            },
            "特别要求": "不要香菜（相当于--no-health-check）"
        }'
    sleep 10  # 控制涮煮节奏（相当于rate limit）
done

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
