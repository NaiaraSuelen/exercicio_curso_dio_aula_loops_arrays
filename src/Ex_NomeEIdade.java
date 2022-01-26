
import java.io.IOException;
import java.util.Scanner;

    public class Ex_NomeEIdade {

        public static void main(String[] args) throws IOException {
            /*Programa que lê dois valores "nome" e "idade", é encerrado quando inserido "0" no campo nome*/

            Scanner scan = new Scanner(System.in);

            String nome;
            int idade;

            while(true){
                System.out.println("Nome: ");
                nome = scan.next();

                if (nome.equals("0")) break;

                System.out.println("Idade: ");
                idade = scan.nextInt();
            }

        }
    }

