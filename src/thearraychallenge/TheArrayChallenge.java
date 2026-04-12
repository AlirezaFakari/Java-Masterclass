package thearraychallenge;

import java.util.Arrays;
import java.util.Random;

public class TheArrayChallenge {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortArray(getRandomArray(5))));

    }
        private static int[] getRandomArray(int len){

            Random random = new Random();
            int[] arr = new int[len];
            for(int i=0;i<arr.length;i++){
                arr[i]=random.nextInt(100);
            }
            return arr;
        }

        private static int[] sortArray(int[] array){

            System.out.println(Arrays.toString(array));
            boolean flag = true;
            int temp;
            while (flag){
                flag=false;
                for(int i=0;i<array.length - 1; i++){
                    if(array[i]<array[i+1]){
                        temp=array[i+1];
                        array[i+1]=array[i];
                        array[i]=temp;
                        flag=true;
                    }
                }
            }
        return array;}

}
