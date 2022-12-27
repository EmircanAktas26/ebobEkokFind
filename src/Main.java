import java.util.Scanner;

/*
 *@Author Emircan Aktaş - 28.Dec.2022
 */
public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int number1, number2;
        int ebob = 1;
        int ekok = 1;
        System.out.print("Enter the number1 :");
        number1 = inp.nextInt();
        System.out.print("Enter the number2 :");
        number2 = inp.nextInt();

        if (number1 >= number2) {
            int i = 1;
            while (i <= number2) {
                i++;
                if (number1 % i == 0 && number2 % i == 0) {
                    ebob = i;
                }
            }
            System.out.print("Ebob :" + ebob);
        } else {
            for (int i = 1; i <= number1; i++) {
                if (number1 % i == 0 && number2 % i == 0) {
                    ebob = i;
                }
            }
            System.out.print("Ebob :" + ebob);
        }
        for (int i = 1; i <= (number1 * number2); i++) {
            if (i % number1 == 0 && i % number2 == 0) {
                ekok = i;
                System.out.println("\nEkok:" + ekok);
                break;
            }
        }
    }
}