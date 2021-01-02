package week4;

class statementExample {
    public static void main(String[] args){
        //ifExample(1);
        //switchExample(1);
        forExample();
        whileExample();
    }

    public static void ifExample(int caseNum){
        if(caseNum == 1){
            System.out.println("One");
        } else if(caseNum == 2){
            System.out.println("Two");
        } else {
            System.out.println("Others");
        }
    }

    public static void switchExample(int caseNum){
        switch (caseNum) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            default:
                System.out.println("Others");
                break;
        }
    }

    public static void forExample(){
        for(int i=1; i<10; i++)
            System.out.println(i + " * 9 = " + i*9);
    }

    public static void whileExample(){
        int i=1;
        while(i<10){
            System.out.println(i + " * 9 = " + i*9);
            i++;
        }
    }
}
