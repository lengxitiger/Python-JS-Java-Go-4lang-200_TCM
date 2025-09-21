// ==================== 中药时间模块 ====================
// 标准炼丹日期格式  // 仙家历法记录仪 🧙
// 年月日干支变体  // 老黄历配伍指导 📜
// 时辰分钟精确版  // 子午流注计时器 ⏳
// 特殊符号分隔款  // 丹方加密时间锁 🔮
// 精简版时辰显示  // 药童速记模式 📝
// 星期简写模式  // 五行养生日程表 ☯️
// 月份本草简称  // 药材采收月历 🌿
// ⚠️虎山老药师：时辰错乱会炼出毒丹

const now = new Date();

// 1. 直接打印（类似 Python 的 now）
console.log(now.toString());

// 2. 格式化：YYYY-MM-DD HH:MM:SS Day
const options1 = {
    year: 'numeric',
    month: '2-digit',
    day: '2-digit',
    hour: '2-digit',
    minute: '2-digit',
    second: '2-digit',
    weekday: 'short',
    hour12: false
};
const formatted1 = new Intl.DateTimeFormat('zh-CN', options1).format(now)
    .replace(/年|月|日|,|\s/g, match => {
        if (match === '周') return '星期';
        return match === ',' ? '-' : match;
    })
    .replace(/上午|下午/, '')
    .padStart(19, '0'); // 补全格式
console.log(formatted1.replace(/(\d{4})-(\d{2})-(\d{2}) (\d{2}):(\d{2}):(\d{2}) (..)/, `$1-$2-$3 $4:$5:$6 $7`));

// 3. 格式化：YYYY 年 MM 月 DD 日
const year = now.getFullYear();
const month = String(now.getMonth() + 1).padStart(2, '0');
const day = String(now.getDate()).padStart(2, '0');
console.log(`${year} 年 ${month} 月 ${day} 日`);

// 4. 格式化：HH 时 MM 分 SS 秒
const hours = String(now.getHours()).padStart(2, '0');
const minutes = String(now.getMinutes()).padStart(2, '0');
const seconds = String(now.getSeconds()).padStart(2, '0');
console.log(`${hours} 时 ${minutes} 分 ${seconds} 秒`);

// 5. 格式化：YYYY<MM>DD
console.log(`${year}<${month}>${day}`);

// 6. 格式化：HH:MM:SS
console.log(`${hours}:${minutes}:${seconds}`);

// 7. 格式化：Day (缩写)
const weekdays = ['日', '一', '二', '三', '四', '五', '六'];
const weekday = weekdays[now.getDay()];
console.log(`星期${weekday}`);

// 8. 格式化：Month (缩写)
const months = ['一月', '二月', '三月', '四月', '五月', '六月', '七月', '八月', '九月', '十月', '十一月', '十二月'];
console.log(months[now.getMonth()]);

console.log("\n🍒🍒🍒🍒🍒🍒🍒🍒🍒以下是week");
const week = ["星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六"];
console.log(week[now.getDay()]);

// 9. 格式化：locale date & time (类似 %c)
console.log(now.toLocaleString('zh-CN'));
        
        
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
  "蕨麻": {
    "技术分类": ["轻量级线程补剂", "容器营养膏"],
    "系统特性": "甘平",
    "核心优势": "补而不燥（适合长期运行的守护进程）",
    "适用场景": ["低配服务器", "IoT设备"],
    "教主提示": "和Kafka同服易消化不良（消息积压）"
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
