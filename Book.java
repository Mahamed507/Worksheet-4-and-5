/*Worksheet 4



Implement a Book class which has the following members:
Three private member variables: title (String), releaseYear (int), isNew (Boolean)
Public methods:
two constructors: one no-argument constructor and one overloaded constructor which takes three parameters in the following order: String, Boolean, int
a getter and setter for each private instance variables*/



public class Book {
    private String title;
    private int relaseYear;
    private boolean isNew;

    public Book(String title, boolean isNew, int relaseYear){
        this.title = title;
        this.isNew = isNew;
        this.relaseYear = relaseYear;

    }

    public Book(){
        this.title = title;
        this.isNew = isNew;
        this.relaseYear = relaseYear;

    }

    public void setTitle(String title){
        this.title = title;
    }
    public void setIsNew(boolean isNew){
        this.isNew = isNew;
    }
    public void setReleaseYear(int relaseYear){
        this.relaseYear = relaseYear;
    }
    public String getTitle(){
        return this.title;
    }
    public boolean getIsNew(){
        return this.isNew;
    }
    public int getRelaseyear(){
       return this.relaseYear;
    }

    public String toString(){
        return this.title +" "+this.relaseYear+ " "+this.isNew;
    }


}
