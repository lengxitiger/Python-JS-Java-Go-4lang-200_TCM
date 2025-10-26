# ==================== 财务统计模块 ====================
# len(科目表)  # 数数有几个钱包在哭 😭
# map(洗钱, 账户列表)  # 给每个账户发洗澡券 🛁
# zip(科目, 金额)  # 让科目和金额配对洞房 💒
# ⚠️ERP_冷溪虎山：乱配对会导致资产负债表难产

red_flower = "红花"
str_blood = "blood"
blood = ["当归","丹参","桃仁"]
number = [44,55,77,88,66]
three = {"山楂":"焦山楂","神曲":"焦神曲","麦芽":"焦麦芽"}

print("⏩⏩⏩⏩⏩⏩以下是迭代对象的长度len")
print(len(red_flower)) #2
print(len(str_blood))  #5
print(len(blood))  #3
print(len(number))  #5
print(len(three))  #3

print("\n","⏬⏬⏬⏬⏬⏬以下是迭代对象map的操作")
new_blood = map(lambda a : a + "活血",blood)  #每个元素拼接
dictmap_blood = dict(map(lambda k, v: (k, v), blood,["补血","活血","破血"])) #合成字典
print(list(new_blood)) #每个元素拼接
print(dictmap_blood)    #字典拼接

print("\n","🆕🆕🆕🆕🆕🆕以下是迭代对象zip的操作")
dictzip_blood = dict(zip(blood,["补血","活血","破血"]))  #合成字典
zip_three = zip(three.values(),three.keys())  #字典转化列表
dictzip_three = dict(zip(three.values(),three.keys())) #字典颠倒

print(dictzip_blood) #合成字典
print(list(zip_three)) #字典转化列表
print(dictzip_three) #字典颠倒
        
        
# ===========================================================================PY
# [中医极客] 药材数据库 JSON 结构规范
# 
# 本数据结构采用《中国药典》2020版标准，所有术语均为技术隐喻：
#   - "性味归经" → 类属性约束
#   - "最大剂量" → API调用限制
#   - "编程寄语" → 设计模式建议
#
# 技术交流请通过GitHub Issues，严禁医疗用途
# ===========================================================================PY
"""

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


"""
# ===========================================================================PY
# 数据协议声明：
# 1. 本JSON结构属技术演示，所有中医术语均为文化隐喻
# 2. 实际应用需遵守MIT协议附加条款
# 3. 企业合作请通过GitHub邮箱联系
# 
# 冷溪虎山数字本草实验室 © 2025
# ===========================================================================PY

def lengxi_tiger(chapter):
    print(f"""
    🍵【Python虎山宝宝专属提醒】🍵
    老铁，你已经肝完 {chapter} 章啦！
    快起来活动下颈椎，接杯热水~
    你是我的心头肉，别累坏了！(๑•̀ㅂ•́)و✧
    别让本座_冷溪tiger操心
    """)

lengxi_tiger(10)