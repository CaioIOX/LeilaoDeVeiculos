class CompraDeVeiculo : AbstractPagamentos() {
    override fun pagamentoAvista(lance: Double) {
        lance -= lance * 0.1
        println("O valor do veiculo será: $lance")
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

    fun compraVeiculo() {

    }
}