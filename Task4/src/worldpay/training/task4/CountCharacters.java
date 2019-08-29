package worldpay.training.task4;

public class CountCharacters {
	
	
	
	public void count(String s) {
		
		int uppercase=0,lowercase=0,digit=0,specialChar=0;
		char[] character=s.toCharArray();
		for(char ch:character)
		{
			if(ch>='A' && ch<='Z')
			uppercase++;
			else if(ch>='a' && ch<='z')
				lowercase++;
			else if(ch>=48 && ch<=57)
				digit++;
			else
				specialChar++;
		}
		
		System.out.println("Uppercase "+uppercase+"\nLowercase"+lowercase+"\nDigit "+digit+"\nSpecial Characters "+specialChar);
	}
	
	public static void main(String[] args)
	{
		CountCharacters countCharacters=new CountCharacters();
		String string="hello user123, You can Mail me @ xyz4343@gmail.com with # tag java!";
		countCharacters.count(string);
	}

}
