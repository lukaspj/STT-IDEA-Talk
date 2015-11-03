package sparetime.teaching.exercises;

///////////////////////////////////////////////////
// General navigation commands
// These commands will really help your traverse
//  all of the projects code.
// Being able to quickly look up a definition or
//  implementation of some interface can, quite
//  possibly, be one of the most important features
//  of an IDE.
// From now on, all of your coding should be
//  ** CURSOR FREE **. The whole purpose of this
//  exercise, is to liberate you from the cursor.
//
// Double-Shift: Search Everywhere command.
//  Press the Shift key twice, and write what
//  you're searching for. This can be class names,
//  filenames, actions or anything else.
// Ctrl+B: Go to definition.
// Ctrl+U: Go to the parent or interface.
//         (Step up in the hierarchy)
// Ctrl+Alt+B: Go to implementations.
//             (Step down in the hierarchy)
///////////////////////////////////////////////////

import sparetime.teaching.library.*;

/**
 * Created by Lukas on 01-11-2015.
 */
public class Exercise3 {
    private String _testVal1;
    private String _testVal2;
    private String _testVal3;
    private String _testVal4;

    public Exercise3() {
        ILanguage language = new EnglishLanguage();
        // Use Ctrl+B to get to the definition of EnglishLanguage and read the value of the field "xyz" and assign it
        //  to _testVal1 here.
        _testVal1 = "Something";

        // Navigate to the ILanguage interface and use Ctrl+Alt+B to find all implementations of the interface.
        // Find the implementation "JapaneseLanguage" and read the value of the field "xyz" and assign it
        //  to _testVal2 here.
        _testVal2 = "Something";

        // Navigate to the class C, and navigate upwards untill you hit A without using Ctrl+B. Then read the value
        //  of the field "xyz" in the class A, and assign it to _testVal3 here.
        _testVal3 = "Something";

        // Another thing people often miss or forget, on Windows and Linux you can hold Ctrl to jump "words" when you
        //  press the right or left arrow-key. This really speeds up selecting text, try using it here to select the
        //  text "Hey you fish" in just 3 arrow-key clicks (one for each word).
        // Hey you fish
        // This behaviour is far from IntelliJ-specific. In fact, it works in most text-fields/editors.

        // A more specific IntelliJ command, is the Ctrl+W command, which lets you expand your current selection.
        // Try placing the cursor at either side of the 'f' in the string "Break free!" below, and press Ctrl+W.
        // Notice how the command first selects the word, then the contents of the string, then the whole string
        // including quotes, then the whole expression, then the statement etc.

        // Use Ctrl+W to select the contents of the if-statement and cut-and-paste it outside of the if-statement.
        if(false) {
            _testVal4 = "Break free!";
        }
    }

    public String getTestVal1() {
        return _testVal1;
    }

    public String getTestVal2() {
        return _testVal2;
    }

    public String getTestVal3() {
        return _testVal3;
    }

    public String getTestVal4() {
        return _testVal4;
    }
}
