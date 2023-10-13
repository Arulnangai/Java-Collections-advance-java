import java.util.*;

class CollectionTreeSet
{
public static void main(String...arg)
{
TreeSet<Integer> ts = new TreeSet<>();
System.out.println("Is Empty ? : "+ts.isEmpty());
ts.add(5);
ts.add(8);
ts.add(8);
ts.add(6);
ts.add(9);
ts.add(9);
ts.add(4);
System.out.println("Removed 9? : "+ts.remove(9));


TreeSet<Integer> tss = new TreeSet<>();
tss.addAll(ts);
Iterator k = ts.descendingIterator();
while(k.hasNext())
System.out.println(k.next());
tss.higher(8);
System.out.println("Adding new Tresset ...!");
Iterator l = tss.iterator();
while(l.hasNext())
System.out.println(l.next());
//ts.clear();

System.out.println("Is Empty ? : "+ts.isEmpty());
System.out.println("Size of the array ? : "+ts.size());
System.out.println("Is Contains 8 ? : "+ts.contains(8));
System.out.println("Is Contains 2099 ? : "+ts.contains(2099));


TreeSet<Integer> c = (TreeSet<Integer>)tss.clone();

System.out.println("Cloning......!");
for(Integer kk : c)
System.out.println(kk);


}
}

/* Arraylist
linkedList
treeset */