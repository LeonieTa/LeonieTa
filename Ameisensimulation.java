 
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
 
 
 /**
  
  * @generated
  */


 public class Ameisensimulation {
	    private int runde;
	    private int totalAmeisen = 6;
	    private int maxAmeisen = 100;
	    private boolean existiertAmeisenkolonie;
	    private List<Ameise> ameiseList;
  
	    public Ameisensimulation() {
	       this.runde = 1;
           this.existiertAmeisenkolonie = false;
           this.ameiseList = new ArrayList<>();
 }
 
 	
 	   
 	/**
 	   	 * 
 		 * @generated
 		 */	
 	    public void erstelleKarte() {
 	    	
 	    }


 	
 	/**
 	
 	   	 * 
 	
 		 * @generated
 	
 		 */	
 	
 	    public void erstelleFeld() {
 	
 			
 	
 	    	
 	
 			// Start of user code default.ameisenkolonie.classdiag::Ameisensimulation::erstelleFeld
 	
 			// TODO should be implemented		
 	
 	    	
 	
 			// End of user code  	
 	
 	    }
 	
 	/**
 	
 	   	 * 
 	
 		 * @generated
 	
 		 */	
 	
 	    public void generiereMaennchen() 
 	    {
 	          boolean add;
 	          for (int i = 0; i < 5; i++) {
 	          add = ameiseList.add(new Ameise("Maennchen"));
 			
 	          }
 	    	
 	
 			// Start of user code default.ameisenkolonie.classdiag::Ameisensimulation::generiereMaennchen
 	
 			// TODO should be implemented		
 	
 	    	
 	
 			// End of user code  	
 	
 	    }
 	   private void addMaennchen() {
 		// TODO Auto-generated method stub

 		}
 	/**
 	
 	   	 * 
 	
 		 * @generated
 	
 		 */	
 	
 	    public void generiereKoenigin() {
 	    	   boolean add;
 	    	   
 	           ameiseList.add(new Ameise("Koenigin"));
 	       }
 	    	
 	
 			// Start of user code default.ameisenkolonie.classdiag::Ameisensimulation::generiereKoenigin
 	
 			// TODO should be implemented		
 	
 	    	
 	
 			// End of user code  	
 	
 	 
  /**
 	
 	   	 * 
 	
 		 * @generated
 	
 		 */	
 	
 	    public void naechsteRunde()
 	    {
 	
 	           runde++;

 	           // In jeder Runde kann jede Ameise eine Aktion ausführen
 	           for (Ameise ameise : ameiseList) {
 	               ameise.move();
 	           }
 	          // Alle 10 Runden wird ein weiteres männliches Ameise hinzugefügt, wenn keine Kolonie existiert
 	          if (runde % 10 == 0 && !existiertAmeisenkolonie) {
 	             addMaennchen();
 	         }
 	          
 	
 			// Start of user code default.ameisenkolonie.classdiag::Ameisensimulation::naechsteRunde
 	
 			// TODO should be implemented		
 	
 	    	
 	
 			// End of user code  	
 	
 	    }
 	
 	
 	
 }
