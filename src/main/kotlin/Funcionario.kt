import kotlin.math.min

abstract class Funcionario (val nome: String, val sobrenome: String,
                   val registro: Int, var idade: Int, var diasTrabalhados: Int,
                   var diasFerias: Int, var salario: Double, var anosTrabalhados: Int
                   ) {

    fun tempoAteAposentadoria(): Int {
        // time to retirement = min(60 - age, 40 - yearsWorked)
        return min(60 - idade, 40 - anosTrabalhados)
    }

    fun tempoAteFimDasFerias(): Int {
        // vacation time left = (daysWorked/360)*(30 - vacationDaysTaken)
        return (diasTrabalhados/360)*(30 - diasFerias)
    }

    fun calcularBonus(): Double {
        // bonus = 2.2*salary
        return 2.2*salario
    }
}