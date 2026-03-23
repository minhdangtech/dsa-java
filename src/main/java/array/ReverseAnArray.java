package array;

public  class ReverseAnArray {



    static String printArray(int[] arr) {
        String str = "";
        for(int e : arr){
            str += (String.valueOf(e) + " ");
        }
        return str.trim();
    }

    static void twoPointer() {
        int[] arr = {8, 7 ,1, 4, 2};
        int start = 0;
        int end = arr.length - 1;

        System.out.println("Before: " + printArray(arr));

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    static void newArray() {
        int[] arr = {8, 7 ,1, 4, 2};
        int n = arr.length;
        int[] reversed = new int[n];

        for (int i = 0; i < n; i++) {
            reversed[i] = arr[n - 1 - i];
        }

        System.out.println("Normal: " + printArray(arr));
        System.out.println("After: " + printArray(reversed));

    }

    public static void main(String[] args) {
        newArray();
    }
}