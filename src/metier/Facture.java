package metier;

import java.time.LocalDate;

public class Facture 
{
	/**
	 * Retourne le client à qui est adressée la facture..
	 * @return le client.
	 */
	private Client client;
	private int montant;
	private boolean reglee;
	private LocalDate date = LocalDate.now();




	public Facture(Client client , int montant , boolean reglee){
		if (montant > 0) this.montant = montant ;
		this.reglee = reglee;
		this.client =  client;
	}


	public Facture(Client client , int montant){
		if (montant > 0 ) this.montant = montant ;
		this.client = client;
	}
	
	public Client getClient()
	{
		return client;
	}

	/**
	 * Retourne le montant de la facture.
	 * @return le montant de la facture.
	 */
	
	public int getMontant()
	{
		return this.montant;
	}

	/**
	 * Retourne vrai si la facture est reglée.
	 * @return vrai ssi la facture est reglée.
	 */
	
	public boolean estReglee()
	{
		if (reglee == true) return true;
		else return false;
	
	}

	/**
	 * Retourne la date de la facture.
	 * @return la date de la facture.
	 */
	
	public LocalDate getDate()
	{
		return this.date;
	}

	/**
	 * Supprime la facture
	 */
	
	public void delete()
	{
		this.client.setfactureList(this);
	}
	
	/**
	 * Duplique la facture.
	 * @return une copie de la facture.
	 */
	
	public Facture copie()
	{
		Facture t = new Facture(client , this.montant,this.reglee);
		this.client.addListFact(t);
		return t;
		
	}
}