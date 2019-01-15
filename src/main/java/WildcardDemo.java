//Java program to demonstrate Lower Bounded Wildcards 
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class WildcardDemo
{
    public static void main(String[] args)
    {
        //Lower Bounded Integer List
//		List<Integer> list1= Arrays.asList(4,5,6,7); 

        //Integer list object is being passed
//		printOnlyIntegerClassorSuperClass(list1); 

        //Number list
        List<Object> list2= new ArrayList(Arrays.asList(4.1,5.2,6,7));
        list2.add("hello");
        //Integer list object is being passed
        printOnlyIntegerClassorSuperClass(list2);
    }

    public static void printOnlyIntegerClassorSuperClass(List<? super Number> list)
    {
        list.add(10);
        System.out.println(list);
    }
} 
