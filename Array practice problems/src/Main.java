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
        System.out.println("there were " + count + " ones in this array");
        System.out.println(array[2]);
        System.out.println("************");


        int[] array2 = new int[10];
        {
            int average = 0;
            int total = 0;
            for (int i = 0; i < array2.length; i++) {
                array2[i] = (int) (Math.random() * 100 + 1);
                total = total + array2[i];
                System.out.println(total);

            }

            System.out.println("total is: " + total);
            System.out.println("Average is " + (total / 10));
            System.out.println("****************");
            int temp = array2[1];
            array2[1] = array2[2];
            array2[2] = temp;
            System.out.println(temp);
            System.out.println(array2[1]);




        }

    }

}










