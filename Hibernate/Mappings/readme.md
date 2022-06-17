   Create a program to persist the following class object using Association Mapping where car would be on OneToOne mapping:
public class CarOwner {  
private int OnnerId;  
private String OnerName;  
private CarDetail car;
} 

 Make another class called MultiCarOwner program to persist the following class object using Collection Mapping of one owner to many cars mapping:
public class CarOwner {  
private int OnnerId;  
private String OnerName;  
private List cars;
}

 Create a program to persist the following class 10 objects using Collection Mapping:
Public class Continent{
Private String cname;
Private Map  countries;
}
Note : Countries property should be of type Map object with Country String class object as key and Capital String class object as value

 Write an Employee class and Passport class such that, one employee object should hold only one passport object (one-to-one).
Implement a client code such that when we save or delete Employee object, automatically passport object should be stored or deleted in a related table.
Note: you can add any appropriate class members

 Convert the  Employee class with address class such that, one employee object should have only one address object (one-to-one). As a Component Mapping  Such that there is only one employee table and the address details are added as columns to the Employee table 