//WAP to check if the String is a Pangram or not.
public class Demo6 {

	public static void main(String[] args) {
boolean [] arr=new boolean[26];
boolean panagram=true;
String s="A quick brown fox jumps over the lazy dog";
int index=0;
for(int i=0;i<s.length();i++)
{
	if(s.charAt(i)>=65 && s.charAt(i)<=90)
	{
		index=s.charAt(i)-'A';
		arr[index]=true;
	}
	else if(s.charAt(i)>=97&&s.charAt(i)<=122)
	{
		index=s.charAt(i)-'a';
		arr[index]=true;

	}
	
	
}
for(int i=0;i<arr.length;i++)
{
	if(arr[i]==false)
	{
		
		panagram=false;
	}
	
	
}
if(panagram)
{
System.out.println("Panagram");
}
else
{
System.out.println("not a panagram");
}

	}

}
