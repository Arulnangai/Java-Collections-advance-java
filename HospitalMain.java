import java.util.*;
class HospitalName implements Comparator<Hospital>
{
public int compare(Hospital a,Hospital b)
{
return a.patientName.compareTo(b.patientName);
}

}

class Hospital implements Comparable<Hospital>
{
String doctor;
String specialist;
String patientName;
String history;
String patientLocation;

Hospital(String patientName,String history,String patientLocation,String doctor, String specialist)
{
this.patientName = patientName;
this.history = history;
this.patientLocation = patientLocation;
this.doctor=doctor;
this.specialist = specialist;
}

public String toString()
{
return patientName+"\t\t\t"+history+"\t\t\t"+patientLocation+"\t\t\t"+"Dr."+doctor+"\t\t\t"+specialist;
}

public int compareTo(Hospital b)
{
return history.compareTo(b.history);
}
}

class HospitalMain
{
public static void main(String...arg)
{
Hospital h[] = new Hospital[7];
h[0] = new Hospital("Senthil M","Swollen feet,diabetes", "Thanjavur","Kannan","Diabetes");
h[1] = new Hospital("Sathyakala","Follow up for Pregnancy", "Mathoorthj","Kiruba","Gynecologist");
h[2] = new Hospital("Revathi A M","Check up for diabetes", "Thanjavur","Kannan","Diabetes");
h[3] = new Hospital("Ruran R A","Feverish, Cold, Caugh", "Ayyampet","Kiruba","Gynecologist");
h[4] = new Hospital("Anbarasi","Hand pain,diabetes", "Thanjavur","Devandran","Neurologist");
h[5] = new Hospital("Anju Shree","Swollen jaw, Teeth pain", "Thanjavur","Tamilmaran","Dentist");
h[6] = new Hospital("Kowsalya","Low blood pressure", "Thanjavur","Kiruba","Gynecologist");
ArrayList<Hospital> hspt = new ArrayList<>();
for(int i = 0; i < h.length; i++)
hspt.add(h[i]);
//Collections.sort(hspt);
//hspt.sort(new HospitalName());
hspt.sort(new Comparator<Hospital>()
{
public int compare(Hospital a, Hospital b)
{
if ((a.patientLocation.equals(b.patientLocation)) == false)
return a.patientLocation.compareTo(b.patientLocation);
else if((a.doctor.equals(b.doctor))==false)
return a.doctor.compareTo(b.doctor);
else
return a.patientName.compareTo(b.patientName);
}
}); 
//hspt.sort((a,b)-> a.patientName.compareTo(b.patientName));

for(Hospital k : hspt)
System.out.println(k);
}
}
