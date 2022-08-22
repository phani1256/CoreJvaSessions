package ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowandThrows {
    public void m1() throws ArithmeticException, ArrayIndexOutOfBoundsException, FileNotFoundException {
        FileInputStream fs=new FileInputStream("C:\\Users\\NAVEEN\\Desktop\\44478567_16580413413281.xls");
        int i=9/0;
        int[] a=new int[3];
        a[4]=9;
        System.out.println(i);
    }

    public static void getinfo(){
        String data=null;
        try{
            if(data==null){
                throw new Exception("Data not Found exception");
            }
            else {
                System.out.println(data);
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("bye");
    }

    public static void main(String[] args) throws FileNotFoundException {
        getinfo();
        ThrowandThrows obj=new ThrowandThrows();
        obj.m1();
    }
}
