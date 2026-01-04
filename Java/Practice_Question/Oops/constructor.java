
// Default Constructor ---------------------------------------------------------


// public class constructor

// {

//     String Name;
//     int age ;
//     String City;


//     public constructor()

//     {

// Name = "Pankaj Kumar Das ";
// age = 21 ;
// City= "Kishanganj";

//     }
//     public static void main(String [] args)

//     {

//         constructor obj = new constructor();
// System.out.println(obj.Name + "\n" + obj.age + "\n" + obj.City);

//     }
// }







// Parametarized Constructor -----------------------------------------------=----
// public class constructor

// {
//     String Name;
//     int age ;
//     String City;


//     public constructor(String n , int a , String c)

//     {

// this.Name = n;
// this.age = a;
// this.City= c;

//     }
//     public static void main(String [] args)

//     {

//         constructor obj = new constructor("Beauty" , 20 , "Kishanganj");
// System.out.println(obj.Name + "\n" + obj.age + "\n" + obj.City);

//     }
// }




// Copy Constructor -----------------------------------------------
// public class constructor {

//     String Name;
//     int age;
//     String City;

//     // Regular constructor to initialize fields
//     public constructor(String Name, int age, String City) {
//         this.Name = Name;
//         this.age = age;
//         this.City = City;
//     }

//     // Copy constructor
//     public constructor(constructor j) {
//         this.Name = j.Name;
//         this.age = j.age;
//         this.City = j.City;
//     }

//     public static void main(String[] args) {
//         constructor obj = new constructor("Beauty", 20, "Kishanganj");
//         constructor obj1 = new constructor(obj);

//         System.out.println(obj1.Name + "\n" + obj1.age + "\n" + obj1.City);
//     }
// }
