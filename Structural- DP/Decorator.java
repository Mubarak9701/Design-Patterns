public class Decorator {
	
	public Decorator(){
		
	}
	
	public String Picdescription(){
		return "This is a picture on the Drawing Board";
	}
	
	public static void main(String[] args){
		
		Decorator d1 = new Decorator();
		
		d1 = new DrawHouse(d1);
		
		d1 = new DrawTree(d1);
		
		d1 = new DrawRiver(d1);
		
		System.out.println(d1.Picdescription());
	}

}

abstract class DecoratorAdapter extends Decorator{
	public abstract String Picdescription() ;
	
}
 
class DrawTree extends DecoratorAdapter{
    
	Decorator decorator;
	 
	public DrawTree(Decorator d){
		 decorator  = d;
	}
 
	public String Picdescription(){
		 return (decorator.Picdescription()  + " with a Mangoo Tree");
	}
 
}

class DrawHouse extends DecoratorAdapter{
    
	Decorator decorator;
	 
	public DrawHouse (Decorator d){
		 decorator  = d;
	}
 
	public String Picdescription(){
		 return (decorator.Picdescription()  + " of a small house");
	}
 
}

class DrawRiver extends DecoratorAdapter{
    Decorator decorator;
	 
	public DrawRiver (Decorator d){
		 decorator  = d;
	}
 
	public String Picdescription(){
		 return (decorator.Picdescription()  + " and flowing river.");
	}
}