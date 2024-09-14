package interfaces.nested;



    public class B extends A{  //A.Nestedinterface
        boolean isOdd(int num){
            return (num & 1)==1;
        }
    }


