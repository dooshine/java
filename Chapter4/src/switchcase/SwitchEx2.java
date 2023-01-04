package switchcase;

public class SwitchEx2 {
    public static void main(String[] args) {
        
        int score = (int)(Math.random() * 10) + 1;

        switch(score * 100) {
            case 100:
                System.out.println("당신의 점수는 100점이고, 상품은 자전거입니다.");
                break;
            case 200:
                System.out.println("당신의 점수는 200점이고, 상품은 TV입니다.");
                break;
            case 300:
                System.out.println("당신의 점수는 300점이고, 상품은 노트북입니다.");
                break;
                case 400:
                System.out.println("당신의 점수는 400점이고, 상품은 자동차입니다.");
                break;
            default:
                System.out.println("죄송하지만 당신의 점수에 해당상품이 없습니다.");
        }
    }
}
