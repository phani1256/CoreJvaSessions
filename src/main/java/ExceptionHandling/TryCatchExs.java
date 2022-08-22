package ExceptionHandling;

public class TryCatchExs {
    String name="Naveen";
    public  void m1(){
        System.out.println("m1 method");
        m2();
    }
    public void m2(){
        System.out.println("m2 method");
        try{
            m3();
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }

    }
    public  void m3(){
        System.out.println("m3 method");
        int i=9/0;
    }
    public static void main(String[] args) {
        TryCatchExs obj=new TryCatchExs();
        obj.m1();
        System.out.println("bye");
        /*int[] a=new int[3];

        TryCatchExs obj=new TryCatchExs();
        obj=null;
        try{
            System.out.println(100/0);
            System.out.println(obj.name);
            a[0]=1;
            a[4]=10;
            System.out.println(a[0]);
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        catch (NullPointerException e){
            System.out.println(e.getMessage());
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Remove existing connections");
        }
        *//*try{
            System.out.println(obj.name);
        }
        catch (Exception e){
            System.out.println(e);
        }
        try{
            a[0]=1;
            a[4]=10;
        }
        catch (Exception e){
            System.out.println(e);
        }
        System.out.println(a[0]);*//*
        System.out.println("Execution continues after  throwing error from try catch blocks");*/
    }
}
