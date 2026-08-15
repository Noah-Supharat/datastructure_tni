import java.util.Scanner;



public class SinglyApp {



    public static SinglyLinkedList list1 = new SinglyLinkedList();

    public static SinglyLinkedList list2 = new SinglyLinkedList();

    public static Scanner input = new Scanner(System.in);



    public static void main(String[] args) {



        System.out.println("Test method 'append()'\n----------------------");

        testAppend();



        System.out.println("\nTest method 'get()'\n-------------------");

        testGet();



        System.out.println("\nTest method 'set()'\n-------------------");

        testSet();



        System.out.println("\nTest method 'contains()'\n-----------------------");

        testContains();



        System.out.println("\nTest method 'addAll()'\n---------------------");

        testAddAll();



    }



    public static void testAppend() {

        list1.append(101);

        list1.append(102);

        list1.append(103);

        list1.append(104);

        list1.append(105);



        System.out.println("Current List => " + list1.displayList());

    }



    public static void testGet() {

        int i = 2;

        int j = 7;



        System.out.println("Get element index " + i + " = " + (list1.get(i) != null ? list1.get(i) : "No data"));

        System.out.println("Get element index " + j + " = " + (list1.get(j) != null ? list1.get(j) : "No data"));

    }



    public static void testSet() {

        list1.set(2, 111);

        System.out.println("Current List => " + list1.displayList());

        list1.set(7, 222);

        System.out.println("Current List => " + list1.displayList());

    }



    public static void testContains() {

        int find1 = 104;

        int find2 = 222;



        System.out.println(find1 + (list1.contains(find1) ? " found!!" : " not found..."));

        System.out.println(find2 + (list1.contains(find2) ? " found!!" : " not found..."));

    }



    public static void testAddAll() {

        System.out.println("Elements in list1 => " + list1.displayList());

        System.out.println("Elements in list2 => " + list2.displayList());

        list1.addAll(list2);

        System.out.println("Merge result => " + list1.displayList());



        list2.append(201);

        list2.append(202);

        list2.append(203);

        list2.append(204);

        list2.append(205);



        System.out.println();

        System.out.println("Elements in list1 => " + list1.displayList());

        System.out.println("Elements in list2 => " + list2.displayList());

        list1.addAll(list2);

        System.out.println("Merge result => " + list1.displayList());



        list1.clear();



        System.out.println();

        System.out.println("Elements in list1 => " + list1.displayList());

        System.out.println("Elements in list2 => " + list2.displayList());

        list1.addAll(list2);

        System.out.println("Merge result => " + list1.displayList());

    }



}

