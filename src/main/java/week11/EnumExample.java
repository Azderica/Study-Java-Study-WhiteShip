package week11;

public class EnumExample {

    public enum Language {
        JAVASCRIPT, JAVA, PYTHON, TYPESCRIPT
    }

    public static void main(String[] args) {
//        printEnumOrdinal();
        printEnumName();
    }

    public enum ItCompany {
        GOOGLE(100),
        APPLE(200),
        NAVER(300),
        KAKAO(400);

        private int value;

        ItCompany(int value) {
            this.value = value;
        }

        public int value() {
            return this.value;
        }
    }

    public static void printEnumOrdinal() {
        System.out.println(Language.JAVASCRIPT.ordinal());
        System.out.println(Language.JAVA.ordinal());
        System.out.println(Language.PYTHON.ordinal());
        System.out.println(Language.TYPESCRIPT.ordinal());
    }

    public static void printEnumName() {
        System.out.println(Language.JAVASCRIPT);
        System.out.println(Language.valueOf("JAVA"));
        System.out.println(Enum.valueOf(Language.class, "PYTHON"));
        System.out.println(Language.TYPESCRIPT.name());
    }


}
