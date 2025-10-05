import java.util.LinkedList;
/*
Implement a Bookshelf collection class. This is a linked list collection of objects from the BookNode class. It has the following members
two private member variables: head (BookNode), numItems(int)
a no-argument constructor that initializes the list


Assuming that the bookshelf list is unsorted, write an insert() method for the Bookshelf class.
 This is a void method that takes a Book object as parameter.



 Declare an object of type Bookshelf inside the driver class named myLibrary and add two Book objects of your choice to mylibrary:

In the Bookshelf class, create a toString() method. This should return a string that includes the header “Current Book List” followed by the information about all the books in the linked list on the subsequent lines (you will need to call the toString() method of the Book class).

In the Bookshelf class, write insertSorted(), a sorted version of the insert() method you wrote in 6) above to make sure the book collection stays organized. We want the books to be listed from newest to oldest. Therefore, when adding a new book, we must compare the releaseYear of the new book with the releaseYear of existing books and insert it in the correct spot to maintain the sorted order. This way, whenever you look at the collection, you'll see the latest releases first in the linked list. Feel free to use or not use a helper method. When writing this method, you can assume that the linked list was sorted before this method is called.

Create a remove() method in the Bookshelf class. This is a void method. This method takes one input parameter of type Book. The method then searches the collection for the first object that equals the input object and deletes its occurrence if found. After the item has been deleted, the list must still be maintained in order.

Test it in the driver class to make sure that it maintains the order of the collection.*/
public class BookShelf extends Book {

    private BookNode head;
    private static int numItems;

    public BookShelf(){
        this.numItems = 0;
    }
//*note to self, struggled with this part
    public void insert(Book b){
 BookNode newNode = new BookNode(b,null);

 if(head == null){
     head = newNode;
 } else{
     newNode.setLink(head);
     head = newNode;
 }

 numItems++;



    }
// Stuggled with this mehtod *
    public String toString(){
        String result = "Current Book List...";

       BookNode current = head;
      while(current != null){
          result+= current.getData().toString()+ "\n";
          current = current.getLink();
      }
      return result;

    }
// has to be in order from(newest  -> oldest) using the data to determine that
public void insertSorted(Book b) {
    BookNode newNode = new BookNode(b, null);

    // case 1: empty list
    if (head == null) {
        head = newNode;
    }
    // case 2: insert at head (newest book is newer than or same year as head)
    else if (b.getRelaseyear() >= head.getData().getRelaseyear()) {
        newNode.setLink(head);
        head = newNode;
    }
    // case 3: insert somewhere in the middle or at the end
    else {
        BookNode current = head;
        while (current.getLink() != null &&
                current.getLink().getData().getRelaseyear() >= b.getRelaseyear()) {
            current = current.getLink();
        }
        // insert after current
        newNode.setLink(current.getLink());
        current.setLink(newNode);
    }

    numItems++;
}


    public void remove(Book target) {
        // case 1: empty list
        if (head == null) {
            return;
        }

        // case 2: target is at the head
        if (head.getData().equals(target)) {
            head = head.getLink();
            numItems--;
            return;
        }

        // case 3: target is somewhere else
        BookNode current = head;
        while (current.getLink() != null) {
            if (current.getLink().getData().equals(target)) {
                current.setLink(current.getLink().getLink()); // skip over the node
                numItems--;
                return;
            }
            current = current.getLink();
        }
    }











}
