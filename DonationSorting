This program has a set of data including the ID number of the donor ascending 
 *and the donation values descending.
 */

public class Assignment4 {
	public static void main(String[]args) throws IOException{
		PrintWriter output = new PrintWriter("assignment4.txt");
		int donorCount;
		double median = 0;
		int[] idNumbers = new int[50];
		double[] donations = new double[50];
		
		donorCount = readData(idNumbers, donations);
		output.println("Xiuwen Zhu\nAssignment#4\nApril 26, 2022\n"
				+"This program has a set of data including the ID number of the donor ascending "
				+ "and the donation values descending by calling the two methods sortID and sortDonations.");
		output.println("Original set");
		printData(idNumbers, donations, donorCount, output);
		sortID(idNumbers, donations, donorCount);
		output.println("Sorted by ID");
		printData(idNumbers, donations,donorCount, output);
		sortDonations(idNumbers, donations, donorCount);
		output.println("Sorted by donations");
		printData(idNumbers, donations,donorCount, output);
		output.print("The highest donation is $" + donations[0]);
		output.println(", And the donor ID is: " + idNumbers[0]);
		
		//statistic of the median
		if(donorCount%2 == 0)
			median = (donations[donorCount/2]+donations[donorCount/2+1])/2;
		else 
			median = (donations[donorCount/2]);
		output.println("The median of donations is $" + median);
		output.close();
	}
	
	public static int readData(int[]IDs, double[]donations) throws IOException {
		File myfile = new File("data4.txt");
		Scanner scnr  = new Scanner(myfile);
		int donorCount = 0;
		while(scnr.hasNext()) {
			IDs[donorCount] = scnr.nextInt();
			donations[donorCount] = scnr.nextDouble();
			donorCount++;
			
		}
		scnr.close();
		return donorCount;
	}
	
	/* * This printData method has four parameters that 
	 * prints the data into the output file when called in the main program.
	 */
	public static void printData(int[]IDs, double[]donations, int donorCount, PrintWriter output) {
		output.println("ID numbers\tdonations");
		for(int i=0; i<donorCount; i++) {
			output.printf(IDs[i] + "\t\t$%.2f",donations[i]);
			output.println();
		}
		output.println();	
	}
	
	/*This sortID method uses selection sort to sort the ID numbers when called in the main program.
	 */
	public static void sortID(int[]IDs, double[]donations, int donorCount) {
		for(int loc=0; loc<donorCount-1; loc++) {
			for(int cand=loc+1; cand<donorCount; cand++) {
				if(IDs[loc]>IDs[cand]) {
					int tempID = IDs[cand];
					IDs[cand] = IDs[loc];
					IDs[loc]  = tempID;
					double tempDonations = donations[cand];
					donations[cand] = donations[loc];
					donations[loc]  = tempDonations;
				}
			}
		}
	}
	
	/*This sortDonations method uses bubble sort to sort the donations when called in the main program.
	*/
	public static void sortDonations(int[]IDs, double[]donations, int count){
		boolean swapped = false;
		do {
			swapped = false;
			for(int loc=0; loc<count-1; loc++) {
				if(donations[loc]<donations[loc+1]) {
					double temp1 = donations[loc];
					donations[loc] = donations[loc+1];
					donations[loc+1] = temp1;
					int temp2 = IDs[loc];
					IDs[loc] = IDs[loc+1];
					IDs[loc+1] = temp2;
					swapped = true;
				}
			}
		}while(swapped);
	}
	
}
