open class Veiculo {
    private lateinit var cor: String
    private lateinit var id: String
    private var ano: Int = 0
    private var quilometragem: Int = 0
    private var valorDivida: Double = 0.0
    private var lanceMinimo: Double = 0.0
    private lateinit var descricao: String
    private lateinit var modelo: Modelo
    var veiculo = arrayListOf<Veiculo>()

    fun Veiculo(
        cor:String,
        id: String,
        ano:Int,
        quilometragem:Int,
        valorDivida:Double,
        lanceMinimo:Double,
        descricao:String,
        modelo:Modelo
    ) {
        this.cor = cor
        this.id = id
        this.ano = ano
        this.quilometragem = quilometragem
        this.valorDivida = valorDivida
        this.lanceMinimo = lanceMinimo
        this.descricao = descricao
        this.modelo = modelo
    }
    fun Veiculo() {}
    fun getVeiculo(indice: Int): Veiculo {return veiculo[indice]
    }
    fun compareWithInput(id: String, indice: Int): Boolean {return idDoVeiculo(indice).equals(id.lowercase())}
    fun setModelo(modelo: Modelo) {this.modelo = modelo}
    fun getDescricao(): String {return descricao}
    fun setDescricao(descricao: String) {this.descricao = descricao}
    fun getCor(): String {return cor}
    fun setCor(cor: String) {this.cor = cor}
    fun getId(): String {return id}
    fun setId(id: String) {this.id = id}
    fun getAno(): Int {return ano}
    fun setAno(ano: Int) {this.ano = ano}
    fun getQuilometragem(): Int {return quilometragem}
    fun setQuilometragem(quilometragem: Int) {this.quilometragem = quilometragem}
    fun getValorDivida(): Double {return valorDivida}
    fun setValorDivida(valorDivida: Double) {this.valorDivida = valorDivida}
    fun getLanceMinimo(): Double {return lanceMinimo}
    fun setLanceMinimo(lanceMinimo: Double) {this.lanceMinimo = lanceMinimo}
    fun idDoVeiculo(indice: Int): String {return getVeiculo(indice).getId()}
    fun corDoVeiculo(indice: Int): String {return getVeiculo(indice).getCor()}
    fun descricaoDoVeiculo(indice: Int): String {return getVeiculo(indice).getDescricao()}
    fun anoDoVeiculo(indice: Int): Int {return getVeiculo(indice).getAno()}
    fun quilometragemDoVeiculo(indice: Int): Int {return getVeiculo(indice).getQuilometragem()}
    fun dividaDoVeiculo(indice: Int): Double {return getVeiculo(indice).getValorDivida()}
    fun lanceMinimoDoVeiculo(indice: Int): Double {return getVeiculo(indice).getLanceMinimo()}

}