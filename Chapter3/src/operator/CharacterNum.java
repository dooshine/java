package operator;

public class CharacterNum {
    public static void main(String[] args) {
        // a~z, A~Z, 0~9 출력

        char lowerCase = 'a';
        char upperCase = 'A';
        int charNum = 'z'-'a';
        
        for(int i = 0; i <= charNum; i++){
            System.out.print(lowerCase++);
        }
        System.out.println();
        
        for(int i = 0; i <= charNum; i++){
            System.out.print(upperCase++);
        }
        System.out.println();
        
        for(int i = 0; i < 10; i++){
            System.out.print(i);
        }
    }
    
}
