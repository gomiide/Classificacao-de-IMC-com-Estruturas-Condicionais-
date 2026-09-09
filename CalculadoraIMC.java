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
    return "PENDENTE";
}


String classificarFeminino(double imc) {
    return "PENDENTE";
}