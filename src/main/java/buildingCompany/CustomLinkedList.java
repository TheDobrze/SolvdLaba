package buildingCompany;

public class CustomLinkedList {

    Node head;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }

    }


    public static CustomLinkedList insert(CustomLinkedList list, int data) {

        Node new_node = new Node(data);
        new_node.next = null;

        if(list.head == null){
            list.head = new_node;
        }else{
            Node last = list.head;
            while (last.next!= null){
                last = last.next;
            }
            last.next = new_node;
        }
        return list;
    }

    public static void printList(CustomLinkedList list){
        Node currentNode = list.head;

        while (currentNode != null){
            System.out.print(currentNode.data+ " ");
            currentNode = currentNode.next;
        }
    }

    public static CustomLinkedList deleteKey(CustomLinkedList list, int kye){
        Node currNode = list.head, prev = null;

        if(currNode != null && currNode.data == kye){
            list.head = currNode.next;
        }

        return list;

    }

    public static CustomLinkedList deletePosition(CustomLinkedList list, int index){
        Node currNode = list.head,  prev = null;

        if(index ==0 && currNode != null){
            list.head = currNode.next;
            return  list;
        }

        int counter=0;

        while (currNode != null){
            if(counter == index){
                prev.next = currNode.next;
                break;
            }else {
                prev = currNode;
                currNode = currNode.next;
                counter++;

            }
        }
        return list;
    }
}