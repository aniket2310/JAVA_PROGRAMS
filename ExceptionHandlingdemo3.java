public class ExceptionHandlingdemo3 {
    public static void main(String[] args) {
       try {
           int a[] = new int[5];
            a[7] = 41;

//           String n = null;
//           System.out.println(n.length());

       }catch (Exception e){
           System.out.println(e);
       }



    }
}
