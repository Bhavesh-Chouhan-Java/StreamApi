package com.jalaramcwa;

import com.jalaramcwa.tables.Employee;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamProgram {
    public static void main(String[] args) {

        //findEvenNumberFromArray();

        //findAllNumberStartingWithOne();

        //finDuplicateElements();

        //removeDuplicateElements();

        //findFirstElementFromArray();

        //findTotalNumberOfElementPresentInTheList();

        //countOfTotalElementPresentInTheList();

        //findMaxNumberPresentInTheList();

        //findSecondMaxNumberPresentInTheList();

        //findNotRepeatingElementFromList();

        //findFirstNotRepeatingElementCharacterFromString();

        //findFirstRepeatedElementCharacterFromString();

        //sortAllElementsPresentsInList();

        //sortAllElementsInDescendingOrderPresentsInList();

        //validateTwiceValue();

        //getCurrentDataTime();

        //concatenateTwoStreams();

        //cubeOnListElementsFilterNumbersGreaterThanFifty();

        //convertUppercase();

        //checkListIsEmpty();

        validateTwiceValue();
    }

    private static void checkListIsEmpty() {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Alice", 50000.00));
        employees.add(new Employee("Bob", 45000.00));
        employees.add(new Employee("Charlie", 60000.00));
        Optional.of(employees)
                .orElseGet(Collections::emptyList).stream()
                .filter(Objects::nonNull)
                .map(Employee::getName)
                .forEach(System.out::println);
    }

    private static void convertUppercase() {
        List<String> list = Arrays.asList("bhavesh", "chouhan", "laisha", "grisha", "rukhmani", "disha");
        list.stream()/*.filter(i->i.startsWith("b"))*/.map(String::toUpperCase).forEach(System.out::println);
    }

    private static void cubeOnListElementsFilterNumbersGreaterThanFifty() {
        List<Integer> list = Arrays.asList(4,5,6,7,1,2,3);
        list.stream().map(i->i*i*i).filter(i->i>50).forEach(System.out::println);
    }

    private static void concatenateTwoStreams() {
        List<Integer> list = Arrays.asList(14,32,54,14);
        List<Integer> list1 = Arrays.asList(20,42,14,74);
        Stream.concat(list.stream(),list1.stream()).forEach(System.out::println);
    }

    private static void getCurrentDataTime() {
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());
    }


    private static void validateTwiceValue(){
        List<Integer> list = Arrays.asList(14,32,54,14,14,32);
        boolean b = list.stream().collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()
                .anyMatch(i -> i.getValue() == 5);
        System.out.println(b);
    }

    private static void sortAllElementsInDescendingOrderPresentsInList() {
        List<Integer> list = Arrays.asList(14,32,54,17,8,9,4,12,54,34,67,17,5,3,5,7,98,13,2,14,32);
        list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }

    private static void sortAllElementsPresentsInList() {
        List<Integer> list = Arrays.asList(14,32,54,17,8,9,4,12,54,34,67,17,5,3,5,7,98,13,2,14,32);
        //list.stream().sorted().forEach(System.out::println);
        //list.stream().sorted(Integer::compare).forEach(System.out::println);
        //list.stream().sorted(Integer::compareTo).forEach(System.out::println);
        list.parallelStream().sorted().forEachOrdered(System.out::println);
        //Arrays.parallelSort(list.toArray(new Integer[0]));
    }

    private static void findFirstRepeatedElementCharacterFromString() {
        String str = "this is my first interview";
        str.chars().mapToObj(i->(char)i)
                .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
                .entrySet().stream()
                .filter(i->i.getValue()>1)
                .map(Map.Entry::getKey)
                .findFirst()
                .ifPresent(System.out::println);
    }

    private static void findFirstNotRepeatingElementCharacterFromString() {
        String str = "this is my first interview";
        str.chars().mapToObj(i->(char)i)
                .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
                .entrySet().stream()
                .filter(i->i.getValue()==1)
                .map(Map.Entry::getKey)
                .findFirst()
                .ifPresent(System.out::println);
    }

    private static void findNotRepeatingElementFromList() {
        List<Integer> list = Arrays.asList(14,32,54,17,8,9,4,12,54,34,67,17,5,3,5,7,98,13,2,14,32);
        list.stream()
                .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
                .entrySet().stream()
                .filter(i->i.getValue()==1)
                .findFirst()
                .ifPresent(i->System.out.println(i.getKey()));
    }

    private static void findSecondMaxNumberPresentInTheList() {
        List<Integer> list = Arrays.asList(14,32,54,17,8,9,4,12,34,67,17,5,3,5,7,98,13,2);
        Integer max = list.stream()
                .reduce(Integer::max)
                .get();
        list.stream()
                .filter(i-> !Objects.equals(i, max))
                .reduce(Integer::max)
                .ifPresent(System.out::println);
    }

    private static void findMaxNumberPresentInTheList() {
        List<Integer> list = Arrays.asList(14,32,54,17,8,9,4,12,34,67,17,5,3,5,7,98,13,2);
        list.stream().max(Comparator.naturalOrder()).ifPresent(System.out::println);
    }

    private static void countOfTotalElementPresentInTheList() {
        List<Integer> list = Arrays.asList(14,32,54,17,8,9,4,12,34,67,17,5,3,5,7,98,13,2);
        list.stream().reduce(Integer::sum).ifPresent(System.out::println);
    }

    private static void findTotalNumberOfElementPresentInTheList() {
        List<Integer> list = Arrays.asList(14,32,54,17,8,9,4,12,34,67,17,5,3,5,7,98,13,2);
        long l = list.stream().count();
        System.out.println(l);
    }

    private static void findFirstElementFromArray() {
        List<Integer> list = Arrays.asList(14,32,54,17,8,9,4,12,34,67,17,5,3,5,7,98,13,2);
        list.stream().findFirst().ifPresent(System.out::println);
    }

    private static void removeDuplicateElements() {
        List<Integer> list = Arrays.asList(14,32,54,17,8,9,4,12,34,67,17,5,3,5,7,98,13,2);
        list.stream().distinct().forEach(System.out::println);
    }

    private static void finDuplicateElements() {
        List<Integer> list = Arrays.asList(14,32,54,17,8,9,4,12,34,67,17,5,3,5,7,98,13,2);
        Set<Integer> set = new HashSet<>();
        list.stream().filter(i->!set.add(i)).forEach(System.out::println);
    }

    private static void findAllNumberStartingWithOne() {
        List<Integer> list = Arrays.asList(14,32,54,17,8,9,4,12,34,67,17,5,3,5,7,98,13,2);
        list.stream().map(String::valueOf).filter(i->i.startsWith("1")).forEach(System.out::println);
    }

    private static void findEvenNumberFromArray() {
        List<Integer> list = Arrays.asList(1,3,5,7,8,9,4,2,34,67,87,5,3,5,7,98,3,2);
        list.stream().filter(i-> i % 2 == 0).forEach(System.out::println);
    }
}
