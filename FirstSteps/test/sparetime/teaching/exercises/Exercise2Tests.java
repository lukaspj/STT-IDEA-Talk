package sparetime.teaching.exercises;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Lukas on 01-11-2015.
 */
public class Exercise2Tests {
    private Exercise2 _exercise2_true;
    private Exercise2 _exercise2_false;

    @Before
    public void setUp() {
        _exercise2_true = new Exercise2(true);
        _exercise2_false = new Exercise2(false);
    }

    @Test
    public void shouldHaveTestVal1To5_WhenTrue() {
        assertThat(_exercise2_true.getTestVal1(), is(5));
    }

    @Test
    public void shouldHaveTestVal1To3_WhenFalse() {
        assertThat(_exercise2_false.getTestVal1(), is(3));
    }

    @Test
    public void shouldHaveTestVal2To4_WhenTrue() {
        assertThat(_exercise2_false.getTestVal2(), is(4));
    }

    @Test
    public void shouldHaveTestVal2To6_WhenFalse() {
        assertThat(_exercise2_false.getTestVal2(), is(6));
    }
}
