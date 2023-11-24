 
 
 import java.util.Set;
 import java.util.HashSet;
 import java.util.Iterator;
 import java.util.Collections;
 
 
 /**
  
  * @generated
  */
 public class Karte {
	    private int karteX;
	    private int karteY;
 	    private Set<Feld>Felder = new HashSet<Feld>();
 	
 	
 		 
 	/**
 				 * @generated
 				 */
 				public Set<Feld> getFelder() {
 					return (Set<Feld>) Collections.unmodifiableSet(this.Felder);
 				}
 				
 				/**
 				 * @generated
 				 */
 				public int sizeOfFelder() {
 					return this.Felder.size();
 				}
 				/**
 				 * @generated
 				 */
 				public void addToFelder(Feld newValue) {
 					if (newValue != null && !this.Felder.contains(newValue)) {
 						this.Felder.add(newValue);
 						newValue.setKarte(this);
 					}
 				}
 				/**
 				 * @generated
 				 */
 				public void removeFromFelder(Feld value) {
 					if (value != null && this.Felder.contains(value)) {
 						this.Felder.remove(value);
 						value.setKarte(null);
 					}
 				}
 	
 	/**
 	
 		 
 	
 		 * getter for attribute karteX : int
 	
 		 * @accessor karteX
 	
 		 * @generated
 	
 		 */
 	
 		public int getKarteX() {
 	
 			return this.karteX;
 	
 		}
 	
 		/**
 	
 		 
 	
 		 * setter for attribute karteX : int
 	
 		 * @accessor karteX
 	
 		 * @generated
 	
 		 */
 	
 		public void setKarteX(int value) {
 	
 			this.karteX = value;
 	
 		}
 	
 	/**
 	
 		 
 	
 		 * getter for attribute karteY : int
 	
 		 * @accessor karteY
 	
 		 * @generated
 	
 		 */
 	
 		public int getKarteY() {
 	
 			return this.karteY;
 	
 		}
 	
 		/**
 	
 		 
 	
 		 * setter for attribute karteY : int
 	
 		 * @accessor karteY
 	
 		 * @generated
 	
 		 */
 	
 		public void setKarteY(int value) {
 	
 			this.karteY = value;
 	
 		}
 	
 	
 
 	
 	   
 	
 	
 	
 }
