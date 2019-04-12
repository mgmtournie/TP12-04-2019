package fr.adaming.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import fr.adaming.model.Apprenant;
import fr.adaming.service.IAppService;

/**
 * 
 * @author IN-LY-022
 *
 */
@Controller
@RequestMapping(value = "/apprenant")
public class ApprenantController {


		@Autowired
		private IAppService appService;

		/**
		 * 
		 * @return
		 */
		@RequestMapping(value ="/index", method = RequestMethod.GET)
		public String welcomeApprenant(ModelMap model) {

			model.addAttribute("name", "APPLICATION DE GESTION DES APPRENANTS");
			model.addAttribute("salutation", "Avec Spring MVC @Author IN-LY-022");

			// le nom logique de la vue
			return "home";
		}

		/**
		 * 
		 * @return
		 */
		@RequestMapping(value = "/listapprenants", method = RequestMethod.GET)
		public String listApprenants(ModelMap model) {

			List<Apprenant> liste = appService.getAllApprenants();
			
			model.addAttribute("apprenantList", liste);

			return "apprenants";
		}

		/**
		 * 
		 * @return
		 */
		@RequestMapping(value = "/addApprenant", method = RequestMethod.GET)
		public ModelAndView addApprenant() {

			String viewName = "addApprenant";

			return new ModelAndView(viewName, "apprenant", new Apprenant());
		}

		/**
		 * 
		 * @return
		 */
		@RequestMapping(value = "/insererApprenant", method = RequestMethod.POST)
		public String insererApprenant(@ModelAttribute("apprenant") Apprenant pApprenant, ModelMap model) {

			if (pApprenant.getId() == 0){
				// ajout de l'apprenant dans la bdd
				this.appService.addApprenant(pApprenant);
			}else{
				this.appService.updateApprenant(pApprenant);;
			
			}

			// recup la liste des amployes
			model.addAttribute("apprenantList", appService.getAllApprenants());

			return "apprenants";
		}

		/**
		 * @return
		 */
		@RequestMapping(value = "/deleteApprenant/{apprenantID}", method = RequestMethod.GET)
		public String supprimerApprenant(@PathVariable("apprenantID") int IdApprenant, ModelMap model) {
	/*une autre maniere pour les parametres de la requte:
		dans la vue : deleteApprenant?IdApprenant=${apprenante.id} et dans la methode on utilise le parametre avec le meme nom
	*/
			
			// suppression de l'apprenant de la bdd
			Apprenant appl = this.appService.getApprenantById(IdApprenant);
			this.appService.deleteApprenant(appl);

			// recup la liste des amployes
			model.addAttribute("apprenanteList", appService.getAllApprenants());

			return "apprenants";
		}
		
		
		@RequestMapping(value = "/editApprenant", method = RequestMethod.GET)
		public ModelAndView editerApprenant(int IdApprenant) {
			Apprenant appl = this.appService.getApprenantById(IdApprenant);
			String viewName = "addApprenant";
			return new ModelAndView(viewName, "apprenant", appl);
		}
		
}
