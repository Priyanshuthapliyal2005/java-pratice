import java.util.*;

public class SampleClass {
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        int a=100;
        int b=10;
        int c=0;

        c=a/b;

        try{
            System.out.println("Enter a number: ");
            int num=sc.nextInt();
            System.out.println("Number entered is: "+num);
        }
        catch(InputMismatchException e){
            e.printStackTrace();
        }
        catch(NullPointerException e)
        {
            e.printStackTrace();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        finally{
            System.out.println("Finally block executed");
            
        }
        System.out.println("C: "+c);
    }
}
