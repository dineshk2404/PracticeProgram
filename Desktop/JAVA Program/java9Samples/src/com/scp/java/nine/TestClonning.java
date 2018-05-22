package com.demo.object.clonning;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

public class TestClonning {
	
	public static void main(String[] args) throws CloneNotSupportedException {
	   Book springOriginal = new Book(10,"Spring Framework",null);
	   Author rodJohson = new Author("Rob",1);
	   springOriginal.setAuthor(rodJohson);
	   
	   Book springClonnedOb = springOriginal.clone();

	   
	   /**
	    * == is nothing but ref equality -- check references -- address locations of 
	    * an objects
	    * 
	    * 
	    * equals -- if its from object class is equivalent to ==
	    * 
	    */
	   
	   Author originalAuthor = springOriginal.getAuthor();
	   Author duplicateAuthor = springClonnedOb.getAuthor();
	   
/*	   System.out.println(springOriginal == springClonnedOb);//False
	   System.out.println(springOriginal.equals(springClonnedOb));//false
	   
	   System.out.println(originalAuthor==duplicateAuthor);//true
	   System.out.println(originalAuthor.equals(duplicateAuthor));//true
	   
	   System.out.println(originalAuthor.getAuthorId()==duplicateAuthor.getAuthorId());
	   
	   
	  //O  -- Rob 1  -- XYZ 1000
	   //D -- Rob 1
	   
	   duplicateAuthor.setAuthorName("XYZ...");
	   duplicateAuthor.setAuthorId(1000);
	   
	   System.out.println(originalAuthor);
	   System.out.println(duplicateAuthor);
*/
	   System.out.println("##############Deep Clonning################");
	   
	   
	   //if you haven't overridden  equals in book and author object
	   System.out.println(springOriginal==springClonnedOb);//false
	   System.out.println(springOriginal.equals(springClonnedOb));//false
	   System.out.println(originalAuthor==duplicateAuthor); //False
	   System.out.println(originalAuthor.equals(duplicateAuthor));//False
	   
	   
	   //if you override equals in book and author object
	   System.out.println(springOriginal.equals(springClonnedOb));//true
	   System.out.println(originalAuthor.equals(duplicateAuthor));//true
	   
	   
	   System.out.println(originalAuthor.getStaticField()==duplicateAuthor.getStaticField());
	   
	}
}



/**
 * 
 * Shallow clonning -- outerobject chi copy banate
 * composite -- object asel tr original and duplicate objcet la same copy milel
 * 
 * Deep clonning -- outerobject chi copy banate
 * composite -- object asel tr original and duplicate objcet chi pn duplicate copy milel
 * but you need to write a code inside outerobject chya clone method madhe
 * 
 * 
 * String  -- if no modifications-- shallow if modified -- deep (immutablitity)
 * 
 * howtodoinjava.com -- object clonning
 * 
 * 
 * 
 * @author Yogymax
 *
 */





@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
@EqualsAndHashCode
class Book implements Cloneable{
	private int bookId;
	private String bookName;
	private Author author;
	
	@Override
	protected Book clone() throws CloneNotSupportedException {
		return (Book)super.clone(); //shallow clonning
/*		Book duplicateBook = (Book)super.clone();
		Author duplicateAuthor = duplicateBook.getAuthor().clone();;
		duplicateBook.setAuthor(duplicateAuthor);
		return duplicateBook;
*/		
	}
	
	
	
}

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
@EqualsAndHashCode
class Author implements Cloneable{
	private String authorName;
	private int authorId;
	static private int staticField;
	
	@Override
	protected Author clone() throws CloneNotSupportedException {
		return (Author)super.clone(); //shallow clonning
	}

	public static int getStaticField() {
		return staticField;
	}

	public static void setStaticField(int staticField) {
		Author.staticField = staticField;
	}

	
	
}

