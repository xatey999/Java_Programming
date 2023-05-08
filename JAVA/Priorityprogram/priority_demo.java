public class priority_demo {
    public static void main(String[] args){
        prdemo t1 = new prdemo();
        prdemo t2 = new prdemo();
        prdemo t3 = new prdemo();

        t1.setPriority(1);
        t2.setPriority(10);
        t3.setPriority(7);
        t1.start();
        t2.start();
        t2.start();
        System.out.println("I am in main");
    }
}

class prdemo extends Thread{
    public void run(){
        Thread T = currentThread();
        System.out.println(Thread.currentThread().getName());
        System.out.println(T.getPriority());
        System.out.println("Id of Thread" + T.getId());
        //System.out.println("I am in main");

    }
}

 
