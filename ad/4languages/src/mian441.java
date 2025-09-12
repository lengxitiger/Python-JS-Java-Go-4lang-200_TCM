// Java中医示例（兼容JDK21+，无需额外依赖）
import javax.script.*;
class TCM_JavaDemo {
    public static void main(String[] args) throws Exception {
        // 1.中药数组拼接（Python版等价实现）
        String[] herbs = {"山楂", "神曲", "麦芽"},
                processed = {"焦山楂", "焦神曲", "焦麦芽"};
        System.out.println(java.util.Arrays.toString(
                java.util.stream.Stream.concat(
                        java.util.Arrays.stream(herbs),
                        java.util.Arrays.stream(processed)
                ).toArray(String[]::new))); // [山楂, 神曲, 麦芽, 焦山楂, 焦神曲, 焦麦芽]

        // 2.用内置JS引擎计算（Python的eval等价）
        new ScriptEngineManager().getEngineByName("javascript")
                .eval("print('JS计算:' + (10 + 20))"); // 输出: JS计算:30
    }
}