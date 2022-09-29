package com.entity;

import java.util.Scanner;
import com.Operations.PatientOperations;
public class AppMain {
	static Scanner scanner = new Scanner(System.in);

    public static void main( String[] args ){
    	try {
    		while(true){
                System.out.println("welcome to Hospital Management");
                System.out.println("Press 1 to Add patient");
    			System.out.println("Press 2 to Display patient");
    			System.out.println("Press 3 to upadte patient");
    			System.out.println("Press 4 to delete patient");
    			System.out.println("Press 5 to exit");
	    		int opt = scanner.nextInt();
	    		PatientOperations op = new PatientOperations();
	    		if(opt==1) {
	    		op.savePaitent();
	    		}
	    		else if(opt==2) {
	    			
	    		
	    			op.getPaitent();
	    		}
	    			
	    		else if(opt== 3) {
	    			int id = scanner.nextInt();
	    			System.out.println("Updating: "+id);
	    			op.updatePaitentFee(id);
	    		}
	    		else if(opt==4) {
	    			int idd = new Scanner(System.in).nextInt();
	    			op.deletePaitent(idd);
	    		}
	    		else {
	    			System.out.println("something went wrong");
	    		}
    		}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
    	
    }
}
