package list;

public class Main {

    public static void main(String[] args) throws Exception {
        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(0, 300);
        arrayList.add(0, 200);
        arrayList.add(0, 100);
        arrayList.append(500);
        arrayList.append(600);
        arrayList.remove(3);
        arrayList.add(3, 250);
        arrayList.add(1, 50);
        arrayList.add(0, 10);
        arrayList.append(700);
        arrayList.remove(1);
        arrayList.removeItem(600);

        System.out.println(arrayList);

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(0, 300);
        linkedList.add(0, 200);
        linkedList.add(0, 100);
        linkedList.append(500);
        linkedList.append(600);
        linkedList.remove(3);
        linkedList.add(3, 250);
        linkedList.add(1, 50);
        linkedList.add(0, 10);
        linkedList.append(700);
        linkedList.remove(1);
        linkedList.removeItem(600);

        System.out.println(linkedList);

        CircularLinkedList<Integer> circularLinkedList = new CircularLinkedList<>();
        circularLinkedList.add(0, 300);
        circularLinkedList.remove(0);
//        circularLinkedList.add(0, 300);
//        circularLinkedList.add(0, 200);
//        circularLinkedList.add(0, 100);
//        circularLinkedList.append(500);
//        circularLinkedList.append(900);
//        circularLinkedList.remove(4);
//        circularLinkedList.add(3, 250);
//        circularLinkedList.add(1, 50);
//        circularLinkedList.add(0, 10);
//        circularLinkedList.append(700);
//        circularLinkedList.remove(1);
//        circularLinkedList.removeItem(600);

        System.out.println(circularLinkedList);

    }
}
