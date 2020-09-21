package ru.mirea.exercise7;

public abstract class Dog {
    protected String name;
    protected int age;
    protected String color;

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public int ageToHuman() {
        return age * 7;
    }

    public String toString() {
        return "Dog{ name='" + name + "\', color=" + color + "\', age=" + age + "\', humanAge=" + ageToHuman() + " }";
    }
}
