import java.util.*;
class BookPrice implements Comparator<Book>
{
public int compare(Book a,Book b)
{
if((a.price.equals(b.price)) == false)
return a.price.compareTo(b.price);
else if( (a.author.equals(b.author)) == false)
return b.author.compareTo(a.author);
else 
return a.name.compareTo(b.name);
}
}

class Book implements Comparable<Book>
{
String name;
Integer price;
String author;
Double version;

Book(String name,Integer price,String author,Double version)
{
this.name=name;
this.price = price;
this.author = author;
this.version = version;
}

public String toString()
{
return name+"\t\t\t"+author+"\t\t\t"+price+"\t\t\t"+version;
}

public int compareTo(Book b)
{
return version.compareTo(b.version);
}
}

class BookMain
{
public static void main(String...arg)
{
Book b[] = new Book[10];
b[0] = new Book("Learn full C",2000,"Lakshma",3.0);
b[1] = new Book("Beginner in C++",2200,"Simran",2.1);
b[2] = new Book("Expert in Java",2500,"Reema",3.5);
b[3] = new Book("Python++",5000,"Anu",2.5);
b[4] = new Book("Adobe Campaign",2000,"Venkat",1.0);
b[5] = new Book("Java the king",2000,"Lakshma",5.0);
b[6] = new Book("Alive in Parad",2000,"Lakshma",2.1);
b[7] = new Book("Just being lazy",2000,"Reema",3.5);
b[8] = new Book("Be a robot ",500,"Anu",2.5);
b[9] = new Book("Soldiers Life ",2000,"Venkat",1.0);
ArrayList<Book> bal = new ArrayList<>();
for(int i=0;i<b.length;i++)
bal.add(b[i]);
bal.sort(new BookPrice()); //Implemented comparator class
/* bal.sort(new Comparator<Book>() // Anonymous inner class
{
public int compare(Book a,Book b)
{
return a.price.compareTo(b.price);
}});*/
//bal.sort((a,b) -> (a.price.compareTo(b.price)));//lambda expression
//Collections.sort(bal);
for(Book k : bal)
System.out.println(k);
}
}


/*10 records
sort -> price, 
author desc( if price is same)
name  wise Asce(if  author is same)*/


/* int,float,String 
comparable,comparator -> expression


user define -> patient , doc comparable , comparator 

array --> repeated elements -->find frequency 
*/
