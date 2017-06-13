package com.ibm.account.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.cloudant.client.api.Database;
import com.cloudant.client.api.model.Response;

import java.util.List;
import java.util.ArrayList;
import java.io.*;

@Controller
public class AccountController {
	
	@Autowired
	Database account;
	
	@RequestMapping(path="/", method=RequestMethod.GET)
	public String allAccounts(Model listModel) {
		List<Account> allAccounts;
		List<String> accountNames = new ArrayList<String>();
		try{
			allAccounts = account.getAllDocsRequestBuilder().includeDocs(true).build()
                		.getResponse().getDocsAs(Account.class);
			listModel.addAttribute("allAccounts", allAccounts);
			for (int i=0; i<allAccounts.size(); i++){	
				accountNames.add(allAccounts.get(i).getName() + " - " + allAccounts.get(i).getId());
			}
			listModel.addAttribute("accountNames", accountNames);
		}catch(IOException ioe){
			System.out.println("Unable to find documents.");
		}
		
		return "allAccounts";
	}
}
