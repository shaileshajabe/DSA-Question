package helloworld;
import bank;
class Pen {
    String color;
    String type;

    public void write(){
        System.err.println("Writing Something");
    }
  public void printColor(){
     System.err.println(this.color);
  }
    
}

class Student{
    String name;
    int age;

//This is polymorphism. The same function is called multiple times.
//If the same function name is given for the different output then it is called as : Overloading
    public void printInfo(){
        System.out.println(name);
    }

    public void printInfo(int age){
      System.out.println(age);
    }

    public void printInfo(String name,int age){
      System.out.println(name+" " + age );
    }

    // public void printInfo(){
    //  System.err.println(this.name);   
    //  System.err.println(this.age);  

    // }


// non parametrised constructor
//      Student(){ 
//         System.err.println("Constructor Called");
// }


// parametrised constructor
//   Student(String  name,int age){
//     this.name=name;
//     this.age=age;
//   }


//Copy Constructor
//   Student(Student s2){
//     this.name=s2.name;
//     this.age=s2.age;
//   }


//      Student() {
// }
}
public class OOPS{
    public static void main(String args[]){
// copy Constructor
        // Student s1= new Student();
        // s1.name="aman";
        // s1.age=33;

        // //Student s2=new Student(s1);
        // s1.printInfo(s1.name,s1.age);


//For Student Class//
   //This step is for parametrised constructor
         //Student s1= new Student("Shailesh",22);
//This Step is for non parametrised constructor
   //Student s1= new Student();
        //  s1.name="aman";
        //  s1.age=24;
         


// For Pen Class

        // Pen pen1= new Pen();
        // pen1.color="blue";
        // pen1.type="gel1";
        // pen1.write();
        
        // Pen pen2= new Pen();
        // pen2.color="black";
        // pen2.type="ballpoint";

        // pen1.printColor();
        // pen2.printColor();
      

          bank.Account account1= new bank.Account();
          account1.name="customer";

    }
}
