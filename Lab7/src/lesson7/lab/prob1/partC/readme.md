The problem is in the Employee class:

Employee class has no 'hashCode' method that is overriding 'hashCode' method of the Object class.

Consequently, in EmployeeEnfo class:
The 'removeDuplicates' method uses the 'containsKey' of HashMap to search items by their 'hashCode' method.
 
    

