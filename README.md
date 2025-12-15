Console Task Manager (Java)

Oiee, esse projeto é um gerenciador de tarefas via terminal, desenvolvido em Java, com foco em programação orientada a objetos (OOP), organização de código e validação de entrada do usuário tratando os bugs.

O sistema permite criar, visualizar, concluir e remover tarefas por meio de um menu interativo no terminal, simulando um pequeno sistema real de controle de tarefas.

Funcionalidades
Adicionar tarefas
Criação de tarefas com ID automático e descrição definida pelo usuário.
Listar tarefas
Exibição de todas as tarefas cadastradas, incluindo:
ID
Descrição
Status (✔ || ❌)

✔ Concluir tarefas
Marcação de tarefas como concluídas a partir do ID informado.

\Remover tarefas
Exclusão de tarefas específicas pelo ID.

Validação de entrada
Tratamento de entradas inválidas (ex: letras no lugar de números), evitando falhas na execução do programa e garantindo a funcionalidade :)

Menu em loop até o usuário escolher encerrar o sistema.

Arquitetura e Organização
O projeto foi estruturado de forma modular, separando responsabilidades:

Main
Controla o fluxo principal da aplicação.
Gerencia a lista de tarefas.
Conecta a interface de console com a lógica do sistema.

Task
Representa o modelo de dados da tarefa.
Contém:
ID
Descrição
Status de conclusão
Responsável por exibir suas próprias informações.

ConsoleUI
Centraliza a interface de console.
Exibe o menu principal.
Realiza leitura e validação segura de dados do usuário.

Essa separação melhora:
Legibilidade
Manutenção
Escalabilidade do código

Tecnologias Utilizadas

Java
ArrayList para gerenciamento dinâmico de dados
Scanner para entrada de dados via console
Programação Orientada a Objetos (OOP)
