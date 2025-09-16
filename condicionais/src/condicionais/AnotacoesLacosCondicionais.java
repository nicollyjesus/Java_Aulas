//========================>    LAÇOS CONDICIONAIS (IF / ELSE IF / ELSE)    <========================
// Usamos para tomar decisões no código, executando blocos diferentes dependendo de uma condição.
// Estrutura: condição entre parênteses; bloco de código entre chaves.

//                         PASSO A PASSO:
// verifica se a condição do "if" é verdadeira
//     se for verdadeira, executa o bloco de código do "if"
// se não for, verifica a condição do "else if" (opcional)
//     se a condição do "else if" for verdadeira, executa esse bloco
// se nenhuma condição for verdadeira, executa o bloco do "else" (opcional)
// USO TÍPICO: decidir fluxo do programa, aplicar regras, validar dados do usuário, responder diferentes cenários

//========================>    EXEMPLO PRÁTICO    <========================
//                          int idade = 20;

//                	if (idade < 18) {
//                     System.out.println("Menor de idade");
//          		} else if (idade >= 18 && idade < 60) {
//    					System.out.println("Adulto");
// 					} else {
//     					System.out.println("Idoso");
// 					}

//========================>    OBSERVAÇÕES IMPORTANTES    <========================
// IF → verifica uma condição, executa o bloco se for verdadeira.
// ELSE IF → verifica outra condição se a primeira for falsa; pode ter vários.
// ELSE → executa se nenhuma condição anterior for verdadeira; é opcional.
// CONDIÇÕES → sempre retornam verdadeiro (true) ou falso (false).
// ATENÇÃO → esquecer de usar chaves {} pode gerar erros ou executar apenas a primeira linha do bloco.
//=======================================================================================================================
//=======================================================================================================================

//                        DIFERENÇAS PRINCIPAIS
// LAÇOS CONDICIONAIS → decidem se algo será executado ou não, não repetem sozinho.
// IF / ELSE IF / ELSE → permite criar fluxos de decisão com múltiplas possibilidades.
// FOR / WHILE / DO WHILE → repetem blocos de código (loop), enquanto a condição for verdadeira.
// ======> ATENÇÃO: sempre garanta que suas condições estejam corretas para não pular ou repetir blocos indevidamente. <======
