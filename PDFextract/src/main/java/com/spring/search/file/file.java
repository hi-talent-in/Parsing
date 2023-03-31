package com.spring.search.file;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import org.apache.pdfbox.Loader;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;



public class file {
	
public static void main(String[] args) throws IOException {
	variables var=new variables();
try {

	File file = new File("R:\\New folder\\fareen 21.pdf");
//	PDDocument() Creates an empty PDF document.
	PDDocument doc1 = Loader.loadPDF(file);
	
//	This class will take a pdf document and strip out all of the 
//	text and ignore the formatting and such. 
	PDFTextStripper pdfStripper = new PDFTextStripper();
	String pdf = pdfStripper.getText(doc1);
	
	
//	String[] text = pdf.split("\\s");
	 
	
	Scanner sc =new Scanner(System.in);
	
	System.out.println("Enter a searching first text");
	String str =sc.nextLine();
	
	System.out.println("Enter a searching Second text");
	String str1 =sc.nextLine();
//	
	
	
	 String lines[] = pdf.split(System.getProperty("line.separator"));
	 
	 String accountHolderName=null;
     String nickName=null;
     String creditAccountNo=null;
     String remarks;
	 String debitAccountNo=null;
	 String date=null;
	 String amount=null;
     String paymentType=null;
	 String payVia=null;
	 
	 
	 
	 
	 
	 
	 
	 
     for (String ext : lines) {
     
    	//First text check
     	if(ext.contains(str)) {
     		
     		
     		if(str.contentEquals("Payee Name")) {
     			accountHolderName=ext.trim();
         		
    			var.setAccountHolderName(accountHolderName);
 		}

     		if(str.contentEquals("Nickname")) {
     				nickName=ext.trim();
             		
        			var.setNickName(nickName);
     		}
     		
     		if(str.contentEquals("Credit")) {
     			creditAccountNo=ext.trim();
         		
    			var.setCreditAccountNo(creditAccountNo);
 		}
     		
     		if(str.contentEquals("Remarks")) {
     			remarks=ext.trim();
         		
    			var.setRemarks(remarks);
 		}
     		

     		if(str.contentEquals("Debit")) {
     			debitAccountNo=ext.trim();
         		
    			var.setDebitAccountNo(debitAccountNo);
 		}
     		if(str.contentEquals("Date")) {
     			date=ext.trim();
         		
    			var.setDate(date);
 		}
     		if(str.contentEquals("Amount")) {
     			amount=ext.trim();
         		
    			var.setAmount(amount);
 		}
     		if(str.contentEquals("Payment Type")) {
     			paymentType=ext.trim();
         		
    			var.setPaymentType(paymentType);
 		}	
     		if(str.contentEquals("Pay via")) {
     			payVia=ext.trim();
         		
    			var.setPayVia(payVia);
 		}	
     		
     	}
     	
     	
     	//second text check
      if(ext.contains(str1)) {
     		
     		
     		if(str1.contentEquals("Payee Name")) {
     			accountHolderName=ext.trim();
         		
    			var.setAccountHolderName(accountHolderName);
 		}

     		if(str1.contentEquals("Nickname")) {
     				nickName=ext.trim();
             		
        			var.setNickName(nickName);
     		}
     		
     		if(str1.contentEquals("Credit")) {
     			creditAccountNo=ext.trim();
         		
    			var.setCreditAccountNo(creditAccountNo);
 		}
     		
     		if(str1.contentEquals("Remarks")) {
     			remarks=ext.trim();
         		
    			var.setRemarks(remarks);
 		}
     		

     		if(str1.contentEquals("Debit")) {
     			debitAccountNo=ext.trim();
         		
    			var.setDebitAccountNo(debitAccountNo);
 		}
     		if(str1.contentEquals("Date")) {
     			date=ext.trim();
         		
    			var.setDate(date);
 		}
     		if(str1.contentEquals("Amount")) {
     			amount=ext.trim();
         		
    			var.setAmount(amount);
 		}
     		if(str1.contentEquals("Payment Type")) {
     			paymentType=ext.trim();
         		
    			var.setPaymentType(paymentType);
 		}	
     		if(str1.contentEquals("Pay via")) {
     			payVia=ext.trim();
         		
    			var.setPayVia(payVia);
 		}	
     		
     	}
     	
     }
     System.out.println(var);
   
     
     
//	System.out.println(pdf);
	}catch(IOException e) {
		e.printStackTrace();
	}
}
}
