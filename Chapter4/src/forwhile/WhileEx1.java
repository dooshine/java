package forwhile;

public class WhileEx1 {
    public static void main(String[] args) {
        
        // 1부터 몇까지 더하면 누적합계가 100을 넘지않는 제일 큰 수가 되는지 계산
        // 조건을 넘기기 딱 진전까지 data를 얻고 싶으면 조건식에 다음 판별을 기입( ex)sum + num < 100 )
        int num = 1;
        int sum = 0;
        while(sum + num < 100) {
            sum += num++;
        }
        
        System.out.println("num: " + num);
        System.out.println("sum: " + sum);
    }
}
