open class Marca() {
    constructor(nomeMarca: String, paisDeOrigem: String, paisDeProducao: String) : this() {
        this.name = nomeMarca
        this.paisDeOrigem = paisDeOrigem
        this.paisDeProducao = paisDeProducao
    }

    private lateinit var name: String
    private lateinit var paisDeOrigem: String
    private lateinit var paisDeProducao: String
    var marca = arrayListOf<Marca>()

    fun getMarca(indice: Int): Marca {return marca[indice]}
    fun compareWithInput(name: String, indice: Int): Boolean {return nomeDaMarca(indice) == name.lowercase()
    }
    private fun getName(): String {return name}
    fun setName(name: String) {this.name = name}
    private fun getPaisDeorigem():String {return paisDeOrigem}
    fun setPaisDeOrigem(paisDeOrigem: String) {this.paisDeOrigem = paisDeOrigem}
    private fun getPaisDeProducao(): String {return paisDeProducao}
    fun setPaisDeProducao(paisDeProducao: String) {this.paisDeProducao = paisDeProducao}
    fun nomeDaMarca(indice: Int): String {return getMarca(indice).getName()}
    fun paisDeOrigemDaMarca(indice: Int): String {return getMarca(indice).getPaisDeorigem()}
    fun paisDeProducaoDaMarca(indice: Int): String {return getMarca(indice).getPaisDeProducao()}


}