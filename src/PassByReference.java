import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PassByReference {

    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>(Arrays.asList(1,4,2,6,8,3,9));

        System.out.println("Original List before pass in MethodA = " + intList);
        methodA(intList); // Will not affect the original list
//        methodB(intList); // Will affect the original list
        System.out.println("Original List after pass in MethodA  = " + intList);
    }

    static void methodA(List<Integer> originalList){
        List<Integer> newList = new ArrayList<>(originalList);
        newList.add(12);
        newList.add(23);
    }

    static void methodB(List<Integer> originalList){
        List<Integer> list3 = originalList;
        list3.add(12);
        list3.add(23);
    }

}