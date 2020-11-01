package it.zucchetti.interfacce;

public class Month implements Comparable<Month> {
	
	protected int number;
	protected String name;
	
	public Month() {}

	public Month(int number, String name) {
		super();
		this.number = number;
		this.name = name;
	}
	
	//--------------------------------
	
	@Override
	public int compareTo(Month o) {
		if(number == o.number) {
			return 0;
		}else if(number >o.number) {
			return 1;
		}else {
			return -1;
		}
		//return numero.compareTo(o.number)  posso utilizzare questo metodo se number è dichiarato come classe Integer
	}

}
