 
 import java. util. Random;
 
 
 /**
  
  * @generated
  */
 public abstract class Entdecker extends Arbeiter
  {
 
 
 	/**	 * @generated
 		 */
 	    private boolean nahrungGefunden;
 	
 	
 	
 	/**	 * @generated
 	
 		 */
 	
 	    private boolean fremdeKolonie;


  /**
 		 
 		 * getter for attribute nahrungGefunden : boolean
 		 * @accessor nahrungGefunden
 		 * @generated
 		 */
 		public boolean isNahrungGefunden() {
 			return this.nahrungGefunden;
 		}
 		/**
 		 
 		 * setter for attribute nahrungGefunden : boolean
 		 * @accessor nahrungGefunden
 		 * @generated
 		 */
 		public abstract void setNahrungGefunden(boolean value); {
 		} 
 		  protected abstract Feld nextFeld();
 		  protected abstract void turnAround();
 		  public boolean isSameColony() {
 			// TODO Auto-generated method stub
 			return false;
 			}
 
 		{
 			boolean value = false;
 			this.nahrungGefunden = value;
 		}
 
 		 public void doAction() {
 		        Random random = new Random();
 		        int chance = random.nextInt(100);

 		        if (chance < 80) {
 		            // Bewegung geradeaus mit 80% Wahrscheinlichkeit
 		            // Code für die Bewegung nach vorne
 		        } else if (chance < 90) {
 		            // Bewegung nach links mit 10% Wahrscheinlichkeit
 		            // Code für die Bewegung nach links
 		        } else {
 		            // Bewegung nach rechts mit 10% Wahrscheinlichkeit
 		            // Code für die Bewegung nach rechts
 		        }

 		        // Überprüfen, ob das nächste Feld zu einer anderen Kolonie gehört
 		        // Wenn ja, drehen sie sich um 180 Grad
 		       if (!isSameColony(nextFeld())) {
 		            // Wenn auf eine andere Kolonie getroffen wird, drehen sich um 180 Grad
 		            turnAround();
 		        }
 		    }

 		    private boolean isSameColony(Feld nextFeld) {
 		        // Prüfen, ob das nächste Feld zur gleichen Kolonie gehört
 		    	return nextFeld != null && nextFeld.isSameColony() == this.isSameColony();
 		    }
 		
 	

 		public boolean isFremdeKolonie() {
 	
 			return this.fremdeKolonie;
 	
 		}
   
 		public void setFremdeKolonie(boolean value) {
 	
 			this.fremdeKolonie = value;
 	
 		}
  /**

 	   	 * 
 		 * @generated
 		 */	
 	    public void depositPheromones() {
 
 	         

 	           // Logik zum Aufspüren von fremden Kolonien in der Nähe des Entdeckers
 	        
 	      
 	    }
 	
 	
 	
 }
