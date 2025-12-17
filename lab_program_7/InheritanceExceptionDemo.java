import java.util.Scanner;

class WrongAge extends Exception {
    WrongAge(String msg) {
        super(msg);
    }
}

class Father {
    int fatherAge;

    Father(int age) throws WrongAge {
        if (age < 0) {
            throw new WrongAge("Father's age cannot be negative");
        }
        fatherAge = age;
        System.out.println("Father's age: " + fatherAge);
    }
}

class Son extends Father {
    int sonAge;

    Son(int fatherAge, int sonAge) throws WrongAge,ArithmeticException{
        super(fatherAge);   // call Father constructor

        if (sonAge >= fatherAge) {
            throw new WrongAge("Son's age must be less than Father's age");
        }
        if(sonAge<0){
            throw  new ArithmeticException("son age also can't be negitive");
        }
        this.sonAge = sonAge;
        System.out.println("Son's age: " + sonAge);
    }
}


public class InheritanceExceptionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter father's age: ");
            int fAge = sc.nextInt();

            System.out.print("Enter son's age: ");
            int sAge = sc.nextInt();

            Son s = new Son(fAge, sAge);
            System.out.println("Object created successfully.");

        } 
        catch (WrongAge e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
        catch(ArithmeticException e){
            System.out.println("exception caught:"+e.getMessage());
        }
        sc.close();
    }
}
