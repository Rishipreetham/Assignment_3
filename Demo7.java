//WAP to sort a String Alphabetically.
public class Demo7 {

	public static void main(String[] args) {
String s1="helloworld";
char [] a=s1.toCharArray();

for(int i=0;i<a.length;i++)
{
	
	for(int j=i+1;j<a.length;j++)
	{
		int temp=0;
		
		if((a[j]<a[i]))
		{
			temp=a[j];
			a[j]=a[i];
			a[i]=(char)temp;
		}
	}
}
for(int i=0;i<a.length;i++)
{
	System.out.print(a[i]);
}
	}

}
