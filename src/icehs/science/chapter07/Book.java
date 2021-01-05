package icehs.science.chapter07;
import icehs.science.chapter06.*;

public class Book {
	Account a = new Account();
	Car b = new Car();
	private String title;
	private int price;
	private String author;
	
	
	public String getTitle () {
		return this.title;
	}
	public void setTitle (String title) {
		this.title = title;
	}
	
	public int getPrice() {
		return this.price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getAuthor() {
		return this.author;
		
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Book() {
		
	}
	public Book(String title) {
		this.title = title;
	}
	
	public Book (String newTitle , int newPrice) {
		title = newTitle;
		price = newPrice;
	}
	
	public Book (String title , String author, int price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}
	void printBookInfo() {
		System.out.println(this.title);
		System.out.println(this.price);
	}

}
