package design_patterns.structural_dp.flyweight_dp;

public class AnimalClient {

    public static void main(String[] args) {
        Animal catAnimal = AnimalFactory.getCat("CAT");
        catAnimal.printAnimalAttributes();
        System.out.println(catAnimal.hashCode());

        Animal catAnimal1 = AnimalFactory.getCat("CAT");
        catAnimal.printAnimalAttributes();
        System.out.println(catAnimal1.hashCode());

        Animal dogAnimal = AnimalFactory.getDog("DOG");
        dogAnimal.printAnimalAttributes();
        System.out.println(dogAnimal.hashCode());

        Animal cowAnimal = AnimalFactory.getCow("COW");
        cowAnimal.printAnimalAttributes();
        System.out.println(cowAnimal.hashCode());
    }
}
