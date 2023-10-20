package org.example.problem3;

public class Person implements Subscriber{

    private String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public void update(String news) {
        System.out.println(this.name + " : " + news);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
