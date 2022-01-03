package com.sb.iams;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println(constructGreeting("Sanath"));
    }

    protected static String constructGreeting(String name){
        return "Hello " + name;
    }
}
