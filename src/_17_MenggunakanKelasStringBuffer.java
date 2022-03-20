public class _17_MenggunakanKelasStringBuffer {
    public static void main(String[] args) {
        String str = "Java";
        StringBuffer buffer = new StringBuffer(str);
        if (str.equals(buffer)){
            System.out.println("Both are equal");
        } else {
            System.out.println("Both are not equal");
        }
    }
}
