fun main(args: Array<String>) {

    val maria = RepVendas(
        "Maria", "da Silva", 456,
        20, 15, 30, 2500.00,
        5, 450.0
    )

    val joao = RepVendas(
        "João", "da Silva", 123,
        18, 16, 30, 2600.00,
        5, 600.00
    )

    val clemente = RepVendas(
        "Clemente", "da Silva", 789,
        20, 15, 30, 2800.00,
        5, 800.00
    )

    val kleiton = GerenteVendas(
        "Kleiton", "da Silva", 789,
        20, 15, 30, 2800.00,
        5
    )

    println("***INFORMAÇÕES MARIA***")
    println(maria.tempoAteAposentadoria())
    println(maria.tempoAteFimDasFerias())
    println(maria.calcularBonus())
    println(maria.calculateComission())
    println("--------------------------")

    kleiton.addRepVendas(maria)
    kleiton.addRepVendas(joao)
    kleiton.addRepVendas(clemente)

    println("\nComissão da equipe toda:")
    kleiton.calculateComission()

}