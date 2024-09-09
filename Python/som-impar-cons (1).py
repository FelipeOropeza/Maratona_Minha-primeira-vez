
X = int(input())
Y = int(input())
aux = 0
soma = 0
cont = 0

if (X > Y):

    aux = X
    X = Y
    Y = aux



while (X+1 != Y):

    X +=1

    if (X % 2 != 0):

        soma += X



print (soma)



