package com.linkedin.javacodechallenges;

public class Person {
  private String firstName;
  private String lastName;
  
  public Person(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }


  private int age;

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void introduction(){
    System.out.println(String.format("Hello! My name is %s %s and I am %d years old.",firstName,lastName,age));
  }
}