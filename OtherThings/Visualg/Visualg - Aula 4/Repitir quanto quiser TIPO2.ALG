
Algoritmo "Opçoes de figura geometricas"

Var
   Resposta,opcao, qqTecla : caracter
   B,H,R,L : inteiro
   A : real
   sair : logico
Inicio
      sair := falso
      enquanto (sair = falso) faca
      escreval("Digite (Q) para calcular quadrado")
      escreval("Digite (T) para calcular triângulo")
      escreval("Digite (C) para calcular o circulo")
      escreval("Digite (S) para sair")
      leia(opcao)
        escolha Maiusc(opcao)

        caso ("Q")
        escreval("Digite o lado de seu qudrado: ")
        leia(L)
        A := L^2
        escreval("Sua area é:",A)

        caso ("T")
        escreva("Digite a base de seu triangulo: ")
        leia(B)
        escreval("Digite a altura de seu triangulo: ")
        leia(H)
        A := (B*H)/2
        escreval("Sua area é:",A)

        caso ("C")
        escreval("Digite o raio de seu circulo: ")
        leia(R)
        A := pi*(R^2)
        escreval("Sua area é:",A)

        caso ("S")
        sair := verdadeiro
        escreval("Fim da execuçao")

        outrocaso
        escreva("Opçao invalida")
        fimescolha

        se (sair = falso) entao
        escreva("Precione qualquer tecla para continuar...")
        leia(qqTecla)
        fimse

        fimenquanto
Fimalgoritmo