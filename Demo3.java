//WAP to count number of special characters.
public class Demo3 {

	public static void main(String[] args) {
String s1="!@#$%./lkmj,'[]";
int count=0;
for(int i=0;i<s1.length();i++)
{
	int b=s1.charAt(i);
	if((b>=32 && b<=47)||(b>=58&&b<=64)||(b>=91&&b<=96)||(b>=123&&b<=126))
			{
		count++;
			}
}
System.out.println("total count of special characters are:"+" "+count);
	}

}
