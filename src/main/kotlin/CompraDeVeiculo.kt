class CompraDeVeiculo : AbstractPagamentos() {
    private var repositoriosDeVeiculoGlobal: RepositorioVeiculo = RepositorioVeiculo()
    override fun pagamentoAvista(lance: Double) {
        val lanceDeCompra: Double = lance - (lance * 0.1)
        println("O valor do veiculo será: $lanceDeCompra")
    }

    override fun pagamento12x(lance: Double) {
       entrada = lance * 0.3
       parcela = (lance - entrada)/12
       println("Para realizar a compra deve-se dar uma entrada de R$ $entrada " +
               "e as parcelas ficarão em R$ $parcela sem juros!")
    }

    override fun pagamento24x(lance: Double) {
        entrada =lance *0.2
        parcela =(lance - entrada)/24
        println("Para realizar a compra deve-se dar uma entrada de R$ $entrada " +
                "e as parcelas ficarão em R$ $parcela sem juros!")
    }
    fun confirmacaoDeCompra(id: String) {
        println("Deseja finalizar a compra? 1 - SIM/2 - NÃO")
        val compra = readLine()?.toInt() ?: 0
        if (compra == 1) {
            println("Compra realizada com sucesso!")
            repositoriosDeVeiculoGlobal.removerVeiculo(id)
        } else println("Compra concelada!")
    }

    fun comprarVeiculo() {
        repositoriosDeVeiculoGlobal.imprimirVeiculo()
        println("Digite o id do veiculo que deseja comprar:")
        val id = readLine()?.lowercase() ?: ""

        for (indice in repositoriosDeVeiculoGlobal.veiculo.indices) {
            if (repositoriosDeVeiculoGlobal.compareWithInput(id, indice)) {
                println("Quanto deseja pagar?")
                val lance = readLine()?.toDouble() ?: 0.0
                if (lance < repositoriosDeVeiculoGlobal.lanceMinimoDoVeiculo(indice)) {
                    println("Lance insuficiente!")
                } else {
                    println("Qual forma de pagamento deseja utilizar?:" +
                            "\n1 - A vista"          +
                            "\n2 - Em 12x sem juros" +
                            "\n3 - Em 24x sem juros" +
                            "\n4 - Desistir da compra")
                    when(readLine()?.toInt() ?: 0) {
                        1 -> confirmacaoDeCompra(id)
                        2 -> confirmacaoDeCompra(id)
                        3 -> confirmacaoDeCompra(id)
                        else -> println("Desistindo da compra...")
                    }
                }
            }
        }
    }
}