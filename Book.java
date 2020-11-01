package day6_hcl_assgn;
import java.util.Comparator;
class BookSorterAsPerTitle implements Comparator<Book>{
	public int compare(Book o1,Book o2) {
		return o1.getTitle().compareTo(o2.getTitle());
	}
}

//using comparable we can define only one sort sequence
public class Book implements Comparable<Book> {
private int id;
private String title;
private double price;
private int pages;
public Book(int id, String title, double price, int pages) {
	
	this.id = id;
	this.title = title;
	this.price = price;
	this.pages = pages;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public int getPages() {
	return pages;
}
public void setPages(int pages) {
	this.pages = pages;
}
@Override
public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("Book [id=");
	builder.append(id);
	builder.append(", title=");
	builder.append(title);
	builder.append(", price=");
	builder.append(price);
	builder.append(", pages=");
	builder.append(pages);
	builder.append("]");
	return builder.toString();
}
@Override
public int compareTo(Book o) {
	// TODO Auto-generated method stub
	return Integer.compare(this.getId(), o.getId());
}




}
