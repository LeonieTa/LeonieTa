	
	
	import java.util.Arrays;
	import java.util.Collections;
	import java.util.List;
	/**
   
   * @generated
   */
  public enum ameisentyp {
  
          /**
         	 * @generated
         	 */
          KOENIGIN(0, "Koenigin", "Koenigin")
      , 
          /**
         	 * @generated
         	 */
          MAENNCHEN(1, "Maennchen", "Maennchen")
      , 
          /**
         	 * @generated
         	 */
          ARBEITER(2, "Arbeiter", "Arbeiter")
      , 
          /**
         	 * @generated
         	 */
          KINDERMAEDCHEN(3, "Kindermaedchen", "Kindermaedchen")
      , 
          /**
         	 * @generated
         	 */
          WACHEN(4, "Wachen", "Wachen")
      , 
          /**
         	 * @generated
         	 */
          KAEMPFER(5, "Kaempfer", "Kaempfer")
      , 
          /**
         	 * @generated
         	 */
          ENTDECKER(6, "Entdecker", "Entdecker")
      , 
          /**
         	 * @generated
         	 */
          TRAEGER(7, "Traeger", "Traeger")
        ;
    
        /**
         * @generated
         */
        public static final int KOENIGIN_VALUE = 0;
      
        /**
         * @generated
         */
        public static final int MAENNCHEN_VALUE = 1;
      
        /**
         * @generated
         */
        public static final int ARBEITER_VALUE = 2;
      
        /**
         * @generated
         */
        public static final int KINDERMAEDCHEN_VALUE = 3;
      
        /**
         * @generated
         */
        public static final int WACHEN_VALUE = 4;
      
        /**
         * @generated
         */
        public static final int KAEMPFER_VALUE = 5;
      
        /**
         * @generated
         */
        public static final int ENTDECKER_VALUE = 6;
      
        /**
         * @generated
         */
        public static final int TRAEGER_VALUE = 7;
      
    
      /**
       * @generated
       */
      private static final ameisentyp[] VALUES_ARRAY = new ameisentyp[] {
        KOENIGIN, MAENNCHEN, ARBEITER, KINDERMAEDCHEN, WACHEN, KAEMPFER, ENTDECKER, TRAEGER
      };
    
      /**
       * @generated
       */
      public static final List<ameisentyp> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));
    
      /**
       * @generated
       */
      public static ameisentyp get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
          ameisentyp result = VALUES_ARRAY[i];
          if (result.toString().equals(literal)) {
            return result;
          }
        }
        return null;
      }
    
      /**
       * @generated
       */
      public static ameisentyp getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
          ameisentyp result = VALUES_ARRAY[i];
          if (result.getName().equals(name)) {
            return result;
          }
        }
        return null;
      }
    
      /**
       * @generated
       */
      public static ameisentyp get(int value) {
        switch (value) {
          case KOENIGIN_VALUE :
            return KOENIGIN;
    
          case MAENNCHEN_VALUE :
            return MAENNCHEN;
    
          case ARBEITER_VALUE :
            return ARBEITER;
    
          case KINDERMAEDCHEN_VALUE :
            return KINDERMAEDCHEN;
    
          case WACHEN_VALUE :
            return WACHEN;
    
          case KAEMPFER_VALUE :
            return KAEMPFER;
    
          case ENTDECKER_VALUE :
            return ENTDECKER;
    
          case TRAEGER_VALUE :
            return TRAEGER;
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
      private ameisentyp(int value, String name, String literal) {
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
  
  }
