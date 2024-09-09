salario = float(input())

if salario <= 0:
    print("Salário inválido")
elif salario <= 2000.00:
    print("Isento")
elif salario <= 3000.00:
    imposto = (salario - 2000.00) * 0.08
    print("R$ %.2f" % imposto)
elif salario <= 4500.00:
    imposto = (1000 * 0.08) + ((salario - 3000.00) * 0.18)
    print("R$ %.2f" % imposto)
else:
    imposto = (1000 * 0.08) + (1500 * 0.18) + ((salario - 4500.00) * 0.28)
    print("R$ %.2f" % imposto)