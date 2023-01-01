package operator;

public class OperatorEx4 {
    public static void main(String[] args) {
        
        float f = 0.1f;
        double d = 0.1;
        double d2 = (double)f;

        System.out.println("10.0 == 10.0f: " + (10.0==10.0f));
        System.out.println("0.1==0.1f: " + (0.1==0.1f));
        System.out.println("f: " + f);
        System.out.println("d: " + d);
        System.out.println("d2: " + d2);
        System.out.println("d==f: " + (d==f));
        System.out.println("d==d2: " + (d==d2));
        System.out.println("d2==f: " + (d2==f));
        System.out.println();

        double temp = 0.0;
        for(int i = 0; i < 100000; i++){
            temp += d;
        }
        System.out.println(temp);

        double temp2 = 0.125;
        double temp3 = 0.0;
        for(int i = 0; i < 10000; i++){
            temp3 += temp2;
        }
        System.out.println(temp3==1250.0);
    }
}
