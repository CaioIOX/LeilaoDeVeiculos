open class Marca() {

    private var name = ""
    private var paisDeOrigem = ""
    private var paisDeProducao = ""
    var marca = arrayListOf<Marca>()

    fun Marca(name: String, paisDeOrigem: String, paisDeProducao: String) {
        this.name = name
        this.paisDeOrigem = paisDeOrigem
        this.paisDeProducao = paisDeProducao
    }

    fun Marca() {}
    fun getMarca(indice: Int): Marca {return marca[indice]}
    fun compareWithInput(name: String, indice: Int): Boolean {return nomeDaMarca(indice) == name.lowercase()
    }
    fun getName(): String {return name}
    fun setName(name: String) {this.name = name}
    fun getPaisDeorigem():String {return paisDeOrigem}
    fun setPaisDeOrigem(paisDeOrigem: String) {this.paisDeOrigem = paisDeOrigem}
    fun getPaisDeProducao(): String {return paisDeProducao}
    fun setPaisDeProducao(paisDeProducao: String) {this.paisDeProducao = paisDeProducao}
    fun nomeDaMarca(indice: Int): String {return getMarca(indice).getName()}
    fun paisDeOrigemDaMarca(indice: Int): String {return getMarca(indice).getPaisDeorigem()}
    fun paisDeProducaoDaMarca(indice: Int): String {return getMarca(indice).getPaisDeProducao()}


}