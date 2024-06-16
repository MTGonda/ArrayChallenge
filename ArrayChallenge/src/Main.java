import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {


        int[] randomArray = getRandomArray(5);
        int [] copyOfRandomArray = Arrays.copyOf(randomArray,randomArray.length);

        int [] sorteArray = sortIntegers(new int[]{7,30,35});
        System.out.println(Arrays.toString(sorteArray));


        Arrays.sort(copyOfRandomArray);
        System.out.println(Arrays.toString(randomArray));
        System.out.println(Arrays.toString(copyOfRandomArray));


        for (int i=copyOfRandomArray.length-1;i>=0;i--){

            int[] sortedArray = {copyOfRandomArray[i]};
            System.out.print(Arrays.toString(sortedArray));

        }
    }

    private static int[] getRandomArray (int len){
        Random random = new Random();
        int[] newInt = new int[len];
        for ( int i = 0; i<len;i++){
            newInt[i] = random.nextInt(100);
        }
        return newInt;
    }
    private static int [] sortIntegers (int[] array){
        System.out.println(Arrays.toString(array));
        int [] sortedArray = Arrays.copyOf(array,array.length);
        boolean flag = true;
        int temp;
        while (flag){
            flag = false;
            for(int i = 0 ; i <sortedArray.length-1 ; i++){
                if(sortedArray[i]<sortedArray[i+1]){
                    temp = sortedArray[i];
                    sortedArray[i]=sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                    System.out.println("------->"+Arrays.toString(sortedArray));
                }
            }
            System.out.println("--->" + Arrays.toString(sortedArray));
        }
return sortedArray;
    }
}