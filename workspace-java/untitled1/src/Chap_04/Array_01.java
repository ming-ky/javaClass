package Chap_04;

public class Array_01 {
    public static void main(String[] args) {

        int[] sizeArray = new int[10];
        for (int i = 0; i < sizeArray.length; i++){
            sizeArray[i] = 250 + (5 * i);
        }

        for (int size : sizeArray) {
        System.out.println("사이즈 " +  size + " (재고있음)"); }
    }
}
