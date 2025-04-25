package ru.evoloodsen.patterns.builder;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 25.04.2025
 */

public class Employee {

    private String name;
    private int age;
    private boolean hasCar;

    private Employee(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.hasCar = builder.hasCar;
    }

//    public Employee(String name, int age, boolean hasCar) {
//        this.age = age;
//        this.name = name;
//        this.hasCar = hasCar;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isHasCar() {
        return hasCar;
    }

    public void setHasCar(boolean hasCar) {
        this.hasCar = hasCar;
    }

    public static class Builder {
        private String name;
        private int age;
        private boolean hasCar;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder hasCar(boolean hasCar) {
            this.hasCar = hasCar;
            return this;
        }

        public Employee build() {
            return new Employee(this);
        }
    }
}
