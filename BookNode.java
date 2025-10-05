/*Implement the BookNode class. Objects of the BookNode class will hold Book objects. The BookNode class has the following members:
A private instance variable data of type Book
A private instance variable link of type BookNode
A constructor which takes two parameters of type Book and BookNode to initialize the private instance variables.
Public getter and setter methods for each private instance variable
A toString() method that returns the values of the private member variables separated by a tab.*/
public class BookNode {

    private Book data;
    private BookNode link;

    public BookNode(Book data, BookNode link){
        this.data = data;
        this.link = link;
    }

    public void setData(Book data){
        this.data = data;
    }
    public void setLink (BookNode link){
        this.link  = link;
    }
    public Book getData(){
        return this.data;
    }
    public BookNode getLink(){
        return this.link;
    }
    public String toString(){
        return this.link +" "+this.data;
    }
}
