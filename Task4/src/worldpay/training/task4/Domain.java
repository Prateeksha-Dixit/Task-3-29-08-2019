package worldpay.training.task4;

public class Domain {

	

	public void countDomainWiseAddresses(String[] emailAddresses) {
		
		int gmail=0, yahoo=0, rediffmail=0;

		for (String email : emailAddresses) {

			switch (email.split("@")[1]) {
			case "gmail.com":
				gmail++;
				break;
			case "yahoo.com":
				yahoo++;
				break;
			case "rediffmail.in":
				rediffmail++;
				break;

			}
		}
		System.out.println("Gmail adresses : " + gmail);
		System.out.println("Yahoo adresses : " + yahoo);
		System.out.println("Rediffmail adresses : " + rediffmail);

	}

	public static void main(String[] args) {

		Domain domain = new Domain();
		String[] emailAddresses = { "abc@gmail.com", "xyz@yahoo.com", "def@rediffmail.in","kbc@gmail.com" };
		domain.countDomainWiseAddresses(emailAddresses);
		

	}

}
