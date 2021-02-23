public class Main {
    public static void main(String[] args) {
        int[] array = new int[20];
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 6 + 1);
            if (array[i] == 1) {
                count = count + 1;
            }

            //i < array.length; i++ is a boolean
            // i++ takes the variable and adds it by 1

            System.out.println(count);
        }
        System.out.println("************");


        int[] array2 = new int[10];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = (int) (Math.random() * 100 + 1);
            int average = 0;
            int total = 0;
            for (int num : array2) {
                total = total + num;
            }
            System.out.println(total);
            
        }
        System.out.println("**************");
    }
}











