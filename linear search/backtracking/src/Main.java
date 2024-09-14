import java.util.*;
public class Main {
    public static void main(String[] args) {
        System.out.println(count(3,3));
        path("",3,3);
        ArrayList<String> ans=path("",3,3);
        System.out.println(ans);
        boolean[][] maze={
                {true,true,true},{true,false,true},{true,true,true}
        };
        restrictionPath("",maze,0,0);
    }
    static int count(int r,int c){
        if(r==1 || c==1){
            return 1;
        }
        int left=count(r-1,c);
        int right=count(r,c-1);
        return left+right;
    }
    static ArrayList<String> path(String p,int r,int c){
        if(r==1 && c==1){
            ArrayList<String> list=new ArrayList<String>();
            list.add(p);
            return list;
        }
        ArrayList<String> list=new ArrayList<>();

        if(r>1 && c>1){
            list.addAll(path(p+"D",r-1,c-1));
        }
        if(r>1){
            list.addAll(path(p+"V",r-1,c));

        }
        if(c>1){
           list.addAll(path(p+"H",r,c-1));
        }
        return list;

    }
    static void restrictionPath(String p,boolean[][] maze,int r,int c){
        if(r==maze.length-1 && c==maze[0].length-1){
            System.out.println(p);
            return;

        }
        if(!maze[r][c]){
            return;
        }
        if(r<maze.length-1){
            restrictionPath(p+"D",maze,r+1,c);

        }
        if(c<maze[0].length-1){
            restrictionPath(p+"R",maze,r,c+1);
        }
    }
}