package enumExamples;

public class Basic {
    enum week implements greet{
        monday, tuesday, wednesday, thursday, friday, saturday, sunday;
        //these are enum constants
        //by default these are public,static and final
        //since its enums you can't create child enums.
        //type is week
        @Override
        public void hello(){
            System.out.println("hey how are you?");
        }

    week (){
        System.out.println("constructor called for " + this);
    }
    //this is not public or protected its default or private
        //why ?
        //don't want to create objects
        //internally public static final week monday=new week();

}

    public static void main(String[] args) {
        week w=week.monday;
        w.hello();
        System.out.println(week.valueOf("monday"));
       // System.out.println(w.ordinal());

        /*for(week day:week.values()){
            System.out.println(day);
        }*/
    }
}
