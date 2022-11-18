package it.disim.mde2223.idelecture.business;

public class Business {
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getValue () {
		StringBuilder sb = new StringBuilder();
		sb.append("hello ");
		sb.append(name);
		
		return sb.toString();
	}
	
	public static void main (String [] args) throws Exception {
		StringBuilder sb = new StringBuilder();
		sb.append("hello ");
		if(args.length>0)
			sb.append(args[0]).append("!");
		else throw new Exception();
		System.out.println(sb.toString());
	}

	public Business(String name) {
		super();
		this.name = name;
	}
	

}
