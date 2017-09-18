package com.objis.springinject.service;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;


import com.objis.springinject.domaine.Personne;


public class PersonneServiceImpl {

	

	public List<Personne> listePersonnes() {
		Personne p = new Personne(1, "KANE", "Amadou");
		Personne p2 = new Personne(2, "Dabo", "Ibrahima");
		Personne p3= new Personne(3, "SENE", "Ousseynou");
		
		List<Personne>	liste = new ArrayList<Personne>();
		liste.add(p);
		liste.add(p2);
		liste.add(p3);
		
		return liste;
	}

}
