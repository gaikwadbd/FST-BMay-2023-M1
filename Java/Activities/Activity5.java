package activities;

public class Activity5 {

    public static void main(String []args) {
        //Initialize title of the book
        String booktitle = "Hover Car Racer";
        //Create object for MyBook
        Book myBook = new MyBook();
        //Set title
        myBook.setTitle(booktitle);

        //Print result
        System.out.println("The title is: " + myBook.getTitle());
    }
}
