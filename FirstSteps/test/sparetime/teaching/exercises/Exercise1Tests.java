package sparetime.teaching.exercises;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Lukas on 01-11-2015.
 */
public class Exercise1Tests {
    private Exercise1 _exercise1;

    @Before
    public void setUp() {
        _exercise1 = new Exercise1();
    }

    @Test
    public void shouldReturnDogOnDogAnimalGetName() {
        assertThat(_exercise1.getDogAnimal().getAnimalName(), is("Dog"));
    }

    @Test
    public void shouldReturnHorseOnHorseAnimalGetName() {
        assertThat(_exercise1.getHorseAnimal().getAnimalName(), is("Horse"));
    }

    @Test
    public void shouldReturnDogStuffOnDogAnimalGetName() {
        _exercise1.doStuffToAnimals();
        assertThat(_exercise1.getDogAnimal().getAnimalName(), is("DogStuff"));
    }

    @Test
    public void shouldReturnHorseStuffOnHorseAnimalGetName() {
        _exercise1.doStuffToAnimals();
        assertThat(_exercise1.getHorseAnimal().getAnimalName(), is("HorseStuff"));
    }
}
