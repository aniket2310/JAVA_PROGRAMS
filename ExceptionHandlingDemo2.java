public class ExceptionHandlingDemo2 {
    public static void main(String[] args) {
        try{

            String n = "aniket";
            System.out.println(n.length());


           int i = 10/0;       //this stmt occour the probleam



        }
        //between try and catch you cannot write anything

        catch(ArithmeticException e){

            System.out.println("divide by zero not possible");
        }
        catch (NullPointerException ne){
            System.out.println("we can use many catch block");
        }
        finally {
            System.out.println("compulsory execute all time if there is exeception it will execute");
        }
        System.out.println("this will also execute");


    }
}
