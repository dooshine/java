package operator;

public class Operator {
    public static void main(String[] args) {
        // 수 중에서 10이상 20미만, 70이상 80미만인 수 출력

        // 입력
        int startNum1 = 10;
        int endNum1 = 20;
        int startNum2 = 70;
        int endNum2 = 80;

        for(int i = 1 ; i <= 100; i++){
            // boolean isNumTarget = (i >= startNum1 && i < endNum1) || (i >= startNum2 && i < endNum2);
            boolean isNumTarget = i < endNum2 && i >= startNum2 || i >= startNum1 && i < endNum1 ;
            if(isNumTarget){
                System.out.println(i);
            }
        }

    }
}
