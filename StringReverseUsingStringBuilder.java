public class StringReverseUsingStringBuilder {
    public static String reveString(String str){
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return sb.toString();
        
    }
    public static void main(String[] args) {
        System.out.println(reveString("1 2 3"));
        System.out.println(reveString("10 20 30"));

    }
}
