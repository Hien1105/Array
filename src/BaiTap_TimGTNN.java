import java.util.Scanner;

public class BaiTap_TimGTNN {
    public static void main(String[] args) {
        int [] array;
        int size;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao so phan tu cua mang: ");
        size = scanner.nextInt();
        array = new int[size];
        System.out.println("Nhap vao gia tri cac phan tu cua mang: ");
        for (int i=0; i<array.length; i++){
            array[i] = scanner.nextInt();
        }
        int min = array[0];
        for (int i=1; i<array.length; i++){
            if(array[i] < min) min = array[i];
        }
        System.out.print("Gia tri nho nhat trong mang la: "+min);
    }
}
