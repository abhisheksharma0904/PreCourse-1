import java.io.*; 
  
// Java program to implement 
// a Singly Linked List 
public class LinkedListImp { 
  
    static Node head; // head of list 
    static int size;
    // Linked list Node. 
    // This inner class is made static 
    // so that main() can access it 
    static class Node { 
  
        int data; 
        Node next; 
        
        // Constructor 
        Node(int d) 
        { 
            data = d;
            //Write your code here 
        } 
    } 
  
    // Method to insert a new node 
    public static LinkedListImp insert(LinkedListImp list, int data) 
    { 
        // Create a new node with given data 
          Node newNode = new Node(data);
        // If the Linked List is empty, 
          if(size == 0){
              head = newNode;
          }
        // then make the new node as head 
        
            // Else traverse till the last node 
            // and insert the new_node there 
 
        else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
            // Insert the new_node at last node 
        // Return the list by head 
        size++;
        return list;
    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedListImp list) 
    {  
        // Traverse through the LinkedList 
           Node temp = head;
            while(temp != null){
                //
                System.out.println(temp.data);
                temp = temp.next;
            }
            
            // Print the data at current node 
            
            // Go to next node 
    } 
    
    public static void remove(LinkedListImp list, int x) 
    {  
        // Traverse through the LinkedList 
           Node temp = head;
           while(temp.next != null){
                //            
                if(temp.next.data == x){
                    temp.next = temp.next.next;
                    
                }
                temp = temp.next;
            }
            
            // Print the data at current node 
            
            // Go to next node 
    } 
    
    public static Node find(LinkedListImp list, int x) 
    {  
        // Traverse through the LinkedList 
           Node temp = head;
           while(temp != null){
                //            
                if(temp.data == x){
                    return temp;
                    
                }
                temp = temp.next;
            }
            
            // Print the data at current node 
            return temp;
            // Go to next node 
    } 
   
    // Driver code 
    public static void main(String[] args) 
    { 
        /* Start with the empty list. */
        LinkedListImp list = new LinkedListImp(); 
  
        // 
        // ******INSERTION****** 
        // 
  
        // Insert the values 
        list = insert(list, 1); 
        list = insert(list, 2); 
        list = insert(list, 3); 
        list = insert(list, 4); 
        list = insert(list, 5); 
  
        // Print the LinkedList 
       
        remove(list, 3);
         printList(list); 
       
    } 
}
