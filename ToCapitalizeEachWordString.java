

public class ToCapitalizeEachWordString {
    public static String toCapitalWord(String str){
        String words[]=str.split("\\s");
        String toCapital="";
        for(String w:words){
            String first=w.substring(0, 1);
            String afterFirst=w.substring(1);
            toCapital+=first.toUpperCase()+afterFirst+" ";
        }
        return toCapital;
    }
    public static void main(String[] args) {
        System.out.println(toCapitalWord("this is jay Kumar"));
    }
}
