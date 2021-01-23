package week10;

public class CalcThread extends Thread {
    private SyncCalculator calc;

    public CalcThread(SyncCalculator calc){
        this.calc = calc;
    }

    public void run() {
        for(int i = 0; i<10000; i++)
            calc.plus(1);
    }
}
