public class ThreadExample extends Thread{
    public void run(){
       for (int i=0; i<10; i++){
            System.out.println("Pokhara University");

        }
    }
    public static void main(String[] args){
        ThreadExample t1 = new ThreadExample();
        t1.start();
    }
}