public class game() {
  private String name;
  private int hp;
  private int rank;
  private int weapon;
  private int level;
  int rest;
  public void newg() {
  System.out.println("What is your name");
    name = dec.newString();
   System.out.println("Welcome cadet "+ name);
    System.out.println("There will be pauses like this you can press enter to continue");
    rest = wait.newString();
    System.out.println("");   
    
  }
}
