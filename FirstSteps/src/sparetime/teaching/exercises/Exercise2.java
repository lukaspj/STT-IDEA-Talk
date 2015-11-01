package sparetime.teaching.exercises;

///////////////////////////////////////////////////
// Simple code generation and refactoring.
// In this exercise, we look at three keybindings:
// Ctrl+Alt+T: The "Surround With" command, which
//  lets you encapsulate a code block within two
//  braces, an if-condition or something similar.
// Ctrl+Shift+Arrow: This moves a line up or down.
//  The command is context-sensitive, and knows how
//  to move it into and out of scopes as well as
//  not place it in between two lines of a multi-
//  line if-statement.
// Ctrl+D: This duplicates a line of code.
//
// Smart templates:
//  IntelliJ has some built-in templates, where if
//  you for example write "fori" and select the
//  option "fori" in the auto-completion menu, it
//  will generate an integer-based for-loop.
///////////////////////////////////////////////////

import java.util.List;

/**
 * Created by Lukas on 01-11-2015.
 */
public class Exercise2 {
    public int _testVal1;
    public int _testVal2;
    public int _testVal3;
    public List<Integer> _testList;

    public Exercise2(boolean val1) {
        if (val1) {
        } else {
        }
        // Move these statements into the if/else statement using the ctrl+shit+up command.
        // If val1 = true, then _testVal1 should be 5.
        _testVal1 = 3;
        _testVal1 = 5;

        // Use the Ctrl+Alt+T command to make sure that _testVal2 is only four if val1 is false.
        _testVal2 = 4;
        _testVal2 = 6;

        // Use Ctrl+D to duplicate this line five times, so the list ends up being {3,1,3,2,4}.
        _testList.add(3);

        _testVal3 = 0;
        // Use smart templates to create a for loop that calls "_testVal3++" 50 times (so it ends up with the value 50)
    }

    public int getTestVal1() {
        return _testVal1;
    }

    public int getTestVal2() {
        return _testVal2;
    }

    public List<Integer> getTestList() {
        return _testList;
    }
}
