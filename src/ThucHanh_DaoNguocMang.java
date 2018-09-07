import java.util.Scanner;

public class ThucHanh_DaoNguocMang {
    public static void main(String[] args) {
        int [] array;
        int size;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("Enter a size");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("Size does not exceed 20");
        } while (size > 30);

        array = new int[size];
        int i = 0;
        while (i < array.length){
            System.out.println("Element "+(i+1)+" :");
            array[i] = scanner.nextInt();
            i++;
        }

        System.out.print("Array 1: ");
        for (int j=0; j<array.length; j++){
            System.out.print("\t"+array[j]);
        }

        System.out.print("Array 2: ");
        int temp;
        for (int j=0; j<(array.length)/2; j++){
            temp = array[j];
            array[j] = array[size-1-j];
            array[size-1-j]=temp;
        }
        for (int j=0; j<(array.length); j++){
            System.out.print("\t"+array[j]);
        }
    }
}
