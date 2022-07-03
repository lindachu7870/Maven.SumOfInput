import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args){
        Main sumN = new Main();
        Scanner scan = new Scanner(System.in);
        System.out.print("Please input an integer: ");
        int num = scan.nextInt();
        System.out.println("The sum of the numbers 1 to " + num + " is: " + sumN.sumToNum(num));
    }
    public int sumToNum(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum = sum + i;
        }
        return sum;
    }
}
