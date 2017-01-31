The problem is in the Employee class:

Employee class is not immutable. Fields are not final, setters are there, constructor is not complete;

In the EmployeeEnfo class:
The 'removeDuplicates' method uses 'containsKey' of HashMap to search for items by their 'hashCode' method.
However, we are changing the state of the item stored in the HashMap, that must not change in the first place. 
Since, the hashCode of the 'sentinel' item is changed, searching for duplicates is not consistent.
 
    

