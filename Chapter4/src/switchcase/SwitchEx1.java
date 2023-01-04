package switchcase;

public class SwitchEx1 {
    public static void main(String[] args) {
        String grade = "VIP";
        String test = "Gold";

        switch(grade) {
            case "VIP":
                System.out.println("VIP");
                break;
            case "Gold":
            // case test:
                System.out.println("Gold");
                break;
            case "Customer":
                System.out.println("Customer");
                break;
            case "default":
                System.out.println("default");
                break;
        }
    }
}
