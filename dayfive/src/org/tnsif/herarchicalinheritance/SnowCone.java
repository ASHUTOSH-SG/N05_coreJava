package org.tnsif.herarchicalinheritance;

public class SnowCone extends Android{
	
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

	public SnowCone() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SnowCone(String brandName, String slotType) {
		super(brandName, slotType);
		// TODO Auto-generated constructor stub
	}
	
	
	

	
	
	

}
