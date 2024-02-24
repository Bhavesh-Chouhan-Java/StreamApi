package com.jalaramcwa;

import java.util.*;

public class ABCProgram {

    public static void main(String[] args) {

        List<Exception> list = Arrays.asList(new Exception(1),new Exception(2),new Exception(3));

        List<History> listHistory = Arrays.asList(new History(1,1),
                new History(2,2),new History(3,1),new History(4,1));

        listHistory
                .stream()
                .filter(id -> list.stream().anyMatch(b -> b.getId() == id.getId()))
                .map(History::getVersion)
                .max(Integer::compareTo).ifPresent(System.out::println);
    }

    static class Exception{

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Exception(int id) {
            this.id = id;
        }

        private int id;
    }

    static  class History{



        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getVersion() {
            return version;
        }

        public void setVersion(int version) {
            this.version = version;
        }

        public History(int id, int version) {
            this.id = id;
            this.version = version;
        }

        private int id;
        private int version;
    }
}
