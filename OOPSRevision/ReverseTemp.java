package OOPSRevision;

public class ReverseTemp {

    public  static  String abc(String str){
        char[] ch = str.toCharArray();
        int start =0;
        int end = str.length()-1;
       while (start<end){

           char temp;

            temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;

            start++;
            end--;


        } return new String(ch);

    }


    public static void main(String[] args) {

        ReverseTemp  pt= new ReverseTemp();
        System.out.println(pt.abc("Aniket"));


    }
}
