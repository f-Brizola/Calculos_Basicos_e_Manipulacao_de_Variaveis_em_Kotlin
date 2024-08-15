fun main() {

    var nome: String = "alice"
    var idade: Int = 19
    var salario: Double = 2000.00
    var mesesTrabalho: Int = 12
    var produtosComprados: Int = 150
    var valorProdutos: Int = 3


    fun SalAnualB(a: Double =salario, b: Int = mesesTrabalho): Double {
        return a * b
        }

    fun SalAnualL(a: Double =SalAnualB()): Double {
        return a * 0.9
    }

    fun MediaProdutos(a: Int = produtosComprados, b: Int = valorProdutos): Int {
        return a/b
    }

    fun saudacao(nome: String) {
        println("Olá, $nome!, O seu sálario anual liquido é ${SalAnualL()}")
    }

    println("O sálario anual bruto é ${SalAnualB()}")
    println("O sálario anual liquido é ${SalAnualL()}")
    println("A media do valor gasto por produto é ${MediaProdutos()}")
    println(saudacao(nome))

    println("Nome: $nome")
    println("Idade:$idade")
    println("Sálario: $salario")
    println("Meses de Trabalho: $mesesTrabalho")
    println("Produtos Comprados: $produtosComprados")
    println("Valor por Produtos: $valorProdutos")
}