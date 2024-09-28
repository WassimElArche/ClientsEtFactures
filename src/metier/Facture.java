package metier;

import java.time.LocalDate;

public class Facture extends Client
{
	/**
	 * Retourne le client à qui est adressée la facture..
	 * @return le client.
	 */
	private int montant;
	private boolean reglee;
	private LocalDate date = LocalDate.now();


	public Facture(String nom ,int montant , boolean relgee){
		super(nom);
		this.montant = montant ;
		this.reglee = reglee;
	}

	public Facture(String nom , int montant){
		super(nom);
		this.montant = montant ;
	}
	
	public Client getClient()
	{
		return null ;
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
		
	}
	
	/**
	 * Duplique la facture.
	 * @return une copie de la facture.
	 */
	
	public Facture copie()
	{
		return new Facture(nom,this.montant,this.reglee);
	}
}