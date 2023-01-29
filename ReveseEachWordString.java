

public class ReveseEachWordString {
    public static String toRevese(String str)
    {
        String words[]=str.split("\\s");
        String reverseWord="";
        for(String w:words){
            StringBuffer sb=new StringBuffer(w);
            sb.reverse();
            reverseWord+=sb.toString()+" ";
        }
        return reverseWord;
    }
    public static void main(String[] args) {
        System.out.println(toRevese("This is Jay Kumar"));
    }
}
