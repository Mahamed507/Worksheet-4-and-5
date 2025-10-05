/*Create a driver class named BookshelfDriver.*/
public class BookShelfDriver {
    public  static void main (String[] args){
        BookShelf myLibrary = new BookShelf();

        Book mineChoice1 = new Book("Love is ready", false, 2004);
        Book mineChoice2 = new Book("Basketball", false, 2016);

        myLibrary.insert(mineChoice1);
        myLibrary.insert(mineChoice2);

        System.out.println(myLibrary);






    }
}
