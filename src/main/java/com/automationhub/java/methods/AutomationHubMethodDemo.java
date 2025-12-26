package com.automationhub.java.methods;

public class AutomationHubMethodDemo {

    /*modifier returnType methodName(parameter list) {
        // method body (statements and logic)
        // optional return statement
    }
*/

    //User-Defined Methods
    //Instance Methods (Non-static methods)
    //Non-Parameterized Methods
    //Void Methods

    public void addtion(){

        int a = 10;
        int b = 20;
        int c =a+b;
        System.out.println(c);
    }

    //User-Defined Methods
    //Instance Methods (Non-static methods)
    //Non-Parameterized Methods
    //Return Type Methods

    public int Subration(){

        int a = 10;
        int b = 20;
        int c =a-b;
        return c;
    }

    //User-Defined Methods
    //Instance Methods (Non-static methods)
    //Parameterized Methods
    //Void Methods

    public void addtionWithParamter(int a, double b){

        double c =a+b;
        System.out.println(c);
    }

    //User-Defined Methods
    //Instance Methods (Non-static methods)
    //Parameterized Methods
    //Return Methods

    public int SubrationwithParamter(int a,int b){
        int c =a-b;
        return c;
    }

    //User-Defined Methods
    //Static Methods
    //Parameterized Methods
    //Return Methods


    public static int divwithParamter(int a,int b){
        int c =a/b;
        return c;
    }

    //User-Defined Methods
    //Static Methods
    //Non -Parameterized Methods
    //void Methods

    public static void MulwithParamter(){
        int a = 10;
        int b = 2;
        int c =a/b;
        System.out.println(c);
    }



    public static void main(String[] args) {

        AutomationHubMethodDemo a = new AutomationHubMethodDemo();
        a.addtion();
        a.addtionWithParamter(10,90.00);
        System.out.println(a.SubrationwithParamter(90,10));
        AutomationHubMethodDemo.divwithParamter(10,2);
        AutomationHubMethodDemo.MulwithParamter();
    }
}
