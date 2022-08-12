class RepositorioMarca: Marca() {

    fun adicionar(m: Marca) {marca.add(m)}
    fun procurarMarca(name: String) {
        var temp: Marca? = null
        for (indice in marca.indices) {
            if (compareWithInput(name, indice)) {
                temp = marca[indice]
            }
        }
    }
}