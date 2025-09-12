import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

class PathDemo {

    public static void main(String[] args) throws IOException {
        /*
         * 🌟 超全路径写法示例 (Java版本)
         * 包含 4 种实战写法 + 老司机调试技巧
         */

        // 写法1：硬编码绝对路径（新手简单粗暴式）
        Path absPath = Paths.get("D:", "ad", "4languages", "4java", "file", "test.txt");
        showFileInfo("1. 绝对路径", absPath);

        // 写法2：项目根目录相对路径（开源项目推荐）
        // 假设工作目录是 4languages/
        Path rootRelative = Paths.get("4java", "file", "test.txt");
        showFileInfo("2. 项目根目录相对路径", rootRelative);

        // 写法3：显式相对路径（明确从当前目录出发）
        // "." 表示当前所在目录
        Path explicitRelative = Paths.get(".", "4languages", "4java", "file", "test.txt");
        showFileInfo("3. 显式相对路径", explicitRelative);

        // 写法4：环境变量动态路径（生产环境推荐）
        // 设置环境变量：set PROJECT_ROOT=D:\ad\4languages
        String projectRoot = System.getenv("PROJECT_ROOT");
        if (projectRoot == null) projectRoot = ".";
        Path envPath = Paths.get(projectRoot, "4java", "file", "test.txt");
        showFileInfo("4. 环境变量路径", envPath);

        /*
         * 🔧 老司机调试工具箱
         */
        printSection("调试信息");

        // 获取当前工作目录（关键！）
        System.out.println("当前工作目录: " + System.getProperty("user.dir"));

        // 检查文件是否存在（标准写法）
        Path fileToCheck = rootRelative;
        if (Files.exists(fileToCheck)) {
            System.out.println("文件存在: " + fileToCheck);
            System.out.println("绝对路径: " + fileToCheck.toAbsolutePath());
        } else {
            System.out.println("文件不存在: " + fileToCheck + " (提示：检查工作目录设置)");
        }
    }

    private static void showFileInfo(String desc, Path path) throws IOException {
        printSection(desc);
        System.out.println("路径格式: " + path);

        try {
            if (Files.exists(path)) {
                BasicFileAttributes attrs = Files.readAttributes(
                        path, BasicFileAttributes.class);
                System.out.println("文件大小: " + attrs.size() + " bytes");
                System.out.println("最后修改: " +
                        Instant.ofEpochMilli(attrs.lastModifiedTime().toMillis())
                                .atZone(ZoneId.systemDefault())
                                .format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
            } else {
                System.out.println("文件不存在 (可能工作目录设置不正确)");
            }
        } catch (IOException e) {
            System.out.println("文件访问错误: " + e.getMessage());
        }
    }

    private static void printSection(String title) {
        System.out.println("\n=== " + title + " ===");
    }
}