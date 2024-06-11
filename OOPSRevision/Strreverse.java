package OOPSRevision;

public class Strreverse {

    public static boolean stringReverse(String word){

        char[] str = word.toCharArray();
        int start = 0; int end = word.length()-1;

        while (start<end){

            if (str[start]!= str[end]){
                return false;
            }else {
                start++;
                end--;

            }
        }return true;

    }

    public static void main(String[] args) {



        Strreverse s = new Strreverse();
        System.out.println(s.stringReverse("madam"));


    }
}
