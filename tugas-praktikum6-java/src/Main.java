import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int arr[] = new int[10];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("masukan anggka : ");
            arr[i] = input.nextInt();

        }
        No1 obj1 = new No1(arr);
      
        obj1.tampil();
        input.close();

    }
}