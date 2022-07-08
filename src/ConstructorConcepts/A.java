package ConstructorConcepts;

public class A {

    int a;
    int b;

    //constructor declaration
    public A(){
        System.out.println("i am naveen");
    }
    public A(int a,int b){

        this.a=a;
        this.b=b;
    }

    public void add(){
        int c=a+b;
        System.out.println(c);
    }
}
