package serialisation;

import java.io.*;
import java.util.Date;

public class app {
	
	public static void main(String[] args) throws Exception {
		
		Operation op1 = new Operation(1, new Date(), "CC1", "V", 40000);
		Operation op2 = new Operation(2, new Date(), "CC1", "R", 6000);
		
	   // Creat in out Steam file banque.txt file
		File f = new File("banque.txt");
		FileOutputStream fos = new FileOutputStream(f);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		// write op1 et op2 in banque.txt file
		oos.writeObject(op1);
		oos.writeObject(op2);
		oos.close();
		
		
		
		
        f=new File("banque.txt");
		
        // Create in ou steam  banque.txt file
		FileInputStream fis=new FileInputStream(f);
		ObjectInputStream ois=new ObjectInputStream(fis);
		
		// read op1 ans op2 from file
		op1=(Operation) ois.readObject();
		op2=(Operation) ois.readObject();
		
		System.out.println("Num:"+op1.getNumeroOperation());
		System.out.println("Date:"+op1.getDateOperation());
		System.out.println("Compte:"+op1.getNumeroCompte());
		System.out.println("Type:"+op1.getTypeOperation());
		System.out.println("Montant:"+op1.getMontant());
		
	}
	
	
}