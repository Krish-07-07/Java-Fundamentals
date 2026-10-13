import java.util.ArrayList;
import java.util.List;
import java.util.Collection;

public class Main{
    public static void main (String[] args){
       ArrayList<Integer> List= new ArrayList<>();
       List.add(10);
       List.add(18);
       List.add(19);
       System.out.println(List);

       List.remove(2);
       System.out.println(List);
       
       List<Integer> list2 = new ArrayList<>();
       list2.add(101);
       list2.add(102);
       list2.add(20);

       List.addAll(list2);
       System.out.println(List);
       List.removeAll(list2);
       System.out.println(List);

       System.out.println(List.size());

       System.out.println("print list2 : "+ list2);
       list2.clear();
       System.out.println(list2.size());

       Iterator<Integer> iterator = list.iterator();
       while(iterator.hasNext()){
        System.out.println("Element :"+iterator.next());
       }



    //    List<Integer> List = new ArrayList<>();
    //    Collection<Integer> Collection = new ArrayList<>();`
    }
}
