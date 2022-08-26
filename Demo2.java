//WAP to count the number of Vowels and Consonants of a String value.
public class Demo2 {

	public static void main(String[] args) {
String s1="America";
int vowelscount=0;
int consonantscount=0;
for(int i=0;i<s1.length();i++)
{
	char b=s1.charAt(i);
	if(b=='a'||b=='e'||b=='i'||b=='o'||b=='u'||b=='A'||b=='E'||b=='I'||b=='O'||b=='U')
	{
		vowelscount++;
	}
	else
	{
		consonantscount++;
	}
}
System.out.println("vowels count:"+" "+vowelscount);
System.out.println("consonants count:"+" "+consonantscount);

	}

}
