package sparetime.teaching.exercises;

///////////////////////////////////////////////////
// The Alt+Enter command.
// The Alt+Enter command, is a context-aware command
//  that lets you access a range of options, based
//  on the code that your cursor is placed at.
///////////////////////////////////////////////////

import sparetime.teaching.library.IAnimal;
import sparetime.teaching.library.VoidAnimal;
// This import is grayed out and has a squiggly line, this
//  is because it is unused.
// Try placing the cursor on this import and press Alt+Enter
// The "Optimize Imports" option will remove any unused imports.
import org.w3c.dom.*;

/**
 * Created by Lukas on 01-11-2015.
 */
public class Exercise1 {
    private IAnimal _dogAnimal;
    private IAnimal _horseAnimal;
    // Similar to the import, this variable is unused. You should remove it with the Alt+Enter command.
    public int _unusedInt;

    public Exercise1() {
        // Use the context-aware command "Alt+Enter" here to quickly create new classes that implements
        //  the IAnimal interface.
        // Simply write the name of the class instead of VoidAnimal. When you see the name turn red (indicating
        //  an error), press "Alt+Enter" to get a set of options for that error.
        setDogAnimal(new VoidAnimal());
        setHorseAnimal(new VoidAnimal());
        doStuffToAnimals();
    }

    public void doStuffToAnimals() {
        // Implement a new method on the IAnimal interface using the context-aware command "Alt+Enter".
        // The new method should append the string "Stuff" to the AnimalName (e.g. "Dog" becomes "DogStuff").
    }

    public IAnimal getDogAnimal() {
        return _dogAnimal;
    }

    public void setDogAnimal(IAnimal dogAnimal) {
        _dogAnimal = dogAnimal;
    }

    public IAnimal getHorseAnimal() {
        return _horseAnimal;
    }

    public void setHorseAnimal(IAnimal horseAnimal) {
        _horseAnimal = horseAnimal;
    }
}
