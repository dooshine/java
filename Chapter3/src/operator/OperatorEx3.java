package operator;

public class OperatorEx3 {
    public static void main(String[] args) {
        
        boolean test1 = 10 == 10.0f;
        boolean test2 = '0' != 0;
        boolean test3 = 'A' == 65;
        int num = 5;
        boolean test4 = num > 0 && num < 9;

        if(test1){
            System.out.println("10과 10.0f는 같다.");
        } else {
            System.out.println("10과 10.0f는 같지않다.");
        }

        if(test2){
            System.out.println("'0'과 0은 같지않다.");
        } else {
            System.out.println("'0'과 0은 같다.");
        }
        System.out.println("(int)'0': " + (int)'0');

        if(test3){
            System.out.println("'A'와 65는 같다");
        } else {
            System.out.println("'A'와 65는 같지않다");
        }

        if(test4){
            System.out.println("5는 0보다 크고 9보다 작다");
        } else {
            System.out.println("5는 0보다 크고 9보다 작은 범위에 있지 않다.");
        }

    }
}
