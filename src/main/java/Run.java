import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number A : ");
        int num1= sc.nextInt();
        System.out.print("Enter Number B : ");
        int num2= sc.nextInt();

        Calculator object=new Calculator(num1,num2);
        System.out.println("Sum : "+object.add());
        System.out.println("Subtract : "+object.sub());
        System.out.println("Multiply : "+object.mul());
        System.out.println("Divide : "+object.div());
    }
}
