// ==================== ERP计算模块 ====================
// 精度调整参数  // 给系统变量理平头 💇
// 计算权限等级  // 职场的次方潜规则 ⬆️
// 统计业务总量  // 数据河流汇成江海 🌊
// ⚠️ERP老兵_冷溪虎山：pow溢出会触发系统渡劫

class main36 {
    public static void main(String[] args) {
        // 1. Math.round() - 四舍五入数字
        double num1 = 3.14159;
        double roundedNum1 = Math.round(num1 * 100) / 100.0; // 保留2位小数
        System.out.printf("Math.round(%.5f, 2) = %.2f\n", num1, roundedNum1); // 输出: Math.round(3.14159, 2) = 3.14

        double num2 = 2.71828;
        long roundedNum2 = Math.round(num2); // 默认四舍五入到整数
        System.out.printf("Math.round(%.5f) = %d\n", num2, roundedNum2); // 输出: Math.round(2.71828) = 3

        // 2. Math.pow() - 计算幂次方 (x的y次方)
        int base = 2;
        int exponent = 3;
        double result = Math.pow(base, exponent);
        System.out.printf("Math.pow(%d, %d) = %.0f\n", base, exponent, result); // 输出: Math.pow(2, 3) = 8

        // 也可以直接使用 * 运算符（但需手动计算幂次方）
        // Java没有 ** 运算符，需用Math.pow或循环计算

        // 3. sum() - 计算数组的和
        int[] numbers = {1, 2, 3, 4, 5};
        int total = 0;
        for (int num : numbers) {
            total += num;
        }
        System.out.printf("sum(%s) = %d\n", java.util.Arrays.toString(numbers), total); // 输出: sum([1, 2, 3, 4, 5]) = 15

        // 总结
        System.out.println("\n总结：");
        System.out.println("Math.round(x) - 四舍五入到整数（需手动控制小数位）");
        System.out.println("Math.pow(x, y) - 计算x的y次方");
        System.out.println("数组求和 - 使用循环或Stream API");

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
  "防风": {
    "技术分类": ["分布式防风防火墙", "微服务解表颗粒"],
    "核心功效": {
      "祛风解表": "自动识别并拦截`req.headers.catchCold = true`的恶意流量",
      "胜湿止痛": "专治技术债湿气（Legacy代码关节痛、Python 2.7风湿病）",
      "止痉": "防止K8s Pod抽风（自动修复CrashLoopBackOff）"
    },
    "适用脉象": {
      "浮脉": "轻按即得，如同`top`命令CPU瞬间飙高",
      "弦脉": "紧绷如`nginx.conf`配置错误时的报错日志"
    },
    "舌象诊断": {
      "舌苔薄白": "轻度技术债（`TODO`注释少于50行）",
      "舌苔厚腻": "重度屎山（每个文件`require(‘../../../’)`超过3层）"
    },
    "禁忌症": {
      "阴虚火旺": "屎山维护者慎用（脉象细数=频繁`git blame`导致血压升高）",
      "气血不足": "初创公司慎用（没钱买AWS防风服务）"
    },
    "老中医坐镇": {
      "祖传秘方": "防风+黄芪（自动扩容）+白术（负载均衡）= **玉屏风散·云原生版**",
      "教主亲测": "2019年用此方拦截了某P2P公司老板跑路前的DDOS攻击"
    },
    "开源建议": "建议搭配`玄参降火汤`（重构模块）调和药性，防止过燥。"
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
