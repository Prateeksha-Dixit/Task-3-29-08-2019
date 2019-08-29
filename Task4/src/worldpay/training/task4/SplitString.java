package worldpay.training.task4;

public class SplitString {

	public void separate(String s)
	{
		s+=",";
		int i=0,j=s.indexOf(",",i);
		do
		{
			System.out.println(s.substring(i, j));
			i=j+1;
			j=s.indexOf(",", i);
		}while(j!=-1);
	}
	
	public static void main(String[] args) {
		
		SplitString splitString=new SplitString();
		splitString.separate("India,Australia,England,Canada");
	}
	
}
