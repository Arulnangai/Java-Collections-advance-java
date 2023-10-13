import java.util.*;

class Trying
{
public static void main(String ...arg)
{
Integer a[] = {3,4,-3,0,-6,5,2,-1};
ArrayList<Integer> al =new ArrayList<>();
for(Integer k : a)
if(k>0)
al.add(k);
Collections.sort(al,Comparator.reverseOrder());
for(Integer k :al)
System.out.println(k);
}
}

