public class stringBuilder {
    public static void main(String[] args) {
        //in one string you can make the changes //no need of creating the new object

        StringBuilder str=new StringBuilder();
        for(int i=0;i<26;i++){
            char ch=(char)('a'+i);
            str.append(ch);
        }
        System.out.println(str.toString());
    }
}
