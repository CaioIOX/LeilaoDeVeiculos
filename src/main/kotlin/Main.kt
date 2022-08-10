
var resposta : Int = 0
fun main(args: Array<String>) {
    val cadastro = Cadastro()

    do {
        println(
            "******* Bem vindo ao leilões de automóveis!! *******" +
            "\nDigite o número da opção que deseja realizar:" +
            "\n1 - Cadastro de veículo" +
            "\n2 - Ver lista de veículos" +
            "\n3 - Sair")
            resposta = readLine()?.toInt() ?: 0

        when (resposta) {
            1 -> cadastro.cadastrar()
            2 ->
        }
    } while (resposta != 3)
}