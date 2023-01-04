package switchcase;

public class SwitchEx4 {
    public static void main(String[] args) {
        
        int score = (int)(Math.random() * 10) + 1;
        String msg = "";
        score *= 100;

        switch(score) {
            case 1000:
                msg += "냉장고, ";
            case 900:
                msg += "TV, ";
            case 800:
                msg += "노트북, ";
            case 700:
                msg += "자전거, ";
            default:
                msg += "볼펜";
        }

        System.out.println("당신의 score는 " + score + "점이고, 상품은 " + msg + "입니다.");
    }
}
