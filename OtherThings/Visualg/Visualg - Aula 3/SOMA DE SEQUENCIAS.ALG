Algoritmo "Soma de sequencias"
//  
//  
//
//
Var
   A,B,T,aux : inteiro


Inicio
      escreval("Digite dois numeros")
      escreva("Digite o primeiro numero: ")
      leia(A)
      escreva("Digite o segundo numero: ")
      leia(B)
      
      se (A>B) entao
      aux := A
      A := B
      B := aux
      fimse
      se (A<B) entao
      escreval("O intervalo entre os numeros é: ")
           T := 0
           enquanto A+1<B faca
              B := B-1
              escreval(B)
                 se (B mod 2)=0 entao
                  T := T + B
                 fimse
           fimenquanto
      escreva("A soma de seus pares é:",T)
      senao
      escreva("Seu valor de B é menor que A")
      fimse

Fimalgoritmo
