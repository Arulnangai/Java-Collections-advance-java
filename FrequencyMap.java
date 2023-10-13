import java.util.*;

class Examplee
{
public static void main(String ...arg)
{
Integer a[] = {3,4,3,3,3,6,5,4,5,5,5,4,7,8,9,8,8,7,4,6,9};
HashMap<Integer,Integer> hm = new HashMap<>();

System.out.println("Using Get or Default .....");
for(Integer k : a)
hm.put(k,hm.getOrDefault(k,0)+1);
for(Map.Entry<Integer,Integer> f : hm.entrySet())
System.out.println(f.getKey()+"-->"+f.getValue());

System.out.println("Using Merge .....");
for(Integer k:a)
hm.merge(k,1,Integer::sum); //method reference 
for(Map.Entry<Integer,Integer> f : hm.entrySet())
System.out.println(f.getKey()+"-->"+f.getValue());
}
}