import java.util.Arrays;
import java.util.Collections;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12};
    }
    
    public static int smallest(int[] array){
        int temp = array[0];
        for(int i=1; i<array.length;i++){
            if(array[i]<temp){
                temp = array[i];
            }
        }
        return temp;
    }
    public static int indexOfSmallest(int[] array){
    // write your code here
        int temp = array[0];
        int counter = 0;
        for(int i=1; i<array.length;i++){
            if(array[i]<temp){
                temp = array[i];
                counter = i;
            }
        }
        return counter;
    }
    public static int indexOfSmallestFrom(int[] table, int startIndex) {
    // write your code here
        int temp = table[startIndex];
        int counter = startIndex;
        for(int i=startIndex; i<table.length;i++){
            if(table[i]<temp){
                temp = table[i];
                counter = i;
            }
        }
        return counter;
    }
    public static void swap(int[] array, int index1, int index2) {
    // write your code here
        int value1 = array[index1];
        int value2 = array[index2];
        array[index1] = value2;
        array[index2] = value1;
    }
    public static void sort(int[] array) {
        int counter = 0;
        while(counter<array.length){
            if(indexOfSmallestFrom(array, counter)!=counter){
                swap(array, indexOfSmallestFrom(array, counter), counter);
            }
            counter+=1;
        }
    }

}
