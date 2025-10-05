/*Create a driver class named BookNodeDriver.*/
public class BookNodeDriver {
    public static void main(String[] args){

        Book myBook = new Book("How to catch a Dinosaur", true, 2019);
        Book yourBook = new Book("I am Enough", false, 2018);
        Book mineChoice1 = new Book("Love is ready", false, 2004);
        Book mineChoice2 = new Book("Basketball", false, 2016);

        BookNode nodeA = new BookNode(myBook, null);
        BookNode nodeB = new BookNode(yourBook, null);

        BookNode nodeC = new BookNode(mineChoice1,null);
        BookNode nodeD = new BookNode(mineChoice2,null);
    }
}
