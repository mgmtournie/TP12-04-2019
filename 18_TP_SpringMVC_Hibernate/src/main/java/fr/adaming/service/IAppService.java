package fr.adaming.service;

import java.util.List;

import fr.adaming.model.Apprenant;

public interface IAppService {

	void addApprenant(Apprenant apprenant);

	void updateApprenant(Apprenant apprenant);

	void deleteApprenant(Apprenant apprenant);

	Apprenant getApprenantById(int idApprenant);

	List<Apprenant> getAllApprenants();
}
