Algoritmo "Verificando triangulo2.0"

Var
   A,B,C: inteiro
Inicio
      escreva("Digite o valor de A: ")
      leia(A)
      escreva("Digite o valor de B: ")
      leia(B)
      escreva("Digite o valor de C: ")
      leia(C)
             se ((abs(B-C)<A)e(A<B+C) e (abs(A-C)<B) e (B<A+C) e (abs(C-B)<C) e (C<A+B)) entao
                escreva("� um triangulo")
             senao
                  escreva("Nao � um triangulo")
             fimse
Fimalgoritmo
