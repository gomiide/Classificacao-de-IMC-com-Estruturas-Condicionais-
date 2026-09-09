void main() {

    String nome = IO.readln("Informe seu nome: ");
    char genero = IO.readln("Informe seu gênero (M: masculino, F: feminino, N: prefiro não informar): ").charAt(0);
    double altura = Double.parseDouble(IO.readln("Informe sua altura (em metros, ex: 1.75): "));
    double peso = Double.parseDouble(IO.readln("Informe seu peso (em quilos, ex: 70.5): "));

    double imc = calcularIMC(peso, altura);
    String classificacao = "";

    switch (genero) {
        case 'M':
            classificacao = classificarMasculino(imc);
            break;

        case 'F':
            classificacao = classificarFeminino(imc);
            break;

        case 'N':
            classificacao = classificarFeminino(imc);
            break;

        default:
            IO.println("Gênero inválido! Utilizando classificação padrão (Feminino).");
            classificacao = classificarFeminino(imc);
            break;
    }

    IO.println("");
    IO.println("Nome: " + nome);
    IO.println("Gênero: " + genero);
    IO.println("IMC: " + String.format("%.1f", imc));
    IO.println("Classificação: " + classificacao);
    IO.println("");
    IO.println("Atitus Educação - O lado certo da força!!!");
}

double calcularIMC(double peso, double altura) {
    return peso / (altura * altura);
}


String classificarMasculino(double imc) {
    String resultado = "";

    if (imc >= 40) {
        resultado = "Obesidade Mórbida";
    } else if (imc >= 30) {
        resultado = "Obesidade Moderada";
    } else if (imc >= 25) {
        resultado = "Obesidade Leve";
    } else if (imc >= 20) {
        resultado = "Normal";
    } else {
        resultado = "Abaixo do Normal";
    }

    return resultado;
}

String classificarFeminino(double imc) {
    String resultado = "";

    if (imc >= 39) {
        resultado = "Obesidade Mórbida";
    } else if (imc >= 29) {
        resultado = "Obesidade Moderada";
    } else if (imc >= 24) {
        resultado = "Obesidade Leve";
    } else if (imc >= 19) {
        resultado = "Normal";
    } else {
        resultado = "Abaixo do Normal";
    }

    return resultado;
}
