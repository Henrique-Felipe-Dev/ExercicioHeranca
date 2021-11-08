class GerenteVendas(
    nome: String, sobrenome: String, registro: Int, idade: Int,
    diasTrabalhados: Int, diasFerias: Int, salario: Double,
    anosTrabalhados: Int
) : Funcionario(
    nome, sobrenome, registro, idade, diasTrabalhados, diasFerias,
    salario, anosTrabalhados
) {

    val equipeVendas = hashMapOf<Int, RepVendas>()

    fun addRepVendas(repVendas: RepVendas){
        equipeVendas.put(repVendas.registro, repVendas)
    }

    fun calculateComission() {
        // 0.03 * all sales made by team
        var numVendas = 0.0
        if(equipeVendas.isEmpty()){
            println("Não há Representantes de Vendas na equipe")
        }else{
            for (item in equipeVendas){
                numVendas += item.value.vendas
            }
            val comissao = 0.03 * numVendas

            println("A comissão geral, com base nas vendas realizadas peala equipe" +
                    " é R$$comissao")
        }

    }

}