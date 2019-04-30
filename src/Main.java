import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String [] args){

        System.out.println("How many numbers ?");
        int count = scanner.nextInt();
        scanner.nextLine();

        int [] array = readIntegers(count);
        displayArray(array);
        System.out.println("Minimum value is "  + minArray(array));
        reverseArray(array);
        displayArray(array);


    }


    public static int[] readIntegers(int num){
        int [] array = new int [num];
        System.out.println("Please enter " + num + " integers");
        for (int i = 0 ; i< array.length; i++){

            System.out.print(i+1 + "number :  ");
            array[i] = scanner.nextInt();
            scanner.nextLine();

        }

        return array;

    }


    public static int minArray(int [] array){
        int min = Integer.MAX_VALUE;

        for (int i =0; i<array.length; i++){
            if (array[i]< min){
                min = array[i];
            }
        }

        return min;
    }


    public static void displayArray(int [] array) {

        System.out.println(Arrays.toString(array));

    }
    public static void reverseArray(int [] array){
       System.out.println("-------Reverse the array------");
//        int [] temp  = new int[array.length];
//        for (int i=0; i < array.length; i++){
//            temp[array.length-i-1] = array[i];
//        }
////        array = temp; // why doesn't work????
////        displayArray(array);
//        for (int i=0; i<array.length; i++){
//            array[i] = temp[i];
//        }

        // better solution
        int temp;
        for (int i=0; i<array.length/2; i++){
          temp = array[i];
            array[i]  = array[array.length-1-i];  // swap
            array[array.length-1-i] = temp;
        }



    }


    } // end of main



