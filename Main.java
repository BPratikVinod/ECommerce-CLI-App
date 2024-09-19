import java.util.*;

class Main {
    static Scanner sc = new Scanner(System.in);
    static String userName;
    static String phoneNumber;
    static String password;
    static String address;

    static ArrayList<String> cart = new ArrayList<>();
    static double totalBill;

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n ***** Welcome to the Ecommerce portal ***** ");
            System.out.println("\n1. Existing User");
            System.out.println("2. New User\n");
            System.out.println("Enter a choice: ");
            int ip = sc.nextInt();

            switch (ip) {
                case 1:
                    loginModule();
                    break;
                case 2:
                    signUpModule();
                    break;
                case 3:
                    System.out.println("\nThank you for shopping, Please visit again!");
                    System.exit(0);
                default:
                    System.out.println("\nPlease enter a valid option!");
                    break;
            }
        }
    }

    public static void loginModule() {
        System.out.println("\n ***** Login Module ***** ");

        if (userName != null) {
            for (int i = 0; i < 3; i++) {
                System.out.println("\nEnter the Username/phone number: ");
                sc.next();
                String userName1 = sc.nextLine();

                System.out.println("\nEnter the password: ");
                String password1 = sc.nextLine();

                if (userName.equals(userName1) || phoneNumber.equals(userName1) && password.equals(password1)) {
                    System.out.println("\nLogin Successful");
                    homeModule();
                    System.exit(0);
                } else {
                    System.out.println("Wrong credentials! Please try again");
                }
            }
            System.out.println("\nLogin limit exceeded!");
            System.exit(0);
        } else {
            System.out.println("\nCreate account first!");
        }
    }

    public static void signUpModule() {
        System.out.println("\n ***** SignUp Module ***** ");
        System.out.println("\nEnter the username: ");
        sc.next();
        userName = sc.nextLine();

        System.out.println("Enter the password: ");
        password = sc.nextLine();

        System.out.println("Enter the Phone Number: ");
        phoneNumber = sc.nextLine();

        System.out.println("Enter the Address: ");
        address = sc.nextLine();

        System.out.println("\nSignUp Successful!");
    }

    public static void homeModule() {
	while(true)
	{
		System.out.println("\n ***** Home Module ***** \n");
		System.out.println("Shop by categories");
		System.out.println("1. Clothing \n2. Electronics \n3. Footwear \n4. Cart \n5. Logout\n");
	        System.out.println("Enter an option: ");
		int ip = sc.nextInt();
		
		switch(ip){
		case 1:{
			clothingModule();
			break;
			}
		case 2:{
			electronicsModule();
			break;
			}
		case 3:{
			footwearModule();
			break;
			}
		case 4:{
			cartModule();
			break;
			}
		case 5:{
			System.exit(0);
			}
		default:{
			System.out.println("\nPlease enter a valid option!\n");
			break;
			}
		}
	}
    }
	
	public static void clothingModule()
	{
		System.out.println("\nClothing Products:");
		System.out.println("1. T-Shirt(101) \n2. Shirt(102) \n3. Jeans(103) \n4. Oversize(104) \n5. Trouser(105) \n6. Formal pant(106) \n7. Formal Shirt(107) \n0. HomePage(0)");

	
		while(true)
		{
			System.out.println("\nEnter the Product Number from above: ");
			int ip = sc.nextInt();
		
			switch(ip)
			{
			case 0:
			{
				return;
			}
			case 1:
			{
				cart.add("101 T-Shirt: 500");
				totalBill += 500;
				System.out.println("\nT-Shirt added to cart");
				break;
			}
			case 2:
			{
				cart.add("102 Shirt: 700");
				totalBill += 700;
				System.out.println("\nShirt added to cart");
				break;
			}
			case 3:
			{
				cart.add("103 Jeans: 800");
				totalBill += 800;
				System.out.println("\nJeans added to cart");
				break;
			}
			case 4:
			{
				cart.add("104 Oversize: 650");
				totalBill += 650;
				System.out.println("\nOversize added to cart");
				break;
			}
			case 5:
			{
				cart.add("105 Trouser: 550");
				totalBill += 550;
				System.out.println("\nTrouser added to cart");
				break;
			}
			case 6:
			{
				cart.add("106 Formal Pant: 850");
				totalBill += 850;
				System.out.println("\nFormal Pant added to cart");
				break;
			}
			case 7:
			{
				cart.add("106 Formal Shirt: 600");
				totalBill += 600;
				System.out.println("\nFormal Shirt added to cart");
				break;
			}
			default:
			{
				System.out.println("\nWrong choice, try again!");
				break;
			}
			}
		}
		
	}

	public static void electronicsModule()
	{
		System.out.println("\nElectronics:");
		System.out.println("1. TV(108) \n2. Laptop(109) \n3. Mobile Phone(110) \n4. Refridgerator(111) \n5. Washing Machine (112) \n6. Oven(113) \n0. HomePage(0)");


		while(true)
		{
			System.out.println("\nEnter the Product Number from above: ");
			int ip = sc.nextInt();
		
			switch(ip)
			{
			case 0:
			{
				return;
			}
			case 1:
			{
				cart.add("108 TV: 30000");
				totalBill += 30000;
				System.out.println("\nTV added to cart");
				break;
			}
			case 2:
			{
				cart.add("109 Laptop: 60000");
				totalBill += 60000;
				System.out.println("\nLaptop added to cart");
				break;
			}
			case 3:
			{
				cart.add("110 Mobile Phone: 25000");
				totalBill += 25000;
				System.out.println("\nMobile Phone added to cart");
				break;
			}
			case 4:
			{
				cart.add("111 Refridgerator: 30000");
				totalBill += 30000;
				System.out.println("\nRefridgerator added to cart");
				break;
			}
			case 5:
			{
				cart.add("112 Washing Machine: 24000");
				totalBill += 24000;
				System.out.println("\nWashing Machine added to cart");
				break;
			}
			case 6:
			{
				cart.add("113 Oven: 19000");
				totalBill += 19000;
				System.out.println("\nOven added to cart");
				break;
			}
			default:
			{
				System.out.println("\nWrong choice, try again!");
				break;
			}
			}
		}
	}

	public static void footwearModule()
	{
		System.out.println("\nFootwear:");
		System.out.println("1. Shoes(114) \n2. Sneakers(115) \n3. Chappals(116) \n4. Slippers(117) \n0. HomePage(0)");
		
		while(true)
		{
			System.out.println("\nEnter the Product Number from above: ");
			int ip = sc.nextInt();
		
			switch(ip)
			{
			case 0:
			{
				return;
			}
			case 1:
			{
				cart.add("114 Shoes: 3000");
				totalBill += 3000;
				System.out.println("\nShoes added to cart");
				break;
			}
			case 2:
			{
				cart.add("115 Sneakers: 1500");
				totalBill += 1500;
				System.out.println("\nSneakers added to cart");
				break;
			}
			case 3:
			{
				cart.add("116 Chappals: 900");
				totalBill += 900;
				System.out.println("\nChappals added to cart");
				break;
			}
			case 4:
			{
				cart.add("117 Slippers: 300");
				totalBill += 300;
				System.out.println("\nSlippers added to cart");
				break;
			}
			default:
			{
				System.out.println("\nWrong choice, try again!");
				break;
			}
			}
		}
	}

	public static void cartModule()
	{
		System.out.println("\n ***** Cart ***** \n");

		System.out.println("The items are: ");
		for(String item: cart)
		{
			System.out.println(item);
		}

		System.out.println("Total number of items in your cart are: " + cart.size());
		System.out.println("Your total bill is: " + totalBill + '\n');

		while(true)
		{
			System.out.println("Do you want to remove any of these items ?");
			String ip = sc.next();

			if("yes".equals(ip.toLowerCase()))
			{
				System.out.println("Enter the id of the product you want to remove: ");
				int id = sc.nextInt();
				removeItem(id);
			}
			else
			{
				System.out.println("\nYour final Bill is: " + totalBill);
				System.out.println("Proceed to checkout (true/false): ");
				boolean cnd = sc.nextBoolean();
				if(cnd)
				{
					System.out.println("\nThanks for shopping!");
					System.out.println("You will receive the order soon.");
				}
				return;
			}
		}
	}

	public static void removeItem(int id)
	{
		for(String parts : cart)
		{
			String[] temp = parts.split(" ");
			int itemId = Integer.parseInt(temp[0]);

			if(id == (int)itemId)
			{
				String priceStr = temp[temp.length - 1];
				double price = Double.parseDouble(priceStr);

				totalBill -= price;
				System.out.println("Item " + id + " removed");
				cart.remove(parts);
				break;				
			}
		}
	}
}
