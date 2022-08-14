open class Modelo {
    private lateinit var name: String
    private lateinit var motorizacao: String
    private lateinit var tipoDeCombustivel: String
    private lateinit var marca: Marca
    var modelo = arrayListOf<Modelo>()

    fun Modelo(name: String, motorizacao: String, tipoDeCombustivel: String, marca: Marca) {
        this.name = name
        this.motorizacao = motorizacao
        this.tipoDeCombustivel = tipoDeCombustivel
        this.marca = marca
    }
    fun Modelo() {}
    fun getModelo(indice: Int): Modelo {return modelo[indice]}
    fun compareWithInput(name: String, indice: Int): Boolean {
        return nomeDoModelo(indice) == name.lowercase()
    }
    fun getName():String {return name}
    fun setName(name: String) {this.name = name}
    fun getMotorizacao(): String {return motorizacao}
    fun setMotorizacao(motorizacao: String) { this.motorizacao = motorizacao}
    fun getTipoDeCombustivel(): String {return tipoDeCombustivel}
    fun setTipoDeCombustivel(tipoDeCombustivel: String) {this.tipoDeCombustivel = tipoDeCombustivel}
    fun nomeDoModelo(indice: Int): String {return getModelo(indice).getName()}
    fun motorizacaoDoModelo(indice: Int): String {return getModelo(indice).getMotorizacao()}
    fun tipoDeCombustivelDoModelo(indice: Int): String {return getModelo(indice).getTipoDeCombustivel()}
}