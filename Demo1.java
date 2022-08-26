//2. WAP to reverse a sentence while preserving the position.
//Input : “Think Twice”
//Output : “kniht eciwt”
public class Demo1 {

	public static void main(String[] args) {
String s1="Think Twice";
String s2= "";
String s3="";
for(int i=s1.length()-1;i>=0;i--)
{
	s2=s2+s1.charAt(i);
}
String [] a=s2.split(" ");
for(int i=a.length-1;i>=0;i--)
{
	s3=s3+a[i]+" ";
}
System.out.println(s3);
	}
}
