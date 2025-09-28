import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Example6 {
    public static void main(String[] args){
        List<Integer> number = Arrays.asList(12,11,90,11,78,55,55,100);

        Map<Integer,Long> result=number.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        //total count of list of integers
        System.out.println(number.stream().count());

        //odd or even numbers of integer

        number.stream().filter(num->num%2==0).forEach(num->System.out.println("even="+num));
        number.stream().filter(num->num%2!=0).forEach(num->System.out.println("odd="+num));

        System.out.println(result);

    }
}
