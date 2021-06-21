package com.company;

import java.util.Iterator;
import java.util.concurrent.ThreadLocalRandom;
import java.util.List;
import java.util.ArrayList;

public class MyList implements MyListMethods {

    List <Integer> list = new ArrayList<>();

    public void listRandomFill (int count, int minNumber, int maxNumber) {
        for (int i = 0; i < count; i++) {
            this.list.add(ThreadLocalRandom.current().nextInt(minNumber,maxNumber));
        }
    }

    public void listDisplay () {
        int listLength = this.list.size();
        System.out.println("Displaying list: ");
        for (Integer integer : this.list) {
            System.out.println(integer);
        }
    }

    public void listRemoveAllDuplicates () {
        int listLength = this.list.size();
        for (int i = 0; i < listLength - 1; i++) {

            listRemoveDuplicateElements(i);
            listLength = this.list.size();

        }

   };

    public void listRemoveDuplicateElements (int start) {
        int listLength = this.list.size();
        for (int i = listLength - 1; i > start; i--) {
            if (this.list.get(start).equals(this.list.get(i))) {
                this.list.remove(i);
            }
        };
    };

    public void listRemoveLessThan (int lessThan) {
        int listLength = this.list.size();
        for (int i = 0; i < listLength; i++) {
            if (this.list.get(i) < lessThan) {
                this.list.remove(i);
                listLength = this.list.size();
                i--;
            };
        };
        };

    public int listFindmaxWithIterator () throws IllegalArgumentException {
        int listLength = this.list.size();
        if (list.size() == 0) throw new IllegalArgumentException("listFindmaxWithIterator error: list is empty");
        int max = list.get(0);
        Iterator iter = list.iterator();
        int token = max;
        while (iter.hasNext()) {
            token = (int) iter.next();
            if (token > max) {
                max = token;
            }
        }
        return max;
    };

}
