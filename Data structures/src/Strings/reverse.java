package Strings;

import java.util.*;

public class reverse {
    public static void main(String[] args) {
        //Approach 1
        String s="chinnu";
        char[] chArr=s.toCharArray();
        for(int i=chArr.length-1;i>=0;i--){
            System.out.print(chArr[i]);
        }
        System.out.println();

        //Approach 2
        for(int i=s.length()-1;i>=0;i--){
            System.out.print(s.charAt(i));
        }
        System.out.println();
        //Approach 3
        StringBuffer sb=new StringBuffer(s);
        System.out.println(sb.reverse());

        //replace special characters
        String str="huehf345@WT#@&*(@";
        String str1=str.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(str1);

        //remove white spaces
        String str2="J a  v a  L an g u ag e  ";
        String str3=str2.replaceAll("\\s","");
        System.out.println(str3);

        //remove duplicates
        String str4="programming";
        StringBuilder sb2=new StringBuilder();
        str4.chars().distinct().forEach(c->sb2.append((char)(c)));
        System.out.println(sb2);

        //--> approach 2
        String str9="beginning";
        StringBuilder str5=new StringBuilder();
        for(int i=0;i<str9.length();i++){
            char ch=str9.charAt(i);
            int index=str9.indexOf(ch,i+1);
            if(index==-1){
                str5.append(ch);
            }
        }
        System.out.print(str5);
        System.out.println();

        //approach 3
        StringBuilder s2=new StringBuilder();
        char[] arr=str9.toCharArray();
        for(int i=0;i<arr.length;i++) {
            boolean repeated = false;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    repeated = true;
                    break;
                }
            }

            if (!repeated) {
                    s2.append(arr[i]);
            }
        }
        System.out.println(s2);
        System.out.println();

        //approach 4
        StringBuilder s3=new StringBuilder();
        Set<Character> set=new LinkedHashSet<>();
        for(int i=0;i<str9.length();i++){
            set.add(str9.charAt(i));
        }
        for(Character c:set){
            s3.append(c);
        }
        System.out.println(s3);

        System.out.println();

        //first non repeated element
        String st="beginning";
        Map<Character,Integer> map=new HashMap();
        for(int i=0;i<st.length();i++){
            char characters=st.charAt(i);
            if(map.containsKey(characters)){
                 map.put(characters,map.get(characters)+1);
            }
            else {
                map.put(characters, 1);
            }

        }
        System.out.println(map);
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            if(entry.getValue()==1){
                System.out.println(entry.getKey());
                break;
            }
        }





    }

}
