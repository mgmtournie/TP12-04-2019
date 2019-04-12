package fr.adaming.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import fr.adaming.model.Apprenant;

/**
 * 
 * @author INTI0261
 *
 */
@Repository
@Transactional
public class AppDaoImpl implements IAppDao {

	@Autowired // injection automatique
	private SessionFactory sessionFactory;

	/**
	 * setter pour injection spring
	 * 
	 * @param sessionFactory
	 */
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	/**
	 * 
	 */
	@Override
	@Transactional(readOnly = false)
	public void addApprenant(Apprenant apprenant) {

		Session session = sessionFactory.openSession();
		session.save(apprenant);
	
	}

	/**
	 * 
	 */
	@Override
	@Transactional
	public void updateApprenant(Apprenant apprenant) {
		
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(apprenant);
		
//		String hqlUpdate = " UPDATE Apprenant e SET e.fonction = :eFonction "
//				         + " WHERE id = :eID";
//		Query query = session.createQuery(hqlUpdate);
//		query.setParameter("eFonction", apprenant.getFonction());
//		query.setParameter("eID", apprenant.getId());
//		
//		int result = query.executeUpdate();
//		System.out.println("Nombre d'apploy�s MAJ : =================> " + result);
	}

	/**
	 * 
	 */
	@Override
	@Transactional
	public void deleteApprenant(Apprenant apprenant) {

		Session session = sessionFactory.openSession();
		
		String hqlDelete = "DELETE FROM Apprenant e WHERE e.id = :eID";
		
		Query query = session.createQuery(hqlDelete);
		query.setParameter("eID", apprenant.getId());
		
		int result = query.executeUpdate();
		
		System.out.println("Nombre d'apploy�s supprim�s : ======> " + result);
		
	}

	/**
	 * 
	 */
	@Override
	@Transactional(readOnly = true)
	public Apprenant getApprenantById(int idApprenant) {

		Session session = sessionFactory.openSession();
		String hqlReq = "FROM Apprenant WHERE id= :apprenantID";
		Query query = session.createQuery(hqlReq);
		query.setParameter("apprenantID", idApprenant);
		@SuppressWarnings("unchecked")
		List<Apprenant> appList = query.list();

		return appList.get(0);
	}

	/**
	 * 
	 */
	@Override
	@Transactional(readOnly = true)
	public List<Apprenant> getAllApprenants() {
	
		Session session = sessionFactory.openSession();
		//SELECT e.nom FROM Apprenant e 
		String hqlReq = "FROM Apprenant"; //ASC
		Query query = session.createQuery(hqlReq);

		@SuppressWarnings("unchecked")
		List<Apprenant> appList = query.list();
		
		return appList;
	}



}
