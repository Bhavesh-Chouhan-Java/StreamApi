package com.jalaramcwa.java.stream;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class MainNumberProgram {
    public static void main(String[] args) {
        //wayToCreateList();
        //streamIntObject();
        //evenOddNumber();
        //map();
        //getFirstAndSecondLargestNumber();
        //System.out.println("------------getFirstAndSecondLargestNumber------------");
        //getFirstAndSecondLowestNumber();
        //System.out.println("------------getFirstAndSecondLowestNumber-----------");
        //getSumValueFromArrayItem();
        //System.out.println("------------getSumValueFromArrayItem-----------");
        //getStringFromArray();
        //System.out.println("------------getStringFromArray-----------");
        //flatMap(); //Flattens nested collections into a single stream.
        //System.out.println("------------flatMap-----------");
        //getDuplicateItemFromArray();
        //System.out.println("------------getDuplicateItemFromArray-----------");
        //checkDuplicateCharInString();
        //System.out.println("------------checkDuplicateCharInString----------");
        //firstNonRepeatedCharacter();
        //System.out.println("------------firstNonRepeatedCharacter----------");
        //findDuplicateValue();
        //System.out.println("------------findDuplicateValue----------");
        //findDuplicateValueUsingStream();
        //System.out.println("------------findDuplicateCharFromString----------");
        //findDuplicateCharFromString();
        //System.out.println("------------findEvenNumber----------");
        //findEvenNumber();
        //System.out.println("------------findOddNumber----------");
        //findOddNumber();
        //System.out.println("------------maxAndMinNumberFromArray----------");
        maxAndMinNumberFromArray();
    }



    private static void findEvenNumber(){
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,32);
        Predicate<Integer> predicate = i -> i%2==0;
        List<Integer> myList21 = myList.stream().filter(predicate).collect(Collectors.toList());
        List<Integer> myList2 = myList.stream().filter(predicate).toList();
        myList2.forEach(System.out::println);
    }

    private static void findOddNumber(){
        /*List<Integer> myList = Arrays.asList(10,15,8,49,25,98,32);
        Predicate<Integer> predicate = i -> i%2!=0;
        List<Integer> myList2 = myList.stream().filter(predicate).toList();
        myList2.forEach(System.out::println);*/
    }

    private static void maxAndMinNumberFromArray(){
        int[] arr = {10,15,8,49,25,98,32};
        int a = arr[0];
        for(int i = 0 ; i < arr.length; i++){
            if(arr[i] < a){
                a = arr[i];
            }
            System.out.println(a);
        }
        //System.out.println(a);

        //OptionalInt min = Arrays.stream(arr).min();
        //System.out.println(min.getAsInt());

        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,32);
        Optional<Integer> list2 = myList.stream().min(Comparator.naturalOrder());
        //System.out.println(list2.get());
    }



    private void findDuplicateCharFromString(){
        String str = "abcdcefga";
        Set<Character> set = new HashSet<>();
        Map<String, Long> collect1 = str.chars().mapToObj(i -> ((char) i)).filter(i -> !set.add(i)).collect(Collectors.groupingBy(Object::toString, Collectors.counting()));
        collect1.forEach((k,v)-> System.out.print(k));

		/*Map<Character, Long> collect = str.chars()
				.mapToObj(i -> (char) i)
				.collect(Collectors.groupingBy(c -> c, Collectors.counting()));
		collect.forEach((k,v)-> {if (v > 1) {System.out.print(k);}});*/



		/*Set<Character> set = new HashSet<>();
		ArrayList<Character> arrayList = new ArrayList<>();
		for(int i = 0 ; i < str.length(); i++){
			if(!set.add(str.charAt(i))){
				arrayList.add(str.charAt(i));
			}
		}
		System.out.println(arrayList);*/

		/*String[] strr = new String[str.length()];
		ArrayList<Character> al = new ArrayList<>();
		Set<Character> set = new HashSet<>();
		for(int i = 0 ; i < strr.length; i++){
			if(!set.add(str.charAt(i))){
				al.add(str.charAt(i));
			}
		}
		System.out.println(al);*/
    }

    private static void getFirstAndSecondLargestNumber(){
        List<Integer> integerList = List.of(111,232,223,4,5,61,73);

        Optional<Integer> max = integerList.stream().max(Comparator.naturalOrder());//(a,b)->a.compareTo(b)
        System.out.println("Largest value : "+max.get());

        Predicate<Integer> predicate = i -> i < max.get();
        Optional<Integer> secondMax = integerList.stream().filter(predicate).max(Comparator.naturalOrder());//(a,b)->a.compareTo(b)
        System.out.println("Second Largest value : "+secondMax.get());
    }

    private static void getFirstAndSecondLowestNumber(){
        List<Integer> integerList = List.of(111,232,223,4,5,61,73);

        Optional<Integer> min = integerList.stream().min(Comparator.naturalOrder());
        System.out.println("Lowest value : "+min.get());

        Predicate<Integer> predicateLowest = i -> i > min.get();
        Optional<Integer> secondMin = integerList.stream().filter(predicateLowest).min(Comparator.naturalOrder());
        System.out.println("Second Lowest value : "+secondMin.get());
    }

    private static void getSumValueFromArrayItem() {
        List<Integer> integerList = List.of(11,2,3,4,5,6,7,7);
        BinaryOperator<Integer> binaryOperator0 = Integer::sum;
        BinaryOperator<Integer> binaryOperator2 = (a,b) -> a+b;
        Integer reduce = integerList.stream().reduce(0,binaryOperator2);//(a,b)->a+b
        System.out.println("1 way to get total sum value : "+reduce);

        int sum = integerList.stream().mapToInt(i->i).sum();
        System.out.println("2 way to get total sum value : "+sum);

        BinaryOperator<Integer> binaryOperator = Integer::sum;
        Integer reduce1 = integerList.stream().reduce(0, binaryOperator);
        System.out.println("3 way to get total sum value : "+reduce1);

        Optional<Integer> reduce2 = integerList.stream().reduce(binaryOperator);
        System.out.println("4 way to get total sum value : "+reduce2.get());

        BinaryOperator<Integer> binaryOperator1 = (a,b)->a*b;
        Integer reduce3 = integerList.stream().reduce(1, binaryOperator1);
        System.out.println("5 way to get total sum value : "+reduce3);

        Optional<Integer> reduce4 = integerList.stream().reduce(binaryOperator1);
        System.out.println("6 way to get total sum value : "+reduce4.get());

        BinaryOperator<Integer> binaryOperator20 = (a,b) -> a>b?b:a;
        Optional<Integer> reduce5 = integerList.stream().reduce(binaryOperator20);
        System.out.println("7 way to get total sum value : "+reduce5.get());

        Integer integer = integerList.stream().reduce(3,binaryOperator20);
        System.out.println("8 way to get total sum value : "+integer);

        BinaryOperator<Integer> binaryOperator3 = Integer::min;
        Optional<Integer> optionalI = integerList.stream().reduce(binaryOperator3);
        System.out.println("9 way to get min value : "+optionalI.get());

        BinaryOperator<Integer> binaryOperator4 = Integer::max;
        Optional<Integer> optionalI4 = integerList.stream().reduce(binaryOperator4);
        System.out.println("10 way to get max value : "+optionalI4.get());

        Set<Integer> integerSet = new HashSet<>();
        Predicate<Integer> predicate = i -> !integerSet.add(i);
        List<Integer> s = integerList.stream().filter(predicate).collect(Collectors.toList());
        Set<Integer> se = integerList.stream().filter(predicate).collect(Collectors.toSet());
        s.forEach(System.out::println);
        System.out.println();
        //se.forEach(System.out::println);
        System.out.println("Remove Duplicate Values from array : "+Arrays.toString(se.toArray()));
        //se.forEach(System.out::println);
    }


    private static void findDuplicateValueUsingStream() {
        List<Integer> list = Arrays.asList(1,2,3,3,4,4,5);
        Set<Integer> set2 = new HashSet<>();
        Set<Integer> collect = list.stream().filter(i -> !set2.add(i)).collect(Collectors.toSet());
        collect.forEach(System.out::println);
    }

    private static void findDuplicateValue(){
        List<Integer> list = Arrays.asList(1,2,3,3,4,4,5);
        List<Integer> list2 = new ArrayList<>();
        //without Stream
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < list.size() ; i++){
            if(!set.add(list.get(i))){
                list2.add(list.get(i));
            }
        }
        System.out.println(list2);
    }

    private static void firstNonRepeatedCharacter() {
        "Cactus".chars().forEach(c -> System.out.println((char)c));
        System.out.println();
        System.out.println("-----------------------");
        String str= "stress";
        String s = str.chars().mapToObj(i->Character.toLowerCase((char)i))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).toString();
        System.out.print("1 way to get all non repeated character is :");
        System.out.println(s);


        System.out.println("-----------------------");
        System.out.print("2nd way to The first non repeated character is :");
        Optional<Character> first = str.chars().mapToObj(i -> Character.toLowerCase((char) i))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()))
                .entrySet().stream()
                .filter(e -> e.getValue() == 1L)
                .map(e -> (char)e.getKey())
                .findFirst();

        first.ifPresent(System.out::println);

        System.out.println("-----------------------");
        System.out.print("remove repeated character is :");
        str.chars()
                .mapToObj(i-> Character.valueOf((char)i))
                .collect(Collectors.toSet())
                .forEach(System.out::print);
        System.out.println();
        System.out.println("-----------------------");
        System.out.print("sorted character is :");
        str.chars().mapToObj(i-> (char) i)
                .sorted(Character::compareTo)
                .forEach(System.out::print);
        System.out.println("-----------------------\n");



    }

    private static void checkDuplicateCharInString(){
        String input = "Feel the need";
        Set<Integer> set = new HashSet<>();
        OptionalInt first = input.chars().filter(i -> !set.add(i)).findFirst();
        if(first.isPresent()) {
            System.out.println((char) first.getAsInt());
        }
        System.out.println("-----------------------");

        String s = input.chars().mapToObj(i -> (char) i).collect(Collectors.groupingBy(Object::toString, Collectors.counting())).toString();
        System.out.println(s);
    }

    private static void getDuplicateItemFromArray() {
        List<Integer> integerStream = Arrays.asList(1, 2, 3, 3, 4, 5, 66, 66, 7, 88, 9);

        Set<Integer> integerSet = new HashSet<>();
        Predicate<Integer> predicate = i -> !integerSet.add(i);
        Stream<Integer> integerStream1 = integerStream.stream().filter(predicate);
        integerStream1.forEach(System.out::print);

        System.out.println("-----------------------");

        Set<Integer> collect = integerStream.stream().filter(i -> Collections.frequency(integerStream, i) > 1).collect(Collectors.toSet());
        collect.forEach(System.out::println);
    }

    private static void flatMap(){
        List<List<Integer>> listLists = Arrays.asList(Arrays.asList(1, 2, 3),
                Arrays.asList(11, 22, 33),
                Arrays.asList(111, 222, 333));

        Stream<Integer> integerList = listLists.stream().flatMap(Collection::stream);
        integerList.forEach(System.out::print);
        System.out.println();
    }

    private static void getStringFromArray() {
        List<String> stringList = Arrays.asList("CoreJava","Spring","SpringBoot","Hibernate");
        String str = stringList.stream().collect(Collectors.joining(", "));
        System.out.println(str);
        List<String> strings1 = List.of(str);
        System.out.println(strings1);
    }







    private static void map(){
        List<Integer> integerList = List.of(1,2,3,4,5,6,7);
        //Predicate<Integer> predicate = i -> i > i;
        //integerList.stream().filter(predicate)
        Function<Integer,Integer> function = i -> i * i;
        Stream<Integer> integerStream = integerList.stream().map(function);
        integerStream.forEach(System.out::println);

        Stream<Integer> sorted = integerList.stream().sorted();
        //sorted.forEach(System.out::println);
    }

    private static void streamIntObject() {
        Stream<Object> empty = Stream.empty(); //create empty object
        int[] intArr = {1,2,3,11,12,13};
        List<int[]> intArr1 = Stream.of(intArr).toList();
        //intArr1.forEach(System.out::println); //lambda

        IntStream stream = Arrays.stream(intArr);
        stream.forEach(System.out::println);


    }

    private static void wayToCreateList() {
        String name = "Bhavesh";
        List<String> collect = Arrays.asList(name).stream().toList();
        List<String> name1 = Stream.of(name).toList();
        List<String> name2 = Stream.of(name).collect(Collectors.toList());
        //Mutable Array
        int[] strArr = {1, 2, 3, 4, 5, 6, 11, 12, 13, 14, 15, 16};
        List<int[]> integerList0 = List.of(strArr); //convert int[] to list

        //Immutable List
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6, 11, 12, 13, 14, 15, 16);

        //Immutable List
        List<Integer> integerList1 = List.of(1, 2, 3, 4, 5, 6, 11, 12, 13, 14, 15, 16);

        //Mutable List
        List<Integer> integerList2 = new ArrayList<>();
        integerList2.add(1);
        integerList2.add(2);
        integerList2.add(3);
        integerList2.add(4);
        integerList2.add(5);
        integerList2.add(6);
        integerList2.add(11);
        integerList2.add(12);
        integerList2.add(13);
        integerList2.add(14);
        integerList2.add(15);
        integerList2.add(16);


    }

    private static void evenOddNumber() {
        //Immutable List
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6, 11, 12, 13, 14, 15, 16);

        //Immutable List
        List<Integer> integerList1 = List.of(1, 2, 3, 4, 5, 6, 11, 12, 13, 14, 15, 16);

        //Mutable List
        List<Integer> integerList2 = new ArrayList<>();
        integerList2.add(1);
        integerList2.add(2);
        integerList2.add(3);
        integerList2.add(4);
        integerList2.add(5);
        integerList2.add(6);
        integerList2.add(11);
        integerList2.add(12);
        integerList2.add(13);
        integerList2.add(14);
        integerList2.add(15);
        integerList2.add(16);

        Stream<Integer> stream = integerList.stream(); // it will return Stream<T>

        Stream<Integer> integerStream = stream.filter(i -> i % 2 == 0); // it will return Stream<T>

        List<Integer> collect = integerStream.toList(); // it will convert after perform operation stream to List

        System.out.println(collect);

        //Even number short way to like : Builder Pattern
        List<Integer> collect1 = integerList
                .stream()
                .filter(i -> i % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(collect1);

        //Even number short way to like : Builder Pattern
        List<Integer> collect2 = integerList
                .stream()
                .filter(i -> i % 2 != 0)
                .collect(Collectors.toList());
        System.out.println(collect2);

        //Even number short way to like : Builder Pattern
        Predicate<Integer> predicateEven = i -> i % 2 == 0;
        List<Integer> collect3 = integerList
                .stream()
                .filter(predicateEven)
                .collect(Collectors.toList());
        System.out.println(collect3);

        Predicate<Integer> predicateOdd = i -> i % 2 != 0;
        List<Integer> collect4 = integerList
                .stream()
                .filter(predicateOdd)
                .collect(Collectors.toList());
        System.out.println(collect4);



    }
}