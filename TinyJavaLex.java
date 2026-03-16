
import java.io.*;

public class TinyJavaLex {

  public static void main(String args[]) throws IOException {

    
    StringBuilder sb = new StringBuilder();
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String line;
    while ((line = br.readLine()) != null) {
      sb.append(line).append("\n");
    }
    String source = sb.toString();

    System.out.println("Source Program");
    System.out.println("--------------");
    System.out.println();
    System.out.print(source);

    System.out.println();
    System.out.println("List of Tokens");
    System.out.println("--------------");
    System.out.println();

    TinyJavaLexer lexer = new TinyJavaLexer(new StringReader(source));

    java_cup.runtime.Symbol tok;
    do {
      tok = lexer.next_token();
      if (tok.sym != Symbol.EOF) {
        System.out.println(tok);
      }
    } while (tok.sym != Symbol.EOF);

    System.out.println();
  }
}
