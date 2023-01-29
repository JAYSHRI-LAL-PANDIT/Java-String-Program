public class ToggleEachWordString {
    public static String toggleWord(String str){
        String words[]=str.split("\\s");
        String toggleWord="";
        for(String w:words){
            String first=w.substring(0, 1);
            String afterFirst=w.substring(1);
            toggleWord+=first.toLowerCase()+afterFirst.toUpperCase()+" ";
        }
        return toggleWord;
    }
    public static void main(String[] args) {
        System.out.println(toggleWord("this is jay kumar"));
    }
}
