package switchcase;

public class SwitchEx3 {
    public static void main(String[] args) {
        // 'A', 'B', 'C', 'D'를 하나 얻어서 score 부여
        char grade = (char)(Math.random()*4 + 'A');
        int score = 0;

        switch(grade) {
            case 'A':
                score = 90;
                break;        
            case 'B':
                score = 80;
                break;        
            case 'C':
                score = 70;
                break;        
            case 'D':
                score = 60;
                break;     
        }

        System.out.println("당신의 grade는 " + grade + "이고, 당신의 점수는 " + score + "점 이상입니다.");
        System.out.println("==========================");
        // 점수를 100~90 89~80 79~70 69~60 59~0 범위로 나누기

        int score2 = (int)(Math.random() * 101);
        char grade2 = ' ';
        switch(score2 / 10) {
            case 10:
            case 9:
                grade2 = 'A';
                break;
            case 8:
                grade2 = 'B';
                break; 
            case 7:
                grade2 = 'C';
                break;
            case 6:
                grade2 = 'D';
                break;
            default :
                grade2 = 'F';
        }

        System.out.println("당신의 점수는 " + score2 + "점 이고, 당신의 grade는 " + grade2 + "입니다.");
    }
}
