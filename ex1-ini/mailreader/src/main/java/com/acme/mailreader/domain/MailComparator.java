package com.acme.mailreader.domain;

import java.util.Comparator;

/**
 * Comparateur de mails
 * 
 * Comme on désire afficher les mails les plus importants en premier, l'element le plus grand retourne une valeur négative
 *
 */
public class MailComparator implements Comparator<Mail> {
	
	public static final int EGAUX = 0;
	public static final int PREMIER_PLUS_PETIT = 1;
	public static final int PREMIER_PLUS_GRAND = -1;

	public int compare(Mail mail1, Mail mail2) {
		if (mail1 == null || mail2 == null) {
			return EGAUX;
		}
		
		if (mail1.isImportant() != mail2.isImportant()) {
			return comparaisonParImportance(mail1, mail2);
		}
		
		if (mail1.getStatut() != mail2.getStatut()) {
			return comparaisonParStatut(mail1, mail2);
		}
		
		if (mail1.getSujet() != mail2.getSujet()) {
			return mail2.getSujet().compareTo(mail1.getSujet());
		}
		return mail2.getDate().compareTo(mail1.getDate());
	}

	private int comparaisonParStatut(Mail mail1, Mail mail2) {
		int comp = mail1.getStatut().ordinal()
				- mail2.getStatut().ordinal();
		return comp > 0 ? PREMIER_PLUS_GRAND : PREMIER_PLUS_PETIT;
	}

	private int comparaisonParImportance(Mail mail1, Mail mail2) {
		if (mail1.isImportant() && !mail2.isImportant()) {
			return PREMIER_PLUS_GRAND;
		} else {
			return PREMIER_PLUS_PETIT;
		}
	}
	

}
