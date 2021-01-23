package week10;

public class Main {
    public static void main(String[] args){
        Thread threadExample = new ThreadExample();
        Thread runnableExample = new Thread(new RunnableExample());

        runnableExample.setPriority(10);
        threadExample.start();
        runnableExample.start();
    }
}
