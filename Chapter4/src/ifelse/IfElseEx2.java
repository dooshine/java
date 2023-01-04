package ifelse;

public class IfElseEx2 {
    public static void main(String[] args) {
        // 90점 이상은 A, 80점 이상은 B, 나머지는 C일 때
        // A중 98점 이상은 A+, 94점 이상은 A, 나머지 A-
        // B중 88점 이상은 B+, 84점 이상은 B, 나머지 B-
        // 나머지는 그냥 C

        int score = 93;
        String grade;

        if(score >= 90){
            grade = "A";
            if(score >= 98){
                grade = "A+";
            } else if(score < 94){
                grade = "A-";
            }
        } else if(score >= 80){
            grade = "B";
            if(score >= 88){
                grade = "B+";
            } else if(score < 84){
                grade = "B-";
            }
        } else {
            grade = "C";
        }

        System.out.println("score: " + score);
        System.out.println("grade: " + grade);
    }
}
