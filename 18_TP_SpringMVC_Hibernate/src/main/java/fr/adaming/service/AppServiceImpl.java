package fr.adaming.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.adaming.dao.IAppDao;
import fr.adaming.model.Apprenant;

@Service("apprenantServiceBean")
public class AppServiceImpl implements IAppService {
	


	

		@Autowired
		private IAppDao apprenantDAO;

		/**
		 * setter pour injection spring
		 * 
		 * @param apprenantDAO
		 */
		public void setApprenantDAO(IAppDao apprenantDAO) {
			this.apprenantDAO = apprenantDAO;
		}

		/**
		 * 
		 */
		@Override
		public void addApprenant(Apprenant apprenant) {
			apprenantDAO.addApprenant(apprenant);
		}

		/**
		 * 
		 */
		@Override
		public void updateApprenant(Apprenant apprenant) {
			apprenantDAO.updateApprenant(apprenant);
		}

		/**
		 * 
		 */
		@Override
		public void deleteApprenant(Apprenant apprenant) {
			apprenantDAO.deleteApprenant(apprenant);
		}

		/**
		 * 
		 */
		@Override
		public Apprenant getApprenantById(int idApprenant) {
			
			return apprenantDAO.getApprenantById(idApprenant);
		}

		/**
		 * 
		 */
		@Override
		public List<Apprenant> getAllApprenants() {
			return apprenantDAO.getAllApprenants();
		}

	}



