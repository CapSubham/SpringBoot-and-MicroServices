package com.demo.spring.core;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.spring.core.beans.Invoice;

public class Main {

	public static void main(String[] args) {
		// Initialize the spring container

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("invoice-beans.xml");
		Invoice invoice = (Invoice) applicationContext.getBean("INV_1");
		System.out.println("Invoice Number	 : " + invoice.getInvoiceNo());
		System.out.println("Customer Name 	 : " + invoice.getCustomerName());

		System.out.println("------------------------------------------------------");
		System.out.println("Items Purchased  : \t\t\t Quantantity");
		System.out.println("------------------------------------------------------");

		Map<String, Integer> items = invoice.getItems();

		Set<String> itemName = items.keySet();
		for (String string : itemName) {
			Integer quantatity = items.get(string);

			System.out.println(string + "\t\t\t\t" + quantatity);
		}

	}

}
