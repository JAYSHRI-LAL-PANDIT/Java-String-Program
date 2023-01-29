public class StringReverseUsingLoop {
    public static String reverseString(String str)
    {
        char ch[]=str.toCharArray();
        String rev="";
        for(int i=ch.length-1; i>=0; i--){
            rev+=ch[i];
        }
        return rev.toString();
    }
    public static void main(String[] args) {
        System.out.println(reverseString("My Name is Jay Kumar"));
    }
}

