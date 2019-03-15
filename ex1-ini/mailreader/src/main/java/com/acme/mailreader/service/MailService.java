package com.acme.mailreader.service;

import com.acme.mailreader.domain.Mail;
import com.google.inject.Inject;

public class MailService {
	private MailSender sender;
	
	public MailService() {
		super();
	}

	public void envoyerMail(Mail mail) {
		sender.envoyerMail(mail);
	}
}
