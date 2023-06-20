### Definição do Projeto!

Olá! Você já ouviu falar do LAIL Bot? Ele é um chatbot criado especialmente para concessionárias de carros e vendedores que buscam melhorar a eficiência e a produtividade nas vendas, ao mesmo tempo em que oferecem uma experiência de atendimento ao cliente aprimorada.

O LAIL Bot é capaz de coletar informações importantes para o início de uma negociação de carros, como qual carro o cliente tem interesse, CPF, cor preferida, se tem carro para troca, entre outras informações relevantes. Além disso, ele gera relatórios mensais informando os progressos feitos na venda.

Com uma interface amigável, o LAIL Bot permite que os clientes interajam de forma rápida e conveniente, sem precisar esperar por um atendimento humano. Os dados coletados são armazenados de forma segura e podem ser acessados pelos vendedores a qualquer momento, facilitando o processo de venda e reduzindo o tempo de espera.

Em resumo, o LAIL Bot é uma ferramenta indispensável para quem trabalha com vendas de carros, pois simplifica o processo de coleta de informações e melhora a experiência do cliente. Se você busca aumentar a eficiência da sua concessionária e melhorar o atendimento ao cliente, o LAIL Bot é a escolha certa para você!

![Lail Otimização](</tela%20de%20login%20(1).png>)

### Scrum

## Etapas do Projeto

- Prototipo figma nosso projeto [FIGMA](https://www.figma.com/proto/u09ZLOHl2Nd9V8eEITABpk/Untitled?node-id=5%3A2&scaling=scale-down&page-id=0%3A1&starting-point-node-id=5%3A2)

## Papéis Scrum

### Product Owner: Hugo Souza

O Product Owner, representado por Hugo Souza, desempenha um papel fundamental no desenvolvimento do LAIL Bot. Ele é responsável por entender e representar os interesses dos stakeholders e do cliente. Trabalhando em estreita colaboração com a equipe de desenvolvimento, o Product Owner define e prioriza os requisitos do produto.

### Scrum Master: Warley Lemes

O Scrum Master, representado por Warley Lemes, desempenha um papel fundamental no desenvolvimento do LAIL Bot. Ele é responsável por garantir que a equipe de desenvolvimento siga os princípios e práticas do Scrum, criando um ambiente de trabalho colaborativo e eficiente.

Warley atua como um facilitador, ajudando a equipe a superar obstáculos e removendo interrupções externas. Ele lidera as reuniões diárias (daily scrum) e as reuniões de planejamento da sprint, garantindo que todos estejam alinhados e focados nos objetivos estabelecidos.

### Equipe de desenvolvimento:

- Maycon Soares
- Caio Marinho
- Matheus Campos
- Ivan Lucas

A equipe de desenvolvimento do LAIL Bot, composta por Maycon Soares, Caio Marinho, Matheus Campos e Ivan Lucas, desempenha um papel essencial no projeto. Com suas habilidades especializadas, eles trabalham em conjunto para transformar os requisitos em funcionalidades concretas. A equipe seleciona as histórias de usuário relevantes, mantendo uma comunicação clara e cumprindo prazos. Sua organização, comprometimento e expertise são fundamentais para o sucesso do LAIL Bot.

## Requisitos do produto

## User History do desenvolvimento

![User History / Backlog do Produto / Sprint](/image%201.png)


## Padrão escolhido: Padrão Observer

- Explicação do padrão:
O padrão Observer é um padrão comportamental que define uma dependência um-para-muitos entre objetos, de modo que quando um objeto muda de estado, todos os seus dependentes são notificados e atualizados automaticamente. Isso permite a comunicação eficiente e desacoplada entre objetos, garantindo que as alterações em um objeto sejam refletidas em outros objetos interessados.

- Motivo da escolha:
No contexto do projeto LAIL Bot, o padrão Observer pode ser aplicado para notificar os vendedores quando um cliente interage com o bot ou quando um novo relatório mensal é gerado. Dessa forma, os vendedores podem receber informações atualizadas sem a necessidade de consultar constantemente o estado do chatbot ou relatórios.

Explicação do papel de cada classe no padrão Observer:

- Classe LAILBot:
Funcionamento no padrão Observer: A classe LAILBot atua como o "Subject" (sujeito) do padrão Observer. Ela mantém uma lista de observadores (vendedores) registrados e é responsável por notificá-los quando ocorrerem eventos relevantes.

- Classe Vendedor:
Funcionamento no padrão Observer: A classe Vendedor atua como um "Observer" (observador) do padrão Observer. Ela se registra como observador do LAILBot para receber notificações quando ocorrerem eventos de interesse, como interações de clientes ou geração de relatórios.

- Classe Cliente:
Funcionamento no padrão Observer: A classe Cliente não está diretamente envolvida no padrão Observer, mas representa os clientes que interagem com o LAIL Bot. A coleta de informações do cliente pode ser realizada pelo LAILBot e, em seguida, notificações podem ser enviadas aos vendedores registrados.

- Classe Relatorio:
Funcionamento no padrão Observer: A classe Relatorio não está diretamente envolvida no padrão Observer, mas representa os relatórios mensais gerados pelo LAILBot. Quando um novo relatório é gerado, o LAILBot pode notificar os vendedores registrados para que eles possam ter acesso às informações atualizadas.
No padrão Observer, o LAILBot é o objeto central que mantém a lista de observadores (vendedores) e os notifica sobre eventos relevantes. Os vendedores são os observadores que se registram no LAILBot para receber notificações quando ocorrerem eventos específicos. Dessa forma, quando um cliente interage com o LAILBot ou um novo relatório é gerado, os vendedores registrados são automaticamente notificados e podem agir de acordo com as informações recebidas. Isso permite uma comunicação eficiente e desacoplada entre o LAILBot e os vendedores, melhorando a colaboração e a atualização de informações no contexto do projeto LAIL Bot.

## Resumo do esqueleto de classes 

Neste esqueleto, temos a classe LAILBot, que representa o "Subject" (sujeito) no padrão Observer. Ela mantém uma lista de observadores (Vendedor) e possui métodos para adicionar (attach) e remover (detach) observadores, além de um método para notificar (notifyVendedores) os observadores sobre eventos relevantes.

A interface Vendedor define o contrato para os observadores, com um método update que será implementado pelos vendedores concretos. No exemplo, temos a classe VendedorImpl que implementa a interface Vendedor e define a lógica para lidar com a mensagem recebida.

As demais classes, como Cliente e Relatorio, são apenas ilustrativas e representam outras entidades do projeto, que podem estar envolvidas na geração de eventos e notificações aos observadores.



## Tecnologias Usadas

- Figma
- Word
- Vscode
- ChatGPT
- Pictory

## Autores

- **Hugo de Souza Alves** **RA:622220322**
- **Warley Lemes** **RA:62112137**
- **Maycon Soares** **RA:622123119**
- **Caio Marinho** **RA:62113942**
- **Matheus Campos** **RA:62114792**
- **Ivan Lucas** **RA:622121965**
