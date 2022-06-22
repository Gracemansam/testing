import java.util.Scanner;

public class SortingArray {
    public static Scanner input =new Scanner(System.in);
    public static void main(String[] args) {

        int[] arrayNum = getArray(5);
        int [] result = sortArray(arrayNum);
        printedArray(result);

    }

    public static int[] getArray(int num){
        System.out.println("Enter " + num + " integers number");
        int[] value = new int[num];
        for(int i =0; i< value.length; i++){
            value[i] = input.nextInt();
        }
        return value;

    }

    public static void  printedArray(int[]array){
        for(int i = 0; i< array.length; i++){
            System.out.println("Element in index " + i + " is "+ array[i]);
        }
    }

    public static int[]sortArray(int []array){
        int [] sortedArray =new int[array.length];
        for(int i = 0; i < array.length; i++){
            sortedArray[i]= array[i];
        }
        boolean check = true;
        int temp;
        for(int i = 0; i < sortedArray.length -1; i++){
            if(sortedArray[i] < sortedArray[i+1]){
                temp = sortedArray[i];
                sortedArray[i] = sortedArray[i+1];
                sortedArray[i+1] = temp;
            }
        }
        return sortedArray;

    }
}
