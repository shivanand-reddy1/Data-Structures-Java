import java.util.Scanner;

public class gate {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter n : ");
    int n = sc.nextInt();

    int ans = fun(n);

    System.out.println("the returned value is " + ans);

  }

  private static int fun(int n) {
    if(n == 1) return 1;
    return 1 + fun(func(n));

  }

  private static int func(int n) {
    if(n <= 1) return 0;
    return 1 + func(n/2);
  }
  
}
