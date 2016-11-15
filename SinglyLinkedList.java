/*
 *
 */
package linkedlist;

/**
 *
 * @author Your Name <Ben>
 */
public class SinglyLinkedList<E> {

        private int size=0;//keeps track of the size of the list
    
    /**
     * Node<E> getNext() setNext(Node<E> n) E getElement()
     *
     * @param <E>
     */
    private static class Node<E> {

        private E element; //element 
        private Node<E> next;

        public Node(E e, Node<E> n) {
            element = e;
            next = n;
        }//multi arg constructor to set the default settings

        public Node<E> getNext() {
            return next;
        }//the next Node that this one is connected to

        public void setNext(Node<E> n) {
            next = n;
        }//changes the reference to the next Node

        public E getElement() {
            return element;
        }//gives the element of the Node
    }//end nested class Node

    public SinglyLinkedList() {
        //this is to stop the JVM from complaining about no constructor
    }//end no arg constructor
    
    private Node<E>head=null;
    private Node<E>tail=null;


    public int size(){
        return size;
    }
    
    public boolean isEmpty(){
        return size==0;
    }
    /**
     * 
     * @param E e 
     */
    public void addFirst(E e){
        head=new Node<>(e, head);//creates a reference to itself
        if(size==0){//minimizes chances of being adversely effected by other methods
            tail=head;//for linkedlists with only one element
        }//end if statement
        size++;//puts this in the end to show that the task is complete
        
    }//end addFirst
    
    public void addLast(E e){
        Node<E>newest=new Node<>(e,null);//create a new node for the
        /*modifying the NODES*/
        if(size==0){
            head=newest;//if there is
        }//makes sure that there is an element inside the list
        else{
            tail.setNext(newest);//the only way you can interact with the nodes
        }//actually adding an element into the end
        
        /*Modifying the LIST*/
        tail=newest;//tells the LIST that there is a new tail.
        size++;//telling the list that there is a new element
        
    }//end addLast
    
    public String toString(){
        StringBuilder str=new StringBuilder("This SinglyLinkedList has:\n");//StringBuilder is much more efficient than string concatenation
        Node<E> place = head;//create a pointer for the iteration through the list
        //note: this is a pointer to the pointer to the element of the head.
        while(place!=null){//as soon as it gets to null, this loop won't run
            str.append(place.getElement());//output the element of the Node
            str.append("\n");//makes it as a vertical list for user visibility
            
            place = place.getNext();//our makeshift way to iterate through the list
        }//loop through the linkedlist
        
        return str.toString();//return the string version of StringBuilder
    }//toString to see what's inside the LinkedList
    
    
}//end classSinglyLikedList
