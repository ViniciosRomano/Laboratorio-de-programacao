Algoritmo "Calculando catetos"

Var
      C1, C2,HIP : real

Inicio
      escreval("Calculando hipotenusa")
      escreva("Digite o primeiro cateto ")
      leia (C1)
      escreva("Digite o segundo cateto ")
      leia (C2)
      HIP := raizq((C1^2)+(C2^2))
      escreva("Hipotenusa é ", HIP)
      
Fimalgoritmo