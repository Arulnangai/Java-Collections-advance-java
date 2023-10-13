import java.util.*;
class Stud{
Integer sno;
String name;
Double wt;
Stud(Integer sno,String name,Double wt)
{
this.sno = sno;
this.name = name;
this.wt = wt;
}
public String toString()
{
return sno+"\t"+name+"\t"+wt;
}
}

class StudMain
{
public static void main(String...arg)
{
Stud s[] = new Stud[5];
s[0] =  new Stud(1,"Anu",55.0);
s[1] =  new Stud(2,"Vijay",60.0);
s[2] =  new Stud(3,"Venkat",65.0);
s[3] =  new Stud(4,"Vino",56.0);
s[4] =  new Stud(5,"Vishal",59.0);
ArrayList<Stud> st =new ArrayList<>();
for(int i=0;i<5;i++)
st.add(s[i]);
Collections.sort(st);
for(Stud k : s)
System.out.println(k);

}
}