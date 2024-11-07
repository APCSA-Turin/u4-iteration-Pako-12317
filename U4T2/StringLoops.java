public class StringLoops {
    // default constructor; no instance variables
    public StringLoops() { }
  
    /* Returns the number of times "character" appears in "searchString"
       This should be NON-case sensitive! 
       
       Examples:
       - if character = "a" and searchString = "Apple and banana",
         this method returns 5 (it finds BOTH "A" and "a")
       - if character = "A" and searchString = "Apple and banana",
         this method returns 5 (it finds BOTH "A" and "a")
       - if character = "!" and searchString = "Hello! Nice day!",
         this method returns 2
  
        DO THIS WITH A FOR LOOP
      */  
    public int countCharacters(String character, String searchString) {
        int count = 0;
        for(int i=0;i<searchString.length();i++){
        if (searchString.substring(i, i+1).equalsIgnoreCase(character)) {
            count+=1;
        }
      }
      return count;
    }
    
    /* Returns the original string reversed 
     
     Examples:
     - if origString = "hello!" this method returns "!olleh"
     - if origString = "Apples and bananas" this method returns "sananab dna selppA"
    */  
    public String reverseString(String origString) {
      StringBuilder str = new StringBuilder(origString);
      return str.reverse().toString();
    }

        /* Returns a String with all instances of "searchChar" in "origString" replaced with
     "replaceChar"; matches should be case sensitive (i.e. no need to worry about
      lowercase vs. uppercase)
     
     - if searchChar = "a", origString = "canned beans and bananas", replaceChar = "*"
       this method returns "c*nned be*ns *nd b*n*n*s" (A not a match because of case)
     - if searchChar = "t", origString = "Ratatattat", replaceChar = "p"
       this method returns "Rapapappap"
     - if searchChar = "!", origString = "Nice! Day today!", replaceChar = "?"
       this method returns "Nice? Day today?"
     - if searchChar = "i", origString = "it’s the brain drain pain train",
       replaceChar = "I", this method returns "It’s the braIn draIn paIn traIn"
     - if searchChar = "i", origString = "it’s the brain drain pain train",
       replaceChar = " ", this method returns " t’s the bra n dra n pa n tra n"
     - if searchChar = "A", origString = "ABABABABABC", replaceChar = "D"
       this method returns "DBDBDBDBDBC"
     - if searchChar = "a", origString = "ABABABABABC", replaceChar = "D"
       this method returns "ABABABABABC" (no matches because of case)

    PRECONDITION: searchChar and replaceChar are single characters and are not equal
    */  
  public String replaceCharacterV1(String searchChar, String origStr, String replaceChar){
    StringBuilder result = new StringBuilder();
    for (int i = 0; i < origStr.length(); i++) {
        char currentChar = origStr.charAt(i);
        if (currentChar == searchChar.charAt(0)) {
            result.append(replaceChar);
        } else {
            result.append(currentChar);
        }
    }
    return result.toString();
   }

   public String replaceCharacterV2(String searchChar, String origStr, String replaceChar) {
    StringBuilder result = new StringBuilder();
    int i = 0;
    while (i < origStr.length()) {
        char currentChar = origStr.charAt(i);
        if (currentChar == searchChar.charAt(0)) {
            result.append(replaceChar);
        } else {
            result.append(currentChar);
        }
        i++;
    }
    return result.toString();
   }

   public int countString(String searchString, String origString) {
    int count = 0;
    int index = 0;

    while ((index = origString.indexOf(searchString, index)) != -1) {
        count++;
        index++;
    }

    return count;
   }

   public String removeString(String searchString, String origString) {
    return origString.replace(searchString, "");
   }

   public void commaSeparated(int fromNum, int toNum) {
    if (fromNum <= toNum) {
        for (int i = fromNum; i <= toNum; i++) {
            System.out.print(i);
            if (i < toNum) System.out.print(", ");
        }
    } else {
        for (int i = fromNum; i >= toNum; i--) {
            System.out.print(i);
            if (i > toNum) System.out.print(", ");
        }
    }
    System.out.println();
   }

   public boolean isPalindrome(String myString) {
    String cleanedString = myString.replace(" ", "").toLowerCase();
    int left = 0;
    int right = cleanedString.length() - 1;

    while (left < right) {
        if (cleanedString.charAt(left) != cleanedString.charAt(right)) {
            return false;
        }
        left++;
        right--;
    }
    
    return true;
   }

   public void multiPrint(String toPrint, int num) {
    System.out.print("[");

    for (int i = 0; i < num; i++) {
        System.out.print(toPrint);
        if (i < num - 1) System.out.print(" ");
    }

    System.out.println("]");
   }
  }
  