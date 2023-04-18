package com.linkedin.javacodechallenges;

public class App 
{
    public static void main( String[] args )
    {
        Person florian = new Person("Florian","Binaku");

        florian.setAge(23);

        florian.introduction();

        Person p2 = new Person("Fis","Geci");
        p2.setAge(22);
        p2.introduction();

    }
}
