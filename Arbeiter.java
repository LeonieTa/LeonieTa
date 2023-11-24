 

 
 
 /**
  
  * @generated
  */
 public class Arbeiter extends Ameise
  {
 
 	/**	 * @opposite default.ameisenkolonie.classdiag::Arbeiter.Ameisenkolonie	 * @generated
 		 */
 	    private Ameisenkolonie Ameisenkolonie;
 	
 	/**	 * @generated
 	
 		 */
 	
 	    private int Nahrung = 100;

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
 							oldValue.removeFromArbeiter(this);
 						}
 						this.Ameisenkolonie = newValue;
 						if (newValue != null)
 							newValue.addToArbeiter(this);
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
 	        if (Nahrung > 0) {
 	            if (kannFliegen) {
 	                Nahrung -= 3; // Fliegen kostet 3x so viel Nahrung wie Krabbeln
 	            } else {
 	                Nahrung--;
 	            }
 	        } else {
 	            // Ameise hat keine Nahrung mehr und stirbt
 	            // Hier könnte eine entsprechende Aktion hinzugefügt werden, wenn keine Nahrung vorhanden ist
 	        }
 	    }
 	
 	/**
 	
 	   	 * 
 	
 		 * @generated
 	
 		 */	
 	
 	    public void eat() {
 	        if (Nahrung > 0) {
 	            Nahrung += 50; // Arbeiter bekommen pro Mahlzeit 50 Runden Nahrung
 	        }
 	    }
 	
 	
 	
 }
