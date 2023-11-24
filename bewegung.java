	
	
	import java.util.Arrays;
	import java.util.Collections;
	import java.util.List;
	/**
   
   * @generated
   */
  public enum bewegung {
  
          /**
         	 * @generated
         	 */
          GERADEAUS(0, "geradeaus", "geradeaus")
      , 
          /**
         	 * @generated
         	 */
          LINKS(1, "links", "links")
      , 
          /**
         	 * @generated
         	 */
          RECHTS(2, "rechts", "rechts")
      , 
          /**
         	 * @generated
         	 */
          UMDREHEN(3, "umdrehen", "umdrehen")
        ;
    
        /**
         * @generated
         */
        public static final int GERADEAUS_VALUE = 0;
      
        /**
         * @generated
         */
        public static final int LINKS_VALUE = 1;
      
        /**
         * @generated
         */
        public static final int RECHTS_VALUE = 2;
      
        /**
         * @generated
         */
        public static final int UMDREHEN_VALUE = 3;
      
    
      /**
       * @generated
       */
      private static final bewegung[] VALUES_ARRAY = new bewegung[] {
        GERADEAUS, LINKS, RECHTS, UMDREHEN
      };
    
      /**
       * @generated
       */
      public static final List<bewegung> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));
    
      /**
       * @generated
       */
      public static bewegung get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
          bewegung result = VALUES_ARRAY[i];
          if (result.toString().equals(literal)) {
            return result;
          }
        }
        return null;
      }
    
      /**
       * @generated
       */
      public static bewegung getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
          bewegung result = VALUES_ARRAY[i];
          if (result.getName().equals(name)) {
            return result;
          }
        }
        return null;
      }
    
      /**
       * @generated
       */
      public static bewegung get(int value) {
        switch (value) {
          case GERADEAUS_VALUE :
            return GERADEAUS;
    
          case LINKS_VALUE :
            return LINKS;
    
          case RECHTS_VALUE :
            return RECHTS;
    
          case UMDREHEN_VALUE :
            return UMDREHEN;
        }
        return null;
      }
    
      /**
       * @generated
       */
      private final int value;
    
      /**
       * @generated
       */
      private final String name;
    
      /**
       * @generated
       */
      private final String literal;
    
      /**
       * @generated
       */
      private bewegung(int value, String name, String literal) {
        this.value = value;
        this.name = name;
        this.literal = literal;
      }
    
      /**
       * @generated
       */
      public int getValue() {
        return value;
      }
    
      /**
       * @generated
       */
      public String getName() {
        return name;
      }
    
      /**
       * @generated
       */
      public String getLiteral() {
        return literal;
      }
    
      /**
       * @generated
       */
      public String toString() {
        return literal;
      }
      
      public void geradeaus() {
      }
      public void links() {
      }
      public void rechts() {
      }
      public void umdrehen() {
      }
  }
