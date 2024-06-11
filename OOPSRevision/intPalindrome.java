package OOPSRevision;
public class intPalindrome {
public  static boolean abc(int []arr){

    int start = 0;
    int end = arr.length-1;
    for (int i = 0; i < arr.length ; i++) {
        if(arr[start]!=arr[end]){

            return false;
        }else {
            start++;
            end--;

        }
    }return true;
}

    public static void main(String[] args) {
        intPalindrome i = new intPalindrome();



        System.out.println(i.abc(new int[]{1, 2, 3, 2, 1}));


    }
}
