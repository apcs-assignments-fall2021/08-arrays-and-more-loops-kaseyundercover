import java.util.Arrays;

public class MyMain {

    // Rotates all values in an array to the left
    // Ex. rotateLeft([1, 2, 3, 4, 5]) => [2, 3, 4, 5, 1]
    public static int[] rotateLeft(int[] arr) {
        int fin=arr[0];
        for (int i = 0; i < arr.length-1; i++) {
        arr[i] = arr[i+1];
    }
        arr[arr.length-1]=fin;
        return arr;
    }

    // Rotates all values in an array to the right
    // Ex. rotateRight([1, 2, 3, 4, 5]) => [5, 1, 2, 3, 4]
    public static int[] rotateRight(int[] arr) {
        int fin=arr[arr.length-1];
        for (int i = arr.length-1; i > 0; i--) {
            arr[i] = arr[i-1];
        }
        arr[0]=fin;
        return arr;
    }

    // Replaces all duplicate values with -1
    // Ex. duplicateReplacer([1, 2, 1, 2, 1, 1]) => [1, 2, -1, -1, -1, -1]
    public static int[] duplicateReplacer(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int x = i+1; x < arr.length; x++) {
                if (arr[i] == arr[x]) {
                    arr[x] = -1;
                }
            }
        }
        return arr;
    }




    public static void main(String[] args) {
        int[] arr = rotateLeft(new int[] {1,2,3,4,5});
        System.out.println(Arrays.toString(arr));
        int[] arr1 = rotateRight(new int[] {1,2,3,4,19});
        System.out.println(Arrays.toString(arr1));
        int[] arr2 = duplicateReplacer(new int[] {3,3,3,3,3});
        System.out.println(Arrays.toString(arr2));
    }
}
