

    class Employee1{
             int id;
             int salary;
             String name;

         public void printDetail(){
             System.out.println("My id is "+id);
             System.out.println("and my name is "+name);
         }
         public int getSalary(){
             return salary;
         }

    }
    public class CL_38_CustomJava {

     public static void main(String[] args) {

            Employee1 alice = new Employee1();  // * Instantiating a new Employee Object
            Employee1 john = new Employee1();  // * Instantiating a new Employee Object

            // * Setting Attributes for Alice
              alice.id=12;
             alice.name="Alice liddle";
             alice.salary= 39;
           // * Setting Attributes for John
             john.id=43;
             john.name="John morphy";
             john.salary=36;



         // * Printing the Attributes
             alice.printDetail();
             john.printDetail();

             int aliceSalary=alice.getSalary();
             System.out.println("Alice Salary:"+aliceSalary);

             int johnSalary =john.getSalary();
             System.out.println("John : "+johnSalary);

                    // System.out.println(Alice.id);
                    // System.out.println(Alice.name);
                    //  System.out.println(john.id);
                    // System.out.println(John.name);
    }
}
