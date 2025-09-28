import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example2 {
    public static void main(String[] args){

        //Write a program to convert the string in Uppercase
        List<String> techStack= Arrays.asList("java","spring","lambda","collections");

       List<String> result= techStack.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(result);

    }

}
