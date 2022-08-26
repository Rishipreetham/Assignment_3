//WAP to check if the String is Anagram or not.
public class Demo5 {

	public static void main(String[] args) {
String s1="sadders";
String s2="dreadds";
char []a=s1.toCharArray();
char []b=s2.toCharArray();
int count=0;
if(a.length!=b.length)
{
	System.out.println("not an anagram");
}
else
{
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<b.length;j++)
		{
			if(a[i]==b[j])
			{
			count++;
			b[j]=0;
			break;
			}
		}
		
	}

	if(count==s1.length())
	{
		System.out.println("anagram");
	}
	else
	{
		System.out.println("not an anagram");
	}
}
	}

}
