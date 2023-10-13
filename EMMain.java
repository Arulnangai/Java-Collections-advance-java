import java.util.stream.*;
import java.util.*;

class Emp
{
int eno;
String name;
String city;
double salary;
String dept;

Emp(int eno,String name,String city,double salary,String dept)
{
this.eno = eno;
this.name= name;
this.city = city;
this.salary = salary;
this.dept = dept;
}

public String toString()
{
return eno+"\t"+name+"\t"+city+"\t"+salary+"\t"+dept;
}
}

class EMMain
{
public static void main(String ...arg)
{
Emp e[] = new Emp[5];
e[0] = new Emp(1001,"Anu","Thj",35000.0,"Associate");
e[1] = new Emp(1004,"Fathi","Chn",37500.0,"Jr.Associate");
e[2] = new Emp(1002,"Bhava","Trichy",42000.0,"Sr.Associate");
e[3] = new Emp(1005,"Harini","Thj",25000.0,"Trainee");
e[4] = new Emp(1003,"Cathe","Thj",35000.0,"Associate");


List<Emp> a =Arrays.asList(e);
//System.out.println(a);
/*
System.out.println("Created from Array..............");
Arrays.stream(e).forEach(System.out::println); //stream created for array
System.out.println("Created by List .............................");
a.stream().forEach(System.out::println); //stream created for list
a.stream().map(x -> x.salary).reduce((x,y) -> x+y).ifPresent(x -> System.out.println("Total Salary : "+x));
System.out.println("Total employees in city Thj : " +a.stream().filter(x -> (x.city.equalsIgnoreCase("THJ"))).count());*/
a.stream().sorted((x,y) -> x.name.compareTo(y.name)).forEach(System.out::println);
System.out.println("Salarywise descending order...........................");
//a.stream().sorted((f,g) -> Double.compare(g.salary,f.salary)).forEach(System.out::println);
a.stream().sorted(Comparator.comparingDouble(x -> x.salary)).forEach(System.out::println);
System.out.println("Printing last 2");
a.stream().skip(3).forEach(System.out::println);
System.out.println("Printing First 2");
a.stream().limit(2).forEach(System.out::println);
a.stream().max((f,g) -> Double.compare(f.salary,g.salary)).ifPresent(x -> (System.out.println("Finding Max salary Employee details " +x)));
a.stream().min(Comparator.comparingDouble(x -> x.salary)).ifPresent(x -> (System.out.println("Finding Min salary Employee details " +x)));
Stream.of(7,8,2,99,5,6,0,1).max(Comparator.comparingInt(x -> x)).ifPresent(System.out::println);
}
}
