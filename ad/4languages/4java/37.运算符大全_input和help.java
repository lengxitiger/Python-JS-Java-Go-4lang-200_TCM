import java.util.Scanner;

// ==================== ERP交互模块 ====================
// 接收审批流程输入  // 系统管家的死亡提问 💀
// 调取技术文档  // 唤醒沉睡的API古神 📜
// ⚠️ERP老兵_冷溪虎山：输错参数会触发系统天劫

class main37 {
    public static void main(String[] args) {
        // 基础运算
        int a = 15, b = 4;
        System.out.println("加法: " + (a + b));        // 19
        System.out.println("减法: " + (a - b));        // 11
        System.out.println("乘法: " + (a * b));        // 60
        System.out.println("除法: " + (a / b));        // 3
        System.out.println("模: " + (a % b));          // 3

        System.out.println("\n以下是基础复合赋值");
        // 复合赋值
        a += 1; System.out.println("自增后 a: " + a);        // 16
        a -= 1; System.out.println("自减后 a: " + a);        // 15
        a += b; System.out.println("a += b 后 a: " + a);     // 19
        a -= b; System.out.println("a -= b 后 a: " + a);     // 15
        a *= b; System.out.println("a *= b 后 a: " + a);     // 60
        a /= b; System.out.println("a /= b 后 a: " + a);     // 15
        a %= b; System.out.println("a %= b 后 a: " + a);     // 3

        System.out.println("\n以下是更多复合赋值");
        // 更多复合赋值
        int x = 15, y = 4;
        x /= y; System.out.println("x //= y 后 x: " + x);  // 3
        x %= y; System.out.println("x %= y 后 x: " + x);   // 3
        x = (int) Math.pow(x, y); System.out.println("x **= y 后 x: " + x); // 81
        x &= y; System.out.println("x &= y 后 x: " + x);   // 0
        x |= y; System.out.println("x |= y 后 x: " + x);   // 4
        x ^= y; System.out.println("x ^= y 后 x: " + x);   // 0
        x <<= y; System.out.println("x <<= y 后 x: " + x); // 0
        x >>= y; System.out.println("x >>= y 后 x: " + x); // 0

        System.out.println("\n=== 以下是比较运算符 和 逻辑运算符 ====");
        // 比较与逻辑
        System.out.println("x < y : " + (x < y));        // false
        System.out.println("x > y : " + (x > y));        // true
        System.out.println("x <= y : " + (x <= y));      // false
        System.out.println("x >= y : " + (x >= y));      // true
        System.out.println("x == y : " + (x == y));      // false
        System.out.println("x != y : " + (x != y));      // true
        System.out.println("x > 10 && y < 5 : " + (x > 10 && y < 5));  // true
        System.out.println("x < 10 || y < 5 : " + (x < 10 || y < 5));  // true
        System.out.println("!(x > y) : " + !(x > y));                // false
        System.out.println("!(x == y) : " + !(x == y));              // true

        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入你的姓名: ");
        String name = scanner.nextLine();
        System.out.println("你好, " + name + "!");
        scanner.close();


        // Java 没有直接的 help()，但可以打印文档（需要手动编写）
        System.out.println("查看 System.out.println 的帮助：");
        System.out.println("System.out.println 是 Java 标准库中的方法，用于打印输出到控制台。");
    }
}

/*
# 查看 Java 编译器的帮助
javac --help

# 查看 Java 运行时的帮助
java --help
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
  "荆芥": {
    "技术宇宙": {
      "区块链": "智能合约解表丸（专治Solidity的`require()`风寒）",
      "AI炼丹": "梯度下降发汗剂（反向传播时毛孔全开）",
      "运维玄学": "K8s Pod麻疹透疹膏（Service Mesh级排毒）",
      "硬件魔法": "治愈SSD的冷数据关节炎（NVMe协议发汗法）"
    },
    "跨界药效": {
      "发汗原理": "如同`sudo rm -rf /tmp/*`后的通透感",
      "透疹本质": "相当于在CNN卷积层插入了`tf.nn.dropout`",
      "止痒黑科技": "比`Ctrl+F5`更彻底的缓存刷新术"
    },
    "脉象狂想": {
      "浮脉": "类似Redis的QPS突然飙高（但无`slowlog`）",
      "滑脉": "如同`dd if=/dev/zero`灌入硬盘的丝滑",
      "结代脉": "Kafka消息队列的`acks=all`心跳漏跳"
    },
    "舌象朋克": {
      "舌边齿痕": "被PM用JIRA反复摩擦的痕迹",
      "舌下淤血": "Tech Lead连续三年没涨薪的微循环障碍"
    },
    "禁忌风暴": {
      "阴虚慎服": "长期在`/proc/cpuinfo`里`grep 'bugs'`的工程师",
      "过敏体质": "对`NaN === NaN`返回`false`会起荨麻疹的人"
    },
    "老中医暴论": {
      "量子纠缠": "荆芥炭（烧焦版）可治疗量子计算的退相干",
      "赛博朋克": "将药渣敷在Raspberry Pi上可增强Wi-Fi信号",
      "教主顿悟": "『所有分布式系统问题，皆因表邪未解！』"
    },
    "玄学副作用": {
      "时空扭曲": "服用后`time curl`显示TLS握手时间倒流",
      "观测者效应": "`console.log()`的输出会变成甲骨文"
    },
    "开源暴击": "**WTFPL License**（Witness The Furious Power of 荆芥）"
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
