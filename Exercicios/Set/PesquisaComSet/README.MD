# Pesquisa em Set
## 1. Agenda de Contatos
   Crie uma classe chamada "AgendaContatos" que possui um conjunto de objetos do tipo "Contato" como atributo. Cada contato possui atributos como nome e número de telefone. Implemente os seguintes métodos:

* ```adicionarContato(String nome, int numero)```: Adiciona um contato à agenda.
* ```aexibirContatos()```: Exibe todos os contatos da agenda.
* ```apesquisarPorNome(String nome)```: Pesquisa contatos pelo nome e retorna uma conjunto com os contatos encontrados.
* ```aatualizarNumeroContato(String nome, int novoNumero)```: Atualiza o número de telefone de um contato específico.
## 2. Lista de Tarefas
   Crie uma classe chamada "ListaTarefas" que possui um conjunto de objetos do tipo "Tarefa" como atributo. Cada tarefa possui um atributo de descrição e um atributo booleano para indicar se a tarefa foi concluída ou não. Implemente os seguintes métodos:

* ```aadicionarTarefa(String descricao)```: Adiciona uma nova tarefa ao Set.
* ```aremoverTarefa(String descricao)```: Remove uma tarefa do Set de acordo com a descrição, se estiver presente.
* ```aexibirTarefas()```: Exibe todas as tarefas da lista de tarefas.
* ```acontarTarefas()```: Conta o número total de tarefas na lista de tarefas.
* ```aobterTarefasConcluidas()```: Retorna um Set com as tarefas concluídas.
* ```aobterTarefasPendentes()```: Retorna um Set com as tarefas pendentes.
* ```amarcarTarefaConcluida(String descricao)```: Marca uma tarefa como concluída de acordo com a descrição.
* ```amarcarTarefaPendente(String descricao)```: Marca uma tarefa como pendente de acordo com a descrição.
* ```alimparListaTarefas()```: Remove todas as tarefas da lista de tarefas.