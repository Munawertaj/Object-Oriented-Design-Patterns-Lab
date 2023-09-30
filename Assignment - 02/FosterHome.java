import java.util.ArrayList;
import java.util.List;

class FosterHome {
    private String name;
    private List<Pet> adoptionPetList;
    private List<Pet> rescuedPetList;

    public FosterHome(String name) {
        this.name = name;
        adoptionPetList = new ArrayList<>();
        rescuedPetList = new ArrayList<>();
    }

    public void addPetForAdoption(Pet pet) {
        pet.setAvailableForAdoption(true);
        adoptionPetList.add(pet);
        System.out.println("- " + pet + " has been added for adoption.");
    }

    public void rescuePet(Pet pet) {
        rescuedPetList.add(pet);
        System.out.println("- " + pet + " has been rescued.");
    }

    public void addRescuedPetForAdoption(int petId) {
        for (Pet pet : rescuedPetList) {
            if (pet.getId() == petId) {
                pet.setAvailableForAdoption(true);
                adoptionPetList.add(pet);
                rescuedPetList.remove(pet);
                System.out.println("- " + pet + " has been added for adoption.");
                return;
            }
        }
        System.out.println("- Pet with ID: " + petId + " is not found in rescued pets list!!!!");
    }

    public void adoptPet(int petId) {
        for (Pet pet : adoptionPetList) {
            if (pet.getId() == petId) {
                adoptionPetList.remove(pet);
                System.out.println("- " + pet + " has been adopted.");
                return;
            }
        }
        System.out.println("- Pet with ID: " + petId + " is not found in adoption pets list!!!!");
    }

    public void listRescuedPets() {
        System.out.println("--------------- Rescued Pets in " + name + " ---------------");
        for (Pet pet : rescuedPetList) {
            System.out.println("- " + pet);
        }
    }

    public void listAdoptionPets() {
        System.out.println("--------------- Pets Available for Adoption in " + name + " ---------------");
        for (Pet pet : adoptionPetList) {
            System.out.println("- " + pet);
        }
    }

    public String getName() {
        return name;
    }
}