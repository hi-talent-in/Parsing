public class Code {

	public static void main(String[] args) throws IOException {


		File file = new File("himanshi dec 21.pdf");


		PDFParser parser =new PDFParser(new org.apache.pdfbox.io.RandomAccessFile(file, "r"));
		parser.parse();

		COSDocument cosdoc = parser.getDocument();
		PDDocument pddoc = new PDDocument(cosdoc);

		PDFTextStripper str = new PDFTextStripper();
		String data = str.getText(pddoc);
		System.out.println(data);

		String pname;
		String line;

		Scanner obj = new Scanner(data);
		AccountDetails ad = new AccountDetails();
		while(obj.hasNextLine()) {
			line = obj.nextLine();
			line.trim();
			if(line.startsWith("Payee Name")) {
				int i = line.lastIndexOf(':');
				ad.setPayeeName(line.substring(i+1).trim());
			}
			else if(line.startsWith("Nickname")) {
				int i = line.lastIndexOf(':');
				ad.setNickName(line.substring(i+1).trim());
			}
			else if(line.startsWith("Credit Account No")) {
				int i = line.lastIndexOf(':');

				try {
					String s = line.substring(i+1).trim();
					BigInteger num = new BigInteger(s);
					ad.setCreditAccNum(num);
				}
				catch (NumberFormatException ex){
		            ex.printStackTrace();
		        }
			}
			else if(line.startsWith("Remarks")) {
				int i = line.lastIndexOf(':');
				//System.out.println("**"+line.substring(i+1).trim()+"**");
				ad.setRemarks(line.substring(i+1).trim());
			}
			else if(line.startsWith("Debit Account")) {
				int i = line.lastIndexOf(':');

				try {
					String s = line.substring(i+1).trim();
					BigInteger num = new BigInteger(s);
					ad.setDebitAccNum(num);
				}
				catch (NumberFormatException ex){
		            ex.printStackTrace();
		        }
			}
			else if(line.startsWith("Date")) {
				int i = line.lastIndexOf(':');
				ad.setDate(line.substring(i+1).trim());
			}
			else if(line.startsWith("Amount")) {
				int i = line.lastIndexOf(':');
				String s = line.substring(i+1).trim();
				ad.setAmount(line.substring(i+1).trim());
			}
			else if(line.startsWith("Payment Type")) {
				int i = line.lastIndexOf(':');
				ad.setPaymentType(line.substring(i+1).trim());
			}
			else if(line.startsWith("Pay via")) {
				int i = line.lastIndexOf(':');
				//System.out.println(line.substring(i+1).trim());
				ad.setPayVia(line.substring(i+1).trim());
			}
		}
		System.out.println("Parsed Output :");
		System.out.println(ad.toString());


	}

	}
