package worldpay.training.task4;

public class WordCount {
	
	public void wordCount(String sentence )
	{
		int count=0,i=0;
		System.out.print("Occurences of word java : ");
		while(sentence.indexOf("java",i)!=-1)
		{
			i=sentence.indexOf("java",i)+1;
			System.out.print(i-1+" ");
			count++;
		}
		
		System.out.println("\nTotal occurences of java : "+count);
	}

	public static void main(String[] args)
	{
		WordCount wordCount=new WordCount();
		String sentence="this is java and java is object oriented and java is powerful. I love java language";
		wordCount.wordCount(sentence);
		
	}
}
