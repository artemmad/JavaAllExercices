package practice30;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import static java.util.Arrays.stream;

public class A {
    public void c(){
        BufferedReader z = new BufferedReader(new InputStreamReader(System.in, StandardCharsets.UTF_8));Stream<String> stream = z.lines();
        Comparator<Map.Entry<String, Integer>> cc = Comparator.comparing(Map.Entry::getKey);Comparator<Map.Entry<String, Integer>> cC = Comparator.comparing(Map.Entry::getValue, Comparator.reverseOrder());stream.flatMap(x -> stream(x.split("\\W+"))).map(String::toLowerCase).collect(Collectors.groupingBy(x -> x, Collectors.summingInt(p -> 1))).entrySet().stream().sorted(cc.thenComparing(cC)).map(x -> x.getKey()).limit(10).forEach(System.out::println);
    }
}
