package machine;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CoffeeMachine machine = new CoffeeMachine();
        System.out.println("Write action (buy, fill, take, remaining, exit): ");
        while (machine.machineState != State.EXIT) {
            String input = scanner.nextLine();
            machine.processInput(input);
        }
    }
}
