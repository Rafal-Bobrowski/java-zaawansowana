package generic_types.ex5;

import java.util.ArrayList;

public class AnimalHouse<T extends Animal> {

    ArrayList<T> Animals;

    public AnimalHouse() {
        Animals = new ArrayList<>();
    }

    public AnimalHouse(ArrayList<T> animalArrayList) {
        this.Animals = animalArrayList;
    }

    public ArrayList<T> getAnimals() {
        return Animals;
    }

    public void setAnimals(ArrayList<T> animals) {
        this.Animals = animals;
    }

    public void addAnimal(T animal) {
        Animals.add(animal);
    }

    public void removeAnimal(T animal) {
        Animals.remove(animal);
    }
}
