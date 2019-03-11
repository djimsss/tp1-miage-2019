package com.acme.mailreader.presentation;

import com.acme.mailreader.service.MailService;
import com.google.inject.Inject;

public class CommandLineInterpretor {

	private MailService serviceMail;
	
	public CommandLineInterpretor(MailService serviceMail) {
		super();
	}
}
