class Pet {
    private int id;
    private String name;
    private String species;
    private int age;
    private boolean availableForAdoption;

    public Pet(int id, String species, String name, int age) {
        this.id = id;
        this.species = species;
        this.name = name;
        this.age = age;
        this.availableForAdoption = false;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public int getAge() {
        return age;
    }

    public boolean isAvailableForAdoption() {
        return availableForAdoption;
    }

    public void setAvailableForAdoption(boolean availableForAdoption) {
        this.availableForAdoption = availableForAdoption;
    }

    public String toString() {
        return "Pet ID: " + id + ", Species: " + species + ", Name: " + name + ", Age: " + age;
    }
}