import java.util.*;
class EvenArray
{
public static void main(String ...arg)
{
int a[] = {2,8,3,22,4,8,5,6,6,7,8,9};
ArrayList<Integer> al = new ArrayList<>();
for(Integer k : a)
if((k%2)== 0)
al.add(k);
//Collections.sort(al,Comparator.reverseOrder());
TreeSet<Integer> lhs = new TreeSet<>(al);
for(Integer k :lhs)
System.out.println(k);
}
}