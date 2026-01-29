import java.util.*;

public class prac{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        System.out.println();

        char ch = 'A';
        for(int i=0;i<n;i++){
            int num = 1;
            for(int j=0;j<i+1;j++){
                System.out.print(num + " ");
                num+=2;
            }
            System.out.println();
            }
        }
}
