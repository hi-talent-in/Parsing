# Parsing Bank Statemnt : Problem Statment 
Parsing the bank statement pdf included in the repository

Under src/code.java we extract all the "Text" from the uploaded PDF files.

You need to indentify and Assign the all imporatant field from the text and create object of AccountDetails and populate it. Than using object.ToString() metod print all the relavent information on console.

You can submit your solution by creating a fork from this repository.

public class AccountDetails
{

    public string Nickname {get; set;}
  
    public string AccountNumber {get; set;}
  
    ..... other property as required
  
    //This is just a sample example, u will need sothing more sophisticated method
    
    public string override ToString(){
  
      return Nickname +" "+ AccountNumber+ " ";

    }
  
}

# How to run the Project:

1.Clone the project into to your system.

2.Downlaod the eclipse version "2021-09" or latest version.

3.Import the project On the "Eclipse IDE JAVA"

4.(If the JDK is not set up into your system then first set the JDK.) to set path of JDK use "jdk latest version".

5.Then Run the "code.java" file.


