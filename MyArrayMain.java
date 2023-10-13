import java.util.*;
class MyArray
{
void reverse(ArrayList<String> words)
{
Collections.reverse(words);
}

void capitalizePlurals(ArrayList<String> words)
{
for(int i =0 ; i <words.size();i++)
{
String k = words.get(i);
if(k.endsWith("s"))
words.set(i,k.toUpperCase());
}
}

void removePlurals(ArrayList<String> words)
{
for(int i =0 ; i <words.size();i++)
{
String k = words.get(i).toLowerCase();
if(k.endsWith("s"))
words.remove(i);
}
}

}

class MyArrayMain
{
public static void main(String...arg)
{
ArrayList<String> words = new ArrayList<>();
words.add("anu");
words.add("vino");
words.add("vishals");
words.add("rev");
words.add("muthus");
MyArray a = new MyArray();
System.out.println("Insertion order");
for(String kk : words)
System.out.println(kk);
System.out.println("Reverse Order");
a.reverse(words);
for(String kk : words)
System.out.println(kk);
/*
System.out.println("Capitalize order");
a.capitalizePlurals(words);
for(String kk : words)
System.out.println(kk);*/

System.out.println("Removing plurals");
a.removePlurals(words);
for(String kk : words)
System.out.println(kk);
}
}