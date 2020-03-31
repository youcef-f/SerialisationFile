package serialisation;

import java.io.Serializable;
import java.util.Date;

public class Operation implements Serializable {
	
	private int numeroOperation;
	private transient Date dateOperation;
	private String numeroCompte;
	private String typeOperation;
	private double montant;

	public Operation() {
	}

	public Operation(int numOp, Date dateOp, String numC, String to, double mt) {
		this.numeroOperation = numOp;
		this.dateOperation = dateOp;
		this.numeroCompte = numC;
		this.typeOperation = to;
		this.montant = mt;
	}

	public int getNumeroOperation() {
		return numeroOperation;
	}

	public void setNumeroOperation(int numeroOperation) {
		this.numeroOperation = numeroOperation;
	}

	public Date getDateOperation() {
		return dateOperation;
	}

	public void setDateOperation(Date dateOperation) {
		this.dateOperation = dateOperation;
	}

	public String getNumeroCompte() {
		return numeroCompte;
	}

	public void setNumeroCompte(String numeroCompte) {
		this.numeroCompte = numeroCompte;
	}

	public String getTypeOperation() {
		return typeOperation;
	}

	public void setTypeOperation(String typeOperation) {
		this.typeOperation = typeOperation;
	}

	public double getMontant() {
		return montant;
	}

	public void setMontant(double montant) {
		this.montant = montant;
	}
	
	
// Getters et Setters
}