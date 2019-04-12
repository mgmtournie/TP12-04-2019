package fr.adaming.dao;

import java.util.List;

import fr.adaming.model.Apprenant;

/**
 * 
 * @author INTI0261
 *
 */
public interface IAppDao {

	void addApprenant(Apprenant apprenant );

	void updateApprenant(Apprenant apprenant);

	void deleteApprenant(Apprenant apprenant);

	Apprenant getApprenantById(int idapprenant);

	List<Apprenant> getAllApprenants();

}
