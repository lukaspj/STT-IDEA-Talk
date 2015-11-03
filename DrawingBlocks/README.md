Tasks for the DrawingBlocks module
==================================

Now that you've learned a bunch of IntelliJ keybindings, the best way to memorize them, 
is to get some dirt under your nails.

Therefore you should try to solve the following exercises, using the keybindings you've 
learnt. Don't be afraid to go back and look at the "FirstSteps" exercises to remember 
how different keybindings work.

**Remember**: You should complete the exercises completely cursor-free! Do not use the 
cursor at all, there's always a way to complete a task without the cursor.


## Filled figures
Try refactoring the code, such that the figures are filled with color, instead of just 
being outlines of figures.

There are corresponding "filled" drawCalls for most of the "stroke" drawCalls. E.g.
```java
context.strokeOval(_position.getX(), _position.getY(), _radius, _radius);
// Has the corresponding
context.fillOval(_position.getX(), _position.getY(), _radius, _radius);
```

## Varying colors
You should try and vary up the colors a bit, instead of just drawing everything in black.
In FigureDisplay you can see an example of how the colors are specified:
```java
drawContext.setLineWidth(5);
drawContext.setFill(Color.BLACK);
drawContext.setStroke(Color.BLACK);
```
After setting the fill or stroke to a color, all subsequent "fill" and "stroke" calls 
will be colored in the specified color.

## House blocks
Try creating a composite block class, for example one that consists of a rectangle, and
a triangle, forming a house. You might want to make it a bit more complicated.

**REMEMBER TO USE THE SHORTCUTS! AND DON'T TOUCH THE CURSOR!**
