###  How to create multple objects for a same class?

If we try to create multiple objects for a single class it will not create different object the secon object 
we will create will point to first object.  What if we want to create multiple different objects for a same class?
we can add an attribute named **`scope`**  within **` <bind> `** 
* Default: **`scope = "singleton"`** :  By default scope will be singleton meaning that one class can create only one object 
(we can achieve this using OOP already discussed and added to repo)
* **`scope = "prototype"`** : This will create multiple objects for a single class.

