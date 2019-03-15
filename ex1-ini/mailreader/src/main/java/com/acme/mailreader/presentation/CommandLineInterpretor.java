package com.acme.mailreader.presentation;

import java.util.logging.Level;
import java.util.logging.Logger;

import com.acme.mailreader.domain.Mail;
import com.acme.mailreader.service.MailService;


public class CommandLineInterpretor {

	private MailService serviceMail;
	
	public CommandLineInterpretor() {
		super();
		MailService serviceMail = new MailService();
	}
	
	public void nouveauMail(String[] args){
		String sujet = args[1];
		Mail mail = new Mail.Builder(sujet).build();
		serviceMail.envoyerMail(mail);
	}
}
