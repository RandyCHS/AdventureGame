# Instructions  

Add the following to the game:

1. Create more rooms to explore
2. Add more items that the player can pick up
3. Add the "look" action that lets the player look at something
4. Use inheritance to create an `Item` class that items can inherit from. 
5. Implement a `look` method for an `Item` that returns a simple description of it.
6. Use inheritance to create a `Scenery` class that locations like the cabin or basement can inherit from. `Scenery` should have a `look` method that will describe it. 
7. Scenery can also hold items, like an inventory!
8. Use Regular Expressions to make the actions more flexible (for example, "pry floorboard" works, but "pry floorboards" doesn't!)