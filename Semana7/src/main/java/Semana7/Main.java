package Semana7;

import java.util.Scanner;
import java.util.ArrayList;
import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {
      
        Empregado e = new Empregado();
        
        int opMenu;
        
        ArrayList<String> nomes = new ArrayList<>();
        ArrayList<String> sobrenomes = new ArrayList<>();
        ArrayList<Float> salarios = new ArrayList<>();

        Scanner L = new Scanner(System.in);
        DecimalFormat deci = new DecimalFormat("###,##0.00");

        do {
            
            System.out.print("|---------------------------------------------"
                    + "|\n");
            System.out.print("| 1 - Registrar nome e salário do funcionário."
                    + "|\n");
            System.out.print("| 2 - Lista de funcionários com salário.      "
                    + "|\n");
            System.out.print("| 3 - Sair.                                   "
                    + "|\n");
            System.out.print("|---------------------------------------------"
                    + "|\n");
            System.out.print("Digite uma opção: \n");
            opMenu = L.nextInt();

            switch (opMenu) {

                case 1:

                    limpaTela();

                    System.out.println("Informe o primeiro nome do funcionário: ");
                    e.setNome(L.next());
                    System.out.println("Informe o sobrenome do funcionário: ");
                    e.setSobreNome(L.next());
                    System.out.println("Nome do funcionário: " + e.getNome() 
                            + " " + e.getSobreNome());
                    System.out.println(" ");
                    System.out.println("Informe o salário do funcionário: ");
                    e.setSalario(L.nextFloat());
                    
                    nomes.add(e.getNome());
                    sobrenomes.add(e.getSobreNome());
                    salarios.add(e.getSalario());

                    break;

                case 2:

                    limpaTela();
                    
                    for (int i = 0; i < nomes.size(); i++) {
                        
                        System.out.println((i + 1) + " - " + nomes.get(i) + " "
                                + sobrenomes.get(i)
                                + "\nSalário mensal: "
                                + deci.format(salarios.get(i)));                      
                        System.out.println("Salário mensal + 10%: " 
                                + deci.format(salarios.get(i) 
                                + salarios.get(i) * 0.1 ));                                
                        System.out.println("Salário anual: "
                                + deci.format(salarios.get(i) * 12));                       
                        System.out.println("Salário anual + 10%: "
                                + deci.format(((salarios.get(i) * 12)
                                + (salarios.get(i) * 12 * 0.1))));                        
                                                
                    }

                    break;

                case 3:

                    limpaTela();

                    System.out.print("|-----------------------------|\n");
                    System.out.print("| Obrigado pela Prefer?ncia <3|\n");
                    System.out.print("|-----------------------------|\n");
                    System.exit(0);

                    break;
                    
                default:
                    
                    limpaTela();
                    
                    System.out.print("|------------------------|\n");
                    System.out.print("|Escolha uma opção valida|\n");
                    System.out.print("|------------------------|\n");
            }
            
        } while (opMenu != 0);
    }
    
    public static void limpaTela() {
        for (int i = 0; i <= 25; i++) {
            System.out.println("\n");
        }   
    } 
}
