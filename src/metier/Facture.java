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

	public Facture(String nom , int montant , boolean relgee){
		super(nom);
		this.montant = montant ;
		this.reglee = reglee;


	}
	
	public Client getClient()
	{
		return null;
	}

	/**
	 * Retourne le montant de la facture.
	 * @return le montant de la facture.
	 */
	
	public int getMontant()
	{
		return 0;
	}

	/**
	 * Retourne vrai si la facture est reglée.
	 * @return vrai ssi la facture est reglée.
	 */
	
	public boolean estReglee()
	{
		return true;
	}

	/**
	 * Retourne la date de la facture.
	 * @return la date de la facture.
	 */
	
	public LocalDate getDate()
	{
		return null;
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
		return null;
	}
}