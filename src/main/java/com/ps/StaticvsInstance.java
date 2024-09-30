package com.ps;

class Calculator{
    public static void main(String[] args){

        // invoking or calling (Instance)
        Calculator calculator = new Calculator();
        calculator.addInstance(1,2);

        // invoking or calling (static) inside the same class
        addStatic(3,4);

        // outside the class
        Calculator.addStatic(5,6);

    }
    public void addInstance(int num1, int num2){
        System.out.println(num1 + num2);
    }
    public static void addStatic(int num1, int num2){
        System.out.println(num1 + num2);
    }
}