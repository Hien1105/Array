import java.util.Scanner;

public class ThucHanh_DemSoLuong {
    public static void main(String[] args) {
        int size;
        int [] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter a size:");
            size = scanner.nextInt();
            if (size > 30)
                System.out.println("Size should not exceed 30");
        } while (size > 30);

        array = new int[size];
        int i = 0;
        while (i < array.length){
            System.out.print("Enter a mark for student "+(i+1)+ " :");
            array[i] = scanner.nextInt();
            i++;
        }

        int count =0;
        System.out.println("List of mark: ");
        for (int j=0; j<array.length; j++){
            System.out.println(+array[j]);
            if (array[j] >= 5) count++;
        }
        System.out.print("So luong sinh vien thi do la: "+count);
    }
}
