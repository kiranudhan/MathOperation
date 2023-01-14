package math_operations;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.Function;

public class NumberPlayList {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();

        for(int i = 0; i < 5; i++){
            myList.add(i);
        }

        //Method 1: using iterator
        Iterator<Integer> itr = myList.iterator();
        while (itr.hasNext()){
            System.out.println("Iterator value :: " + itr.next());
        }

        //Method 2:Traversing with Consumer interface impl
        class MyConsumer implements Consumer<Integer>{
            @Override
            public void accept(Integer integer) {
                System.out.println("m2 : Consumer impl value :" + integer);
            }
        }
        MyConsumer action = new MyConsumer();
        myList.forEach(action);

        //Method 3:Traversing with Anonymous Consumer interface impl
        myList.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println("m3 : forEach anonymous class value :: " + integer );
            }
        });

        //Method 4: Explicit Lambda Function
        Consumer<Integer> myListAction = n -> {
            System.out.println("m4 : forEach Lambda impl value :: " + n);
        };
        myList.forEach(myListAction);

        //Method 5: Implicit Lambda Function
        myList.forEach(n->{
            System.out.println("M5 : forEach lambda impl value" + n);
        });

        //Method 6:Implicit Lambda Function to print double value
        Function<Integer, Double> doubleFunction = Integer::doubleValue;
        for (Integer n : myList) {
            System.out.println("m5 :forEach Lambda double value :: " + doubleFunction.apply(n));
        }

    }
}
