package polymorphism;

public class Numbers {
    int sum(int a,int b){
        return a+b;
    }
    double sum(double a,int b){   //automatic casting done
        return a+b;
    }
    int sum(int a,int b,int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        Numbers n=new Numbers();
        n.sum(4,6);
        n.sum(2, 23, 2);
    }
}
