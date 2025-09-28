import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


//inputArrayList= [1,3,2,4,3,1,2]
//outputArrayList = [4,3,2,1]

public class Example4 {
    public static void main(String[] args){
        List<Integer> inputArrayList= Arrays.asList(1,3,2,4,3,1,2);
        List<Integer> outputArrayList= inputArrayList.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        System.out.println(outputArrayList);

    }
}
