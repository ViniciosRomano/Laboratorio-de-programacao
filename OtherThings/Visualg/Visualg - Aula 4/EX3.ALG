Algoritmo "ex3"
//
//
Var
   A,B,C,T,soma : inteiro


Inicio
      enquanto (A <= 1) faca
         limpatela
         escreva("Digite o valor de A (A>1): ")
         leia(A)
      fimenquanto

      enquanto (B <= A) faca
         limpatela
         escreva("Digite o valor de B (B>A): ")
         leia(B)
      fimenquanto
      
      enquanto (C <= B) faca
         limpatela
         escreva("Digite o valor de C (C>B): ")
         leia(C)
      fimenquanto
           soma := 0
           para T  de B ate C faca
                se (T mod A = 0) entao
                   soma := soma + T
                fimse
           fimpara
                  escreval ("soma = ", soma)
Fimalgoritmo