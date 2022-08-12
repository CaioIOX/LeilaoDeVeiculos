class RepositorioMarca: Marca() {

    fun adicionar(m: Marca) {marca.add(m)}
    fun procurarMarca(name: String) {
        var temp: Marca? = null
        for (indice in marca.indices) {
            if (compareWithInput(name, indice)) {
                temp = marca[indice]
                println("Marca: ${nomeDaMarca(indice)}")
                println("Pais de Origem: ${paisDeOrigemDaMarca(indice)}")
                println("Pais de Produção: ${paisDeProducaoDaMarca(indice)}")
                break
            }
        }
        if (temp == null) {
            println("Marca não encontrada!")
        }
    }

    fun editarMarca(name: String) {
        for (indice in marca.indices) {
            try {
                if (compareWithInput(name, indice)) {
                    println("O que deseja alterar?" +
                            "\n1 - Nome da Marca"   +
                            "\n2 - País de Origem"  +
                            "\n3 - País de produção")
                    val respostaAlterar = readLine()?.toInt() ?: 0
                    when(respostaAlterar) {
                        1 -> {  println("Digite um novo nome para a marca: ")
                                val respostaNome = readLine()?:"Marca genérica"
                                marca[indice].setName(respostaNome)
                        }
                        2 -> {  println("Digite um novo pais de origem: ")
                                val respostaPaisDeOrigem = readLine()?: "Pais genérico"
                                marca[indice].setPaisDeOrigem(respostaPaisDeOrigem)
                        }
                        3 -> {  println("Digite um novo pais de produção: ")
                                val respostaPaisDeProducao = readLine()?: "Pais genérico"
                                marca[indice].setPaisDeProducao(respostaPaisDeProducao)
                        }
                        else -> println("Marca não encontrada!")
                    }
                }
            } catch (e: Exception) {
                println("Erro: Dados inválidos!")
            }
        }
    }

    fun removerMarca(name: String) {
        for (indice in marca.indices) {
            if (compareWithInput(name, indice)) {
                marca.remove(getMarca(indice))
            }
        }
    }

    fun isEmpty():Boolean {
        return marca.size == 0
    }
}