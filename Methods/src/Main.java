public class Main {
    public static int addon(int[] array, int number) {
        int[] newArray = new int[array.length + 1];

        return number;
    }
    public static void squareRoot(double number) {
    }

    public static void main(String[] args) {
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
            System.out.println(array[i]);
            int[] newArray = addon(array[i], 5);
            System.out.println(newArray);
        }


    }
}
