import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


//write a java program to group string by their length using java 8 stream API

//Input :"apple","banana","pear","grape","kiwi","orange"
public class Example8 {

    public static void main(String[] args){
        List<String> names= Arrays.asList("apple","banana","pear","grape","kiwi","orange");
        Map<Integer,List<String>> result = names.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(result);
    }
}
