package OOPSConcepts;

public class MainMethod {
    public static void main(String[] args) {
        Subclass obj=new Subclass("phani");
        obj.sub(10,20,5);
        obj.add(10,20);
        Sub2 obj1=new Sub2("purna");
        obj1.add(20,10);
        obj1.mul(20,10);
        subclassSibling obj2=new subclassSibling("manoj");
        obj2.add(30,20);
        obj2.sub(30,20,10);
        obj2.div(10,2);
    }
}
