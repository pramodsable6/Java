package src;

class Array {
    public static void main(String[] args) {
        int[] arr = new int[5];

        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        for (int i = 0; i < arr.length; i++)
            System.out.println("Element at index " + i + " : " + arr[i]);

        System.out.println("Length of array is : " + arr.length);

        // Hence there will be 5 elements starting from index 0 to index 4
        // i.e. arr.length = 5
    }
}
