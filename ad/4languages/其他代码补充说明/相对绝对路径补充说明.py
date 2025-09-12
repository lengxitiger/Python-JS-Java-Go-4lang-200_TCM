import os

#相对路径的四种写法           [🔽🔽🔽🔽🔽🔽🔽🔽🔽🔽]
dir_path = os.path.abspath("相对绝对路径补充说明.py")  #隐式写法
dir_path1 = os.path.abspath(r".\相对绝对路径补充说明.py") #显式[单反斜杆]+r转义写法
dir_path2 = os.path.abspath("./相对绝对路径补充说明.py") #显式[正单斜杆]写法 兼容程度非常好
dir_path3 = os.path.abspath(".\\相对绝对路径补充说明.py") #显式[双反斜杆]转义写法

print("💳💳💳💳💳💳以下是相对路径四种写法")
print(dir_path)  #获取完整路径 写法1
print(dir_path1)  #获取完整路径 写法2
print(dir_path2)  #获取完整路径 写法3
print(dir_path3)  #获取完整路径 写法4

#绝对路径的三种写法 绝对路径都是显式写法---------------------------------------
abs_path = os.path.abspath(r"D:\ad\4languages\其他代码补充说明\相对绝对路径补充说明.py")     #[单反斜杆]+r转义写法
abs_path1 = os.path.abspath("D:/ad/4languages/其他代码补充说明/相对绝对路径补充说明.py")     #[正单斜杆]写法 兼容程度非常好
abs_path2 = os.path.abspath("D:\\ad\\4languages\\其他代码补充说明\\相对绝对路径补充说明.py") #[双反斜杆]转义写法

print("\n🧰🧰🧰🧰🧰🧰以下是绝对路径三种写法")
print(abs_path)  #获取绝对路径文件目录 写法1
print(abs_path1)  #获取绝对路径文件目录 写法2
print(abs_path2)  #获取绝对路径文件目录 写法3

print("\n🏆🏆🏆🏆🏆🏆以下是其他高阶引用写法,开发人员必会")
#  父目录引用写法
dir_path4 = os.path.abspath("../其他代码补充说明/相对绝对路径补充说明.py")  # 上级目录引用
print(f"\n父目录引用: {dir_path4}")

#  跨平台安全写法（推荐！）
dir_path5 = os.path.abspath(os.path.join("4languages", "其他代码补充说明", "相对绝对路径补充说明.py"))
print(f"跨平台拼接: {dir_path5}")


#  环境变量动态路径（生产环境常用）
abs_path3 = os.path.abspath(os.path.join(os.environ['USERPROFILE'], "4languages", "相对绝对路径补充说明.py"))
print(f"\n环境变量路径: {abs_path3}")

#  UNC网络路径（企业开发必备）
abs_path4 = os.path.abspath(r"\\192.168.1.1\共享文件夹\test.py")
print(f"UNC网络路径: {abs_path4}")

#  短文件名兼容（复古但有用）
abs_path5 = os.path.abspath(r"D:\AD~1\4LAN~1\相对绝对路径补充说明.py")
print(f"\n短文件名兼容: {abs_path5}")

#  原始bytes路径（极端情况处理）
path_bytes = b"D:\\ad\\test.txt"  # 处理非UTF-8文件名时可能需要
print(f"bytes路径: {path_bytes.decode('gbk')}")  # Windows中文编码常用gbk

def path_doctor(path):
    print(f"诊断报告：")
    print(f"原始路径: {path}")
    print(f"绝对路径: {os.path.abspath(path)}")
    print(f"规范化: {os.path.normpath(path)}")
    print(f"存在?: {'✅' if os.path.exists(path) else '❌'}")

path_doctor("相对绝对路径补充说明.py")