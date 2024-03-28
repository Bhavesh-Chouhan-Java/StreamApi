package com.jalaramcwa.java.stream;


import java.util.*;
import java.util.concurrent.Callable;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamApi {
    public static void main(String[] args) {

        String str0 = "123";
        String str2 = new String("123");

        System.out.println(str0.equals(str2));

        Predicate<String> predicate = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.startsWith("A");
            }
        };

        Supplier<String> supplier = new Supplier<String>() {
            @Override
            public String get() {
                return "I am Supplier";
            }
        };

        Consumer<String> consumer = new Consumer<String>() {
            @Override
            public void accept(String s) {

            }
        };

        BiConsumer<String,Integer> biConsumer = new BiConsumer<String, Integer>() {
            @Override
            public void accept(String s, Integer integer) {

            }
        };

        Function<String,Integer> function = new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return s.startsWith("A")?1:0;
            }
        };

        BinaryOperator<String> binaryOperator = new BinaryOperator<String>() {
            @Override
            public String apply(String s, String s2) {
                return null;
            }
        };

        UnaryOperator<String> unaryOperator = new UnaryOperator<String>() {
            @Override
            public String apply(String s) {
                return null;
            }
        };

        IntFunction<String> intFunction = new IntFunction<String>() {
            @Override
            public String apply(int value) {
                return null;
            }
        };

        DoubleFunction<String> doubleFunction = new DoubleFunction<String>() {
            @Override
            public String apply(double value) {
                return null;
            }
        };

        Comparator<String> comparator = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return 0;
            }
        };

        Runnable runnable = new Runnable() {
            @Override
            public void run() {

            }
        };

        Callable<String> callable = new Callable<String>() {
            @Override
            public String call() throws Exception {
                return null;
            }
        };

        Arrays.asList("","");
        List.of("","");

        String[] strings = {"papl","apple", "banana", "orange", "grape", "kiwia", "melona","apple","apple"};
        List<String> list = List.of(strings);
        String[] strings0 = {"Bhavesh","Pooja", "Laisha", "Grisha"};
        List<String> list0 = List.of(strings0);

        String str = "BhaveshChouhan";
        List<Character> collect10 = str.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
        //collect10.forEach(System.out::print);
        List<String> list1 = List.of(str);
        String collect11 = list1.stream().collect(Collectors.joining(", "));
        System.out.println(collect11);

        char[] charArray = str.toCharArray();
        String string = Arrays.toString(charArray);
        //System.out.println(string);

        int[] arr = {1,2,3,4,5,6,3,2,1,4,8};
        List<Integer> lst = Arrays.stream(arr).mapToObj(i->i).toList();


        Integer[] arr2 = {1,2,3,4,5,6,3,2,1,4,8};
        List<Integer> list2 = Arrays.stream(arr2).toList();

        int num = 102020;
        String size = Integer.toString(num);
        int[] ii = new int[size.length()];
        for(int i = 0 ; i < size.length() ; i++){
            ii[i] = size.charAt(i) - '0';
        }
        //System.out.println(Arrays.toString(ii));

        // TODO: 10-12-2023 This is an intermediate operation
        Stream<String> filter = list.stream().filter(i -> !i.equals("Bhavesh"));//intermediate operation
        //filter.toList().forEach(System.out::println);
        Stream<String> map = list.stream().map(i -> i + "Fun");//intermediate operation
        //map.toList().forEach(System.out::println);
        Stream<String> flatMap = Stream.of(strings,strings0).flatMap(Arrays::stream);//intermediate operation
        //flatMap.forEach(System.out::println);
        Stream<String> peek = list.stream().peek(System.out::println);//intermediate operation
        //peek.forEach(System.out::println);
        Stream<String> stringStream = list.stream().onClose(() -> System.out.println("Stream is closed."));//intermediate operation
        //stringStream.forEach(System.out::println);
        //stringStream.close();
        Stream<String> parallel = list.stream().parallel();//intermediate operation
        //parallel.forEach(System.out::println);
        Stream<String> sequential = list.stream().sequential();//intermediate operation
        //sequential.forEach(System.out::println);
        Stream<String> unordered = list.stream().unordered();//intermediate operation
        //unordered.forEach(System.out::println);
        IntStream intStream = list.stream().mapToInt(String::length);//intermediate operation.
        //intStream.forEach(System.out::println);
        LongStream longStream = list.stream().mapToLong(String::length);
        //longStream.forEach(System.out::println);
        Stream<Object> objectStream = list.stream().mapMulti((a, b) -> b.accept(a.charAt(0)));//JAVA 16 This is an intermediate operation.
        //objectStream.forEach(System.out::println);

        // TODO: 10-12-2023 This is a stateful intermediate operation.
        Stream<String> distinct = list.stream().distinct();//This is a stateful intermediate operation.
        //distinct.forEach(System.out::println);
        Stream<String> sorted = list.stream().sorted();//This is a stateful intermediate operation.
        //sorted.forEach(System.out::println);
        Stream<String> dropWhile = list.stream().dropWhile(i -> i.length() < 5);//This is a stateful intermediate operation.
        //dropWhile.forEach(System.out::println);
        Stream<String> sorted1 = list.stream().sorted(Comparator.naturalOrder());//This is a stateful intermediate operation.
        //sorted1.forEach(System.out::println);
        Stream<String> skip = list.stream().skip(3);//This is a stateful intermediate operation.
        //skip.forEach(System.out::println);

        // TODO: 10-12-2023  This is a short-circuiting stateful intermediate operation.
        Stream<String> takeWhile = list.stream().takeWhile(i -> i.length() < 5);//this is a short-circuiting stateful intermediate operation.
        takeWhile.forEach(System.out::println);
        Stream<String> limit = list.stream().limit(3);//this is a short-circuiting stateful intermediate operation.
        //limit.forEach(System.out::println);


        // TODO: 10-12-2023 This is a terminal operation.
        Optional<String> reduce = list.stream().reduce((a, b) -> b.equals(a)?b:a);//This is a terminal operation.
        //System.out.println("red = " + reduce.get());
        List<String> toList = list.stream().toList();//This is a terminal operation.
        //toList.forEach(System.out::println);
        long count = list.stream().count();//This is a terminal operation.
        //System.out.println("count = " + count);
        Optional<String> max = list.stream().max(Comparator.naturalOrder());//This is a terminal operation.
        //System.out.println("max = " + max.get());
        Optional<String> min = list.stream().min(Comparator.naturalOrder());//This is a terminal operation.
        //System.out.println("min = " + min.get());
        Object[] objects = list.stream().toArray();//This is a terminal operation.
        //System.out.println("toArray = " + Arrays.toString(objects));
        String[] toArray = list.stream().toArray(String[]::new);//This is a terminal operation.
        //System.out.println("toArray = " + Arrays.toString(toArray));
        //list.stream().forEachOrdered(System.out::println);//This is a terminal operation.
        //list.stream().forEach(System.out::println);//This is a terminal operation.

        // TODO: 10-12-2023 This is a short-circuiting terminal operation.
        boolean gagan = list.stream().noneMatch(i -> i.equals("Gagan"));//This is a short-circuiting terminal operation.
        //System.out.println("gagan = " + gagan);
        boolean apple = list.stream().anyMatch(i -> i.equals("apple"));//This is a short-circuiting terminal operation.
        //System.out.println("apple = " + apple);
        Optional<String> any = list.stream().findAny();//This is a short-circuiting terminal operation.
        //System.out.println("any = " + any.get());
        boolean p = list.stream().allMatch(i -> i.contains("a"));//This is a short-circuiting terminal operation.
        //System.out.println("p = " + p);
        Optional<String> first = list.stream().findFirst();//This is a short-circuiting terminal operation.
        //System.out.println("first = " + first.get());



        String collect = list.stream().collect(Collectors.joining(","));
        //System.out.println(collect);
        Set<String> collect1 = list.stream().collect(Collectors.toSet());
        //System.out.println(collect1);
        LinkedHashSet<String> collect2 = list.stream().collect(Collectors.toCollection(LinkedHashSet::new));
        //collect2.forEach(System.out::println);
        List<String> collect3 = list.stream().collect(Collectors.toUnmodifiableList());
        //collect3.forEach(System.out::println);
        Map<Boolean, List<String>> collect4 = list.stream().collect(Collectors.groupingBy(i -> i.length() > 4));
        //collect4.forEach((a,b)->System.out.println(a+" : "+b));
        Map<String, Long> collect5 = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        //collect5.forEach((a,b)->System.out.println(a+" : "+b));
        Map<Boolean, Set<String>> collect6 = list.stream().collect(Collectors.groupingBy(i -> i.length() > 5, Collectors.toSet()));
        //collect6.forEach((a,b)->System.out.println(a+" : "+b));
        Hashtable<String, List<Boolean>> apple1 = list.stream().collect(Collectors.groupingBy(Function.identity(), Hashtable::new, Collectors.mapping(i -> i.length()>5, Collectors.toList())));
        //System.out.println(apple1);
        Map<Boolean, List<String>> collect7 = list.stream().collect(Collectors.partitioningBy(i -> i.length() > 5, Collectors.toList()));
        //collect7.forEach((a,b)-> System.out.println(a+" - "+b));
        LinkedHashSet<String> collect8 = new LinkedHashSet<>(list);
        //collect8.forEach(System.out::println);

        List<String> collect9 = list.stream().toList();
        List<String> list3 = list.stream().toList();

        // TODO: 10-12-2023  intermediate operation
        //1. filter         Predicate
        //2. map            Function
        //3. flatMap        Function
        //4. peek           Consumer
        //5. onClose        Runnable
        //6. parallel
        //7. sequential
        //8. unordered
        //9. mapToInt       IntFunction
        //10. mapToDouble   DoubleFunction
        //11. mapMulti      BiConsumer
        //12. distinct
        //13. sorted        Comparator
        //14. dropWhile     Predicate
        //15. limit         int                     This is a short-circuiting stateful intermediate operation.
        //16. skip          int
        //17. takeWhile     Predicate               This is a short-circuiting stateful intermediate operation.
        //18. mapToLong     LongFunction

        // TODO: 10-12-2023 terminal operation
        //1. toArray()
        //2. toArray(String[]::new)
        //3. collect()
        //4. forEach()
        //5. forEachOrdered()
        //6. reduce()       BinaryOperator
        //7. anyMatch()     This is a short-circuiting terminal operation.
        //8. allMatch()     This is a short-circuiting terminal operation.
        //9. max()          Optional
        //10. min()         Optional
        //11. noneMatch()   This is a short-circuiting terminal operation.
        //12. findAny()     This is a short-circuiting terminal operation.
        //13. findFirst()   This is a short-circuiting terminal operation.
        //14. count()
        //15. toList()

        Object o = new Object();

        Map<String, Integer> budget = new HashMap<>();
        budget.put("clothes", 120);
        budget.put("grocery", 150);
        budget.put("transportation", 100);
        budget.put("utility", 130);
        budget.put("rent", 1150);
        budget.put("miscellaneous", 90);

        HashMap<String, Integer> collecte = budget.entrySet()
                .stream().sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldValue, newValue) -> oldValue, LinkedHashMap::new));
        collecte.forEach((k,v)-> { System.out.println(v); } );


        LinkedHashMap<String, Integer> collectw = budget.entrySet().stream().sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldValue, newValue) -> oldValue, LinkedHashMap::new));
        collectw.forEach((k,v)-> System.out.println(v));


        hcl();
        reversedString();

    }
    private static void hcl(){
        List<String> teamIndia = Arrays.asList("Dhoni","Kholi","Rohit");
        List<String> teamAus = Arrays.asList("Ricky", "Maxwell");
        List<String> teamSA = Arrays.asList("ABD","BabyABD");

        List<List<String>> playersTeamsIn2023 = new ArrayList<>();
        playersTeamsIn2023.add(teamIndia);
        playersTeamsIn2023.add(teamAus);
        playersTeamsIn2023.add(teamSA);


        //Need all get all players participating in 2023
        List<String> allPlayers = new ArrayList<>();

        List<String> list = playersTeamsIn2023.stream().flatMap(List::stream).toList();

        list.forEach(System.out::println);
    }


    private static void reversedString(){
        String str = "Bhavesh Chouhan";
        String revered = str.chars().mapToObj(i->(char)i)
                .collect(StringBuilder::new,(b, c) -> b.insert(0, (char)c),(b1,b2)->b1.insert(0,b2)).toString();
        System.out.println(revered);
    }

}
