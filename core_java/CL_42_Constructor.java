

class myNewEmployee{
    private int id;
    private String name;

    public myNewEmployee(){
      id=45;
      name="Alice Liddle";
    }
    public myNewEmployee(String myName,int myId){
        id=myId;
        name=myName;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        this.name=n;
    }
    public int  getId(){
        return id;
    }
    public void  setId(int n){
        this.id=n;
    }
}


public class CL_42_Constructor {
    public static void main(String[] args) {
        myNewEmployee alice =new myNewEmployee("\"Alice\"Liddle\"",135);
        System.out.println(alice.getName());
        System.out.println(alice.getId());

        myNewEmployee alice2 =new myNewEmployee();
        System.out.println(alice2.getName());
        System.out.println(alice2.getId());

    }
}
