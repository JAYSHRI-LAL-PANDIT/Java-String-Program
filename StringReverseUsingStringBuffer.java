
public class StringReverseUsingStringBuffer {
    public static String toReveseString(String str)
    {
       StringBuffer sb=new StringBuffer(str);
       sb.reverse();
       return sb.toString();
    }
    public static void main(String[] args) {  
        System.out.println(toReveseString("This Jay Kumar"));
    }
}
