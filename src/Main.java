import javax.swing.*;

void main() {

    /*Desenvolva um programa que utilize um menu interativo para executar diferentes operações. O programa deve obrigatoriamente utilizar uma estrutura de repetição do tipo while para manter o menu em execução, e uma estrutura de decisão do tipo switch case para tratar as opções escolhidas pelo usuário.

Inicialmente, deve ser declarada uma variável para armazenar a opção escolhida pelo usuário. Em seguida, deve ser criado um laço de repetição while,
 que continuará sendo executado enquanto o usuário não escolher a opção de sair.

Dentro desse laço, o programa deve exibir um menu com as seguintes opções:

Opção um: mostrar todos os números de um até dez.
Opção dois: mostrar a tabuada do número cinco, do um até o dez.
Opção três: solicitar ao usuário um número e exibir todos os números pares de um até esse valor.
Opção quatro: calcular e mostrar a soma dos números de um até cem.
Opção zero: encerrar o programa.
Após exibir o menu, o programa deve solicitar que o usuário digite uma opção. O valor informado deve ser armazenado em uma variável de controle.

Em seguida, deve-se utilizar a estrutura switch case para verificar a opção escolhida:

Caso a opção seja um, o programa deve mostrar os números de um até dez utilizando uma estrutura de repetição.
Caso a opção seja dois, o programa deve exibir a tabuada do número cinco, do um até o dez.
Caso a opção seja três, o programa deve solicitar um número ao usuário e mostrar apenas os números pares até esse valor.
Caso a opção seja quatro, o programa deve calcular a soma dos números de um até cem e exibir o resultado.
Caso a opção seja zero, o programa deve exibir uma mensagem informando que está sendo encerrado.
Caso seja digitado qualquer outro valor, o programa deve exibir uma mensagem de opção inválida.
O programa deve continuar sendo executado até que o usuário escolha a opção zero.
     */

    int opcao = -1;

    while (opcao != 0) {

        String menu = "===== MENU =====\n"
                + "1 - Mostrar números de 1 a 10\n"
                + "2 - Tabuada do 5\n"
                + "3 - Números pares até um valor\n"
                + "4 - Soma de 1 até 100\n"
                + "0 - Sair\n"
                + "Escolha uma opção:";

        opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));

        switch (opcao) {

            case 1:
                String numeros = "Números de 1 a 10:\n";
                for (int i = 1; i <= 10; i++) {
                    numeros += i + "\n";
                }
                JOptionPane.showMessageDialog(null, numeros);
                break;

            case 2:
                String tabuada = "Tabuada do 5:\n";
                for (int i = 1; i <= 10; i++) {
                    tabuada += "5 x " + i + " = " + (5 * i) + "\n";
                }
                JOptionPane.showMessageDialog(null, tabuada);
                break;

            case 3:
                int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:")
                );

                String pares = "Números pares:\n";
                for (int i = 1; i <= numero; i++) {
                    if (i % 2 == 0) {
                        pares += i + "\n";
                    }
                }
                JOptionPane.showMessageDialog(null, pares);
                break;

            case 4:
                int soma = 0;
                for (int i = 1; i <= 100; i++) {
                    soma = soma + i;
                }
                JOptionPane.showMessageDialog(null,
                        "Soma de 1 até 100: " + soma);
                break;

            case 0:
                JOptionPane.showMessageDialog(null,
                        "Encerrando o programa...");
                break;

            default:
                JOptionPane.showMessageDialog(null,
                        "Opção inválida!");
        }
    }
}