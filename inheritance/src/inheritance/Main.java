package inheritance;

public class Main {

	public static void main(String[] args) {

		IndividualCustomer engin = new IndividualCustomer();
		engin.customerNumber = "12345";

		CorporateCustomer hepsiBurada = new CorporateCustomer();
		hepsiBurada.customerNumber = "6789";

		SyndicateCustomer abc = new SyndicateCustomer();
		abc.customerNumber = "99999";

		CustomerManager customerManager = new CustomerManager();
		/*
		 * customerManager.add(engin); customerManager.add(hepsiBurada);
		 */
		Customer[] customers = { engin, hepsiBurada, abc };

		customerManager.addMultiple(customers);
	}

}
