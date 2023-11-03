package model;

    public class Person {
        private String name;
        private Integer age;
        private Boolean isMarried;

        public Person(String name, Integer age, Boolean isMarried){
            this.name = name;
            this.age = age;
            this.isMarried = isMarried;
        }

        public String getName() {
            return name;
        }

        public Integer getAge() {
            return age;
        }

        public Boolean getMarried() {
            return isMarried;
        }

    }
