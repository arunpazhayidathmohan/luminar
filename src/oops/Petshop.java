package oops;

import java.util.Scanner;

interface Pets {
    void cat();
    void dog();
    void fish();
}

class Shop implements Pets {
    private int persianQty = 2;
    private int bengalQty = 2;
    private int labQty = 2;
    private int pugQty = 2;
    private int fighterQty = 2;
    private int goldFishQty = 2;

    @Override
    public void cat() {
        System.out.println("Available Cat Breeds");
        System.out.println("*********************");
        System.out.println("1. Persian - Price: 12550 Quantity: " + persianQty);
        System.out.println("2. Bengal  - Price: 9500 Quantity: " + bengalQty);
    }

    @Override
    public void dog() {
        System.out.println("Available Dog Breeds");
        System.out.println("*********************");
        System.out.println("1. Lab - Price: 12550 Quantity: " + labQty);
        System.out.println("2. Pug - Price: 9500 Quantity: " + pugQty);
    }

    @Override
    public void fish() {
        System.out.println("Available Fish Breeds");
        System.out.println("**********************");
        System.out.println("1. Fighter  - Price: 550  Quantity: " + fighterQty);
        System.out.println("2. Gold Fish- Price: 950  Quantity: " + goldFishQty);
    }

    public void startShopping() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to PetShop");
        System.out.println("--------------------");
        System.out.println("Choose an animal:");
        System.out.println("1. Cat");
        System.out.println("2. Dog");
        System.out.println("3. Fish");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                cat();
                sellPet("cat");
                break;
            case 2:
                dog();
                sellPet("dog");
                break;
            case 3:
                fish();
                sellPet("fish");
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }

    private void sellPet(String petType) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the breed number to sell:");
        int breedNumber = sc.nextInt();
        System.out.println("Enter quantity to sell:");
        int quantity = sc.nextInt();
        switch (petType) {
            case "cat":
                if (breedNumber == 1 && quantity <= persianQty) {
                    persianQty -= quantity;
                    System.out.println("Sold " + quantity + " Persian cats.");
                } else if (breedNumber == 2 && quantity <= bengalQty) {
                    bengalQty -= quantity;
                    System.out.println("Sold " + quantity + " Bengal cats.");
                } else {
                    System.out.println("Invalid selection or insufficient quantity!");
                }
                break;
            case "dog":
                if (breedNumber == 1 && quantity <= labQty) {
                    labQty -= quantity;
                    System.out.println("Sold " + quantity + " Lab dogs.");
                } else if (breedNumber == 2 && quantity <= pugQty) {
                    pugQty -= quantity;
                    System.out.println("Sold " + quantity + " Pug dogs.");
                } else {
                    System.out.println("Invalid selection or insufficient quantity!");
                }
                break;
            case "fish":
                if (breedNumber == 1 && quantity <= fighterQty) {
                    fighterQty -= quantity;
                    System.out.println("Sold " + quantity + " Fighter fish.");
                } else if (breedNumber == 2 && quantity <= goldFishQty) {
                    goldFishQty -= quantity;
                    System.out.println("Sold " + quantity + " Gold Fish.");
                } else {
                    System.out.println("Invalid selection or insufficient quantity!");
                }
                break;
            default:
                System.out.println("Invalid pet type!");
        }
    }
}

public class Petshop {
    public static void main(String[] args) {
        Shop s = new Shop();
        s.startShopping();
    }
}

