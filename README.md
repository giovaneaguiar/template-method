<h1 align="center">Template Method</h1>

<p>O Template Method é um padrão de projeto comportamental que define o esqueleto de um algoritmo na 
  superclasse mas deixa as subclasses sobrescreverem etapas específicas do algoritmo sem modificar sua estrutura.
</p>

##

#### Exemplo 1

<p>
Resumidamente, meu exemplo implementa o padrão de projeto Template Method para modelar o processo de construção de diferentes tipos de casas. As classes envolvidas são:

- ConstrucaoCasa (Classe Abstrata):

Representa o esqueleto de um algoritmo para a construção de uma casa.
Métodos:
construirCasa(): Método template que define a sequência de etapas para construir uma casa.
prepararTerreno(): Método abstrato para preparar o terreno.
construirEstrutura(): Método abstrato para construir a estrutura da casa.
realizarAcabamento(): Método abstrato para realizar o acabamento na casa.
realizarLimpeza(): Método concreto que realiza a limpeza geral da obra.

##
- ConstrucaoCasaMadeira (Subclasse de ConstrucaoCasa):

Implementa as etapas específicas para a construção de uma casa de madeira.
Herda o método construirCasa() e fornece implementações para os métodos abstratos.
Pode sobrescrever métodos conforme necessário.
ConstrucaoCasaConcreto (Subclasse de ConstrucaoCasa):

Implementa as etapas específicas para a construção de uma casa de concreto.
Herda o método construirCasa() e fornece implementações para os métodos abstratos.
Pode sobrescrever métodos conforme necessário.

##
- ConstrucaoCasaConcreto (Subclasse de ConstrucaoCasa):

Implementa as etapas específicas para a construção de uma casa de concreto.
Herda o método construirCasa() e fornece implementações para os métodos abstratos.
Pode sobrescrever métodos conforme necessário.

</p>


