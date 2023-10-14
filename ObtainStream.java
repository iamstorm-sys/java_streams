
import java.util.*;
import java.util.stream.*;

/**
 * ObtainStream
 */
public class ObtainStream {

    public static void main(String[] args) {

        ArrayList<Integer> mylist = new ArrayList<Integer>();

        mylist.add(22);
        mylist.add(33);
        mylist.add(222);
        mylist.add(122);
        mylist.add(220);
        mylist.add(212);

        Stream<Integer> myStream = mylist.stream();

        Optional<Integer> minVal = myStream.max(Integer::compare);

        if (minVal.isPresent())
            System.out.println(minVal.get());
        else
            System.out.println(minVal.orElse(-1));
    }
}