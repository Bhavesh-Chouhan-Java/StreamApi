package com.jalaramcwa.java.stream;

import com.jalaramcwa.java.tables.Employee;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toMap;

public class MainStringProgram {
    public static void main(String[] args) {
        Consumer<String> stringConsumer = String::toString;
        stringConsumer.accept("Hello Consumer ");

        //Supplier<Double> stringSupplier = Math::random;
        //System.out.println(stringSupplier.get());
        //System.out.println(stringSupplier.get());
        //streamStringObject();
        //filter();
        //map();
        //getStringFromArray();
        //getStringToArray();
        //getJoinWithPrefixPostfix();
        //splitString();
        //splitToListOfChar();
        //removeDuplicateCharacterFromString();
        //stringArrayToMap();
        //givenArray_transformedToStream_convertToString();

        Employee a = new Employee("1234", 1.0);

        Map<Employee, String> accountAreaMap = new HashMap<>();
        accountAreaMap.put(a, "Mumbai");

        Employee b = new Employee("1234", 1.0);
        accountAreaMap.put(b, "Pune");

        //System.out.println(accountAreaMap.get(a));

        //System.out.println(accountAreaMap.get(b));

        //HashMapSortByValuesExample();
        getNonRepeatedCharacter();
    }

    private static void getNonRepeatedCharacter(){
        String a = "Desserted";
        Map<Character, Long> collect = a.chars().mapToObj(i -> (char) i)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        Map.Entry<Character, Long> characterLongEntry = collect.entrySet()
                .stream()
                .filter(i -> i.getValue() == 1).findFirst().get();
        System.out.println(characterLongEntry.getKey()+" : "+characterLongEntry.getValue());

        //collect.forEach();
    }

    private static void givenArray_transformedToStream_convertToString() {
        String[] programmingLanguages = {"java", "python", "nodejs", "ruby"};
    }

    private static void stringArrayToMap() {
        String[] strings = {"Hello","World","Java","Programming"};
        Map<String, String> map = Arrays.asList(strings).stream().map(i -> i.split(":")).collect(toMap(s -> s[0], s -> s[1]));
    }

    private static void removeDuplicateCharacterFromString() {
        String name ="Bhavesh";

        List<Character> list = name.chars().mapToObj(i -> (char) i).distinct().collect(Collectors.toList());
        //list.forEach(System.out::println);

        System.out.println();

        Map<Character, Long> collect = name.chars().mapToObj(i -> (char) i).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        Map<Character, Long> collect1 = name.chars().mapToObj(i -> (char) i).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new, Collectors.counting()));
        collect.forEach((a,b)->System.out.println(a +"  "+b));
    }

    private static void splitToListOfChar() {
        String name = "Bhavesh";
        List<Character> list = name.chars().mapToObj(i -> (char) i).toList();
        list.forEach(System.out::println);
    }

    private static void splitString(){
        String name = "Bhavesh,Chouhan";
        Function<String,String> function = String::new;
        List<String> stringList = Stream.of(name.split(",")).map(function).collect(Collectors.toList());
        stringList.forEach(System.out::println);
    }

    private static void getJoinWithPrefixPostfix(){
        List<String> stringList = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eva");
        String str = stringList.stream().collect(Collectors.joining(", ","[","]"));
        System.out.println(str);
    }

    private static void getStringToArray(){
        List<String> stringList = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eva");
        String string = stringList.stream().collect(Collectors.joining(", "));
        System.out.println(string);
        System.out.println();
        System.out.println(Arrays.toString(stringList.toArray()));
    }

    private static void getStringFromArray(){
        List<String> stringList = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eva");
        Predicate<String> predicate = i -> i.startsWith("B");
        Function<String,String> function = String::toUpperCase;
        Function<String,String> function2 = String::toLowerCase;
        Stream<String> stringStream = stringList.stream().filter(predicate).map(function2).map(function);
        stringStream.forEach(System.out::println);

        BinaryOperator<String> binaryOperator = String::concat;
        String str = stringList.stream().reduce(binaryOperator).get();
        System.out.println(str);
    }

    private static void filter(){
        //filter
        //  It is a part of Stream.
        //  It contains Predicate (functional Interface) and Predicate interface contain 1 abstract test method and this method return boolean value.
        //  It is use for Collection Process
        //  this function return boolean value
        List<String> stringList = Arrays.asList("Laisha","Grisha","Pooja","Bhavesh");
        Predicate<String> name = i -> i.equals("Grisha");
        Stream<String> grisha = stringList.stream().filter(name);
        grisha.forEach(System.out::println);

    }

    private static void map() {

        //  Map is a Stream function. it contains Function (functional Interface) and Function take 2 generic value  first is as parameter T and second is return type R
        //  this Function (functional Interface) has 1 apply abstract method
        //  It is use for Collection item Modification
        List<String> stringList = Arrays.asList("Laisha", "Grisha", "Pooja", "Bhavesh");
        Function<String, String> stringFunction = i -> String.valueOf(i.startsWith("P"));
        Stream<String> stringStream = stringList.stream().map(stringFunction);
        stringStream.forEach(System.out::println);
    }

    private static void streamStringObject() {
        Stream<Object> empty = Stream.empty(); //create empty object
        String[] name = {"Bhavesh","Chouhan","Laisha","Grisha","Pooja"};
        Stream<String> name1 = Stream.of(name);
        name1.forEach(System.out::println); //lambda


        List<String> stringList = Arrays.asList("CoreJava","Spring","SpringBoot","Hibernate");
        BinaryOperator<String> binaryOperator5 = (w1, w2)->w1.length() > w2.length()?w1:w2;
        String name2 = stringList.stream().reduce(binaryOperator5).get();
        System.out.println("11 way to get name : "+name2);

        List<String> stringList2 = Arrays.asList("CoreJava","Spring","SpringBoot","Hibernate");
        Predicate<String> predicate = w1-> !w1.equals("Spring");
        List<String> collect = stringList2.stream().filter(predicate).toList();
        System.out.print("12 way to get name : ");
        collect.forEach(System.out::println);


    }

    private static void HashMapSortByValuesExample(){
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("One", 5);
        hashMap.put("Two", 3);
        hashMap.put("Three", 8);
        hashMap.put("Four", 1);

        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(hashMap.entrySet());

        entryList.sort(Map.Entry.comparingByValue());

        entryList.forEach((a)->System.out.println(a.getValue()));


        //List<Map.Entry<String, Integer>> sorted = hashMap.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toList());

        //Map<String, Integer> sortedHashMap = new LinkedHashMap<>();

        //hashMap.entrySet().forEach((a)-> System.out.println(a.getValue()));

        //List<Map.Entry<String,Integer>> list = new ArrayList<>(hashMap.entrySet());


    }
}
