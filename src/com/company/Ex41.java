package com.company;

public class Ex41 {

    public static void main (String... args) {
      MyList myList = new MyList();

      myList.listRandomFill(10, 1, 10);

      myList.listDisplay();

        System.out.println("max element: " + myList.listFindmaxWithIterator());

    };

}
