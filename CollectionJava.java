import java.util.*;

class CollectionJava
{
public static void main(String...arg)
{
LinkedHashSet<Double> lhs = new LinkedHashSet<>(25);
lhs.add(90000.78);
lhs.add(200.227);
lhs.add(90000.78);
lhs.add(300.89);
ArrayList<Double> al = new ArrayList<>(lhs);
al.add(4000.99);
al.add(678999.0);
al.add(289.9007);
al.add(4000.99);
al.add(289.9007);
System.out.println("Size: "+al.size());
//System.out.println("Capacity : "+al.size());
Iterator i = al.iterator();
while(i.hasNext())
System.out.println(i.next());
/*
System.out.println("Trimming.....!");
al.trimToSize();
al.ensureCapacity(8);
System.out.println("Size "+al.size());
System.out.println("Is Empty ? :" +al.isEmpty());
System.out.println("Is Contain 289.9007 ? : " + al.contains(289.9007));
System.out.println("Is Index of 289.9007 ? : " + al.indexOf(289.9007));
System.out.println("Is last Index of 289.9007 ? : " + al.lastIndexOf(289.9007)); */

ArrayList<Double> bl = (ArrayList<Double>)al.clone();

System.out.println("Cloning......!");

Iterator k = bl.iterator();
while(k.hasNext())
System.out.println(k.next());

/* 
System.out.println("To Array Casting....");
Object l[] = bl.toArray();
for(Object t : l)
System.out.println(t); 


System.out.println("Getting  data : "+bl.get(4)); 
bl.set(3,4.55);
System.out.println("Setting data : ");
Iterator f = bl.iterator();
while(f.hasNext())
System.out.println(f.next());
for(int ii =0;ii < bl.size();ii++)
System.out.println(ii +" - "+bl.get(ii)); */
bl.remove(5);
System.out.println("Removing data : ");
Iterator ff = bl.iterator();
while(ff.hasNext())
System.out.println(ff.next());
System.out.println("Is removed ? : "+bl.remove(289.9007));
}
}
