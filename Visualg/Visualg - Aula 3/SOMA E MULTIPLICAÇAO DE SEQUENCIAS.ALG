Algoritmo "Soma de sequencias"
//  
//  
//
//
Var
   A,B,T,soma, mult : inteiro


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
           soma := 0
           mult := 1
           para T de A ate B faca
             se (T mod 2=0) entao
             soma := soma + T
             senao
             mult := mult * T
                 fimse
           fimpara
      escreval("A soma de seus pares é:",soma)
      escreva("A multiplicaçao de seus impares", mult)
      senao
      escreva("Seu valor de B é menor que A")
      fimse

Fimalgoritmo