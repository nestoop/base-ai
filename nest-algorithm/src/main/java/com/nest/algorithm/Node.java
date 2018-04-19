package com.nest.algorithm;

/***
 * 单链表，现实
 * @author botter
 */
@SuppressWarnings("all Used")
public class Node {

     private Object data;

     private Node next;

     public Node() {
          this(null, null);
     }

     public Node(Object data, Node next) {
          this.data = data;
          this.next = next;
     }

     public Object getData() {
          return data;
     }

     public void setData(Object data) {
          this.data = data;
     }

     public Node getNext() {
          return next;
     }

     public void setNext(Node next) {
          this.next = next;
     }
}