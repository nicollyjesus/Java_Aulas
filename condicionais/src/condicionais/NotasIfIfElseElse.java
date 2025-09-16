package condicionais;

import java.util.Scanner;

public class NotasIfIfElseElse {

//==================================================================================================	
//  IF / ELSE IF / ELSE: São estruturas condicionais que permitem executar blocos de código
//  apenas quando uma condição é verdadeira.
//  → Diferente dos laços de repetição, aqui não repetimos nada automaticamente, apenas escolhemos
//    qual bloco será executado dependendo da condição.
//  → É útil para tomar decisões, validar dados, aplicar regras diferentes dependendo da situação.
	//==================================================================================================		
	
    public static void main(String[] args) {    

        int idade;     
//  INT IDADE → Declara a variável que vai armazenar a idade do usuário.
//  Ainda não recebe valor, apenas reserva espaço na memória.

        Scanner scanner = new Scanner(System.in); 
//  CRIA UM OBJETO DO TIPO SCANNER → usado para capturar dados digitados no console.
//  System.in → indica que a leitura será feita a partir do teclado.

        System.out.println("Digite sua idade: ");
//  MOSTRA MENSAGEM NA TELA → pedindo para o usuário digitar a idade.

        idade = scanner.nextInt();
//  LÊ O VALOR DIGITADO PELO USUÁRIO e armazena na variável IDADE.
//  .nextInt() → indica que esperamos um valor inteiro.

        if (idade < 18) {
//  IF (idade < 18) → verifica a primeira condição.
//  Se a condição for verdadeira, executa o bloco dentro das chaves.
//  Neste caso, se a idade for menor que 18, o usuário é considerado menor de idade.

            System.out.println("Menor de idade");

        } else if (idade >= 18 && idade < 60) {
//  ELSE IF (idade >= 18 && idade < 60) → verifica a segunda condição, só é testada se o IF
//  anterior for falso.
//  Aqui, se a idade estiver entre 18 e 59, o usuário é considerado adulto.

            System.out.println("Adulto");

        } else {
//  ELSE → executa este bloco se todas as condições anteriores forem falsas.
//  Aqui, significa que a idade é 60 ou mais, então o usuário é considerado idoso.

            System.out.println("Idoso");
        }

        scanner.close();
    }
}


//                       COMO FUNCIONA NA PRÁTICA
// Se idade = 15 → verifica IF (15 < 18 = true) → imprime "Menor de idade"
// Se idade = 30 → IF (30 < 18 = false) → ELSE IF (30 >= 18 && 30 < 60 = true) → imprime "Adulto"
// Se idade = 65 → IF (65 < 18 = false) → ELSE IF (65 >= 18 && 65 < 60 = false) → ELSE → imprime "Idoso"

//                       RESULTADO NO CONSOLE:
//                        Digite sua idade: 30
//                             Adulto

//                           RESUMINDO
//IF / ELSE IF / ELSE → escolhe qual bloco de código será executado dependendo das condições.
//Não repete sozinho, apenas decide fluxo.
//Uso comum → validar dados, aplicar regras, responder diferentes cenários.

