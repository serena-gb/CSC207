package study;

public class Person {
    String name;
    int age;
    Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    void setName (String name){
        this.name = name;
    }
    String returnName () {
        return name;
    }
}