 
 
 import java.util.Set;
 import java.util.HashSet;
 import java.util.Iterator;
 import java.util.Collections;
 
 
 /**
  
  * @generated
  */
 public class Nahrung {
 
 
 	/**	 * @opposite default.ameisenkolonie.classdiag::Nahrung.Feld	 * @generated
 		 */
 	    private Set<Feld>Feld = new HashSet<Feld>();

  /**	 * @generated
 	
 		 */
 	
 	    private int nahrungX;
 	
 	/**	 * @generated
 	
 		 */
 	
 	    private int nahrungY;
 	
 	
 	
 	/**
 				 * @generated
 				 */
 				public Set<Feld> getFeld() {
 					return (Set<Feld>) Collections.unmodifiableSet(this.Feld);
 				}
 				
 				/**
 				 * @generated
 				 */
 				public int sizeOfFeld() {
 					return this.Feld.size();
 				}
 				/**
 				 * @generated
 				 */
 				public void addToFeld(Feld newValue) {
 					if (newValue != null && !this.Feld.contains(newValue)) {
 						this.Feld.add(newValue);
 						newValue.addToNahrung(this);
 					}
 				}
 				/**
 				 * @generated
 				 */
 				public void removeFromFeld(Feld value) {
 					if (value != null && this.Feld.contains(value)) {
 						this.Feld.remove(value);
 						value.removeFromNahrung(this);
 					}
 				}
 	
 	/**
 	
 		 
 	
 		 * getter for attribute nahrungX : int
 	
 		 * @accessor nahrungX
 	
 		 * @generated
 	
 		 */
 	
 		public int getNahrungX() {
 	
 			return this.nahrungX;
 	
 		}
 	
 		/**
 	
 		 
 	
 		 * setter for attribute nahrungX : int
 	
 		 * @accessor nahrungX
 	
 		 * @generated
 	
 		 */
 	
 		public void setNahrungX(int value) {
 	
 			this.nahrungX = value;
 	
 		}
 	
 	/**
 	
 		 
 	
 		 * getter for attribute nahrungY : int
 	
 		 * @accessor nahrungY
 	
 		 * @generated
 	
 		 */
 	
 		public int getNahrungY() {
 	
 			return this.nahrungY;
 	
 		}
 	
 		/**
 	
 		 
 	
 		 * setter for attribute nahrungY : int
 	
 		 * @accessor nahrungY
 	
 		 * @generated
 	
 		 */
 	
 		public void setNahrungY(int value) {
 	
 			this.nahrungY = value;
 	
 		}
 	
 	
 
 	
 	   
 	/**
 	   	 * 
 		 * @generated
 		 */	
 	    public Feld generiereNahrung(int x , int y) {
 			
 	    	
 	    // Hier wird Nahrung in einem bestimmten Feld generiert
 	        // Beispiel: Erstellen einer Nahrungsressource an der Position (x, y)

 	        Feld feld = new Feld(x, y);
 	        // Hier wird angenommen, dass die Methode addToFeld() vorhanden ist, um die Nahrungsquelle zum Feld hinzuzufügen
 	        addToFeld(feld);
 	        
 	       return feld;
 	    }
 	
 	
 	
 }
