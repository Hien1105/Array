import java.util.Scanner;

public class BaiTap_GopMang {
    public static void main(String[] args) {
        int[] array1;
        int[] array2;
        int[] array3;
        int size1, size2, size3;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap kich thuoc mang 1: ");
        size1 = scanner.nextInt();
        array1 = new int[size1];
        System.out.println("Array1: ");
        for (int i = 0; i < array1.length; i++) {
            array1[i] = scanner.nextInt();
        }

        System.out.print("Nhap kich thuoc mang 2: ");
        size2 = scanner.nextInt();
        array2 = new int[size2];
        System.out.println("Array2: ");
        for (int i = 0; i < array2.length; i++) {
            array2[i] = scanner.nextInt();
        }

        size3 = size1 + size2;
        System.out.println("Kich thuoc mang 3 la: " + size3);
        array3 = new int[size3];
        System.out.println("Array 3: ");
        for (int i = 0; i < array1.length; i++) {
            array3[i] = array1[i];
        }

        for (int i = array1.length; i < array3.length; i++) {
            array3[i] = array2[i - array1.length];
        }

        for (int i = 0; i < array3.length; i++) {
            System.out.print("\t" + array3[i]);
        }
    }
}
