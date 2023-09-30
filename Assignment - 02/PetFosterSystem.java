
/*

This represents a simple Pet Foster Home System that helps manage pets available for adoption and rescued pets.
Users can add pets for adoption, rescue pets, mark rescued pets for adoption, and adopt pets.

*/

import java.util.Scanner;

public class PetFosterSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FosterHome home = new FosterHome("Foster Care BD");

        System.out.println("\n*********** Welcome to " + home.getName() + " ***********");

        while (true) {
            System.out.println("\n----------------------- Options -----------------------");
            System.out.println("1. Add a pet");
            System.out.println("2. Rescue a pet");
            System.out.println("3. Add a rescued pet for Adoption");
            System.out.println("4. Adopt a pet");
            System.out.println("5. Exit");
            System.out.print("==> Select an option: ");

            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {

                case 1:
                    // Taking Pet Info
                    System.out.print("==> Enter Pet ID: ");
                    int petId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("==> Enter Pet Species: ");
                    String species = scanner.nextLine();
                    System.out.print("==> Enter Pet Name: ");
                    String name = scanner.nextLine();
                    System.out.print("==> Enter Pet Age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine();

                    // Add Pet for adoption
                    Pet newPet = new Pet(petId, species, name, age);
                    home.addPetForAdoption(newPet);

                    break;

                case 2:
                    // Taking Pet Info
                    System.out.print("==> Enter Pet ID: ");
                    int rescuePetId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("==> Enter Pet Species: ");
                    String rescueSpecies = scanner.nextLine();
                    System.out.print("==> Enter Pet Name: ");
                    String rescueName = scanner.nextLine();
                    System.out.print("==> Enter Pet Age: ");
                    int rescueAge = scanner.nextInt();
                    scanner.nextLine();

                    // Add a rescue pet
                    Pet rescuedPet = new Pet(rescuePetId, rescueSpecies, rescueName, rescueAge);
                    home.rescuePet(rescuedPet);

                    break;

                case 3:
                    // Showing the rescued pet lists
                    home.listRescuedPets();

                    // Selecting a rescued pet for adaption
                    System.out.print("==> Enter Pet ID to add for adoption: ");
                    int addForAdoptionId = scanner.nextInt();
                    scanner.nextLine();
                    home.addRescuedPetForAdoption(addForAdoptionId);

                    break;

                case 4:
                    // Showing all the pets available for Adaption
                    home.listAdoptionPets();

                    // Adopting a pet
                    System.out.print("==> Enter Pet ID to adopt: ");
                    int adoptPetId = scanner.nextInt();
                    scanner.nextLine();
                    home.adoptPet(adoptPetId);

                    break;

                case 5:
                    // Exiting from the system
                    System.out.println("\n*************  Thank you for using " + home.getName() + "  *************\n");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid option. Please select a valid option.");
            }
        }
    }
}