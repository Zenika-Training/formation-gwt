package com.zenika.resanet.gwt.server;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import junit.framework.Assert;
import junit.framework.TestCase;

import com.gargoylesoftware.htmlunit.CollectingAlertHandler;
import com.gargoylesoftware.htmlunit.FailingHttpStatusCodeException;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import com.gargoylesoftware.htmlunit.html.HtmlPasswordInput;
import com.gargoylesoftware.htmlunit.html.HtmlTextInput;

public class EcranLoginTest extends TestCase {

	public void testLogin() throws FailingHttpStatusCodeException,
			MalformedURLException, IOException {
		final WebClient webClient = new WebClient();

		final List<String> collectedAlerts = new ArrayList<String>();
		webClient.setAlertHandler(new CollectingAlertHandler(collectedAlerts));

		HtmlPage page = webClient
				.getPage("http://localhost:8080/Resanet-TP10/");

		webClient.waitForBackgroundJavaScript(5000);

		HtmlTextInput login = (HtmlTextInput) page.getElementById("login");
		login.setText("admin");
		HtmlPasswordInput password = (HtmlPasswordInput) page
				.getElementById("password");
		password.setText("admin");

		page.getElementById("submitButton").click();

		webClient.waitForBackgroundJavaScript(1000);
		
		final List<String> expectedAlerts = Collections
				.singletonList("Bienvenue admin");
		Assert.assertEquals(expectedAlerts, collectedAlerts);
	}
}
