package week10;

public class CommonCalculator {
    private int res;

    public CommonCalculator() {
        res = 0;
    }

    public void plus(int num){
        res += num;
    }

    public void minus(int num){
        res -= num;
    }

    public int getRes(){
        return res;
    }
}
