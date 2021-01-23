package week10;

public class RunSync {
    public static void main(String[] args) {
        RunSync runSync = new RunSync();
        runSync.runCalculate();
    }

    private void runCalculate() {
        // CommonCalculator commonCalc = new CommonCalculator();
        SyncCalculator syncCalc = new SyncCalculator();
        CalcThread thread1 = new CalcThread(syncCalc);
        CalcThread thread2 = new CalcThread(syncCalc);

        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
            System.out.println("Final value : " + syncCalc.getRes());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }


}
