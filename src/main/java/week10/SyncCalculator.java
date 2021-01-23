package week10;

public class SyncCalculator {
    private int res;

    public SyncCalculator() {
        res = 0;
    }

    public synchronized void plus(int num){
        res += num;
    }

    public synchronized void minus(int num){
        res -= num;
    }

    public int getRes(){
        return res;
    }
}
