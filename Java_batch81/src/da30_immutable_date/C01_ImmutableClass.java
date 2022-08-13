package da30_immutable_date;



import java.util.ArrayList;
import java.util.List;


public class C01_ImmutableClass {
    public static void main(String[] args) {

        List<String>list=new ArrayList<>();

        list.add("Kenan");
        list.add("Enes");
        list.add("Ismail");
        System.out.println(list.remove(1));

        System.out.println(list);

        list.set(1,"Yasemen");
        System.out.println(list);


        list.remove("Ismail");
        System.out.println(list);
        System.out.println(list.remove("Kenan"));

        System.out.println(list);
    }






}
