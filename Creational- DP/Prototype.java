import java.io.IOException;

interface PrototypeDemo {  
	public PrototypeDemo getClone();    
}

class EmployeeRecord implements PrototypeDemo {

    private int id;
    private String name, designation;
    private double salary;
    private String address;

    public EmployeeRecord(int id, String name, String designation, double salary, String address) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
        this.address = address;
    }

    public void showRecord() {
        System.out.println(id + "\t" + name + "\t" + designation + "\t" + salary + "\t" + address);
    }

    public PrototypeDemo getClone() {
        return new EmployeeRecord(id, name, designation, salary, address);
    }
}

public class Prototype {
    public static void main(String[] args) throws IOException {

        int eid=8;
        String ename="ravi";
        String edesignation="sde";
        String eaddress="maanapalle";
        double esalary= 20000.0;
        
        EmployeeRecord e1=new EmployeeRecord(eid,ename,edesignation,esalary,eaddress);

        e1.showRecord();
        System.out.println("-------------------------------------------");
        EmployeeRecord e2=(EmployeeRecord) e1.getClone();
        e2.showRecord();
    }
}
