Algoritmo "VerificaTriangulo"
Var
   a,b,c : real
Inicio
      escreva("Digite o valor do lado A de seu triangulo: ")
      leia(a)
      escreva("Digite o valor do lado B de seu triangulo: ")
      leia(b)
      escreva("Digite o valor do lado C de seu triangulo: ")
      leia(c)
      se (a<b+c)e(b<a+c)e(c<a+b) entao
      escreva("E um triangulo")
      senao
      escreva("Não é um triangulo")
      fimse

Fimalgoritmo