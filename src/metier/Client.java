package metier;

import java.util.ArrayList;
import java.util.List;

public class Client
{
	/** 
	 * Crée un client.
	 * @param nom le nom du client. 
	 */
	private String nom;
	private List<Facture> factureList = new ArrayList<Facture>();
	private List<Facture> factRegle = new ArrayList<Facture>();
	private static List<Client> nbClient = new ArrayList<Client>();

	public Client(String nom)
	{
		this.nom = nom;
		nbClient.add(this);
	}

	/**
	 * Retourne le nom du client.
	 * @return le nom du client.
	 */
	
	public String getNom()
	{
		return this.nom;
	}
	
	/**
	 * Modifie le nom du client.
	 * @param nom le nom du client.
	 */
	
	public void setNom(String nom)
	{
		this.nom = nom;
	}
	
	/**
	 * Créé une facture.
	 * @param montant Le montant de la facture.
	 * @return la facture créée.
	 */
	
	public Facture createFacture(int montant)
	{
		Facture facture = new Facture(montant);
		factureList.add(facture);
		return facture ;
	}
	
	
	
	/**
	 * Retourne la somme des montants des factures.
	 * @return la somme des montants des factures.
	 */
	
	public int sommeMontants()
	{
		int s = 0;
		for(Facture fact : factureList){
			s += fact.getMontant();
		}
		return s;
	}
	/**
	 * Retourne une copie de la liste des factures du client. 
	 * @return une copie de la liste des factures du client.
	 */

	 public List<Facture> getFactures()
	 {
		 List<Facture> test = new ArrayList<Facture>(); 
		 for(Facture fact : factureList){
			 test.add(fact);
		 }
		 return test;
	 }

	/**
	 * Créé une facture en précisant si elle est reglée.
	 * @param montant Le montant de la facture.
	 * @param reglée Vrai si la facture est reglée.
	 * @return la facture créée.
	 */
	
	public Facture createFacture(int montant, boolean reglee)
	{
		if(reglee){
			Facture factReglee = new Facture(montant, reglee);
			factRegle.add(factReglee);
			return factReglee;
		}
		else return null;

		
	}	
	
	/**
	 * Retourne la liste des factures reglées. 
	 * @return la liste des factures reglées.
	 */

	public List<Facture> facturesReglees()
	{
		return factRegle;
	}
	

	/**
	 * Retourne tous les clients créés.
	 * @return une copie de la liste de tous les clients.
	 */
	public static List<Client> tous()
	{
		List<Client> t = new ArrayList<Client>();
		for(Client z : nbClient){
			t.add(a);
		}
		return t;
	}
	
	/**
	 * Supprime le client.
	 */
	
	public void delete()
	{
		
		int a = tous().size();
		tous().remove(a-1);

	}
}
