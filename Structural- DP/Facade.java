import java.util.Scanner;

interface MobileShop {	
	public void modelNo();
	
	public void price();
}

class Samsung implements MobileShop {

	public void modelNo() {
		System.out.println(" Samsung galaxy tab 3 ");
	}

	public void price() {
		 System.out.println(" Rs 15000.00 ");	
	}
}

class Mi implements MobileShop {

	public void modelNo() {
		System.out.println(" Mi 10 ");	
	}

	public void price() {
	   System.out.println(" Rs 20000.00 ");
	}
}

class ShopKeeper {
    private MobileShop mi;
    private MobileShop samsung;

    public ShopKeeper() {
        mi = new Mi();
        samsung = new Samsung();
    }

    public void miSale() {
        mi.modelNo();
        mi.price();
    }

    public void samsungSale() {
        samsung.modelNo();
        samsung.price();
    }
}

public class Facade {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String mobile = sc.next();
        sc.close();
        ShopKeeper sk=new ShopKeeper();
        if(mobile.equalsIgnoreCase("Mi")){
            sk.miSale();
        }
        else if(mobile.equalsIgnoreCase("Samsung")){
            sk.samsungSale();
        }
        else{
            System.out.println("Nothing You purchased");
        }
    }
}
