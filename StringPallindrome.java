

public class StringPallindrome {
    public static boolean toPalindrome(String str){
       StringBuffer sb=new StringBuffer(str);
       sb.reverse();
       String rev=sb.toString();
       if(str.equals(rev))
       {
         return true; 
       }
       else
       {
        return false;
       }
    }
    public static void main(String[] args) {
        System.out.println(toPalindrome("raar"));
    }
}

