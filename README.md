# paintApp
A fully functioning paint application coded from scratch in Java. It has the draw, color, shape choice, shading type, select and move options. Design Patterns of OOP were used to build the project.

# Versions and Installations 
The version of java used is 
java version "1.8.0_181"

# Comments on Design

""Paint Canvas and ShapeList:""

- A Singleton pattern is used for the Paint Canvas and also the Shape List
- This is done because having a single instance for the canvas helps in maintaining exclusivity
- Various classes are implemented onto the paint canvas and changes are made

""For Drawing Shapes""
- A stategy pattern in used to draw the shape onto the canvas. 
- The CreateShapeCommand specifies the shape to be created and the DrawShape puts the patterns onto the canvas. 
- They both in collaboration make for a cleaner execution of shapes.
- If it weren’t for the strategy pattern, there would be numerous if
else statements and the whole flow process gets complicated and too many
dependencies would’ve been created.

""For selecting shapes"" 
- A factory pattern is used to implement the select shape aspect of the project. 
- It reduces the switch statements and makes room for more shapes if we decide to add more later

""Choosing between Draw, Select and Move""
- Command pattern is used to create the three different modes
- CreateShapeCommand, MoveShapeCommand and SelectShapeCommand work in collaboration with the GUI created. 
- They take their parameters ( the start and end point) from the users and implement the changes onto the paint canvas. 

They paint canvas at a point assumes a stack like data structure to allow for copying and pasting shapes one over another. 
