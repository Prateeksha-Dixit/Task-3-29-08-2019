package worldpay.training.task4;

public class PallindromeWithSB {
	
	public void checkPallindrome(StringBuffer sb) {
		
		if(sb.toString().equals(sb.reverse().toString()))
			System.out.println("Is Pallindrome");
		else
			System.out.println("Is not a Pallindrome");
		
	}

	public static void main(String[] args) {
		
		StringBuffer sb1=new StringBuffer("abcdcba");
		StringBuffer sb2=new StringBuffer("abcdecba");
		
		PallindromeWithSB psb=new PallindromeWithSB();
		psb.checkPallindrome(sb1);
		psb.checkPallindrome(sb2);
		
		
		
		
			
		
		

	}

}
