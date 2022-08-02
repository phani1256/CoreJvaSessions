package IfConditions;

public class IfStatements {
    public static void main(String[] args) {
        int marks=34;
        String name="phani";
        if(marks<35){
            System.out.println("fail");
            System.out.println(name);
        }

        else if(marks>=60 && marks<=100){
            System.out.println("first class");
            if(name.equals("phani")){
                System.out.println("good");
            }
            else {
                System.out.println("improved");
            }
        }
        else if(marks>=45 && marks<=59){
            System.out.println("Second Grade");
        }
        else if(marks>=35 && marks<=44){
            System.out.println("third grade");
        }
        else{
            System.out.println("marks are not valid");
        }
    }

}
