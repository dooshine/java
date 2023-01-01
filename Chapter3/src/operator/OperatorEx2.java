package operator;

public class OperatorEx2 {
    public static void main(String[] args) {
        // 소수점 끊기와 절삭

        // 소수점 4자리까지만 저장
        float PI = 3.141592f;
        float PIpoint4 = (int)(PI * 10000) / 10000f;
        System.out.println("PIpoint4: " + PIpoint4);

        // 소수점 4자리까지, 5자리에서 반올림
        float PIpoint4Round = (int)Math.round(PI * 10000) / 10000f;
        System.out.println("PIpoint4Round: " + PIpoint4Round);

        // 1000의자리수까지 버림
        int BIRTH = 950304;
        int BIRTHYear = BIRTH - BIRTH % 10000;
        System.out.println("BIRTHYear: " + BIRTHYear);
        System.out.println();

        // / 피연산자의 부호
        System.out.println("10 / -4: " + 10 / -4);
        System.out.println("10 % -4: " + 10 % -4);
        System.out.println();

        System.out.println("-10 / 4: " + -10 / 4);
        System.out.println("-10 % 4: " + -10 % 4);
        System.out.println();

        System.out.println("-10 / -4: " + -10 / -4);
        System.out.println("-10 % -4: " + -10 % -4);

    }
}
