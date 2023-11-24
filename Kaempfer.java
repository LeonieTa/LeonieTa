 
 
 
 
 /**
  
  * @generated
  */
 public class Kaempfer extends Arbeiter
  {
 
 	/**	 * @generated
 		 */
 	    private boolean nahrungGefunden;
 	    private boolean isCollaborating;
 	   
 
 		public boolean isNahrungGefunden() {
 			return this.nahrungGefunden;
 		}
 		/**
 		 
 		 * setter for attribute nahrungGefunden : boolean
 		 * @accessor nahrungGefunden
 		 * @generated
 		 */
 		public void setNahrungGefunden(boolean value) {
 			this.nahrungGefunden = value;
 		}
 	
 
 	    public void fight() {
 			
 	  
 	    	}

 	    private void startCollaboration() {
 	        isCollaborating = true;
 	 	    Kaempfer partner = null;
 	        partner.setCollaborationStatus(true);
 	    }
 	   public class Random {
 		  public int nextInt(int i) {
 			return 0;
 			}
 	  }
 	    private void moveTogether() {
 	    
 	        Random random = new Random();
 	        int chance = random.nextInt(100);

 	        if (chance < 60) {
 	            moveForward();
 	        } else if (chance < 80) {
 	            turnLeft();
 	        } 
 	        else {
 	        	turnRight();
 	        	}
 	            
 	        }
       private void turnRight() {
	

	}
 	   private void turnLeft() {
 		

 		}
 	   private void moveForward() {
 		

 		}
 	    private void performDefaultAction() {
 	        // Führe Standardaktionen für einen einzelnen Kämpfer aus
 	    }

 	    public void setCollaborationStatus(boolean status) {
 	        isCollaborating = status;
 	    }
 	    
 	
 	
 	    public void depositPheromones() {
 		
 	
 			// Logik zum Hinterlassen von Pheromonspuren für Träger		
 	
 	
 	    }
 	
 	
 	
 }
