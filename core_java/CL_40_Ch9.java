
          // * Access Modifier - Private ,Default , Protected ,Public
  class myEmployee{
      private int id;
      private String name;

         public void setName(String n){
              this.name=n;
         }
         public String getName(){
             return name;
         }

        public void  setId(int n){
             this.id=n;
        }

        public int  getId(){
             return id;
        }

         }

public class CL_40_Ch9 {
    public static void main(String[] args) {
        myEmployee alice =new myEmployee();
        // alice.id=45;
        // alice.name="Alice Liddle"; // *-> Throws an error due to Private access modifier
        alice.setName("Alice Liddle");
        System.out.println(alice.getName());

        alice.setId(456);
        System.out.println(alice.getId());

    }
}

