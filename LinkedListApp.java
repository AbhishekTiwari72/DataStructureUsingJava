package DeleteLinkedListProgram;
class Node {
  Node next;
  int data;
}

class Linked {
	 /*
	   * It'll get size of linked list
	   */
	  public int getSizeOfList(Node node) {
	    if(node == null) {
	      return 0;
	    }
	    
	    return 1 + getSizeOfList(node.next);
	  }
	
	/*
	   * It'll delete front node of linked list
	   */
	public Node frontDelete(Node node)
	{
		if(node == null)
			return null;
	
		return node.next;
	}
	/*
	   * It'll delete at given position  node of linked list
	   */
	public Node deleteAtPosition(int position, Node node)
	{
		if(position < 0) {
		      System.out.println("Not a valid position");
		      return node;
		    }
		    
		    if(node == null && position > 0) {
		      System.out.println("Position not valid");
		      return node;
		    }
		    
		    if(position == 1) {
		      return node.next;
		    }
		    
		    node.next = deleteAtPosition(position - 1, node.next);
		    return node;	
	}

  /*
   * It'll delete last node of linked list
   */
  public Node delete(Node node) {
    if (node == null || node.next == null) {
      return null;
    }
    
    Node tmp = node;

    while(tmp.next.next != null) {
      tmp = tmp.next;
    }
    
    tmp.next = null;
    return node;
  }

  /*
   * getNewNode() method to generate a new node
   */
  public Node getNewNode(int key) {
    Node a = new Node();
    a.next = null;
    a.data = key;
    return a;
  }

  /*
   * insert method is used to insert the element in Linked List
   */
  public Node insert(int key, Node node) {

    if (node == null)
      return getNewNode(key);
    else
      node.next = insert(key, node.next);

    return node;
  }

  public void printList(Node node) {
    if (node == null) {
      return;
    }

    System.out.print(node.data + " ");
    printList(node.next);
  }
}

public class LinkedListApp {

  public static void main(String[] args) {

    Node root = null;
    Linked a = new Linked();

    root = a.insert(12, root);
    root = a.insert(99, root);
    root = a.insert(37, root);
    root = a.insert(50, root);
    root = a.insert(89, root);
    root = a.insert(97, root);
    a.printList(root);
    System.out.println();
    
    root=a.frontDelete(root);
    a.printList(root);
    System.out.println();
    root=a.deleteAtPosition(3, root);
    a.printList(root);
    System.out.println();
    root = a.delete(root);
    a.printList(root);
    System.out.println();
    int Size=a.getSizeOfList(root);
    System.out.println("Size of Linked List:-"+Size);
  }
}