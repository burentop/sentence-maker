import java.io.Console;

public class SentenceMaker {
  public static void main(String[] args) {
    Console myConsole = System.console();

    System.out.println("Give me a noun: ");
    String inputNoun = myConsole.readLine();
    System.out.println("Give me an adjective: ");
    String inputAdjective = myConsole.readLine();

    System.out.println("The " + inputNoun + " looks very " + inputAdjective + ".");
  }
}
