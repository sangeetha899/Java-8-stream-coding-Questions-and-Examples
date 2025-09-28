import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example1 {
    public static void main(String[] args){
       //write a program to filter  even numbers from a list

        List<Integer> numbers= Arrays.asList(1,2,3,4,5,6,7,8,9,10);

      List<Integer> result=numbers.stream().filter(num->num%2==0)
                  .collect(Collectors.toList());
      System.out.println(result);
    }
}

