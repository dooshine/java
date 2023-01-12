package array;

import java.util.Random;

public class arrayEx2 {
    public static void main(String[] args) {
        int[] fourcard = new int[54];
        int fourcardLeng = fourcard.length;

        // 포카드 0~53으로 초기화
        for(int i =0; i< fourcardLeng; i++){
            fourcard[i] = i;
        }

        // 포카드 1000번 셔플(0과 randomIndex와 자리바꿈)
        int shuffleNum = 1000;
        Random r = new Random();
        for(int i =0; i<shuffleNum; i++){
            int target = r.nextInt(fourcardLeng);

            int temp = fourcard[0];
            fourcard[0] = fourcard[target];
            fourcard[target] = temp;
        }

        showArr(fourcard);
    }

    private static void showArr (int[] arr){
        int arrLeng = arr.length;
        for(int i =0; i<arrLeng; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
