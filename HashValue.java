public class HashValue {

    int a=4;
    String AB = "acb";

    @Override
    public String toString() {
        return "HashValue{" +
                "a=" + a +
                ", AB='" + AB + '\'' +
                '}';
    }

    public static void main(String[] args) {
        HashValue hv=new HashValue();
        System.out.println(hv);
    }
}
