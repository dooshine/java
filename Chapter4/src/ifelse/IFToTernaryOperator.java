package ifelse;

public class IFToTernaryOperator {
    public static void main(String[] args) {
        
        // 점수가 90점보다 같거나 크면 'A'
        // 점수가 80점보다 같거나 크면 'B'
        // 나머지 'C'

        int score = 45;
        char grade;

        if(score >= 90){
            grade = 'A';
        } else if (score >= 80){
            grade = 'B';
        } else {
            grade = 'C';
        }

        // Ternary Operator
        // grade = (score >= 90 ?) 'A' : ( (score >= 80) ? 'B' : 'C');
        System.out.println("score: " + score);
        System.out.println("grade: " + grade);

    }
}
