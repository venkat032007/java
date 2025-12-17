import java.util.Scanner;
class book{
    private String name;
    private String author;
    private double price;
    private int num_pages;
    book(String name,String author,double price,int num_pages) {
        this.name=name;
        this.author=author;
        this.price=price;
        this.num_pages=num_pages;
    }
    void setname(String name){
        this.name=name;
    }
    void setauthor(String author){
        this.author=author;
    }
    void setprice(double price){
        this.price=price;

    }
    void setnumpages(int num_pages){
        this.num_pages=num_pages;
    }
    String getname(){
        return name;
    }
    String getauthor(){
        return author;
    }
    double getprice(){
        return price;
    }
    int getnumpages(){
        return num_pages;
    }
    public String toString(){
        return "bookname:"+name+"\nauthor name:"+author+"\nprice of the book:"+price+"\nno of poages in the book:"+num_pages;
    }
}

public class bookmain{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no of books:");
        int n=sc.nextInt();
        sc.nextLine();
        book[] Book=new book[n];
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of Book " + (i + 1));

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Author: ");
            String author = sc.nextLine();

            System.out.print("Price: ");
            double price = sc.nextDouble();

            System.out.print("Number of pages: ");
            int pages = sc.nextInt();
            sc.nextLine();   // consume newline

            Book[i]=new book(name, author, price, pages);
        }
        System.out.println("\nBook Details");
        for (int i = 0; i < n; i++) {
            System.out.println("\nBook " + (i + 1));
            System.out.println(Book[i]);
        }

        sc.close();
    }
}