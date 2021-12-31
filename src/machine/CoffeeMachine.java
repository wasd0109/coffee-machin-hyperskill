package machine;

public class CoffeeMachine {
    int waterLevel = 400;
    int milkLevel = 540;
    int beansLevel = 120;
    int cupsCount = 9;
    int money = 550;
    State machineState = State.WAITING_FOR_CHOICE;


//    public static void main(String[] args) {
////        System.out.println("Starting to make a coffee");
////        System.out.println("Grinding coffee beans");
////        System.out.println("Boiling water");
////        System.out.println("Mixing boiled water with crushed coffee beans");
////        System.out.println("Pouring coffee into the cup");
////        System.out.println("Pouring some milk into the cup");
////        System.out.println("Coffee is ready!");
//        int waterLevel = 400;
//        int milkLevel = 540;
//        int beansLevel = 120;
//        int money = 550;
//        int cupsCount = 9;
//        boolean exit = false;
//        while (!exit) {
//            System.out.println("Write action (buy, fill, take, remaining, exit): ");
//            String action = scanner.nextLine();
//            switch (action) {
//                case "buy":
//                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ");
//                    String input = scanner.nextLine();
//                    if ("back".equals(input)) {
//                        break;
//                    }
//                    int choice = Integer.valueOf(input);
//                    boolean coffeeMade = false;
//                    if (cupsCount - 1 >= 0) {
//                        switch (choice) {
//                            case 1:
//                                coffeeMade = makeCoffee(waterLevel, milkLevel, beansLevel, 250, 0, 16);
//                                if (coffeeMade) {
//                                    waterLevel -= 250;
//                                    beansLevel -= 16;
//                                    money += 4;
//                                }
//                                break;
//                            case 2:
//                                coffeeMade = makeCoffee(waterLevel, milkLevel, beansLevel, 350, 75, 20);
//                                if (coffeeMade) {
//                                    waterLevel -= 350;
//                                    milkLevel -= 75;
//                                    beansLevel -= 20;
//                                    money += 7;
//                                }
//                                break;
//                            case 3:
//                                coffeeMade = makeCoffee(waterLevel, milkLevel, beansLevel, 200, 100, 12);
//                                if (coffeeMade) {
//                                    waterLevel -= 200;
//                                    milkLevel -= 100;
//                                    beansLevel -= 12;
//                                    money += 6;
//                                }
//
//                                break;
//                        }
//                        if (coffeeMade) {
//                            cupsCount -= 1;
//                            System.out.println("I have enough resources, making you a coffee!");
//
//                        }
//                    } else {
//                        System.out.println("Sorry, not enough cup!");
//                    }
//                    break;
//                case "fill":
//                    System.out.println("Write how many ml of water you want to add: ");
//                    waterLevel += scanner.nextInt();
//                    System.out.println("Write how many ml of milk you want to add: ");
//                    milkLevel += scanner.nextInt();
//                    System.out.println("Write how many grams of coffee beans you want to add: ");
//                    beansLevel += scanner.nextInt();
//                    System.out.println("Write how many disposable cups of coffee you want to add: ");
//                    cupsCount += scanner.nextInt();
//                    break;
//                case "take":
//                    System.out.println("I gave you $" + money);
//                    money = 0;
//                    break;
//                case "remaining":
//                    printMachineStats(waterLevel, milkLevel, beansLevel, cupsCount, money);
//                    break;
//                case "exit":
//                    exit = true;
//                    break;
//                default:
//                    break;
//            }
//        }

//        System.out.println("Write how many cups of coffee you will need: ");
//            int cupOfCoffee = scanner.nextInt();
//            int maxCup = calculateMaxCupOfCoffee(waterLevel, milkLevel, beansLevel);
//            if (maxCup >= cupOfCoffee) {
//                System.out.println("Yes, I can make that amount of coffee ");
//                if (maxCup > cupOfCoffee) {
//                    System.out.printf("(and even %d more than that)%n", maxCup - cupOfCoffee);
//                }
//            } else {
//                System.out.printf("No, I can make only %d cup(s) of coffee%n", maxCup);
//            }
//        System.out.printf("For %d cups of coffee you will need:%n", cupOfCoffee);
//        System.out.println(200 * cupOfCoffee + " ml of water");
//        System.out.println(50 * cupOfCoffee + " ml of milk");
//        System.out.println(15 * cupOfCoffee + " g of coffee beans");
//    }
//
//    public static void fillMachine(int currentWaterLevel, int currentMilkLevel, int currentBeanLevel) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Write how many ml of water the coffee machine has: ");
//        int waterVolume = scanner.nextInt();
//        System.out.println("Write how many ml of milk the coffee machine has: ");
//        int milkVolume = scanner.nextInt();
//        System.out.println("Write how many grams of coffee beans the coffee machine has: ");
//        int beansAmount = scanner.nextInt();
//
//    }

//    public static int calculateMaxCupOfCoffee(int waterVolume, int milkVolume, int beansAmount) {
//        int maxCup = Integer.MAX_VALUE;
//        int maxCupForWater = waterVolume / 200;
//        if (maxCupForWater < maxCup) {
//            maxCup = maxCupForWater;
//        }
//        int maxCupForMilk = milkVolume / 50;
//        if (maxCupForMilk < maxCup) {
//            maxCup = maxCupForMilk;
//        }
//        int maxCupForBean = beansAmount / 15;
//        if (maxCupForBean < maxCup) {
//            maxCup = maxCupForBean;
//        }
//        return maxCup;
//    }

    public boolean makeCoffee(Coffee coffeeType) {
        int requiredWater;
        int requiredMilk;
        int requiredBeans;
        int price;
        switch (coffeeType) {
            case ESPRESSO:
                requiredWater = 250;
                requiredMilk = 0;
                requiredBeans = 16;
                price = 4;
                break;
            case LATTE:
                requiredWater = 350;
                requiredMilk = 75;
                requiredBeans = 20;
                price = 7;
                break;
            case CAPPUCCINO:
                requiredWater = 200;
                requiredMilk = 100;
                requiredBeans = 12;
                price = 6;
                break;
            default:
                requiredWater = 0;
                requiredMilk = 0;
                requiredBeans = 0;
                price = 0;
                break;
        }
        boolean haveEnoughWater = waterLevel - requiredWater >= 0;
        boolean haveEnoughMilk = milkLevel - requiredMilk >= 0;
        boolean haveEnoughBeans = beansLevel - requiredBeans >= 0;
        if (!haveEnoughBeans) {
            System.out.println("Sorry, not enough beans!");
            return false;
        } else if (!haveEnoughMilk) {
            System.out.println("Sorry, not enough milk!");
            return false;
        } else if (!haveEnoughWater) {
            System.out.println("Sorry, not enough water!");
            return false;
        }
        this.waterLevel -= requiredWater;
        this.milkLevel -= requiredMilk;
        this.beansLevel -= requiredBeans;
        this.cupsCount -= 1;
        this.money += price;
        return true;
    }

    public void printMachineStats() {
        System.out.println("The coffee machine has:");
        System.out.println(this.waterLevel + " ml of water");
        System.out.println(this.milkLevel + " ml of milk");
        System.out.println(this.beansLevel + " g of coffee beans");
        System.out.println(this.cupsCount + " disposable cups");
        System.out.println("$" + this.money + " of money");
    }

    public void processInput(String input) {
        switch (machineState) {
            case WAITING_FOR_CHOICE:
                switch (input) {
                    case "buy":
                        this.machineState = State.BUYING;
                        break;
                    case "fill":
                        this.machineState = State.FILLING_WATER;
                        break;
                    case "take":
                        System.out.println("I gave you $" + money);
                        this.money = 0;
                        break;
                    case "remaining":
                        printMachineStats();
                        break;
                    case "exit":
                        this.machineState = State.EXIT;
                        break;
                }
                break;
            case BUYING:
                if ("back".equals(input)) {
                    machineState = State.WAITING_FOR_CHOICE;
                    break;
                }
                if (cupsCount > 0) {
                    Coffee coffeeType = Coffee.findByInputString(input);
                    boolean isSuccessful = makeCoffee(coffeeType);
                    if (isSuccessful) {
                        System.out.println("I have enough resources, making you a coffee!");
                    }
                } else {
                    System.out.println("Sorry, not enough cup!");
                }
                machineState = State.WAITING_FOR_CHOICE;

                break;
            case FILLING_WATER:
                int addWaterLevel = Integer.parseInt(input);
                this.waterLevel += addWaterLevel;
                this.machineState = State.FILLING_MILK;

                break;
            case FILLING_MILK:
                int addMilkLevel = Integer.parseInt(input);
                this.milkLevel += addMilkLevel;
                this.machineState = State.FILLING_BEANS;

                break;
            case FILLING_BEANS:
                int addBeanLevel = Integer.parseInt(input);
                this.beansLevel += addBeanLevel;
                this.machineState = State.FILLING_CUPS;

                break;
            case FILLING_CUPS:
                int addCupCount = Integer.parseInt(input);
                this.cupsCount += addCupCount;
                this.machineState = State.WAITING_FOR_CHOICE;
                break;

        }
        printInstruction();
    }

    private Coffee inputToEnum(String input) {
        int enumIndex = Integer.parseInt(input) - 1;
        for (Coffee value : Coffee.values()) {
            if (enumIndex == value.ordinal()) {
                return value;
            }
        }
        return null;
    }

    private void printInstruction() {
        switch (machineState) {
            case WAITING_FOR_CHOICE:
                System.out.println("Write action (buy, fill, take, remaining, exit): ");
                break;
            case FILLING_WATER:
                System.out.println("Write how many ml of water you want to add: ");
                break;
            case FILLING_MILK:
                System.out.println("Write how many ml of milk you want to add: ");
                break;
            case FILLING_BEANS:
                System.out.println("Write how many grams of coffee beans you want to add: ");
                break;
            case FILLING_CUPS:
                System.out.println("Write how many disposable cups of coffee you want to add: ");
                break;
            case BUYING:
                System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ");
                break;

        }
    }
}
