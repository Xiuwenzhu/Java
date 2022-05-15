
public class PasswordValidation {
	
	public static void main(String[] args) throws Exception {		

		PrintWriter output = new PrintWriter("output5.txt");
		
		String[] passwords = new String[50];
		
		int count = readData(passwords);
		
		String password="";
		
		//print corresponding message
		for (int i = 0; i<count;i++) {
			password = passwords[i];
			if (isValid(password,count,output))
				output.print(passwords[i]+" \tThe password is valid.\n");
			else 
				output.print(passwords[i]+" \tThe password is invalid.\n");
		}
			
		output.println("Finished reading and processing all the data.");
		output.close();
		
	}
	

	//read data from the input file, and returns count to the main program to process more steps
	public static int readData(String[]passwords) throws Exception {
		File inputFile = new File("input5.txt");
		Scanner input = new Scanner(inputFile);
		int count = 0;
		while (input.hasNext()) {
				passwords[count] = input.nextLine().trim();
				count++;
		}
	
		input.close();

		return count;
	}
	

	/*testing if the password is valid by testing the conditions
	 */
	public static boolean isValid(String password, int count, PrintWriter output) {
		boolean hasDigit=false;
		boolean hasUppercase = false;
		boolean hasLowercase = false;
		boolean noSpace = true;
		boolean hasSpecial = false;
		boolean isValid = false;
		
		for(int i = 0; i<password.length();i++) {
			if(password.indexOf(" ") != -1)
				noSpace = false;
		}
		
		if(password.length()>=8) {
			for(int i = 0; i<password.length();i++) {
				char check = password.charAt(i);
				if(Character.isDigit(check)) 
					hasDigit= true;
					
				else if(Character.isUpperCase(check)) 
					hasUppercase = true;
					
				else if(Character.isLowerCase(check)) 
					hasLowercase = true;
				
				else if(check=='@'||check=='*'||check=='#'||check=='$'
||check=='%'||check=='?'||check=='!')
					hasSpecial = true;

			}
		}
		
		//check if the password meets all the conditions and return to the main program 
		if(hasDigit && hasUppercase && hasLowercase && noSpace && hasSpecial) {
			isValid = true;
			return isValid;
		}
		else {
			isValid = false;
			return isValid;
		
		}
	}
		
}
