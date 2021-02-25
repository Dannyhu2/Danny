public class Main {
    //Addon method
    public static int addon(int[] array, int number) {
        int[] newArray = new int[array.length + (1 * number)];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = i + 1;
            System.out.println(newArray[i]);
        }

System.out.print("You added "); return number; }
    //remove method
public static int remove(int[] array, int number) {
        int[] newArray = new int [array.length - 1 * number];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = i+1;
            System.out.println(newArray[i]);
        }
        System.out.print("You removed "); return number;
    }
    //insert method
    public static int insert(int[] array, int index, int value) {
        int[] newArray = new int[array.length * 1];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = i + 1;
            newArray[index] = value;
            System.out.println(newArray[i]);
        }
        System.out.print("You inserted "); return value;

    }
    public static void main(String[] args) {
        System.out.println("**************** Original array *****************");
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
            System.out.println(array[i]);

        }
        System.out.println("**************** Addon array *****************");
        System.out.println(addon(array, 2));
        System.out.println("**************** Remove array *****************");
        System.out.println(remove(array, 2));
        System.out.println("**************** insert array *****************");
        System.out.println(insert(array, 2, 5));

    }
    }

