package worldpay.training.task4;

public class Pallindrome {
	
	public Boolean checkPallindromeWithoutSB(String s)
	{
		char[] ch=s.toCharArray();
		for(int i=0,j=s.length()-1;i<ch.length/2&j>ch.length/2;i++,j--)
		{
			System.out.println(ch[i]+" "+ch[j]);
			if(ch[i]!=ch[j])
				return false;
		}
		
		
		return true;
		
	}
	
	public static void main(String[] args)
	{
		Pallindrome pallindrome=new Pallindrome();
		String s="abcba";
		Boolean check=pallindrome.checkPallindromeWithoutSB(s);
		if(check)
			System.out.println("Pallindrome");
		else System.out.println("Not a Pallindrome");
	}

}
