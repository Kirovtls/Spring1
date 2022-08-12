package org.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Cat implements Animal{
   @Value("${cat.name}")
    private String name;
   @Value("${cat.age}")
    private int age;
   @Value("${cat.breed}")
    private String breed;

    public Cat() {
    }

    public Cat(String name, int age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

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

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", breed='" + breed + '\'' +
                '}';
    }

    @Override
    public void animalPlus() {
        System.out.println("lovytMywei");

    }

    @Override
    public void animalMinus() {
        System.out.println("MnogoKuwaet");

    }
}
