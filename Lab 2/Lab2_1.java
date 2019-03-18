package lab2;
import java.util.*;

abstract class Item{
	 private int identification_Number;
	 private String title;
	 private int number_of_copies;
	 
	 abstract void print();
	 abstract void checkIn();
	 abstract void checkOut();
	 
	public Item(int identification_Number, String title, int number_of_copies) {
		super();
		this.identification_Number = identification_Number;
		this.title = title;
		this.number_of_copies = number_of_copies;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + identification_Number;
		result = prime * result + number_of_copies;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		if (identification_Number != other.identification_Number)
			return false;
		if (number_of_copies != other.number_of_copies)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}
	public int getIdentification_Number() {
		return identification_Number;
	}
	public void setIdentification_Number(int identification_Number) {
		this.identification_Number = identification_Number;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getNumber_of_copies() {
		return number_of_copies;
	}
	public void setNumber_of_copies(int number_of_copies) {
		this.number_of_copies = number_of_copies;
	}
}

abstract class WrittenItem extends Item{
	private String author;

	public WrittenItem(int identification_Number, String title, int number_of_copies, String author) {
		super(identification_Number, title, number_of_copies);
		this.author = author;
	}
	public String getAuthor() {
		return author;
	}

}

class Book extends WrittenItem{
	   public Book(int identification_Number, String title, int number_of_copies, String author) {
		super(identification_Number, title, number_of_copies, author);
	}
	   @Override
	   void print()
		 {
			System.out.println("identification_Number : "+getIdentification_Number());
			System.out.println("title : "+getTitle());
			System.out.println("number_of_copies : "+getNumber_of_copies());
			System.out.println("Author : "+getAuthor());
		
		 }
	   @Override
	   void checkIn()
	   {
		   Date d=new Date(2675439098L);
		   System.out.println(d);
	   }
	   @Override
	   void checkOut()
	   {
		   Date d=new Date(267543289098L);
		   System.out.println(d);
	   }
	
}

class JournalPaper extends WrittenItem{
	private String year;

	public JournalPaper(int identification_Number, String title, int number_of_copies, String author, String year) {
		super(identification_Number, title, number_of_copies, author);
		this.year = year;
	}
	   public String getYear() {
		        return year;
	     }
	   @Override
	   void print()
		 {
		   System.out.println("identification_Number : "+getIdentification_Number());
			System.out.println("title : "+getTitle());
			System.out.println("number_of_copies : "+getNumber_of_copies());
			System.out.println("Author : "+getAuthor());
			 
		 }
	   @Override
	   void checkIn()
	   {
		   Date d=new Date(2675439098L);
		   System.out.println(d); 
	   }
	   @Override
	   void checkOut()
	   {
		   Date d=new Date(267543289098L);
		   System.out.println(d); 
	   }
	
}
abstract class MediaItem extends Item{

	public MediaItem(int identification_Number, String title, int number_of_copies) {
		super(identification_Number, title, number_of_copies);
	}
	
}
class Video extends MediaItem{
	private String director;
	private String genre;
	private String year_released;
	
	
	
	public Video(int identification_Number, String title, int number_of_copies, String director, String genre,
			String year_released) {
		super(identification_Number, title, number_of_copies);
		this.director = director;
		this.genre = genre;
		this.year_released = year_released;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getYear_released() {
		return year_released;
	}
	public void setYear_released(String year_released) {
		this.year_released = year_released;
	}
	@Override
	void print() {
		 System.out.println("identification_Number : "+getIdentification_Number());
		 System.out.println("title : "+getTitle());
	 	 System.out.println("number_of_copies : "+getNumber_of_copies());
   		 System.out.println("Author : "+getDirector());
		 System.out.println("identification_Number : "+getGenre());
		 System.out.println("title : "+getYear_released());	
	}
	@Override
	void checkIn() {
		Date d=new Date(267543280099098L);
		   System.out.println(d); 	
	}
	@Override
	void checkOut() {
		Date d=new Date(2675438765289098L);
		   System.out.println(d); 	
	}
	
}
class CD extends MediaItem{
	private String artist, genre;
	
		
	public CD(int identification_Number, String title, int number_of_copies, String artist, String genre) {
		super(identification_Number, title, number_of_copies);
		this.artist = artist;
		this.genre = genre;
	}
	
    public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	@Override
	void print() {
		 System.out.println("identification_Number : "+getIdentification_Number());
		 System.out.println("title : "+getTitle());
	 	 System.out.println("number_of_copies : "+getNumber_of_copies());
  		 System.out.println("Author : "+getArtist());
		 System.out.println("identification_Number : "+getGenre());
		 
	}
	@Override
	void checkIn() {
		Date d=new Date(267543280099098L);
		   System.out.println(d); 	
	}
	@Override
	void checkOut() {
		Date d=new Date(2675438765289098L);
		   System.out.println(d); 	
	}
	
}

public class Lab2_1 {
	public static void main(String st[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter identification_Number");
		int id=sc.nextInt();
		
		System.out.println("Enter number_of_copies");
		int noc=sc.nextInt();
		
		sc.nextLine();
		System.out.println("Enter title");
		String title=sc.nextLine();
	
        System.out.println("Enter Author's name");
		String author=sc.nextLine();
	
		sc.close();
		
		System.out.println("******************************************Item Details*******************************************");
		WrittenItem wt=new Book(id,title,noc,author);
		wt.print();
		System.out.println("Check-In Time :");
		wt.checkIn();
		System.out.println("Check-Out Time :");
		wt.checkOut();
		
		System.out.println("******************************************CD Details*******************************************");
		MediaItem mi=new CD(id,title,noc,"Vishal","Love");
		mi.print();
		System.out.println("Check-In Time :");
		mi.checkIn();
		System.out.println("Check-Out Time :");
		mi.checkOut();
		
		System.out.println("******************************************Video Details*******************************************");
		MediaItem mi1=new Video(id,title,noc,"Vishal","Love","1997");
		mi1.print();
		System.out.println("Check-In Time :");
		mi1.checkIn();
		System.out.println("Check-Out Time :");
		mi1.checkOut();
		
		
	}

}
