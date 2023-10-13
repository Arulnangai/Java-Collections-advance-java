import java.util.*;
class EmployeeDept implements Comparator<Employee>
{
public int compare(Employee a,Employee b)
{
return a.dept.compareTo(b.dept);
}
}
class EmployeeSalary implements Comparator<Employee>
{
public int compare(Employee a,Employee b)
{
System.out.println("Anu...!");
return (a.salary).compareTo(b.salary);
}
}


class Employee
{
Integer eno;
String name;
String dept;
Double salary;
String designation;

Employee(Integer eno, String name, String dept, Double salary,String designation)
{
this.eno =eno;
this.name = name;
this.dept = dept;
this.salary = salary;
this.designation = designation;
}

public String toString()
{
return eno+"\t"+name+"\t"+dept+"\t"+salary+"\t"+designation;
}
}

class EmployeeMain
{
public static void main(String...arg)
{
Employee e[] = new Employee[6];
e[0] = new Employee(1001,"Anu","EEE",50000.0,"Assistant Professor");
e[1] = new Employee(1003,"Rev","Math",75000.0,"Professor");
e[2] = new Employee(1004,"Elango","ECE",90000.0,"Senior Professor");
e[3] = new Employee(1005,"Vishal","CSE",100000.0,"Assistant Professor");
e[4] = new Employee(1002,"Basket","EEE",120000.0,"Associate Professor  ");

ArrayList<Employee> al = new ArrayList<>();
for(int i=0;i<5;i++)
al.add(e[i]);
//al.sort(new EmployeeDept());
/*al.sort(new Comparator<Employee>()
{
public int compare(Employee a,Employee b)
{
return a.price.compareTo(b.price);
}
*/
//al.sort((a,b) -> (a.name.compareTo(b.name)));
for(Employee k : al)
System.out.println(k);

}
}