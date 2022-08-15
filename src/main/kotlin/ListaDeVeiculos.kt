class ListaDeVeiculos {
    var repositoriosDeMarcaGlobal: RepositorioMarca = RepositorioMarca()
    var repositoriosDeModeloGlobal: RepositorioModelo = RepositorioModelo()
    var repositoriosDeVeiculoGlobal: RepositorioVeiculo = RepositorioVeiculo()
    var comprarVeiculos: CompraDeVeiculo = CompraDeVeiculo()

    fun verificarSeExistemVeiculosCadastrados(): Boolean {
        return if (repositoriosDeVeiculoGlobal.isEmpty()) {
            println("Não há veiculos cadastrados!")
            false
        } else true
    }
    fun exibirListaDeVeiculos() {
        repositoriosDeVeiculoGlobal.imprimirVeiculo()
        }
    fun opcoesDaListaDeVeiculos() {
        println("Você deseja:" +
                "\n1 - Alterar as informações de algum veículo" +
                "\n2 - Alterar as informações de alguma marca" +
                "\n3 - Alterar as informaões de algum modelo" +
                "\n4 - Remover veículo da lista" +
                "\n5 - Ver todas as informações do veiculo" +
                "\n6 - Comprar um veículo" +
                "\n7 - Voltar ao menu anterior")
        when(readLine()?.toInt() ?: 0) {
            1 -> {
                println("Digite o id do veiculo que deseja alterar as informações:")
                val editarVeiculo = readLine() ?: ""
                repositoriosDeVeiculoGlobal.editarVeiculo(editarVeiculo)
            }
            2 -> {
                println("Digite o nome da Marca que deseja alterar as informações:")
                val editarMarca = readLine() ?: ""
                repositoriosDeMarcaGlobal.editarMarca(editarMarca)
            }
            3 -> {
                println("Digite o nome do Modelo que deseja alterar as informações:")
                val editarModelo = readLine() ?: ""
                repositoriosDeModeloGlobal.editarModelo(editarModelo)
            }
            4 -> {
                println("Qual id do veiculo que deseja remover?")
                val removerVeiculo = readLine() ?: ""
                repositoriosDeVeiculoGlobal.removerVeiculo(removerVeiculo)
            }
            5 -> {
                println("Qual id do veiculo que deseja buscar?")
                val buscarVeiculo = readLine() ?: ""
                repositoriosDeVeiculoGlobal.procurarVeiculo(buscarVeiculo)
            }
            6 -> comprarVeiculos.comprarVeiculo()
            else -> {}
        }
    }
}