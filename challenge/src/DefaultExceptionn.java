
public class DefaultExceptionn extends Exception{
	
	private static int accno[]= {101,1002,103,104};
	private static String name[]= {"om","neha","tim","boby"};
	private static double bal[]= {1000.00,12656600.00,1300.97,800.24};
	
	
	//constructor
	DefaultExceptionn(){
		
	}
	DefaultExceptionn(String str){
		super(str);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			System.out.println("accno"+"\t"+"name"+"\t"+"balance");
			for(int i=0;i<4;i++) {
				System.out.println(accno[i]+"\t"+name[i]+"/t"+ bal[i]);
			}
			if (bal[i]<1000) {
				
				DefaultExceptionn e=new DefaultExceptionn("balence is less than 1000 for account no"+accno[i]);
				
				throw e;
			}
			
		}
		catch(	DefaultExceptionn e){
			e.printStackTrace();
		}

	}

}
