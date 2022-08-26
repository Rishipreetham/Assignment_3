//WAP to print repeatedly occurring characters in the given String.
public class Demo4 {

	public static void main(String[] args) {
String s="madamm";
char []a=s.toCharArray();
int count=0;
for(int i=0;i<s.length();i++)
{
	for(int j=i+1;j<s.length();j++)
	{
		if(a[i]==a[j]&&a[i]!=' ')
		{
			count++;
			a[j]='0';
		}
	}
	
	
	 if(count>=1&&a[i]!='0')
	{
		System.out.println(a[i]);
		
		count=0;
	}
	
}
}

	}


