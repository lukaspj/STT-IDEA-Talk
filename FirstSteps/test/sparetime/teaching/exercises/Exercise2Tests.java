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

    @Test
    public void shouldHaveTheCorrectList() {
        List<Integer> testList = new ArrayList<Integer>();
        testList.add(3);
        testList.add(1);
        testList.add(3);
        testList.add(2);
        testList.add(4);
        assertThat(_exercise2_true.getTestList(), is(testList));
    }
}
