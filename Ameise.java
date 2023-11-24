  
 
 
 
 /**
  
  * @generated
  */
 public class Ameise {

	/**	 * @opposite default.ameisenkolonie.classdiag::Ameise.Ameisenkolonie	 * @generated
	 		 */
	 	    private Ameisenkolonie Ameisenkolonie;
 	
 	/**	 * @generated
 	
 		 */
 	
 	    private int Nahrung;

  /**	 * @generated
 	
 		 */
 	
 	    private ameisentyp typID;
 	
 	/**	 * @generated
 	
 		 */
 	
 	    private int typNr;
 	
 	/**	 * @generated
 	
 		 */
 	
 	    private bewegung bewegen;
 	
 	/**	 * @generated
 	
 		 */
 	
 	    private Ameisenkolonie kolonie;
 	
 	
 	
 	/**	 * @generated
 	
 		 */
 	
 	    private boolean tod;



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
 							oldValue.removeFromAmeisen(this);
 						}
 						this.Ameisenkolonie = newValue;
 						if (newValue != null)
 							newValue.addToAmeisen(this);
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
 	
 		 
 	
 		 * getter for attribute typID : ameisentyp
 	
 		 * @accessor typID
 	
 		 * @generated
 	
 		 */
 	
 		public ameisentyp getTypID() {
 	
 			return this.typID;
 	
 		}
 	
 		/**
 	
 		 
 	
 		 * setter for attribute typID : ameisentyp
 	
 		 * @accessor typID
 	
 		 * @generated
 	
 		 */
 	
 		public void setTypID(ameisentyp value) {
 	
 			this.typID = value;
 	
 		}
    /**
 	
 		 
 	
 		 * getter for attribute typNr : int
 	
 		 * @accessor typNr
 	
 		 * @generated
 	
 		 */
 	
 		public int getTypNr() {
 	
 			return this.typNr;
 	
 		}
 	
 		/**
 	
 		 
 	
 		 * setter for attribute typNr : int
 	
 		 * @accessor typNr
 	
 		 * @generated
 	
 		 */
 	
 		public void setTypNr(int value) {
 	
 			this.typNr = value;
 	
 		}
 	
 	/**
 	
 		 
 	
 		 * getter for attribute bewegen : bewegung
 	
 		 * @accessor bewegen
 	
 		 * @generated
 	
 		 */
 	
 		public bewegung getbewegen() {
 	
 			return this.bewegen;
 	
 		}
 	
 		/**
 	
 		 
 	
 		 * setter for attribute bewegen : bewegung
 	
 		 * @accessor bewegen
 	
 		 * @generated
 	
 		 */
 	
 		public void setBewegen(bewegung value) {
 	
 			this.bewegen = value;
 	
 		}
    /**
 	
 		 
 	
 		 * getter for attribute kolonie : Ameisenkolonie
 	
 		 * @accessor kolonie
 	
 		 * @generated
 	
 		 */
 	
 		public Ameisenkolonie getKolonie() {
 	
 			return this.kolonie;
 	
 		}
 	
 		/**
 	
 		 
 	
 		 * setter for attribute kolonie : Ameisenkolonie
 	
 		 * @accessor kolonie
 	
 		 * @generated
 	
 		 */
 	
 		public void setKolonie(Ameisenkolonie value) {
 	
 			this.kolonie = value;
 	
 		}
 	
 	
 
 	
 	   
 	/**
 	
 		 
 	
 		 * getter for attribute tod : boolean
 	
 		 * @accessor tod
 	
 		 * @generated
 	
 		 */
 	
 		public boolean isTod() {
 	
 			return this.tod;
 	
 		}
    /**
 	
 		 
 	
 		 * setter for attribute tod : boolean
 	
 		 * @accessor tod
 	
 		 * @generated
 	
 		 */
 	
 		public void setTod(boolean value) {
 	
 			this.tod = value;
 	
 		}
  /**
 	   	 * 
 		 * @generated
 		 */	
 	    public void doAction() {
 	    	if (!isTod()) {
            if (getNahrung() <= 0) {
                setTod(true); // Ameise stirbt, wenn keine Nahrung mehr vorhanden ist
                return;
            }

            switch (getTypID()) {
                case KOENIGIN:
                    if (getbewegen() == bewegung.BODEN || getbewegen() == bewegung.LUFT) {
                        // Implementierung der Bewegung der Königin auf dem Boden oder in der Luft
                    }
                    // Logik für die mate()-Methode der Königin
                    // Logik für die reproduce()-Methode der Königin
                    break;

                case MAENNCHEN:
                    if (getbewegen() == bewegung.BODEN || getbewegen() == bewegung.LUFT) {
                        // Implementierung der Bewegung für Männchen auf dem Boden oder in der Luft
                    }
                    break;

                case ARBEITER:
                    // Logik für die Bewegung, Aktivitäten und Aktionen von Arbeitern basierend auf ihrem Typ (Nursemaid, Sentry, Fighter, Explorer, Carrier)
                    break;

                default:
                   
                    break;
            }

           
        }
    }
 	
 	
 	
 }
