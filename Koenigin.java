 
 import java.util.Random;
 
 
 /**
  
  * @generated
  */
 public class Koenigin extends Ameise
  {
 
 
 	/**	 * @opposite default.ameisenkolonie.classdiag::Koenigin.Ameisenkolonie	 * @generated
 		 */
 	    private Ameisenkolonie Ameisenkolonie;
 	    private boolean mateErfolgt;
        private int Nahrung;
        private boolean kannFliegen;
        private boolean kannKrabbeln;
        private int reproductionCount;
 	
 	
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
 							oldValue.setAmeisenkoenigin(null);
 						}
 						this.Ameisenkolonie = newValue;
 						if (newValue != null)
 							newValue.setAmeisenkoenigin(this);
 					}
 				}
 	
 	/**
 	
 		 
 	
 		 * getter for attribute mateErfolgt : boolean
 	
 		 * @accessor mateErfolgt
 	
 		 * @generated
 	
 		 */
 	
 		public boolean isMateErfolgt() {
 	
 			return this.mateErfolgt;
 	
 		}
 	
 		/**
 	
 		 
 	
 		 * setter for attribute mateErfolgt : boolean
 	
 		 * @accessor mateErfolgt
 	
 		 * @generated
 	
 		 */
 	
 		public void setMateErfolgt(boolean value) {
 	
 			this.mateErfolgt = value;
 	
 		}
 	
 	/**
 	
 		 
 	
 		 * getter for attribute Nahrung : int
 	
 		 * @accessor Nahrung
 	
 		 * @generated
 	
 		 */
 	
 		public int getNahrung() {
 	
 			return this.Nahrung;
 	
 		}
 	
 		/**
 	
 		 
 	
 		 * setter for attribute Nahrung : int
 	
 		 * @accessor Nahrung
 	
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
 	        Random random = new Random();
 	        int moveCost = (kannFliegen) ? 3 : 1; // Fliegen kostet 3x so viel Nahrung wie Krabbeln

 	        if (Nahrung >= moveCost) {
 	            if (!kannFliegen) {
 	            	kannFliegen = random.nextBoolean(); // Entscheidung, ob die Königin fliegt oder nicht
 	            } else {
 	            	kannFliegen = false; // Königin hat bereits geflogen, setze den Flugstatus auf false
 	            }

 	            Nahrung -= moveCost; // Nahrung reduzieren entsprechend der Bewegungskosten
 	        } else {
 	            // Keine ausreichende Nahrung für die Bewegung, Ameise stirbt
 	            // Hier könnte eine entsprechende Aktion hinzugefügt werden, wenn keine Nahrung vorhanden ist
 	        }	
 	    }
 	
 	/**
 	
 	   	 * 
 	
 		 * @generated
 	
 		 */	
 	
 	    public void mate() {
 	        if (!mateErfolgt) {
 	        	mateErfolgt = true;
 	            // Nach der Paarung gründet die Königin sofort eine Kolonie auf dem gleichen Feld
 	            // Hier könnte die Logik für das Gründen einer Kolonie implementiert werden
 	        }
 	    }
 	
 	/**
 	
 	   	 * 
 	
 		 * @generated
 	
 		 */	
 	
 	    public void reproduce() {
 	        if (mateErfolgt) {
 	            Random random = new Random();
 	            int workerChance = 98; // 1%ige Wahrscheinlichkeit für eine weitere Königin
 	            int maleChance = 3; // 3%ige Wahrscheinlichkeit für Männchen

 	            int chance = random.nextInt(100);

 	            if (chance < workerChance) {
 	                // Neuen Arbeiter gebären
 	                // Hier könnte die Logik für die Geburt eines Arbeiters implementiert werden
 	            } else if (chance < workerChance + maleChance) {
 	                // Neues Männchen erzeugen
 	                // Hier könnte die Logik für die Geburt eines Männchens implementiert werden
 	            } else {
 	                // Neue Königin erzeugen
 	                // Hier könnte die Logik für die Geburt einer neuen Königin implementiert werden
 	            }
 	          
 	            reproductionCount++;
 	        }
 	    }
 	
 	/**
 	
 	   	 * 
 	
 		 * @generated
 	
 		 */	
 	
 	    public void eat() {
 	        if (Nahrung > 0) {
 	            Nahrung -= 3; // Königinnen verbrauchen pro Runde 3 Einheiten Nahrung
 	        }
 	    }
 	
 	
 	
 }
