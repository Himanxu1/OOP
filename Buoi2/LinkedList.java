package linkedLists;

  public class LinkedList {
     Node head;
     static class Node {
	 int data;
	 Node next;
	 
	 Node(int d){
		 data = d;
		 next = null;
		 
	      }
 }
 
 public void print() {
	 Node n = head;
	 while(n != null) {
		 System.out.print(n.data + " ");
		 n = n.next;
		 
	 }
 }
