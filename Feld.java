 
 
 import java.util.Set;
 import java.util.HashSet;
 import java.util.Iterator;
 import java.util.Collections;
 
 
 /**
  
  * @generated
  */
 public class Feld {
  
	    private int x;
	    private int y;
 	
	    public Feld(int x, int y) {
	        this.x = x;
	        this.y = y;
	    }
 	    private Karte Karte;
 	
 	/**	 * @generated
 	
 		 */
 	
 	    private boolean besetztdurchAmeisenkolonie;
 	
 	/**	 * @generated
 	
 		 */
 	
 	    private boolean KoeniginistaufFeld;
 	
 	/**	 * @generated
 	
 		 */
 	
 	    private boolean MaennchenistaufFeld;
 	
 	/**	 * @generated
 	
 		 */
 	
 	    private int feldX = 10;
 	
 	/**	 * @generated
 	
 		 */
 	
 	    private int feldY = 10;
 	
 	/**	 * @opposite default.ameisenkolonie.classdiag::Feld.Ameisenkolonien	 * @generated
 	
 		 */
 	
 	    private Set<Ameisenkolonie>Ameisenkolonien = new HashSet<Ameisenkolonie>();
 	
 	/**	 * @opposite default.ameisenkolonie.classdiag::Feld.Nahrung	 * @generated
 	
 		 */
 	
 	    private Set<Nahrung>Nahrung = new HashSet<Nahrung>();

  /**
 				 * @generated
 				 */
 				public Karte getKarte() {
 					return this.Karte;
 				}
 				/**
 				 * @generated
 				 */
 				public void setKarte(Karte newValue) {
 					if (this.Karte != newValue) {
 						Karte oldValue = Karte;
 						if (oldValue != null) {
 							this.Karte = null;
 							oldValue.removeFromFelder(this);
 						}
 						this.Karte = newValue;
 						if (newValue != null)
 							newValue.addToFelder(this);
 					}
 				}
 	
 	/**
 	
 		 
 	
 		 * getter for attribute besetztdurchAmeisenkolonie : boolean
 	
 		 * @accessor besetztdurchAmeisenkolonie
 	
 		 * @generated
 	
 		 */
 	
 		public boolean isBesetztdurchAmeisenkolonie() {
 	
 			return this.besetztdurchAmeisenkolonie;
 	
 		}
 	
 		/**
 	
 		 
 	
 		 * setter for attribute besetztdurchAmeisenkolonie : boolean
 	
 		 * @accessor besetztdurchAmeisenkolonie
 	
 		 * @generated
 	
 		 */
 	
 		public void setBesetztdurchAmeisenkolonie(boolean value) {
 	
 			this.besetztdurchAmeisenkolonie = value;
 	
 		}
 	
 	/**
 	
 		 
 	
 		 * getter for attribute KoeniginistaufFeld : boolean
 	
 		 * @accessor KoeniginistaufFeld
 	
 		 * @generated
 	
 		 */
 	
 		public boolean isKoeniginistaufFeld() {
 	
 			return this.KoeniginistaufFeld;
 	
 		}
 	
 		/**
 	
 		 
 	
 		 * setter for attribute KoeniginistaufFeld : boolean
 	
 		 * @accessor KoeniginistaufFeld
 	
 		 * @generated
 	
 		 */
 	
 		public void setKoeniginistaufFeld(boolean value) {
 	
 			this.KoeniginistaufFeld = value;
 	
 		}
 	
 	/**
 	
 		 
 	
 		 * getter for attribute MaennchenistaufFeld : boolean
 	
 		 * @accessor MaennchenistaufFeld
 	
 		 * @generated
 	
 		 */
 	
 		public boolean isMaennchenistaufFeld() {
 	
 			return this.MaennchenistaufFeld;
 	
 		}
 	
 		/**
 	
 		 
 	
 		 * setter for attribute MaennchenistaufFeld : boolean
 	
 		 * @accessor MaennchenistaufFeld
 	
 		 * @generated
 	
 		 */
 	
 		public void setMaennchenistaufFeld(boolean value) {
 	
 			this.MaennchenistaufFeld = value;
 	
 		}
 	
 	/**
 	
 		 
 	
 		 * getter for attribute feldX : int
 	
 		 * @accessor feldX
 	
 		 * @generated
 	
 		 */
 	
 		public int getFeldX() {
 	
 			return this.feldX;
 	
 		}
 	
 		/**
 	
 		 
 	
 		 * setter for attribute feldX : int
 	
 		 * @accessor feldX
 	
 		 * @generated
 	
 		 */
 	
 		public void setFeldX(int value) {
 	
 			this.feldX = value;
 	
 		}
 	
 	/**
 	
 		 
 	
 		 * getter for attribute feldY : int
 	
 		 * @accessor feldY
 	
 		 * @generated
 	
 		 */
 	
 		public int getFeldY() {
 	
 			return this.feldY;
 	
 		}
 	
 		/**
 	
 		 
 	
 		 * setter for attribute feldY : int
 	
 		 * @accessor feldY
 	
 		 * @generated
 	
 		 */
 	
 		public void setFeldY(int value) {
 	
 			this.feldY = value;
 	
 		}
 	
 	/**
 	
 				 * @generated
 	
 				 */
 	
 				public Set<Ameisenkolonie> getAmeisenkolonien() {
 	
 					return (Set<Ameisenkolonie>) Collections.unmodifiableSet(this.Ameisenkolonien);
 	
 				}
 	
 				
 	
 				/**
 	
 				 * @generated
 	
 				 */
 	
 				public int sizeOfAmeisenkolonien() {
 	
 					return this.Ameisenkolonien.size();
 	
 				}
 	
 				/**
 	
 				 * @generated
 	
 				 */
 	
 				public void addToAmeisenkolonien(Ameisenkolonie newValue) {
 	
 					if (newValue != null && !this.Ameisenkolonien.contains(newValue)) {
 	
 						this.Ameisenkolonien.add(newValue);
 	
 						newValue.addToFelder(this);
 	
 					}
 	
 				}
 	
 				/**
 	
 				 * @generated
 	
 				 */
 	
 				public void removeFromAmeisenkolonien(Ameisenkolonie value) {
 	
 					if (value != null && this.Ameisenkolonien.contains(value)) {
 	
 						this.Ameisenkolonien.remove(value);
 	
 						value.removeFromFelder(this);
 	
 					}
 	
 				}
 	
 	/**
 	
 				 * @generated
 	
 				 */
 	
 				public Set<Nahrung> getNahrung() {
 	
 					return (Set<Nahrung>) Collections.unmodifiableSet(this.Nahrung);
 	
 				}
 	
 				
 	
 				/**
 	
 				 * @generated
 	
 				 */
 	
 				public int sizeOfNahrung() {
 	
 					return this.Nahrung.size();
 	
 				}
 	
 				/**
 	
 				 * @generated
 	
 				 */
 	
 				public void addToNahrung(Nahrung newValue) {
 	
 					if (newValue != null && !this.Nahrung.contains(newValue)) {
 	
 						this.Nahrung.add(newValue);
 	
 						newValue.addToFeld(this);
 	
 					}
 	
 				}
 	
 				/**
 	
 				 * @generated
 	
 				 */
 	
 				public void removeFromNahrung(Nahrung value) {
 	
 					if (value != null && this.Nahrung.contains(value)) {
 	
 						this.Nahrung.remove(value);
 	
 						value.removeFromFeld(this);
 	
 					}
 	
 				}
 	
 	
 
 	
 	   
 	
 	
 	
 }
