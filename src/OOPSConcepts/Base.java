package OOPSConcepts;

public class Base {
    public String name;
    public Base(String name){
        this.name=name;
    }
    public  int add(int a,int b){
        int c=a+b;
        System.out.println(c);
        return  c;
    }
}
