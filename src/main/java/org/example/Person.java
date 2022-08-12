package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person {

   @Value("${person.name}")
    private  String name;
   @Value("${person.age}")
    private int age;
    private Animal animal;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

@Autowired
    public Person( @Qualifier("dog") Animal animal) {
        this.animal = animal;
    }

    public Person() {
    }
    public void anemal(){
        animal.animalMinus();
        animal.animalPlus();
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
}


