import java.util.Arrays;
import java.util.List;

public class Example5   {
    //Find the first occurence element in the list of integers

    public static void main(String[] args){
        List<Integer> nums= Arrays.asList(10,12,22,5,100,13);

        nums.stream().findFirst()
                .ifPresent(System.out::println);

    }


}
