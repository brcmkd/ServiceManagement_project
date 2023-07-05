package testnew;

public class FakerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		for(int i=0;i<3;i++)
		{
			Faker faker=new Faker();
			String fname=faker.name().firstname();
			String lastname=faker.name().lastname();
			String phno=faker.phoneNumber().phoneNumber();
			String adres=faker.address().fullAddress();
			System.out.println("firstname"+fname);
			System.out.println("lastname"+lastname);
			System.out.println("phone"+phno);
			System.out.println("address"+adres);
			
		}
	}

}
