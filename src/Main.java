
import static java.lang.System.out;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        boolean running = true;

        while (running) {

            out.println("1. Завдання 1");
            out.println("2. Завдання 2");
            out.println("3. Завдання 3");
            out.println("4. Завдання 4");
            out.println("0. Вихід");

            int choice = scanner.nextInt();

            if (choice == 0) {
                running = false;
            } else {
                switch (choice) {
                    case 1:
                        RandomNumbers.randomNumbersTask();
                        break;
                    case 2:
                        Products.productsTask();
                        break;
                    case 3:
                        DeviceManager.deviceManagerTask();
                        break;
                    case 4:
                        ProjectorManager.projectorManagerTask();
                        break;
                }
            }
        }
    }
}