package operator;

public class OperatorEx1 {
    public static void main(String[] args) {
        
        int temp = 5;
        // 증감 연산자
        System.out.println("temp++: " + temp++);
        System.out.println("++temp: " + ++temp);

        // 0.0과 산술 연산자, Infinity, NaN
        System.out.println("temp/0.0: " + temp/0.0);

        double test = temp/0.0;

        System.out.println("test: " + test);

        System.out.println("0.0/0.0: " + 0.0/0.0);

        // + 산술연산자와 overflow
        int test2 = 2000000000;
        int test3 = 2000000000;
        int test4 = test2 + test3;

        System.out.println(test4);

        byte a = 10;
        byte b = 20;
        // byte c = a + b;
        byte c = (byte)(a + b);
        System.out.println(c);

        
        char d = 'a';
        // char e = d + 1;
        char e = (char)(d + 1);
        System.out.println("e: " + e);

        char f = 'a' + 1;
        // char f = (char)('a' + 1);
        System.out.println("f: " + f);

    }
}
