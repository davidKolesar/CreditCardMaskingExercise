import java.lang.StringBuilder;

public class Maskify {
    private static final String CENSOR_CHARACTER = "#";

    public static String maskify(String str) {
        String censoredInputCharacters = "";
        
        //null check
        if(isNullOrEmpty(str)){
          return "";
        }
        
        //Check if string is long enough to censor
         if(!isAdequateSize(str)) {
           return str;
         }
        
        char[] userInputCharacters = str.toCharArray();
        StringBuilder sb = new StringBuilder(userInputCharacters.length);
        
        for(int i = 0; i < userInputCharacters.length - 4; i++) {
          sb.append(CENSOR_CHARACTER);
        }

         sb.append(userInputCharacters[userInputCharacters.length - 4]);
         sb.append(userInputCharacters[userInputCharacters.length - 3]);
         sb.append(userInputCharacters[userInputCharacters.length - 2]);
         sb.append(userInputCharacters[userInputCharacters.length - 1]);

        System.out.println(sb.toString());
        return sb.toString();
    }
     
    private static boolean isAdequateSize(String userInput){
       char[] userInputToCount = userInput.toCharArray();
        
        if(userInputToCount.length < 5) {
          return false;
        } else {
          return true;
        }      
  }
    
    private static boolean isNullOrEmpty(String userInput){
    
    if(userInput.isEmpty() || userInput == null) {
        return true;
        } else {
          return false;
          }
        }
}