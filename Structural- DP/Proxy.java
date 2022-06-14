interface InternetAccess{
    public void grantAccess();
}

class RealInternetAccess implements InternetAccess{
    private String empname;
    public RealInternetAccess(String empname){
        this.empname=empname;
    }
    @Override
    public void grantAccess(){
        System.out.print("Internet Acess Granted for "+empname);
    }
}

class ProxyInternetAcess implements InternetAccess{
    private String empname;
    private RealInternetAccess access;
    public ProxyInternetAcess(String empname){
        this.empname=empname;
        this.access=new RealInternetAccess(empname);
    }
    @Override
    public void grantAccess(){
        
        System.out.println("granting access to "+this.empname);
        access.grantAccess();
    }
}
public class Proxy {
    InternetAccess ac;
    public  void grant(){
        ac=new ProxyInternetAcess("raju");
        ac.grantAccess();
    }
    
    public static void main(String[] args) {
        Proxy p = new Proxy();
        p.grant();
    }
}
