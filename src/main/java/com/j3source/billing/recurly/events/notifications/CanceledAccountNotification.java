package com.j3source.billing.recurly.events.notifications;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.j3source.billing.recurly.events.models.AccountE;



@XmlRootElement(name = "canceled_account_notification")
public class CanceledAccountNotification{

	@XmlElement(name = "account")
	private AccountE account;

	public AccountE getAccount() {
		return account;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("CanceledAccountNotification{");
		sb.append(", account='").append(account.toString());
		sb.append('}');
		return sb.toString();
	}

}
