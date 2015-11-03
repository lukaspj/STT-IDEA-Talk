package sparetime.teaching.exercises;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Lukas on 01-11-2015.
 */
public class Exercise3Tests {
    private Exercise3 _exercise3;

    @Before
    public void setUp() {
        _exercise3 = new Exercise3();
    }

    @Test
    public void shouldReturnFishFooOnTestVal1() {
        assertThat(_exercise3.getTestVal1(), is("FishFoo"));
    }

    @Test
    public void shouldReturnSenpaiOnTestVal2() {
        assertThat(_exercise3.getTestVal2(), is("Senpai"));
    }

    @Test
    public void shouldReturnAlphabetOnTestVal3() {
        assertThat(_exercise3.getTestVal3(), is("Alphabet"));
    }

    @Test
    public void shouldReturnCorrectStringOnTestVal4() {
        assertThat(_exercise3.getTestVal4(), is("Break free!"));
    }
}
