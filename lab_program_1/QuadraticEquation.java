import java.util.Scanner;
public class QuadraticEquation{
    public static void main(String[] args) {
        Scanner sc12 = new Scanner(System.in);
        System.out.println("enter a:");
        double a=sc12.nextDouble();
        System.out.println("enter b:");
        double b=sc12.nextDouble();
        System.out.println("enter c:");
        double c=sc12.nextDouble();
        double disc=b*b-(4*a*c);
        if(disc<0){
            System.out.println("there are no real solutions");
        }
        else if(disc==0){
            double root1=-b/(2*a);
            System.out.println("there is one real solution:");
            System.out.println("x="+root1);
        }
        else{
            double root1=(-b+Math.sqrt(disc))/(2*a);
            double root2=(-b-Math.sqrt(disc))/(2*a);
            System.out.println("there are two real solutions:");
            System.out.println("x1="+root1);
            System.out.println("x2="+root2);
        }
        sc12.close();
    }
}