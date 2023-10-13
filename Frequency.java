import java.util.*;
class Frequency
{
public static void main(String...arg)
{
ArrayList<Integer> al = new ArrayList<>();
al.add(10);
al.add(45);
al.add(10);
al.add(30);
al.add(20);
al.add(30);
al.add(20);
al.add(45);
al.add(30);
al.add(20);
al.add(30);
al.add(20);
al.add(10);
TreeSet<Integer> ts = new TreeSet<>(al);
for(Integer a : ts)
System.out.println("Frequency of "+a+" : "+Collections.frequency(al,a));
}
}

 