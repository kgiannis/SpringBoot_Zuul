package ykarav.tut.Zuul_Responder;

public class Person {

	public String name;
	public int afm;
	
	
	public Person() {}
	
	public Person(String name, int afm) {
		super();
		this.name = name;
		this.afm = afm;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAfm() {
		return afm;
	}

	public void setAfm(int afm) {
		this.afm = afm;
	}
	
}
