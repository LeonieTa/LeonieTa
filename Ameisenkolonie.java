 
 
 import java.util.Set;
 import java.util.HashSet;
 import java.util.Iterator;
 import java.util.Collections;
 
 
 /**
  
  * @generated
  */
 public class Ameisenkolonie {
 
 
 	/**	 * @opposite default.ameisenkolonie.classdiag::Ameisenkolonie.Felder	 * @generated
 		 */
 	    private Set<Feld>Felder = new HashSet<Feld>();
 	
 	/**	 * @generated
 	
 		 */
 	
 	    private boolean hatAmeisen;
 	
 	/**	 * @opposite default.ameisenkolonie.classdiag::Ameisenkolonie.Ameisenkoenigin	 * @generated
 	
 		 */
 	
 	    private Koenigin Ameisenkoenigin;
 	
 	/**	 * @opposite default.ameisenkolonie.classdiag::Ameisenkolonie.Arbeiter	 * @generated
 	
 		 */
 	
 	    private Set<Arbeiter>Arbeiter = new HashSet<Arbeiter>();
 	
 	/**	 * @opposite default.ameisenkolonie.classdiag::Ameisenkolonie.Maennchen	 * @generated
 	
 		 */
 	
 	    private Set<Maennchen>Maennchen = new HashSet<Maennchen>();
 	
 	/**	 * @opposite default.ameisenkolonie.classdiag::Ameisenkolonie.Ameisen	 * @generated
 	
 		 */
 	
 	    private Set<Ameise> Ameisen = new HashSet<Ameise>();
 	
 	/**	 * @generated
 	
 		 */
 	
 	    private int kolonieID;
 	
 	/**	 * @generated
 	
 		 */
 	
 	    private int Nahrungsvorrat;
 	    boolean isBesetzt;
 	    
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
 						newValue.addToAmeisenkolonien(this);
 					}
 				}
 				/**
 				 * @generated
 				 */
 				public void removeFromFelder(Feld value) {
 					if (value != null && this.Felder.contains(value)) {
 						this.Felder.remove(value);
 						value.removeFromAmeisenkolonien(this);
 					}
 				}
 	
 	/**
 	
 		 
 	
 		 * getter for attribute hatAmeisen : boolean
 	
 		 * @accessor hatAmeisen
 	
 		 * @generated
 	
 		 */
 	
 		public boolean isHatAmeisen() {
 	
 			return this.hatAmeisen;
 	
 		}
 	
 		/**
 	
 		 
 	
 		 * setter for attribute hatAmeisen : boolean
 	
 		 * @accessor hatAmeisen
 	
 		 * @generated
 	
 		 */
 	
 		public void setHatAmeisen(boolean value) {
 	
 			this.hatAmeisen = value;
 	
 		}
 	
 	/**
 	
 				 * @generated
 	
 				 */
 	
 				public Koenigin getAmeisenkoenigin() {
 	
 					return this.Ameisenkoenigin;
 	
 				}
 	
 				/**
 	
 				 * @generated
 	
 				 */
 	
 				public void setAmeisenkoenigin(Koenigin newValue) {
 	
 					if (this.Ameisenkoenigin != newValue) {
 	
 						Koenigin oldValue = Ameisenkoenigin;
 	
 						if (oldValue != null) {
 	
 							this.Ameisenkoenigin = null;
 	
 							oldValue.setAmeisenkolonie(null);
 	
 						}
 	
 						this.Ameisenkoenigin = newValue;
 	
 						if (newValue != null)
 	
 							newValue.setAmeisenkolonie(this);
 	
 					}
 	
 				}
 	
 	/**
 	
 				 * @generated
 	
 				 */
 	
 				public Set<Arbeiter> getArbeiter() {
 	
 					return (Set<Arbeiter>) Collections.unmodifiableSet(this.Arbeiter);
 	
 				}
 	
 				
 	
 				/**
 	
 				 * @generated
 	
 				 */
 	
 				public int sizeOfArbeiter() {
 	
 					return this.Arbeiter.size();
 	
 				}
 	
 				/**
 	
 				 * @generated
 	
 				 */
 	
 				public void addToArbeiter(Arbeiter newValue) {
 	
 					if (newValue != null && !this.Arbeiter.contains(newValue)) {
 	
 						this.Arbeiter.add(newValue);
 	
 						newValue.setAmeisenkolonie(this);
 	
 					}
 	
 				}
 	
 				/**
 	
 				 * @generated
 	
 				 */
 	
 				public void removeFromArbeiter(Arbeiter value) {
 	
 					if (value != null && this.Arbeiter.contains(value)) {
 	
 						this.Arbeiter.remove(value);
 	
 						value.setAmeisenkolonie(null);
 	
 					}
 	
 				}
 	
 	/**
 	
 				 * @generated
 	
 				 */
 	
 				public Set<Maennchen> getMaennchen() {
 	
 					return (Set<Maennchen>) Collections.unmodifiableSet(this.Maennchen);
 	
 				}
 	
 				
 	
 				/**
 	
 				 * @generated
 	
 				 */
 	
 				public int sizeOfMaennchen() {
 	
 					return this.Maennchen.size();
 	
 				}
 	
 				/**
 	
 				 * @generated
 	
 				 */
 	
 				public void addToMaennchen(Maennchen newValue) {
 	
 					if (newValue != null && !this.Maennchen.contains(newValue)) {
 	
 						this.Maennchen.add(newValue);
 	
 						newValue.setAmeisenkolonie(this);
 	
 					}
 	
 				}
 	
 				/**
 	
 				 * @generated
 	
 				 */
 	
 				public void removeFromMaennchen(Maennchen value) {
 	
 					if (value != null && this.Maennchen.contains(value)) {
 	
 						this.Maennchen.remove(value);
 	
 						value.setAmeisenkolonie(null);
 	
 					}
 	
 				}
 	
 	/**
 	
 				 * @generated
 	
 				 */
 	
 				public Set<Ameise> getAmeisen() {
 	
 					return (Set<Ameise>) Collections.unmodifiableSet(this.Ameisen);
 	
 				}
 	
 				/**
 	
 				 * @generated
 	
 				 */
 	
 				public int sizeOfAmeisen() {
 	
 					return this.Ameisen.size();
 	
 				}

  /**
 	
 				 * @generated
 	
 				 */
 	
 				public void addToAmeisen(Ameise newValue) {
 	
 					if (newValue != null && !this.Ameisen.contains(newValue)) {
 	
 						this.Ameisen.add(newValue);
 	
 						newValue.setAmeisenkolonie(this);
 	
 					}
 	
 				}

  /**
 	
 				 * @generated
 	
 				 */
 	
 				public void removeFromAmeisen(Ameise value) {
 	
 					if (value != null && this.Ameisen.contains(value)) {
 	
 						this.Ameisen.remove(value);
 	
 						value.setAmeisenkolonie(null);
 	
 					}
 	
 				}

        /**
 	
 		 
 	
 		 * getter for attribute kolonieID : int
 	
 		 * @accessor kolonieID
 	
 		 * @generated
 	
 		 */
 	
 		public int getKolonieID() {
 	
 			return this.kolonieID;
 	
 		}
 	
 		/**
 	
 		 
 	
 		 * setter for attribute kolonieID : int
 	
 		 * @accessor kolonieID
 	
 		 * @generated
 	
 		 */
 	
 		public void setKolonieID(int value) {
 	
 			this.kolonieID = value;
 	
 		}
 	
 	/**
 	
 		 
 	
 		 * getter for attribute nahrungsvorrat : int
 	
 		 * @accessor nahrungsvorrat
 	
 		 * @generated
 	
 		 */
 	
 		public int getNahrungsvorrat() {
 	
 			return this.Nahrungsvorrat;
 	
 		}
 	
 		/**
 	
 		 
 	
 		 * setter for attribute nahrungsvorrat : int
 	
 		 * @accessor nahrungsvorrat
 	
 		 * @generated
 	
 		 */
 	
 		public void setNahrungsvorrat(int value) {
 	
 			this.Nahrungsvorrat = value;
 	
 		}
 	
 	
 
 	
 	   
 	
 	
 	
 }
