import java.util. Scanner
public class Ciclos03 {
    public static void main (String [] args) {
    Scanner entrada = new Scanner (System.in);
    int numero;
    System.out.println("Digite un número: ");
    numero = Integer.parseInt(entrada.nextline ());
    while (numero != 0) {
      if (numero % 2 == 0) {
      System.out.println("EI número ingresado "+numero+" es PAR");
      else {
      System.out.println ("EI número ingresado "+numero+" es IMPAR");
      }
      System.out.println("Digite otro número: ");
      numero = Integer.parselnt(entrada.nextLine () );
      }
      System.out.println("El numero ingresado es"+numero+"finaliza el programa");
}
}
