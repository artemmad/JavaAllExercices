package com.company.task29_30;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import static java.util.Arrays.stream;

class WordCounter {
    public  void counter(){
        Comparator<Map.Entry<String, Integer>> c1 = Comparator.comparing(Map.Entry::getValue, Comparator.reverseOrder());
        Comparator<Map.Entry<String, Integer>> c2 = Comparator.comparing(Map.Entry::getKey);
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in, StandardCharsets.UTF_8));
        Stream<String> stream = in.lines();
        stream.flatMap(x -> stream(x.split("\\W+")))
                .map(String::toLowerCase)
                .collect(Collectors.groupingBy(x -> x, Collectors.summingInt(p -> 1)))
                .entrySet()
                .stream()
                .sorted(c1.thenComparing(c2))
                .map(x -> x.getKey())
                .limit(10)
                .forEach(System.out::println);
    }
}
