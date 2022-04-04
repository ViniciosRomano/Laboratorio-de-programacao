Algoritmo "Verificando triangulo2.0"
//  
//  

Var
   A,B,C: inteiro
   T1,T2,T3:inteiro
Inicio
      escreva("Digite o valor de A: ")
      leia(A)
      escreva("Digite o valor de B: ")
      leia(B)
      escreva("Digite o valor de C: ")
      leia(C)
T1 := abs(B-C)
T2 := abs(A-C)
T3 := abs(C-B)
             se ((T1<A)e(A<B+C) e (T2<B) e (B<A+C) e (T3<C) e (C<A+B)) entao
                escreva("É um triangulo")
             senao
                  escreva("Nao é um triangulo")
             fimse
Fimalgoritmo
