public class ThreadSimple{
    public static void main(String[] args) throws Exception{
        for(int i=0; i<5; i++){
            System.out.println("User Thread");
            Thread.sleep(1000);
        }
    }
}