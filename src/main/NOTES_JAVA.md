# **NESTED LOOP**
 
This is call as a nested loop where we can use a loop inside another loop, think this as using a matrix , this is helpful
when in the code is necesary to reapet the code more times that we think so to avoid repeat the code, the nested loop is 
very helpful in these types of cases , the nested loops can't integrate when the variable is the same, that's why we need to 
change the name of the variable in the loops, skeleton of a nested loop is:

    for (some statement){
    for (some statement){
    run some code; 
    }
    }

the nested loops can be also be writen in nested while loops, but these cases are not much used for the people, but the 
struct is the same
Both can be used in Data struct and Algorithms 

    while(some statement){
    while(some statement){
    run some code;    
    }
    }

# **Scanner (user imput)**

this is to take some user inputs, to use the scanner we need to import a java folder , this folder will help us to take 
wherever the user types, but when we take the user input the scanner need to be close at the end of the main code, struct 
of the scanner is:

- Need to declare a scanner variable 
- set this scanner in after the print statament to take wherever the user types
  with the different types of scanner's
  
## Input Type Methods

  Strings: Use nextLine() to read a full line of text (including spaces) or next() to read a single token (word) up to the next whitespace.
  Integers: Use nextInt() for whole numbers.
  Floating-Point Numbers: Use nextDouble() for double-precision decimals or nextFloat() for single-precision decimals.
  Booleans: Use nextBoolean() to read true or false.
  Large Integers: Use nextLong() for large whole numbers, nextShort() for small integers, and nextByte() for byte-sized integers.
  Precise Decimals: Use nextBigDecimal() or nextBigInteger() for high-precision calculations.
  
    Scanner #name_of_scanner = new Scanner(System.in);
close the scanner at the end

    #name_of_scanner.close();

# **METHODS**

Methods are a block of code that we can be reusable inside any functions , to use these methods we to use the name of the method
or also name "called the method" using a "()", this help to don't repeat yourself (D.R.Y), these types of variables has
to be static when is inside the main function.
But if we want to use any type of specific types inside the methods we need to set up things that are call parametres,
this parametres will act as part of the funtion that we need to put to make the method work
Also any variable that are use inside the method and the methods outside the methods are not coorelated, the order of 
the parametre when the method is use has to be in the same position as is in the method like data type and order.

# **OVERLOAD METHOD**

An overload method is a method or funtion that can share names with others methods but the difference is that these methods
has unique paramethres, these differents parametres create a unique signature about in this overload method
 EX.
    
    Statatic double add(int number,int number2){some code}
    Statatic double add (int a, int b , int c){some code}
Java don't allow to create methods with same name and same number of parameters, but it can allow to create methods
with same name and different parameters

# **Variables Scope**

Variables scopes are divide in two clases local and gloval variables, local variables are any type of data that is typed
inside the main funtion, variables can have the same name as long these variables are in different funtion , then there 
are the class variables these are showing in the class funtion these are most seem outside the main  funtion, if any case 
there are three variables with the same name java will prefer to use first any local variables first before any class variables

# **ARRAYS**

Arrays are the collections of values of the same data type to declare  and Initialization
Arrays can be declared using either type[] name or type name[]. Memory is allocated using the new keyword or via array literals.

    // Declaration and initialization with literal values
    int[] nums = {10, 20, 30};
    
    // Declaration with specified size (default values assigned)
    String[] names = new String[5];
    
    // Accessing and modifying elements
    names[0] = "Alice";
    System.out.println(names[0]); // Output: Alice
To check the elemetes of the array, the array has an inicialization of index 0
Common operation to use in the arrays are:
    
-Length: Access the number of elements using the .length property (not a method).
-Iteration: Use for loops or enhanced for-loops (for-each) to traverse elements.
-Utility Methods: The java.util.Arrays class provides static methods for sorting, searching, copying, and filling arrays.
    
    int[] arr = {3, 1, 2};
    Arrays.sort(arr); // Sorts to {1, 2, 3}
    Arrays.toString(arr); // Returns "[1, 2, 3]"


# **VARIABLES ARGUMENTS**

A VARARGS allows a methods to have a varying numbers of arguments, this is very helpful to make methods more flexible works 
for methods that share the same name but each one has differents parametres 

Ex of an overload methods:
    
    static add (int x, int y );
    static add (int x, int y,int z );
    static add (int x, int y,int z , int g ); etc....

These variables arguments help to simplify these long and repitetive variables to a simple and single mathod
with the help of an Ellipsis (...) this means in the argument the paramenters are put into an array 

EX:

    Static int add (int ... #set a name of the array(numbers)){
    int sum;
    for (int number : numbers){
    sum+=number;
    }
    return sum;
    }

Now this type if methods can do the same operations for with any number of parameters.

#**2D ARRAYS**

These types of array also known as multidimentional arrays are known bc can hold an #'s of arrays inside another array
these are very useful for matrixes of data 

REGULAR ARRAY:

    String[] name = {"Ange","Hana","Yamada"};

now 2D ARRAYS are:

    String[] name = {"Ange","Hana","Yamada"};
    String[] name2 = {"Ange","Hana","Yamada"};
    String[] name3 = {"Ange","Hana","Yamada"};
    String [][] names = {name,name2,name3};// this one hold all the three arrays in the with the lists.

To loop in these types of multidimentional arrays we need two for loops, where each loop has its onw job, the first one
is looping through the position of the list and the second one is looping throght the elemtens inside the lists(any name 
inside the array ).

# **Object Orient Programing (OOP)**

Object Orient Programin or OOP know common is a programing code that help to entities to hold data (attribiteties) or 
can perform actions (methods) , this can be also know has a bluprint or template of some object, OOP can work in different ways 
Encapsulation is where behind data and methods can be manipulated in its classes, making possible to hide internal details
Inheritance this is where the child class can take some reference fron the parent class having some reusable code and organization 
Polymorphism this tread different classes as a common parent class often is used an overriding or overload code 
Abtractions this hide complex implementation detail and only shows essential features of a objeect throght a abstrac class or interface

To use a OOP we need to createa a new class outside the main code this outside code will be the parent class or the class that can hold 
the basic features for future code  and so this can be reusable. This has to have attributes 

To access things inside the object we need to use the dot operator [ . ]

EX.

    // Define a class
    public class Car {
    // Fields (State)
    private String model;
    private int year;

    // Constructor (Initialization)
    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    // Method (Behavior)
    public void displayInfo() {
        System.out.println("Model: " + model + ", Year: " + year);
    }

    // Main method to run the code
    public static void main(String[] args) {
        // Create an object
        Car myCar = new Car("Toyota", 2022);
        myCar.displayInfo(); // Output: Model: Toyota, Year: 2022
        }
    }   
This is the know blue print of an car details

EX2.

Encapsulation
Protect data by making fields private and providing public getter/setter methods. 
This prevents unauthorized access and ensures data integrity.

    public class Person {
    private String name; // Hidden data

    // Public getter
    public String getName() { return name; }

    // Public setter with validation
    public void setName(String name) {
        if (name != null) {
            this.name = name;
            }
        }
    }

EX3

Inheritance
Reuse code by creating a child class that extends a parent class. The child inherits fields and methods.

    // Parent class
    class Animal {
    void eat() { System.out.println("Eating..."); }
    }
    
    // Child class
    class Dog extends Animal {
    void bark() { System.out.println("Barking..."); }
    }
    
    // Usage
    Dog myDog = new Dog();
    myDog.eat();  // Inherited method
    myDog.bark(); // Own method

These methods do not have to be in the same file to run parent and childs classes and mehtods has to be in differents locations

EX4

Polymorphism
Allow objects to be treated as instances of their parent class. 
The specific method implementation is determined at runtime (Method Overriding).

    Animal myPet = new Dog(); // Upcasting
    myPet.eat(); // Calls Dog's version if overridden, or Animal's if not

Note: In a full polymorphic example, Dog would override eat() to print "Dog eating...", 
and the call myPet.eat() would execute that specific version

EX5

Abstraction
Hide complex implementation details using abstract classes or interfaces. 
You define what an object does without specifying how.

**Using an Abstract Class:**
    
    abstract class Shape {
    abstract void draw(); // No body, must be implemented by subclass
    }
    
    class Circle extends Shape {
    void draw() { System.out.println("Drawing a circle"); }
    }

# **Constructors**

This is special method to inicializate objects , this has to pass arguments  to a constructor and set up initial values4

EX.

    public class Car {
    String model;
    int year;

    // No-Argument Constructor (Explicitly defined)
    public Car() {
        model = "Unknown";
        year = 0;
        System.out.println("Car created with default values.");
    }

    public static void main(String[] args) {
        Car myCar = new Car(); 
        // Output: Car created with default values.
        System.out.println(myCar.model + " - " + myCar.year); 
        // Output: Unknown - 0
        }
    }   


# **OVER LOADCONTRUCTORS** 

This allowed to the class to have multiples constructors in a file each constructor with different parameters.
This allowed to enable object in different ways 

Here is Basic Overloading Example

public class Rectangle {
private double length;
private double width;

    // 1. No-argument constructor (Default)
    public Rectangle() {
        length = 1.0;
        width = 1.0;
    }

    // 2. Single parameter constructor (for a square)
    public Rectangle(double side) {
        length = side;
        width = side;
    }

    // 3. Two-parameter constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle();       // Calls default
        Rectangle square = new Rectangle(5.0);   // Calls single param
        Rectangle rect2 = new Rectangle(10, 20); // Calls two params
        }
    }   

All the methods has the same but each one has different parameters

# **ARRAY OF OBJECTS**

A array of objects are used for store multiples classes or structures, this is very helpfull for efficient management of large 
databases or any complex entities, this types of arrays hold a reference to the objec  in the memory, is very useful for 
organization access and manupulation of multiples items.
To implementate this Arrays we need

-Define Class 
we need to define a class or blueprint this defines the propreties and behaviors of the objects
-Declaration And Memory Allocation 
we need to declare a array variable and allocated memory , the array has to inicializate in NULL
EX.

    ClassName[] arrayName = new ClassName[size]
    Student[] students = new Student[3];
-Initialization of Elements 
we need to create new elements inside the new array create in the blueprint 
EX

    // Declare, allocate, and initialize in one line
    Student[] students = {
    new Student("Alice", 20),
    new Student("Bob", 22)
    };  

To itelerate throught the list of arrays we need to use a for loop 

# **STATIC**

Static is a key word use in most of the methods create in the code, this means that any variable or method belong to tha 
class rater of any specific object, this is most common use in methods that have a share utility, that can access without Instatiation 
using

     Classname.method()

Ex.

public class Employee {
static String company = "TechCorp"; // Shared by all employees
String name;

    public Employee(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Alice");
        Employee e2 = new Employee("Bob");

        // Access via class name
        System.out.println(Employee.company); 
        
        // Access via instance (not recommended but valid)
        System.out.println(e1.company); 

        // Changing via class name affects all instances
        Employee.company = "NewCorp";
        System.out.println(e2.company); // Output: NewCorp
        }
    }     
This is an example that how work static with variables where the variable is traking the same instance of the class
to print the list of something is better to print through the name of the class that using the variable name.

Also in the same blueprint can also hold a static method,
to use the methods create we need to use the name of the classs and name of the method create 

EX

    Friend.showworkers(); The output should be the number of workers in the company 

# **INHERITENCE**

Inheritance is a type of class, Inheritane is a fundamental concept where this allows to use methods and attributes from 
others class or blueprints, this promote code reusability and help reduncing redundancy by exten the code and not have to re write
code 
EX.

    //if we have blueprint from one size of
    //parent class
    Class VEHICLE{
    
    int year;
    String[] name;
    
    }
    
    //child class (subclass)

    Class car extends VEHICLE{
    private String name = "Munstang";
    private year  year1= 2010;
    public static void main(String[] args) {
    Car myCar = new Car();

        
        // Accessing inherited and local fields
        System.out.println(myCar.year + " " + myCar.name);
        }
    }

the key work for the inheritance is [ extends ]

# **Polymorphism**

Polymorphism is a way to treat an Object as another objects , can also can be indentify as another object, this has a facility 
to writing a reusable ,flexive and maintainable code by allowing to the programmers to do a single actions in varius differnt ways 
depending on the context of the code.
The code from one file can take and allows different objects to enable a single  interface like behaviors or data types
Can also Polymorphism can be used with interfaces.

## Polymorphism has two mechanisms 

The first one is call "Compile-time Polymorphism" these methods is also know like "method overloading" this can allow
mutiples methods to share the same class but the difference are found in the parameters, the compiler determines which method
is used depending on the parameters uses at the moment.

The second one is called 'Runtime Polymorphism' also knows as "method overriding" this happens when the Subclasses when this 
take a method form the Upper class, the Subclass overrider a specific methods and the java compiler determine which one is the best to use 
according how's is use 

EX.
    
    $$Compile-time Polymorphism
    class Calculator {
    int add(int a, int b) { return a + b; }
    double add(double a, double b) { return a + b; }
    }
    
    public class Main {
    public static void main(String[] args) {
    Calculator calc = new Calculator();
    System.out.println(calc.add(5, 10));       // Calls int version
    System.out.println(calc.add(5.5, 10.5));   // Calls double version
        }
    }   

EX

    %%Runtime Polymorphism
    class Animal {
    void sound() { System.out.println("Animal makes sound"); }
        }
    
    class Dog extends Animal {
    @Override
    void sound() { System.out.println("Dog barks"); }
    }
    
    public class Main {
    public static void main(String[] args) {
    Animal myDog = new Dog(); // Upcasting
    myDog.sound(); // Output: Dog barks
        }
    }   

# **RUNTIME POLYMORPHISM** 

This a type of polymorphism where the programmer decides the time of the code execution. This is based in the data type
of the object, this is processor by the JVM (java virtual machine) at certain run time, this is achieved through the 
method overriding where in the subclass there is a specific method implementation where is located in the superclass.

EX

    class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
        }
    }
    
    class Dog extends Animal {
    @Override
    void sound() {
    System.out.println("Dog barks");
        }
    }
    
    class Cat extends Animal {
    @Override
    void sound() {
    System.out.println("Cat meows");
        }
    }
    
    public class Main {
    public static void main(String[] args) {
    // Upcasting: Parent reference referring to Child object
    Animal myDog = new Dog();
    Animal myCat = new Cat();

        // Method calls are resolved at runtime based on the actual object
        myDog.sound(); // Output: Dog barks
        myCat.sound(); // Output: Cat meows
        }         
    }   


# **GETTERS AND SETTER**

These two names of methods help to protect abject data and abe aviable to add rules for accessing or modifying them 
getter are usually use for make the methods have a field Readable and setter is use for methods that can have a field of writeable 

The keyworkds for use an GETTER is  [ get_thenameofthefuntion(); ]
The keyworkds for use an SETTER is  [ set_thenameofthefuntion(); ]

EX.

    public class Employee {
    private int id;
    private String name;

    // Getter for id
    public int getId() {
        return id;
    }

    // Setter for id
    public void setId(int id) {
        this.id = id;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name with validation
    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;
        }
    }   

# **AGGREGATION**

Its a relationship between two classes, the type of relation is "has-a", this meaning that one object contains part of another object 
    as part of the structure but the object/s that exist are independently.
ex.

-One [Independent Lifecycles]; objects or conteined can exist independently of one container, if the continer is destroyed, one part remains intact 
-
-Two [Weak Ownership]; containters class hold a reference  to the other class but is doesn't own its lifecycle or creation
-
-Three [Code Reusability]; this allows the code to reuse funtionally from others classes without inheritance or tigh coupling.
-

EX.

    import java.util.ArrayList;
    import java.util.List;
    
    // Independent class (Part)
    class Employee {
    private String name;
    private int id;
    
        public Employee(String name, int id) {
            this.name = name;
            this.id = id;
        }
    
        public String getName() { return name; }
        public int getId() { return id; }
    }
    
    // Container class (Whole)
    class Department {
    private String deptName;
    private List<Employee> employees; // Aggregation: holds references

    public Department(String deptName) {
        this.deptName = deptName;
        this.employees = new ArrayList<>();
    }

    // Employees are created OUTSIDE and passed in
    public void addEmployee(Employee emp) {
        employees.add(emp);
    }

    public void showEmployees() {
        System.out.println("Employees in " + deptName + ":");
        for (Employee emp : employees) {
            System.out.println("ID: " + emp.getId() + ", Name: " + emp.getName());
            }
        }
    }

    public class Main {
    public static void main(String[] args) {
    // 1. Create Employees independently
    Employee emp1 = new Employee("Alice", 101);
    Employee emp2 = new Employee("Bob", 102);

        // 2. Create Department
        Department hr = new Department("Human Resources");

        // 3. Add existing employees to department
        hr.addEmployee(emp1);
        hr.addEmployee(emp2);

        hr.showEmployees();

        // 4. Prove Independence: 
        // Even if 'hr' is destroyed, emp1 and emp2 still exist 
        // and can be added to another department.
        Department sales = new Department("Sales");
        sales.addEmployee(emp1); // Alice moves to Sales
        }      
    }   

# **COMPOSITON**

Composition mean that the code establish a strong relatioship between classes, where one class contain objects of another class
as instance variables, is different form inheritance, composition allows to reuse and modular desing the code by combining simpler 
objects to build complex one, the life cicle of the composition depends on the containing object in the container.
The componer cannot exist idenpendetly if the container object id destroy the composition is also destroy, thats the difference from
Aggregation. 

-One [Strong Ownership]; The Container class creates and owns the composed objects , the often are instantiating in its own constructor
-
-Two [Loose Coupling];This is a better feature for testing , this allowed to be swapped or modify at runtime without alternign the container structure
-
-Three [Code Reusability]; Its allowed to reuse existen class without rigid constrains and potential complexity 
-

EX.

    import java.util.ArrayList;
    import java.util.List;
    
    // The Component class
    class Room {
    private String name;

    public Room(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
        }
    }
    
    // The Container class (Composition)
    class House {
    // The house owns the rooms; they are created inside the house
    private List<Room> rooms;

    public House() {
        this.rooms = new ArrayList<>();
        // Rooms are instantiated directly by the House
        rooms.add(new Room("Living Room"));
        rooms.add(new Room("Bedroom"));
        rooms.add(new Room("Kitchen"));
    }

    public void showRooms() {
        for (Room room : rooms) {
            System.out.println("Room: " + room.getName());
            }
        }
    }
    
    public class CompositionDemo {
    public static void main(String[] args) {
    House myHouse = new House();
    myHouse.showRooms();

        // Note: You cannot create a 'Room' independently and pass it to 'House'
        // in this strict composition model. The House creates them.
        }
    }   


# **WRAPPER CLASS**

Wrapper classes use primitive data type (int, double,string...etc) as a class that can use in the OOP classes, the wrapper 
classes encapsulate these types of data type. Allowing to the primitives be used as collections [ArrayList<Integer>],generics 
and AP's that need object that primitives data types, this class use a way called auto-wrapper.

These wraps classes has constructors to use, like the method  "valueof();" for creation or "Integer.parseInt();" for comparing 
using "equals();" this can handle cases like null or NaN.

EX.

    import java.util.ArrayList;
    import java.util.List;
    
    public class WrapperExample {
    public static void main(String[] args) {
    // Autoboxing: primitive int automatically becomes Integer
    Integer wrappedInt = 42;

        // Unboxing: Integer automatically becomes int
        int primitiveInt = wrappedInt; 

        // Collections require objects; autoboxing handles the conversion
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10); // Autoboxing: int 10 → Integer
        numbers.add(20); // Autoboxing: int 20 → Integer

        // Unboxing occurs when retrieving values
        int first = numbers.get(0); 
        
        System.out.println("First number: " + first); // Output: 10
        }
    }       

Ex2.

    public class CreationExample {
     public static void main(String[] args) {
        // Recommended: Uses cache for values -128 to 127
        Integer a = Integer.valueOf(100);
        Integer b = Integer.valueOf(100);

        // Deprecated: Always creates a new object
        // Integer c = new Integer(100); 

        // Demonstrates caching: 'a' and 'b' refer to the SAME object
        System.out.println(a == b); // Output: true

        // Values outside the cache range create new objects
        Integer x = Integer.valueOf(200);
        Integer y = Integer.valueOf(200);
        System.out.println(x == y); // Output: false (different references)
        
        // Always use .equals() for value comparison
        System.out.println(x.equals(y)); // Output: true
        }
    }   

# **ARRAYLIST**

Arraylist is a resizable array that stores objects (from the autoboxing) the difference between an array is this has 
a fixed sizes and the Arraylist can change.
The sizes of an arraylist is minimum 10 but is can grow or shrink, to check inside the array is in a loop with a O(1)interval,
can only store wrapp classes and not primitives data types, so we most need to conver the data type to a wrapper class, 
the arraylist a common operator that is use in these classes and are add() to insert,get() to retrieve ,remove() to delete 
,size() to check the numbers of elements.

EX.

    import java.util.ArrayList;

    public class BasicExample {
    public static void main(String[] args) {
    // Create an ArrayList of Strings
    ArrayList<String> fruits = new ArrayList<>();

        // Add elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        // Access element at index 0
        System.out.println("First fruit: " + fruits.get(0)); // Output: Apple

        // Modify element at index 1
        fruits.set(1, "Blueberry"); 

        // Remove an element by value
        fruits.remove("Orange");

        // Print the modified list
        System.out.println("Updated List: " + fruits); // Output: [Apple, Blueberry]
        
        // Check size
        System.out.println("Size: " + fruits.size()); // Output: 2
        }
    }   

to loop through the array is possible to use a for loop or while loop.

EX.

    for (int i = 0; i < fruits.size(); i++) {
    System.out.println("Index " + i + ": " + fruits.get(i));
    }   

## OR

    import java.util.Iterator;
    Iterator<String> iterator = fruits.iterator();
    while (iterator.hasNext()) {
    String fruit = iterator.next();
    if (fruit.equals("Apple")) {
    iterator.remove(); // Safely removes "Apple"
        }
    }

Ex with autoboxing//

    import java.util.ArrayList;
    
    public class NumberExample {
    public static void main(String[] args) {
    // Create an ArrayList of Integers
    ArrayList<Integer> numbers = new ArrayList<>();

        // Autoboxing: primitive int is automatically converted to Integer
        numbers.add(10); 
        numbers.add(20);
        numbers.add(30);

        // Unboxing: Integer is automatically converted to int for math
        int sum = numbers.get(0) + numbers.get(1); 
        System.out.println("Sum: " + sum); // Output: 30
        }
    }   
    
# **EXEPTIONS**

This a feature that java has it, this is an event that interrupts the normal flow of the program like, dividing by 0, file not found,
or mismatch input, for these errors java implement methods that helps to avoid it , these methods are try{},catch{}, finally{}.
each of these ones has a specific work to do.

## TRY{}

TRY {}=Enclose a block of code that may trow a error in its running time, if any exceptions occurs int the remainder code, this block of code is skipped, 
and anything else is transfer to the catch{} block 

## CATCH{}

CATCH{}=This handles the exeptions thrown by the try{} block code, Catch{} can only occuors only when a matching execptions occurs , it is possible to have many catch{} with 
differents exceptions types.

## FINALLY{}

FINALLY{}= This always is executing no matter what, regardless of whether an exceptions happen or not ,this has an primety task that is for cleanup tasks
like closing files, some databases, connections , or releasing resources.

EX

    public class DivisionExample {
    public static void main(String[] args) {
        int[] numbers = {10, 5, 0};
        
        for (int i = 0; i < numbers.length; i++) {
            try {
                // TRY: Risky code that might throw an exception
                int result = 100 / numbers[i];
                System.out.println("Result: " + result);
                
            } catch (ArithmeticException e) {
                // CATCH: Executes ONLY if an ArithmeticException occurs
                System.out.println("Error: Cannot divide by zero!");
            } finally {
                // FINALLY: Always executes (success or failure)
                System.out.println("Iteration " + i + " completed.\n");
                }
            }
        }
    }

# **DATES OR TIME**

this section is to implements the use of time using Java like Localtime,Localdate,LocalDataTime and UTC timestamp 

## LOCAL TIME 
 
This is refering to represent the time 

    14:30:15 hours:minutes:seconds

## LOCAL DATE

This is refering to represent the date 

    2006-11-10 year/month/day || this will depents on the region and how they manage the format 

## LOCAL DATE AND TIME

This is refering to represent the date and time together of the region 


    2003-11-10T14:30:15 this is put together the date format and the time 

## ZONE DATE TIME

This is the regiong where the time and date depens of the time zone 

    2000-11-10 T14:30:15+02:00[Europe/Paris] the number after the + signe is the hours of that zone 

    ex. Europe is 2 hours ahead of USA

## DateTimeFormatter

Used for formatting and parsing our own dates.

There is a way to access to the time and is 

    import java.util.Date;
import java.text.SimpleDateFormat;

    public class Main {
        public static void main(String[] args) {
            Date now = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            System.out.println("Legacy Date: " + sdf.format(now));
            }
        }

# **ANONYMOUS CLASS**

This classes is called like that because they doesn't have a name , this classes can't be reused, it can't have a constructure either
this block of code use a instance initializater blocks to be set up a state typically used for one-time implementations of an interface 
or subclass(timer task,Runnable,callbacks)

EX.

    // Define a simple interface
    interface Greeting {
       void sayHello();
        }
    
    public class Main {
        public static void main(String[] args) {
    // Create an anonymous class implementing Greeting
        Greeting greet = new Greeting() {
        @Override
        public void sayHello() {
        System.out.println("Hello, World!");
            }
        };

        greet.sayHello(); // Output: Hello, World!
        }
    }   

# **TIME AND TIMERTASK**

To use the time class is a extencion of java we need to import the time methods to the class , this is very helpful to sending notifications,
or possible for any schedule updates , or any repatitive actions.

EX


    import java.util.Timer;
    import java.util.TimerTask;
    
    public class OneTimeExample {
        public static void main(String[] args) {
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
    @Override
    public void run() {
        System.out.println("One-time task executed at: " + System.currentTimeMillis());
            }
        };

        // Schedule task after 2000ms (2 seconds)
        timer.schedule(task, 2000);
        
        // Cancel timer after task completes to stop the program
        // timer.cancel(); 
        }
    }   

