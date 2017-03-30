import java.util.Scanner
import java.util.Random

public class mainClass {
public static main(String[], arg) {
  Scanner dec = new Scanner(System.out);
  Random encounter = new Random();
  
  System.out.print("Menu\n1. new game\n2. continue\n3. quit");
  decision = dec.netInt();
  switch(decision) {
  case 1: new();break;
  case 2: cont();break;
  case 3: quit();break;
  default: main();
}
}
}
