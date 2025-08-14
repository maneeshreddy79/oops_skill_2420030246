package Skill_4;

public class Book {
private String title;
private String author;
private double price;
public void setTitle(String tle) {
	this.title=tle;
}
public void setAuthor(String atr) {
	this.author=atr;
}
public void setPrice(double prc) {
	this.price=prc;
}
public String getTitle() {
	return title;
}
public String getAuthor() {
	return author;
}
public double getPrice() {
	return price;
}
public String toString() {
	return "Book: \n" + "Title-"+title+"\n"+"Author- "+author+"\n"+"Price- "+price;
}
public static void main(String[] args) {
		// TODO Auto-generated method stub
	Book mybook=new Book();
	mybook.setTitle("Wings of Fire");
	mybook.setAuthor("Dr.A.P.J.Abdul Kalam");
	mybook.setPrice(300);
	System.out.println(mybook);
	}



}
