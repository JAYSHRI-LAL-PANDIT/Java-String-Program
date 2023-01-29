public class Demo_String {
    public static void main(String[] args) {
        // char a[]={'j','a','v','a'};
        // String s1 = new String(a);
        // System.out.println(s1);
        // String s2 ="Jay";
        // System.out.println(s2);
        // String s3= new String(" Kumar");
        // System.out.println(s3);
        
        // s2=s2.concat(s3);
        // System.out.println(s2);
       
        //String Comparision by using equals method
       
        // String s1 ="jay";
        // String s2 ="jay";
        // String s5 = "Jay";
        // String s3 = new String("jay");
        // String s4 ="Kumar";
        // System.out.println(s1.equals(s2));
        // System.out.println(s1.equals(s3));
        // System.out.println(s1.equals(s4));
        // System.out.println();
        // System.out.println(s1.equals(s5));
        // System.out.println(s1.equalsIgnoreCase(s5));

    //String comparision By using == operator

        // String s1 = "jay";
        // String s2 = "jay";
        // String s3 = new String("jay");
        // System.out.println(s1==s2);
        // System.out.println(s1==s3);

     // String Comparision By using compareTo method()

    //  String s1 ="jay";
    //  String s2 ="jay";
    //  String s3 ="ja";
    //  System.out.println(s1.compareTo(s2));
    //  System.out.println(s2.compareTo(s3));
    //  System.out.println(s3.compareTo(s1));

    // String concatination by using + operator

    // String s="Jay"+" Kumar";
    // System.out.println(s);
    // String s1 =50+30+"Jay"+40+10;
    // System.out.println(s1);

    // String concatination by using concat method

    // String s1="jay";
    // String s2=" kumar";
    // String s3=s1.concat(s2);
    // System.out.println(s3);
// String concatination by using StringBuilder with append() method

    // StringBuilder s1=new StringBuilder("Hi");
    // StringBuilder s2=new StringBuilder(" Jay");
    // StringBuilder s=s1.append(s2);
    // System.out.println(s);

// String concatination by using format() method

    //  String s1 = new String("Jay");
    //  String s2 = new String(" Kumar");
    //  String s = String.format("%s%s", s1,s2);
    //  System.out.println(s);

    // substring

    // String s="hello";
    // System.out.println(s.substring(0,2));

    // String s ="JayshriLalPandit";
    // System.out.println(s);
    // System.out.println(s.substring(3));
    // System.out.println(s.substring(0, 7));

 //StringBuffer append() method

    // StringBuffer sb = new StringBuffer("Hi");
    // sb.append(" Jay");
    // System.out.println(sb);

 // StringBuffer insert() method
 
//  StringBuffer sb = new StringBuffer("Hello");
//  sb.insert(5, " Jay");
//  System.out.println(sb);

 //StringBuffer replace() method

//  StringBuffer sb = new StringBuffer("HELLO");
//  sb.replace(1, 2, "hi");
//  System.out.println(sb);

 //StringBuffer delete() method

//  StringBuffer sb = new StringBuffer("HELLO");
//  sb.delete(1, 3);
//  System.out.println(sb);
    
//StringBuffer revese() method
 
// StringBuffer sb = new StringBuffer("HELLO");
// sb.reverse();
// System.out.println(sb);
   
//StringBuffer capacity() method

StringBuffer sb = new StringBuffer();
System.out.println(sb.capacity());
sb.append("hello");
System.out.println(sb.capacity());
sb.append("This is Jay ");
System.out.println(sb.capacity());
   }

}
