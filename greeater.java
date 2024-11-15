import java.util.Scanner;

public class greeater{
    
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
     System.out.println("enter first value");
        int a= sc.nextInt();
        
        System.out.println("enter the second number:");
         int b= sc.nextInt();
        
        System.out.println("enter the third number:");
          int c= sc.nextInt();

          if (a>b&&a>c) {
            System.out.println("first number is grater"+a);
            
          }
         if (b>a&&b>c) {
            System.out.println("second number is grater"+b);
            
          }
          if (c>a&&c>b){
            System.out.println("third number is grater"+c);
           }
        
         
         
sc.close();
         

        
    }
}