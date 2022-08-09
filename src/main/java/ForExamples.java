public class ForExamples {
    public static void main(String[] args) {
       /* //sum of 10 numbers
        int sum=0;
        for (int i=1;i<=10;i++){
            sum=sum+i;
        }
        System.out.println(sum);
        //Average of 10 numbers
        double average=(double)sum/10;
        System.out.println(average);*/
        //Sum of elements in the array
        /*int[] a={1,2,3,4,5,6,7,8,9,10};
        int sum=0;
        for(int i=0;i<=a.length-1;i++){
            sum=sum+a[i];
        }
        System.out.println(sum);*/
        //Swapping of two numbers with third variable
        /*int a=10;
        int b=20;
        int temp;
        temp=a;
        a=b;
        b=temp;
        System.out.println(a);
        System.out.println(b);*/
       /* //Swapping of 2 numbers without third variable
        int a=10;
        int b=20;
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a);
        System.out.println(b);*/
        //Pattern Program
        /*for(int i=1;i<=5;i++){
            for(int j=5;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }*/
        /*String[] names={"Manoj","Purna","Srinu","phani"};
        for(int i=0;i<=names.length-1;i++){
            System.out.println(names[i]);
            if(names[i].equals("Purna")){
                System.out.println("purna is available");
                break;
            }
        }*/
        //Reverse Charcters of a string
        /*String input="Dinesh";
        String output="";
        char[] ch=input.toCharArray();
        for(int i=0;i<=ch.length-1;i++){
            output=ch[i]+output;
        }
        System.out.println(output);*/


        //Reverse words of a string
        /*String input="I love my country";
        //I evol ym yrtnuoc
        String output="";
        String[] splttedstring=input.split(" ");
        for(int i=0;i<=splttedstring.length-1;i++){
            output=splttedstring[i]+" "+output;
        }
        System.out.println(output);*/


        //Retrieve substring from a string
        /*String input="Vasundara@gmail.com";
        int index=input.indexOf('@');
        System.out.println(input.substring(0,index));*/
        //Sum of digits in a string
        /*String input="Na12ve34en56";
        int sum=0;
        char[] ch=input.toCharArray();
        for(int i=0;i<=ch.length-1;i++){
            if(Character.isDigit(ch[i])){
                char ch1=ch[i];
                int no=Character.getNumericValue(ch1);
                sum=sum+no;
            }
        }
        System.out.println(sum);*/

        //Sum of elements in the array
        /*int[] a={10,20,30,40};
        int sum=0;
        for(int i=0;i<=a.length-1;i++){
            sum=sum+a[i];
        }
        System.out.println(sum);*/

        //Ascending order of an array

        int[] a={10,3,5,11,20,18,9};
        System.out.println("length of an array is"+a.length);
        int temp;
        for(int i=0;i<=a.length-1;i++){
            for (int j=i+1;j<=a.length-1;j++)
            {
                if(a[i]>a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        //Ascending order
        for (int k=0;k<=a.length-1;k++){
            System.out.println(a[k]);
        }
        //Descending order
        /*for(int l=a.length-1;l>=0;l--){
            System.out.println(a[l]);
        }*/
        //find second highest element in array
        System.out.println("Second highest element:"+a[a.length-2]);
        System.out.println("Second smallest element:"+a[1]);
    }
}
