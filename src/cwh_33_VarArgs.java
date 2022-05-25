public class cwh_33_VarArgs {
    static int count=0;
   static void Recursion() {
       count++;
       if(count<5){
           System.out.println("Hello " +count);
           Recursion();

       }

   }

    public static void main(String[] args) {
        Recursion();

    }
}
