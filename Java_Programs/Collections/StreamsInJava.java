import java.util.*;
import java.util.stream.Collectors;

public class StreamsInJava {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 3, 4, 5);
        List<Integer> square = list.stream().map(x -> x * x).collect(Collectors.toList());
        System.out.println(square);
    }
}