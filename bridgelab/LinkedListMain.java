package bridgelab;

public class LinkedListMain {

    public static void main(String[] args) {

        LinkedList<Integer> list1 = new LinkedList();
        list1.push(70);
        list1.push(30);
        list1.push(56);
        list1.insertMid(2,100);
        list1.show();

        System.out.println();
        LinkedList<Integer> list2 = new LinkedList<>();

        list2.add(56);
        list2.add(30);
        list2.add(70);
        list2.show();
        list2.popAtFirst();
        list2.popAtLast();
        list2.show();

        LinkedList<Integer> list3 = new LinkedList<>();
        System.out.println("Before Sorting ");
        list3.apendNode(56);
        list3.apendNode(30);
        list3.apendNode(70);
        list3.show();
        System.out.println("After Sorting ");
        list3.sortInAsceding();
        list3.show();

        if (list2.searchNode(30))
            System.out.println("Element Not found");
        else
            System.out.println("Element Found");
    }



}
