//========================>    FOR    <========================
// Usamos quando sabemos exatamente quantas vezes o laço precisa rodar.
// Estrutura: inicialização, condição e incremento no mesmo lugar.

//                         PASSO A PASSO:
// inicializa variável de controle
// verifica se a condição é verdadeira
// executa o bloco de código
// incrementa ou atualiza a variável de controle
// repete enquanto a condição for verdadeira
// USO TÍPICO: repetir algo um número fixo de vezes, percorrer listas ou arrays com tamanho definido.

//========================>    WHILE    <========================
// Usamos quando não sabemos quantas vezes o laço vai rodar; depende de uma condição.
// Estrutura: apenas a condição no cabeçalho; inicialização e atualização ficam dentro do bloco.

//                         PASSO A PASSO:
// inicializa variável de controle ou condição antes do laço
// verifica se a condição é verdadeira
// executa o bloco de código
// atualiza a variável de controle ou condição
// repete enquanto a condição for verdadeira
// USO TÍPICO: ler dados até o usuário digitar algo específico, aguardar até que uma condição seja satisfeita.

//========================>    DO WHILE    <========================
// Usamos quando queremos que o bloco rode pelo menos uma vez, mesmo que a condição já seja falsa.
// Estrutura: bloco executa primeiro, depois verifica a condição.

//                           PASSO A PASSO:
// inicializa variável de controle ou condição antes do laço
// executa o bloco de código
// atualiza a variável de controle ou condição
// verifica se a condição é verdadeira
// repete se a condição for verdadeira, encerra se for falsa
// USO TÍPICO: menus que devem aparecer pelo menos uma vez, operações que precisam ser executadas no mínimo uma vez, pedir senha ou confirmação.
//=================================================================================================================================
//=================================================================================================================================

//                        DIFERENÇAS PRINCIPAIS
// FOR → laço controlado, contagem fixa, inicialização, condição e incremento juntos.
// WHILE → laço condicional, condição verificada antes, inicialização e incremento fora do cabeçalho.
// DO WHILE → condição verificada depois, garante execução mínima de 1 vez.

// ======> ATENÇÃO: esquecer de atualizar a variável de controle no WHILE ou DO WHILE causa loop infinito. <======