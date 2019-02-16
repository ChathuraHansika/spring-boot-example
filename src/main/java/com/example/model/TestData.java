package com.example.model;

/**
 * Created by Gayan Sanjeewa on 12/9/2018.
 */
public class TestData {
    String name;
    String age;

    @Override
    public String toString() {
        return "TestData{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    public TestData(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
