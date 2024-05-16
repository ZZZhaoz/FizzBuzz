import java.util.Scanner;

public class Reduce {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        while (n > 0) {
            if (n % 2 == 0){
                n = n / 2;
                System.out.println(n);
            }
            else{
                n--;
                System.out.println(n);
            }
        }
        sc.close();
    }
}
