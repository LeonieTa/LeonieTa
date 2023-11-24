 
 
 
 
 /**
  
  * @generated
  */
 public class Maennchen extends Ameise
  {
 
 
 	/**	 * @opposite default.ameisenkolonie.classdiag::Maennchen.Ameisenkolonie	 * @generated
 		 */
 	    private Ameisenkolonie Ameisenkolonie;
 	
 	/**	 * @generated
 	
 		 */
 	
 	    private int Nahrung = 50;

  /**	 * @generated
 	
 		 */
 	
 	    private boolean kannFliegen;
 	
 	/**	 * @generated
 	
 		 */
 	
 	    private boolean kannKrabbeln;
 	
 	
 	
 	/**
 				 * @generated
 				 */
 				public Ameisenkolonie getAmeisenkolonie() {
 					return this.Ameisenkolonie;
 				}
 				/**
 				 * @generated
 				 */
 				public void setAmeisenkolonie(Ameisenkolonie newValue) {
 					if (this.Ameisenkolonie != newValue) {
 						Ameisenkolonie oldValue = Ameisenkolonie;
 						if (oldValue != null) {
 							this.Ameisenkolonie = null;
 							oldValue.removeFromMaennchen(this);
 						}
 						this.Ameisenkolonie = newValue;
 						if (newValue != null)
 							newValue.addToMaennchen(this);
 					}
 				}
 	
 	/**
 	
 		 
 	
 		 * getter for attribute nahrung : int
 	
 		 * @accessor nahrung
 	
 		 * @generated
 	
 		 */
 	
 		public int getNahrung() {
 	
 			return this.Nahrung;
 	
 		}
 	
 		/**
 	
 		 
 	
 		 * setter for attribute nahrung : int
 	
 		 * @accessor nahrung
 	
 		 * @generated
 	
 		 */
 	
 		public void setNahrung(int value) {
 	
 			this.Nahrung = value;
 	
 		}
 	
 	/**
 	
 		 
 	
 		 * getter for attribute kannFliegen : boolean
 	
 		 * @accessor kannFliegen
 	
 		 * @generated
 	
 		 */
 	
 		public boolean isKannFliegen() {
 	
 			return this.kannFliegen;
 	
 		}
 	
 		/**
 	
 		 
 	
 		 * setter for attribute kannFliegen : boolean
 	
 		 * @accessor kannFliegen
 	
 		 * @generated
 	
 		 */
 	
 		public void setKannFliegen(boolean value) {
 	
 			this.kannFliegen = value;
 	
 		}
 	
 	/**
 	
 		 
 	
 		 * getter for attribute kannKrabbeln : boolean
 	
 		 * @accessor kannKrabbeln
 	
 		 * @generated
 	
 		 */
 	
 		public boolean isKannKrabbeln() {
 	
 			return this.kannKrabbeln;
 	
 		}
 	
 		/**
 	
 		 
 	
 		 * setter for attribute kannKrabbeln : boolean
 	
 		 * @accessor kannKrabbeln
 	
 		 * @generated
 	
 		 */
 	
 		public void setKannKrabbeln(boolean value) {
 	
 			this.kannKrabbeln = value;
 	
 		}
 	
 	
 
 	
 	   
 	/**
 	   	 * 
 		 * @generated
 		 */	
 	    public void move() {
 			
 	    	
 			// Start of user code default.ameisenkolonie.classdiag::Maennchen::move
 			// TODO should be implemented		
 	    	
 			// End of user code  	
 	    }
 	
 	/**
 	
 	   	 * 
 	
 		 * @generated
 	
 		 */	
 	
 	    public void eat() {
 	
 			
 	
 	    	
 	
 			// Start of user code default.ameisenkolonie.classdiag::Maennchen::eat
 	
 			// TODO should be implemented		
 	
 	    	
 	
 			// End of user code  	
 	
 	    }
 	
 	
 	
 }
