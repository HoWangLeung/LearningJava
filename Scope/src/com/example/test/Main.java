package com.example.test;

public class Main {

    public static void main(String[] args) {
        String varFour = " this is private to main() ";

        ScopeCheck scopeInstance = new ScopeCheck();
        scopeInstance.useInner();
        System.out.println("scopeInstance varOne is " + scopeInstance.getPrivateVar());
        System.out.println(varFour);
        scopeInstance.timesTwo();
        System.out.println("********************************************");
        ScopeCheck.InnerClass innerClass = scopeInstance.new InnerClass();
        innerClass.timesTwo();

    }


}
