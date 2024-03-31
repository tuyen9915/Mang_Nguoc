import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int size;

        Scanner sc = new Scanner(System.in);

        do{
            System.out.print(" Nhập kích thước mảng = ");
            size = sc.nextInt();
            if (size > 20)
                System.out.println("Nhập mảng nhỏ hơn 20");
        } while (size > 20);

        int[] mang = new int[size];
        int j = 0;
        while (j < mang.length) {
            System.out.print("Phần thử thứ " + (j + 1) + ": ");
            mang[j] = sc.nextInt();
            j++;
        }
        System.out.print(" Mảng đã nhập là: ");
        for (int a : mang){
            System.out.print(a +", ");
        }
        //đọc ngược
        for (int i = 0 ; i < mang.length/2; i++){
            int tem = mang[i];
            mang[i] = mang[size - 1 - i];
            mang[size - 1 - i] = tem;
        }
        System.out.println();
        System.out.print(" Mảng đảo ngược là:");
        for (int b : mang){
            System.out.print(b +", ");
        }
    }
}