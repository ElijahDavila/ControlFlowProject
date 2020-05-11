public class AsciiChars 
{  
  public static void main(String[] args) {
    AsciiChars.printNumbers();
    AsciiChars.printUpperCase();
    AsciiChars.printLowerCase();
  }
   public static void printNumbers()
    {
      Integer num = null;
      for(int i = 48; i <= 57; i++){
      num = Character.getNumericValue((char)i);
      System.out.println(num);
      }
    }

   public static void printLowerCase()
    {
      String lowerLetters =null;
      for(int i = 97; i <= 122; i++){
      lowerLetters = Character.toString((char)i);
      System.out.println(lowerLetters);
      }
    }

  public static void printUpperCase()
    {
      String upperLetters =null;
      for(int i = 65; i <= 90; i++){
      upperLetters = Character.toString((char)i);
      System.out.println(upperLetters);
      }
    }
}

