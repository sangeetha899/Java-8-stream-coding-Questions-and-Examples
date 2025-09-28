import java.util.Arrays;
import java.util.List;

public class Example7 {
    public static void main(String[] args){
        List<String> names= Arrays.asList("Alice","Bob","Franklin","vishali","Akruthi");

        //write a program to print the names that starts with letter a
        names.stream().map(String::toLowerCase)
                //since startWith is a method of string not a stream method
                .filter(name->name.startsWith("a"))
                .forEach(name->System.out.println(name));

        List<Integer> numbers= Arrays.asList(5,10,55,50,30,44);

//        numbers.stream()
//                .filter(num ->num.toString().startsWith("5"))
//                .forEach(num->System.out.println(num));

        numbers.stream()
                .map(num -> num.toString())
                .filter(s -> s.startsWith("5"))
                .forEach(System.out::println);


    }
}
