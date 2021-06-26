#Author: tribo 6


Feature: Validar chat online e busca de produtos
  Eu como usuario quero consultar produtos no campo de busca de produtos e quero tirar minhas duvidas pelo chat online

  
  Scenario: Validar chat online e busca de produtos
    Given eu esteja na pagina principal
    When clique no icone do chat online
    And escreva o nome do produto no campo de pesquisa e clique em procurar 
    Then valido as informacoes
    