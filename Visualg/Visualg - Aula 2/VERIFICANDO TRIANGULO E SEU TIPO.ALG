Algoritmo "Verificando triangulo e seu tipo"

Var
   A,B,C: inteiro
   V : logico
Inicio
      escreva("Digite o valor de A: ")
      leia(A)
      escreva("Digite o valor de B: ")
      leia(B)
      escreva("Digite o valor de C: ")
      leia(C)
        se ((abs(B-C)<A)e(A<B+C) e (abs(A-C)<B) e (B<A+C) e (abs(C-B)<C) e (C<A+B)) entao
             V := verdadeiro
        senao
             escreval("Nao é um triangulo")
        fimse
             se V = verdadeiro entao
                se (A = B) e (A = C) e (B = C) entao
               escreva ("Triângulo equilátero")
                senao
                    se ((A = B) e (A <> C)) ou ((A = C) e (A <> B)) ou ((B = C) e (B <> A)) entao
                    escreva("É um triangulo isoceles")
                       senao
                        se (A <> C) e (A <> B)e (B <> A)entao
                        escreva("É um triangulo escaleno")
                        fimse
                    fimse
                fimse
             fimse
Fimalgoritmo
