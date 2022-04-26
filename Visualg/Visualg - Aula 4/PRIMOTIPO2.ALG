Algoritmo "PrimoTIPO2"

var
   N,i: Inteiro
   primo : logico
inicio
   Escreva("Digite um numero: ")
   Leia(N)
   escreval()
   primo := verdadeiro
   para i de 2 ate (N-1) faca
      se (N mod i = 0) entao
         primo := falso
         interrompa
      FimSe
   fimpara

   Se (primo = verdadeiro) entao
      EscrevaL ("O valor ", N, " e primo!")
   senao
      EscrevaL ("O valor ", N, " nao e primo!")
   FimSe
fimalgoritmo