package week3;

interface interType{}
class type1 {}
class type2 extends type1 {}
class type3 implements interType {}

class instanceOfExmple {
    public static void main(String[] args){
        //instanceOfExample();
        //shiftOperator();
        switchOperator();
    }

    public static void instanceOfExample() {
        type1 myType1 = new type1();
        type2 myType2 = new type2();
        type3 myType3 = new type3();

        System.out.println(myType1 instanceof interType);
        System.out.println(myType2 instanceof interType);
        System.out.println(myType3 instanceof interType);
        System.out.println(myType2 instanceof type2);
    }

    public static void shiftOperator() {
        int num1 = 10;  // 00000000 00000000 00000000 00001010
        int num2 = 15;  // 00000000 00000000 00000000 00001111

        System.out.println(num1 << 3); // 80
        // 00000000 00000000 00000000 01010000

        System.out.println(num1 >> 1); // 5
        // 00000000 00000000 00000000 00000101

        System.out.println(num1 >>> 1); // 5
        // 00000000 00000000 00000000 00000101
    }

    public static void switchOperator() {
        System.out.println(swtichExample("a")); // 1
        System.out.println(swtichExample("b")); // 2
        System.out.println(swtichExample("c")); // 3
        System.out.println(swtichExample("d")); // -1
    }

    public static int swtichExample(String s){
        switch (s){
            case "a":
                return 1;
            case "b":
                return 2;
            case "c":
                return 3;
            default:
                return -1;
        }
    }
}
