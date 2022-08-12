abstract class AbstractPagamentos {
    var entrada = 0.0
    var parcela = 0.0

    abstract fun pagamentoAvista(lance: Double): Double
    abstract fun pagamento12x(lance: Double): Double
    abstract fun pagamento24x(lance: Double): Double
}