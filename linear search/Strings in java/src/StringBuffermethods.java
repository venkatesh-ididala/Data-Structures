public class StringBuffermethods {
    public static void main(String[] args) {
        StringBuffer str=new StringBuffer();
        str.append("hello");
        str.append("world");
        System.out.println(str);

        StringBuffer str1=new StringBuffer("chinnu"); //constructors -->string passed ,initial capacity,specified capacity
        str1.append("baby");
        System.out.println(str1);

        StringBuffer str2=new StringBuffer("roy");
        str2.insert(2,"vicky");
        System.out.println(str2);

        StringBuffer str3=new StringBuffer("chinnu");
        str3.replace(3,5,"k");
        System.out.println(str3);

        StringBuffer str4=new StringBuffer("chinnu");
        str4.delete(3,5);
        System.out.println(str4);


        StringBuffer str5=new StringBuffer("chinnu");
        str5.reverse();
        System.out.println(str5);











    }
}
