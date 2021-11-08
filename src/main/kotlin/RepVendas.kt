class RepVendas(nome: String, sobrenome: String,
                registro: Int, idade: Int, diasTrabalhados: Int,
                diasFerias: Int, salario: Double, anosTrabalhados: Int,
                var vendas: Double
) : Funcionario(nome,
    sobrenome, registro, idade, diasTrabalhados, diasFerias, salario, anosTrabalhados
) {

    fun calculateComission(): Double {
        // comission = 0.1 * salesMade
        return 0.1 * vendas
    }

}