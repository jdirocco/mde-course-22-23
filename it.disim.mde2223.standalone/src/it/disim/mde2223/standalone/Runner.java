package it.disim.mde2223.standalone;

public class Runner {

	
	public static void main (String [] args) throws Exception {
		StringBuilder sb = new StringBuilder();
		sb.append("hello ");
		if(args.length>0)
			sb.append(args[0]).append("!");
		else throw new Exception();
		System.out.println(sb.toString());
	}

}
