package ConstructorConcepts;

public class C {
    int a;
    int b;

    public C(int a,int b){
        this.a=a;
        this.b=b;
    }

    public void mul(){
        int c=a*b;
        System.out.println(c);
    }
}
