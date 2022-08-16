
var resposta : Int = 0
private var repositoriosDeMarcaGlobal: RepositorioMarca = RepositorioMarca()
private var repositoriosDeModeloGlobal: RepositorioModelo = RepositorioModelo()
private var repositoriosDeVeiculoGlobal: RepositorioVeiculo = RepositorioVeiculo()
fun main(args: Array<String>) {
    val cadastro = Cadastro()
    val listaDeVeiculos = ListaDeVeiculos()

    do {
        println(
            "******* Bem vindo ao leilões de automóveis!! *******" +
            "\nDigite o número da opção que deseja realizar:" +
            "\n1 - Cadastro de veículo" +
            "\n2 - Ver lista de veículos" +
            "\n3 - Sair")
        when (readLine()?.toInt()) {
            1 -> {
                cadastro.cadastrar()
                resposta = 0
            }
            2 -> if (listaDeVeiculos.verificarSeExistemVeiculosCadastrados()) {
                listaDeVeiculos.exibirListaDeVeiculos()
                listaDeVeiculos.opcoesDaListaDeVeiculos()
            }
        }
    } while (resposta != 3)

    println("Leilão encerrado. Volte sempre!")
}