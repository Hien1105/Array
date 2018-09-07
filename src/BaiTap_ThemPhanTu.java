import java.util.Scanner;

public class BaiTap_ThemPhanTu {
    public static void main(String[] args) {
        int[] array1;
        int size;
        System.out.print("Nhap vao so phan tu cua mang: ");
        Scanner scanner = new Scanner(System.in);
        size = scanner.nextInt();
        array1 = new int[size];
        System.out.println("Nhap vao gia tri cac phan tu cua mang: ");
        for (int i = 0; i < array1.length; i++) {
            array1[i] = scanner.nextInt();
        }
        int index;
        do {
            System.out.println("Nhap vao vi tri can them phan tu: ");
            index = scanner.nextInt();
            if (index >= array1.length)
                System.out.println("Vuot qua kich thuoc mâng. Nhap lai!");
        } while (index >= array1.length);

        int[] array2 = new int[size + 1];
        System.out.println("Nhap vao gia tri phan tu can them: ");
        int number;
        number = scanner.nextInt();
        for (int i = 0; i < index; i++) {
            array2[i] = array1[i];
        }
        array2[index] = number;
        for (int i = index + 1; i < array2.length; i++) {
            array2[i] = array1[i - 1];
        }
        System.out.println("Mang sau khi da them phan tu la: ");
        for (int i = 0; i < array2.length; i++) {
            System.out.println("\t" + array2[i]);
        }
    }
}
