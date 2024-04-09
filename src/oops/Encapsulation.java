package oops;

class Encap{
	private String Empname;
	private int id;
	public String getEmpname() {
		return Empname;
	}
	public void setEmpname(String empname) {
		Empname = empname;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
}

public class Encapsulation {

	public static void main(String[] args) {
		
		Encap em=new Encap();
		em.setEmpname("Arun");
		em.setId(1);
		System.out.println(em.getEmpname());
		System.out.println(em.getId());


		
	}

}
