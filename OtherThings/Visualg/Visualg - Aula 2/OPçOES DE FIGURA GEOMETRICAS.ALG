Algoritmo "Op�oes de figura geometricas"

Var
   Resposta : caracter
   B,H,R,L : inteiro
   A : real
   opcao : caracter
Inicio
      escreval("Digite (Q) para calcular quadrado")
      escreval("Digite (T) para calcular tri�ngulo")
      escreval("Digite (C) para calcular o circulo")
      leia(opcao)
        escolha Maiusc(opcao)

        caso ("Q")
        escreva("Digite o lado de seu qudrado: ")
        leia(L)
        A := L^2
        escreva("Sua area �:",A)
        
        caso ("T")
        escreva("Digite a base de seu triangulo: ")
        leia(B)
        escreva("Digite a altura de seu triangulo: ")
        leia(H)
        A := (B*H)/2
        escreva("Sua area �:",A)
        
        caso ("C")
        escreva("Digite o raio de seu circulo: ")
        leia(R)
        A := pi*(R^2)
        escreva("Sua area �:",A)
        
        
        fimescolha

Fimalgoritmo