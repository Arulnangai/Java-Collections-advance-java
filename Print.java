import java.util.stream.*;
import java.util.*;

class Print
{
public static void main(String ...arg)
{
String []a = {"anu","vino","is","of","for","rev","was","forty"};
String []b= new String[a.length];
int i=0;
for(String s : a)
{
if(s.length() >= 3)
{

System.out.println("Printing string greater than 3 " +s);
  s = s.toUpperCase();
System.out.println("Printing upper case "+s);
  b[i++]= s;
}
}
System.out.println("Printing b array .....!");
for(String l: b)
if(l != null)
System.out.println(l);

System.out.println("Below we crearted stream " );
List<String> k = Arrays.stream(a).filter(x -> (x.length() >= 3)).peek(x->System.out.println("Printing String greater than three "+ x)).map(x-> x.toUpperCase()).peek(System.out::println).collect(Collectors.toList());
System.out.println("Printing  Stream " );
for(String s: k)
System.out.println(s);

}
}