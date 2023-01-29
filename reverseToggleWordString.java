
public class reverseToggleWordString {
    public static String reverseToggle(String str){
        String words[]=str.split("\\s");
        String reveseToggle="";
        for(String w:words){
           StringBuffer sb=new StringBuffer(w);
           sb.reverse();
           String first=sb.substring(0, 1);
           String afterFirst=sb.substring(1);
           reveseToggle+=first.toLowerCase()+afterFirst.toUpperCase()+" ";
        }
        return reveseToggle;
    }
    public static void main(String[] args) {
        System.out.println(reverseToggle("this is jay kumar"));
    }
}
