import java.util.*;
class StudArray
{
int sno;
String name;
double wt;

StudArray(int sno,String name,double wt)
{
this.sno = sno;
this.name=name;
this.wt = wt;
}

public String toString()
{
return sno+"\t"+name+"\t"+wt;
}
}

class SAMain
{
public static void main(String ...arg)
{
StudArray s[] = new StudArray[3];
s[0] = new StudArray(1,"Anu",33.0);
s[1] = new StudArray(2,"vino",35.4);
s[2] = new StudArray(3,"Yuva",36.8);
Double avg = Arrays.stream(s).mapToDouble(x -> x.wt).average().getAsDouble();
System.out.println(avg);
/*double sum = 0;
for(int i = 0; i<s.length;i++)
sum = sum + s[i].wt;
double avg = sum / s.length;
System.out.println(avg);
for(StudArray k:s)
System.out.println(k); */

}
}