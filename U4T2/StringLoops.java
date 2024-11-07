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
    if(countCharacters(searchChar, origStr)>0){
      for(int i=0;i<origStr.length();i++){
        
      }
    }
    
    return "";
   }
 
 
  }
  