import java.util.*;
class Stud
{
int sno;
String name;
double wt;

Stud(int sno,String name, double wt)
{
this.sno = sno;
this.name= name;
this.wt = wt;
}

public String toString()
{
return sno+"\t"+name+"\t"+wt;
}

}

class YearMap
{
public static void main(String arg[])
{
Stud s[] = new Stud[3];
s[0]= new Stud(2,"Bas",29.9);
s[1]=new Stud(1,"Anu",30.0);
s[2] = new Stud(3,"Daffni",28.54);
HashMap<Integer, Stud> hm = new HashMap<>();
for(int i =0; i <s.length;i++)
hm.put(s[i].sno,s[i]);
for(Map.Entry<Integer,Stud> k : hm.entrySet())
System.out.println(k.getKey()+"\t"+k.getValue());


}
}