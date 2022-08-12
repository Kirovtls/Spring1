package org.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component

public class Dog  implements Animal{
    @Value("${dog.name}")
    private String name;
   @Value("${dog.age}")
    private int age;
   @Value("${dog.breed}")
    private String breed;

    public Dog() {
    }

    public Dog(String name, int age, String breed) {
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
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", breed='" + breed + '\'' +
                '}';
    }

    @Override
    public void animalPlus() {
        System.out.println("storojytDom");

    }

    @Override
    public void animalMinus() {
        System.out.println("opasnyi");

    }
}
