package d_assertj;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class ZooTest {

    @Test
    public void newlyCreatedZoo_shouldBeEmpty() {

        Zoo zoo = new Zoo();
        List<Animal> allAnimals = zoo.getAllAnimals();
        Assertions.assertThat(allAnimals).isEmpty();
    }

    @Test
    public void whenAddingOneAnnimal_therShouldBeOneAnimalInZoo() {

        Zoo zoo = new Zoo();
        Animal animal = new Animal("Żyrafa");
        zoo.addAnimal(animal);
        List<Animal> allAnimals = zoo.getAllAnimals();

        Assertions.assertThat(allAnimals).containsExactly(animal);
    }

    // "Stefan" -> "Zwierzątko  Stefan"

    @Test
    public void generateNameWithPrefix_thereShouldBePrefixAtTheBiginning() {

        Zoo zoo = new Zoo();

        Animal animal = new Animal("Zebra");

        String generatedName = zoo.generateNameWithPrefix(animal);
        Assertions.assertThat(generatedName).startsWith("Zwierzątko");
    }

    @Test
    public void generateNameWithPrefix_thereShouldBeNameOfTheAnimalAtTheEnd() {

        Zoo zoo = new Zoo();

        Animal animal = new Animal("Zebra");

        String generatedName = zoo.generateNameWithPrefix(animal);
        Assertions.assertThat(generatedName).endsWith(animal.getName());
    }
}
