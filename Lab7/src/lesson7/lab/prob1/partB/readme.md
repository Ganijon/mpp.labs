The problem is in the Employee class:

Employee class has 'equals' method that is overloading but not overriding 'equals' method of the Object class.
The 'equals' method of Employee accepts one parameter of type Employee.
Whereas, the 'equals' method of Object has different signature: it accepts one parameter of type Object.

Furthermore, in EmployeeInfo class:
The 'listsAreEqual' method uses 'contains' of ArrayList that relies on the 'equals' method of items in collection.
 
    

