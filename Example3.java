import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Example3 {
    public static void main(String[] args){

        //write a program to find the maximum value from the list of integer
        List<Integer> numbers= Arrays.asList(10,50,30,45);
       Optional<Integer> result= numbers.stream().max(Integer::compareTo);
        System.out.println(result.get());

    }
}



//1. Creation of Streams
//
//        Ways to create a stream:
//
//        Collection.stream()
//
//        Collection.parallelStream()
//
//        Stream.of(T... values)
//
//        Arrays.stream(array)
//
//        Stream.generate(Supplier<T>)
//
//        Stream.iterate(seed, UnaryOperator<T>)
//
//        IntStream, LongStream, DoubleStream (primitive streams)
//
//        🔹 2. Intermediate Operations
//
//        (These return a new Stream → they are lazy and only executed when a terminal operation is called.)
//
//        filter(Predicate<T>) → keeps elements that satisfy a condition
//
//        map(Function<T,R>) → transforms each element
//
//        flatMap(Function<T,Stream<R>>) → flatten nested streams
//
//        distinct() → removes duplicates
//
//        sorted() / sorted(Comparator<T>) → sorts elements
//
//        limit(long n) → keeps first n elements
//
//        skip(long n) → skips first n elements
//
//        peek(Consumer<T>) → debugging / look at values without changing
//
//        🔹 3. Terminal Operations
//
//        (These produce a result and consume the stream — after this, the stream is closed.)
//
//        Reduction:
//
//        forEach(Consumer<T>)
//
//        toArray()
//
//        reduce(identity, accumulator)
//
//        collect(Collector) → e.g. Collectors.toList(), toSet(), joining()
//
//        Searching/Matching:
//
//        findFirst()
//
//        findAny()
//
//        anyMatch(Predicate<T>)
//
//        allMatch(Predicate<T>)
//
//        noneMatch(Predicate<T>)
//
//        Aggregation:
//
//        count()
//
//        min(Comparator<T>)
//
//        max(Comparator<T>)
//
//        🔹 4. Short-Circuiting Operations
//
//        (Special category – they stop as soon as result is found.)
//
//        findFirst()
//
//        findAny()
//
//        anyMatch()
//
//        allMatch()
//
//        noneMatch()
//
//        limit()
//
//        🔹 5. Parallel Stream
//
//        Any stream can be converted to parallel using:
//
//        list.parallelStream()
//
//
//        which allows parallel execution.
//
//        ✅ Example usage
//        List<Integer> numbers = Arrays.asList(10, 50, 30, 45, 50);
//
//        List<Integer> result = numbers.stream()
//        .filter(n -> n > 20)       // keep > 20
//        .distinct()                // remove duplicates
//        .sorted()                  // sort
//        .limit(3)                  // take first 3
//        .collect(Collectors.toList());
//
//        System.out.println(result); // [30, 45, 50]