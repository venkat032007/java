public class threadmain {
    public static void main(String[] args) {
        thread1 t1=new thread1();
        thread2 t2=new thread2();
        t1.start();
        t2.start();
    }
}
class thread1 extends Thread{
    public void run(){
        try {
            int x=0;
            while (true) { 
                if(x%3==0){
                    System.out.println("traffic singnal change:red");
                }
                if(x%3==1){
                    System.out.println("traffic signal change:yellow");
                } 
                if(x%3==2){
                    System.out.println("traffic signal change:green");
                }
                sleep(5000);
                x=x+1;
            }
        }
        catch (Exception e) {
            System.out.println("exception found in thread1");
        }
    }
}
class thread2 extends Thread{
    public void run(){
        try{
            while (true) { 
                System.out.println("pedestrain crossing");
                sleep(2000);
            }
        }
        catch (Exception e){
            System.out.println("exception found in thread2");
        }

    }
}