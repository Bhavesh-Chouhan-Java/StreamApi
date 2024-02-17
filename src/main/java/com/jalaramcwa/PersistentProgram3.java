package com.jalaramcwa;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PersistentProgram3 {

    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student("Bhavesh","Male",30));
        list.add(new Student("Laisha","FeMale",32));
        list.add(new Student("Bhavesh2","Male",34));
        list.add(new Student("Grisha","FeMale",31));

        Map<String, List<Student>> map = list.stream().collect(Collectors.groupingBy(Student::getGender));
        map.forEach((i,k)-> System.out.println(i+" "+k));


        /*String str = "Bhavesh";
        StringBuilder reversed = new StringBuilder();
//        for(int i = str.length()-1 ; i >= 0 ; i--){
//            //reversed.append(str.charAt(i));
//            reversed.insert(0,str.charAt(i));
//        }

        for(int i = 0 ; i <= str.length()-1 ; i++){
            //reversed.append(str.charAt(i));
            reversed.insert(0,str.charAt(i));
        }
        System.out.println(reversed);*/

        /*String reverse = "";
        for(int i = str.length()-1 ; i >= 0 ; i--){
            reverse = reverse + str.charAt(i);
        }
        System.out.println(reverse);*/


        //Stream.of(1,2,3,4,5,6,7,8,9,10).filter(i->i%2!=0).map(Math::sqrt).toList().forEach(System.out::println);

        String str = "Bhavesh";
        String revStr = IntStream.rangeClosed(1, str.length())
                .mapToObj(i -> str.charAt(str.length() - i))
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();
        System.out.println(revStr);

        String reversed = str.chars()
                .collect(StringBuilder::new,
                        (b, c) -> b.insert(0, (char)c), (b1, b2) -> b1.insert(0, b2))
                .toString();
        System.out.println(reversed);
    }

    static class Student{

        private String name;
        private String gender;
        private int age;

        public Student(String name, String gender, int age) {
            this.name = name;
            this.gender = gender;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", gender='" + gender + '\'' +
                    ", age=" + age +
                    '}';
        }
    }


}
