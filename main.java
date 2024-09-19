import java.io.*;
class main
{
public static void main(String args[])throws IOException
{
InputStreamReader re=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(re);
int rn,m1,m2,m3,m4,pm;
String name,g = null;
System.out.println("Enter Roll Number");
rn=Integer.parseInt(br.readLine());
System.out.println("Marks of Physics");
m1=Integer.parseInt(br.readLine());
System.out.println("Marks of Chemistry");
m2=Integer.parseInt(br.readLine());
System.out.println("Marks of Maths");
m3=Integer.parseInt(br.readLine());
System.out.println("Marks of Computer");
m4=Integer.parseInt(br.readLine());
System.out.println("Enter the Name");
name=br.readLine();
pm=(m1+m2+m3+m4)/4;
if (pm>=80)
{
g="DISTINCTION";
}
else if (pm>=60 && pm<80)
{
g="FIRST DIVISION";
}
else if (pm>=45 && pm<60)
{
g="SECOND DIVIVSION";
}
else if (pm>=40 && pm<45)
{
g="PASS";
}
else if (pm<40)
{
g="PROMOTION NOT GRANTED";
}
System.out.println("ROLL NUMBER \t NAME \t PERCENTAGE MARKS \t GRADES");
    System.out.print( rn+"           "+name+"   "+pm+"      "+g);
}
}
