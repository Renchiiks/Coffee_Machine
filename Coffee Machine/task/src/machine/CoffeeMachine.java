package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CoffeeMachine.makeCoffee(scanner);
    }

    public static int money = 550;
    public static int water = 400;
    public static int milk = 540;
    public static int beans = 120;
    public static int cups = 9;
    public static boolean flag = true;

    public static void makeCoffee(Scanner scanner) {

        while(flag){
            System.out.println("Write action (buy, fill, take, remaining, exit): ");
            String action = scanner.nextLine();

            switch (action) {
                case "buy":
                    printCoffeeOptions();
                    String option = scanner.nextLine();
                    buy(option);
                    break;
                case "fill":
                    fill();
                    break;
                case "take":
                    take();
                    break;
                case "remaining":
                    printIngredients(money, water, milk, beans, cups);
                    break;
                case "exit":
                    flag = false;
                    break;
            }
        }
    }


//        System.out.println("Starting to make a coffee\n" +
//                "Grinding coffee beans\n" +
//                "Boiling water\n" +
//                "Mixing boiled water with crushed coffee beans\n" +
//                "Pouring coffee into the cup\n" +
//                "Pouring some milk into the cup\n" +
//                "Coffee is ready!");

//        System.out.println("Write how many cups of coffee you will need:");
//        int coffees = scanner.nextInt();
//
//        int count = 0;
//
//        while (waterInCoffeeMachine >= WATER && milkInCoffeeMachine >= MILK && beansInCoffeeMachine >= BEANS) {
//            waterInCoffeeMachine -= WATER;
//            milkInCoffeeMachine -= MILK;
//            beansInCoffeeMachine -= BEANS;
//            count++;
//
//        }
//        if (count == coffees) {
//            System.out.println("Yes, I can make that amount of coffee");
//        } else if (count > coffees) {
//            System.out.println("Yes, I can make that amount of coffee (and even " + (count - coffees) + " more than that");
//        } else {
//            System.out.println("No, I can make only " + count + " cup(s) of coffee");
//        }

//        System.out.println(WATER * coffees + " ml of water\n"
//                + MILK * coffees + " ml of milk\n" +
//                BEANS * coffees + "g of coffee beans");


    private static void take() {
        System.out.println("I gave you $" + money);
        money = 0;
    }

    private static void fill() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write how many ml of water do you want to add: ");
        water += scanner.nextInt();
        System.out.println("Write how many ml of milk do you want to add: ");
        milk += scanner.nextInt();
        System.out.println("Write how many grams of coffee do you want to add: ");
        beans += scanner.nextInt();
        System.out.println("Write how many disposable cups of coffee do you want to add:  ");
        cups += scanner.nextInt();
    }

    private static void printIngredients(int money, int water, int milk, int beans, int cups) {
        System.out.println("The coffee machine has:\n" +
                water + " of water\n" +
                milk + " of milk\n" +
                beans + " of coffee beans\n" +
                cups + " of disposable cups\n" +
                money + " of money");
    }

    private static void buy(String option) {

        switch (option) {
            case "1":
                System.out.println(makeEspresso());
                break;
            case "2":
                System.out.println(makeLatte());
                break;
            case "3":
                System.out.println(makeCappuccino());
                break;
            case "exit":
                break;
        }
    }

    private static String makeCappuccino() {
        if (water < 200) {
            return "Sorry, not enough water!";
        } else if (milk < 100) {
            return "Sorry, not enough milk!";
        } else if (beans < 12) {
            return "Sorry, not enough beans!";
        } else if (cups < 0) {
            return "Sorry, not enough cups!";
        }

        water -= 200;
        milk -= 100;
        beans -= 12;
        money += 6;
        cups--;
        return "I have enough resources, making you a coffee!";
    }

    private static String makeLatte() {
        if (water < 350) {
            return "Sorry, not enough water!";
        } else if (milk < 75) {
            return "Sorry, not enough milk!";
        } else if (beans < 20) {
            return "Sorry, not enough beans!";
        } else if (cups < 0) {
            return "Sorry, not enough cups!";
        }

        water -= 350;
        milk -= 75;
        beans -= 20;
        cups--;
        money += 7;
        return "I have enough resources, making you a coffee!";
    }

    private static String makeEspresso() {
        if (water < 250) {
            return "Sorry, not enough water!";
        } else if (beans < 16) {
            return "Sorry, not enough beans!";
        } else if (cups < 0) {
            return "Sorry, not enough cups!";
        }

        water -= 250;
        beans -= 16;
        cups--;
        money += 4;
        return "I have enough resources, making you a coffee!";
    }

    private static void printCoffeeOptions() {
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, 4 - back:");
    }


}
