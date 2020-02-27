


For this notifications system assignment I decided to use an Observer Pattern, as I felt it was the most suitable. I defined observers in the program, which register themselves to a subject. Observers get a notification when a change is made inside that subject.

 I believe that my code is quite flexible, if  a user needs to send a message to the driver, all he needs to do is create an object inside the Main class, attach the driver to the drivers list, and the message would be broadcasted to all the drivers in that list. If user wants to remove the driver from the list, he can do so by detaching the driver.

 The simplicity of the code is questionable, it might be hard to understand at first, but hopefully the UML diagram would help.

  At first, I thought the Factory Method Pattern might be suitable for this assignment, but after trying to implement it, I decided to opt for the Observer Pattern

GitHub repository link:
https://github.com/metcs/met-cs665-assignment-2-Benzoleum
