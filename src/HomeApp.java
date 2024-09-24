import facades.HomeFacade;

import java.util.Scanner;

public class HomeApp {
    public static void main(String[] args) {
        HomeFacade homeFacade = new HomeFacade();

        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("\n1. Turn on all");
            System.out.println("2. Turn off all");
            System.out.println("3. Exit\n");

            System.out.print("Enter your choice: ");

            int input = scanner.nextInt();
            switch (input) {
                case 1:
                    homeFacade.turnOnAll();
                    break;
                case 2:
                    homeFacade.turnOffAll();
                    break;
                case 3:
                    System.out.println("Exit - John Victor Gonzales");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        } while (true);
    }
}