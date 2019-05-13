package com.adaming.run;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.adaming.entities.Utilisateur;
import com.adaming.service.interfaces.ITacheService;
import com.adaming.service.interfaces.IUtilisateurService;
import com.adaming.service.interfaces.IAffaireService;
import com.adaming.service.interfaces.IPhaseService;
import com.adaming.service.interfaces.ITribunalService;

public class Main {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		SimpleDateFormat formater = null;
		formater = new SimpleDateFormat("dd-MM-yyyy");
		Date d1 = formater.parse("01-02-2019");
		Date d2 = formater.parse("09-04-2019");
		Date d3 = formater.parse("01-03-2018");
		Date d4 = formater.parse("09-04-2018");

		IUtilisateurService utilisateurService = (IUtilisateurService) context.getBean("utilisateurService");
		IAffaireService affaireService = (IAffaireService) context.getBean("affaireService");
		ITribunalService tribunalService = (ITribunalService) context.getBean("tribunalService");
		ITacheService tacheService = (ITacheService) context.getBean("tacheService");
		IPhaseService phaseService = (IPhaseService) context.getBean("phaseService");

		Utilisateur c1 = new Utilisateur("email", "gerda","tidada");

		Utilisateur c2 = new Utilisateur("je suis un email", "gerda","tidoudou");

		utilisateurService.create(c1);
		utilisateurService.create(c2);
		
		System.out.println("recherche par id");
		Utilisateur disp = utilisateurService.getById(Utilisateur.class, c1.getIdUtilisateur());
		System.out.println("Le utilisateur est :" + disp.getNom());
		System.out.println("recherche des utilisateurs");
		List<Utilisateur> utilisateurs = utilisateurService.find(Utilisateur.class);
		
		Utilisateur c3 = new Utilisateur(1l,"je suis un email", "gerda","oumpa oumpa");
		utilisateurService.update(c3);
		utilisateurService.delete(c3);

		
		
		
	}

}
