public class Main {
    public static void main(String[] args) {
        int[] arr = new int[20];
        for (int i = 0; i < arr.length; i++) {

            arr[i] = (int) (Math.random() * 6 + 1);

                System.out.println("Value: " + arr[i] );

            }

    }
}
