package stream.classes;

import stream.enums.Gender;

import java.math.BigDecimal;

public class Student {
    private String firsName;
    private String lastName;
    private BigDecimal money;
    private int age;
    private Gender gender;

    public Student(String firsName, String lastName, BigDecimal money, int age, Gender gender) {
        this.firsName = firsName;
        this.lastName = lastName;
        this.money = money;
        this.age = age;
        this.gender = gender;
    }

    public String getFirsName() {
        return firsName;
    }

    public void setFirsName(String firsName) {
        this.firsName = firsName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "\nStudent{" +
                "firsName='" + firsName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", money=" + money +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}

