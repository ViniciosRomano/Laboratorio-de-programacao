Algoritmo "Opçoes de figura geometricas"
Var
   Resposta : caracter
   B,H,R,L,bzin,D, dzin : inteiro
   A : real
   opcao : caracter
Inicio
      escreval("Digite (Q) para calcular quadrado")
      escreval("Digite (R) para calcular retangulo")
      escreval("Digite (T) para calcular triângulo")
      escreval("Digite (P) para calcular trapézio")
      escreval("Digite (L) para calcular losango")
      escreval("Digite (C) para calcular o circulo")
      escreva("Minha opção é ")
      leia(opcao)
        escolha Maiusc(opcao)

        caso ("Q")
        escreva("Digite o lado de seu qudrado: ")
        leia(L)
        A := L^2
        escreva("Sua area é:",A)
        
        caso ("R")
        escreva("Digite a altura de seu retangulo: ")
        leia(H)
        escreva("Digite a base de seu retangulo: ")
        leia(B)
        A := B*H
        escreva("Sua area é:",A)
        
        caso ("T")
        escreva("Digite a base de seu triangulo: ")
        leia(B)
        escreva("Digite a altura de seu triangulo: ")
        leia(H)
        A := (B*H)/2
        escreva("Sua area é:",A)
        
        caso ("P")
        escreva("Digite a base maior de seu trapezio: ")
        leia(B)
        escreva("Digite a base menor de seu trapezio: ")
        leia(bzin)
        escreva("Digite a altura de seu trapezio: ")
        leia(H)
        A := ((B+bzin)*H)/2
        escreva("Sua area é:",A)

        caso ("L")
        escreva("Digite a diagonal maior de seu qudrado: ")
        leia(D)
        escreva("Digite a diagonal menor de seu qudrado: ")
        leia(dzin)
        A := (D*dzin)/2
        escreva("Sua area é:",A)
        
        caso ("C")
        escreva("Digite o raio de seu circulo: ")
        leia(R)
        A := pi*(R^2)
        escreva("Sua area é:",A)
        
        fimescolha
  Fimalgoritmo