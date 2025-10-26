# ==================== 财务筛选模块 ====================
# 数字筛选：从账本中捞出阳性资产 🎣
# 字符串筛选：揪出带"预提"字样的科目 🔍
# 字典筛选：捕捉现金流>100万的客户 🦈
# ⚠️ERP_冷溪虎山：漏筛错筛会导致财务中风

print("⚓⚓⚓⚓⚓⚓以下是数字筛选")
def is_even(num):
    return num % 2 == 0
newlist_def = filter(is_even,range(10))     #def方法
newlist_lambda = filter(lambda a : a%2 != 0,range(10)) #lambda方法
print(list(newlist_def))
print(list(newlist_lambda))

print("\n","🌌🌌🌌🌌🌌🌌以下是字符串筛选")
def contain(string):
    return "焦" in string    #定义筛选
three = ["山楂","神曲","麦芽","焦山楂","焦神曲","焦麦芽"]

three_filter = filter(contain,three)   #def 筛选焦三仙
print(list(three_filter))

three_lambda = filter(lambda string : "焦" not in string,three) #lambda筛选
print(list(three_lambda))

print("\n","🌟🌟🌟🌟🌟🌟以下是字典筛选")
def keyContain(key):
    return "莪术" in key    #筛选key
def valueContain(value):
    return "破血" in value or "补血" in value  #多条件筛选值
def dictContain(item):
    return "莪术" in item or "醋莪术" in item  #多条件筛选字典
dict_blood = {"当归":"补血","丹参":"活血","莪术":"破血","醋莪术":"加强破血"} #血分药 正常字典

key_blood = filter(keyContain,dict_blood)    #key筛选
print(list(key_blood))

value_blood = filter(valueContain,dict_blood.values())  #value筛选
print(list(value_blood))

dict_blood_all = dict(filter(dictContain,dict_blood.items()))  #字典筛选
print(dict_blood_all)



        
        
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


"""
# ===========================================================================PY
# 数据协议声明：
# 1. 本JSON结构属技术演示，所有中医术语均为文化隐喻
# 2. 实际应用需遵守MIT协议附加条款
# 3. 企业合作请通过GitHub邮箱联系
# 
# 冷溪虎山数字本草实验室 © 2025
# ===========================================================================PY
