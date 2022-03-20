public class _16_MenambahkanElemenStringMelaluiParameterFungsiString {
    public static void main(String[] args) {
        String s = "Hell";
        aMethod(s);
    }
    public static void aMethod(String s){
        char c ='o';
        s += c;
        System.out.println(s);
    }
}
