Algoritmo "FatorialNInverso"

Var
 Fat ,i ,N : inteiro
 Inicio
       N := -1
       enquanto ((N < 0) ou (N > 12)) faca
       escreva("Digite o valor de N(de 0 a 12): ")
       leia(N)
       fimenquanto
       escreval()

       fat := 1
       para i de N ate 1 passo -1 faca
            fat := fat * i
       fimpara
       
       escreval(N, "!=", fat)


Fimalgoritmo