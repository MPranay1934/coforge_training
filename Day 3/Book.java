import java.util.Scanner;

public class Book {
   Scanner sc = new Scanner(System.in);
   
   private int bookid;
   private String title;
   private String author;
   private int price;
   
  

public Book(int bookid, String title, String author, int price) {
	super();
	this.sc = sc;
	this.bookid = bookid;
	this.title = title;
	this.author = author;
	this.price = price;
}






public void display() {
	   System.out.println(" Book id : " + bookid);
	   System.out.println(" Title : " + title);
	   System.out.println(" Author : " + author);
	   System.out.println(" Price : " + price);
   }
   
}
