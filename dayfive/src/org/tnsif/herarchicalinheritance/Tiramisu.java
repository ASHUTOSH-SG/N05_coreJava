package org.tnsif.herarchicalinheritance;

public class Tiramisu extends Android {
	
	private int version;

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	@Override
	public String toString() {
		return "Tiramisu [version=" + version + ", toString()=" + super.toString() + "]";
	}

	public Tiramisu() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Tiramisu(String brandName, String slotType,int version) {
		super(brandName, slotType);
		this.version =version;
		
		// TODO Auto-generated constructor stub
	}

	
	
	
	

	
	
	
	
	
	
	

}
