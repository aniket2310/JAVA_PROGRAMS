package OOPSRevision;

/*
Private -  Access  Whthin the class only
Default - Access Within the class and within the package
Protected - Access Within the class , Within the package and outside the package by subclass olny.
Public - Access Within the class , Within the package, outside the package by subclass olny and outside the package .

*/

class BankAccount
{
  public   String Username;
  private  String Password;


  public  void setPassword(String Password)
  {
      this.Password = Password;
  }

}


public class AccessModifiersDemo {

    public static void main(String[] args) {

        BankAccount ba  = new BankAccount();
        ba.Username = "Aniket";
        ba.setPassword("123456");

        System.out.println(ba.Username);
     //   System.out.println(ba.setPassword);//we cant change the password but we can set it because it is a private 

    }
}
