package condicionais;

import java.util.Scanner;

public class HoroscopoSwitch { 
//==================================================================================================	
//  SWITCH: É uma estrutura condicional usada para tomar decisões baseado em UM único valor.
//  Ele compara o valor da variável com várias opções (cases).
//  Quando encontra um case correspondente, executa o bloco de código dentro dele.
//  → O comando break serve para ENCERRAR o switch após executar o case escolhido.
//  → O bloco default é executado quando NENHUM dos cases corresponde ao valor informado.
//  → É útil quando temos várias opções fixas para escolher (ex: menu, dias da semana, signos, etc).
//==================================================================================================	

    public static void main(String[] args) { 

        Scanner scanner = new Scanner(System.in); 

        int signo; 
//  INT SIGNO → declara a variável que vai armazenar o número correspondente ao signo digitado pelo usuário.
//  Ainda não recebe valor, apenas reserva espaço na memória.

        System.out.println("=======================================");
        System.out.println("           Horóscopo do Dia            ");
        System.out.println("=======================================");
        System.out.println("                                       ");
        System.out.println("            1   -  Capricornio         ");
        System.out.println("            2   -  Aquário             ");
        System.out.println("            3   -  Peixes              ");
        System.out.println("            4   -  Áries               ");
        System.out.println("            5   -  Touro               ");
        System.out.println("            6   -  Gêmeos              ");
        System.out.println("            7   -  Câncer              ");
        System.out.println("            8   -  Leão                ");
        System.out.println("            9   -  Virgem              ");
        System.out.println("            10  -  Libra               ");
        System.out.println("            11  -  Escorpião           ");
        System.out.println("            12  -  Sagitário           ");
        System.out.println("                                       ");
        System.out.println("=======================================");
        System.out.println("           Digite seu Signo!           ");
//  EXIBE NO CONSOLE O MENU DE SIGNOS E PEDE PARA O USUÁRIO DIGITAR UM NÚMERO DE 1 A 12.

        signo = scanner.nextInt(); 
//  LÊ O VALOR DIGITADO PELO USUÁRIO e armazena na variável SIGNO.
//  .nextInt() → indica que esperamos um valor do tipo inteiro.

        switch (signo) { 
//  SWITCH → laço condicional usado quando queremos verificar várias possibilidades de uma variável.
//  Ele compara o valor de SIGNO com cada CASE (1 a 12).

            case 1:
                System.out.println("Capricórnio: Trabalhe com disciplina; metas realistas e passos consistentes trarão progresso visível.");
                break;
//  CASE 1 → se SIGNO for 1, executa este bloco e depois para (break).
//  BREAK → evita que os próximos cases sejam executados.

            case 2:
                System.out.println("Aquário: Inove com colaboração — compartilhe suas ideias e ouça perspectivas diferentes para evoluir.");
                break;

            case 3:
                System.out.println("Peixes: Confie na intuição, mas mantenha os pés no chão; atenção aos detalhes evitará confusões.");
                break;

            case 4:
                System.out.println("Áries: Hoje concentre-se em ações rápidas e ponderadas — priorize uma tarefa importante e avance com confiança.");
                break;

            case 5:
                System.out.println("Touro: Evite gastos impulsivos; organize suas finanças e desfrute pequenos prazeres com moderação");
                break;

            case 6:
                System.out.println("Gêmeos: Comunique-se com clareza — uma conversa aberta pode esclarecer mal-entendidos e abrir oportunidades");
                break;

            case 7:
                System.out.println("Câncer: Cuide do seu bem-estar emocional; reserve tempo para descansar e fortalecer vínculos familiares.");
                break;

            case 8:
                System.out.println("Leão: Mostre suas ideias com segurança, mas escute antes de reagir — equilíbrio trará reconhecimento.");
                break;

            case 9:
                System.out.println("Virgem: Foque na organização: revisar prioridades e planejar pequenas ações aumentará sua produtividade.");
                break;

            case 10:
                System.out.println("Libra: Busque harmonia nas relações hoje — proponha um acordo justo e seja flexível nas negociações.");
                break;

            case 11:
                System.out.println("Escorpião: Intensidade pode ser positiva se bem dirigida — transforme emoções em determinação prática.");
                break;

            case 12:
                System.out.println("Sagitário: Abrace a curiosidade, mas finalize compromissos pendentes antes de começar algo novo.");
                break;

            default: 
                System.out.println("Opção Inválida");
//  DEFAULT → executa se nenhum case corresponder ao valor da variável.
//  Serve para tratar entradas inválidas, como números fora de 1 a 12.
                
        }
        scanner.close(); 
    }
}


//                     COMO FUNCIONA NA PRÁTICA
// Usuário digita 3 → SWITCH compara signo com cada case:
// CASE 1? Não → passa
// CASE 2? Não → passa
// CASE 3? Sim → imprime "Peixes: Confie na intuição, ..." → BREAK → sai do switch

// Usuário digita 13 → nenhum CASE corresponde → DEFAULT → imprime "Opção Inválida"

//==========================================================================================================
//                                        Resultado no console:
//                                          Horóscopo do Dia
//                                          Digite seu Signo!
//                                                 3
//           Peixes: Confie na intuição, mas mantenha os pés no chão; atenção aos detalhes evitará confusões.
//===========================================================================================================

//                           RESUMINDO
//SWITCH → escolhe qual bloco executar entre várias opções possíveis.
//CASE → verifica cada valor específico.
//BREAK → impede execução dos próximos cases.
//DEFAULT → trata valores não previstos.

//                      PASSOS PRINCIPAIS
//Declarar variável (signo).
//Exibir menu com opções.
//Ler valor do usuário (scanner.nextInt()).
//Testar valor no switch (case 1 a 12).
//Executar bloco correspondente ao case ou default.
//Fechar scanner.

