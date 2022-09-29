
Algoritmo "Opçoes de figura geometricas"

Var
   Resposta : caracter
   B,H,R,L : inteiro
   A : real
   opcao, resp : caracter
Inicio
      resp := "S"
      enquanto (Resp = "S") faca
      escreval("Digite (Q) para calcular quadrado")
      escreval("Digite (T) para calcular triângulo")
      escreval("Digite (C) para calcular o circulo")
      leia(opcao)
        escolha Maiusc(opcao)

        caso ("Q")
        escreva("Digite o lado de seu qudrado: ")
        leia(L)
        A := L^2
        escreval("Sua area é:",A)

        caso ("T")
        escreva("Digite a base de seu triangulo: ")
        leia(B)
        escreva("Digite a altura de seu triangulo: ")
        leia(H)
        A := (B*H)/2
        escreval("Sua area é:",A)

        caso ("C")
        escreva("Digite o raio de seu circulo: ")
        leia(R)
        A := pi*(R^2)
        escreval("Sua area é:",A)
        fimescolha
        escreva ("Deseja continuar (S/N)?")
        leia (resp)
        fimenquanto
Fimalgoritmo