class RepositorioModelo : Modelo() {
    fun adicionar(m: Modelo) {modelo.add(m)}
    fun procurarModelo(name: String) {
        var temp: Modelo? = null
        for (indice in modelo.indices) {
            if (compareWithInput(name, indice)) {
                temp = getModelo(indice)
                println("Modelo: ${nomeDoModelo(indice)}")
                println("Motorização: ${motorizacaoDoModelo(indice)}")
                println("Tipo de Combustível: ${tipoDeCombustivelDoModelo(indice)}")
                println()
                break
            }
        }
        if (temp == null) {
            println("Modelo não encontrado!")
        }
    }
    fun editarModelo(name: String) {
        for (indice in modelo.indices) {
            if (compareWithInput(name, indice)) {
                println("O que deseja alterar?" +
                        "\n1 - Nome do modelo"  +
                        "\n2 - Motorização"     +
                        "\n3 - Tipo de gasolina")
                when(readLine()?.toInt() ?: 0) {
                    1 -> {  println("Digite um novo nome para o Modelo: ")
                            val respostaNome = readLine() ?: "Modelo genérico"
                            getModelo(indice).setName(respostaNome)
                    }
                    2 -> {  println("Digite uma nova motorização: ")
                            val respostaMotorizacao = readLine() ?: "Motorização genérica"
                            getModelo(indice).setMotorizacao(respostaMotorizacao)
                    }
                    3 -> {  println("Digite um tipo de combustivel diferente usado: ")
                            val respostaTipoDeCombustivel = readLine() ?: "Gasolina"
                            getModelo(indice).setTipoDeCombustivel(respostaTipoDeCombustivel)
                    }
                    4 -> println("Modelo não encontrado!")
                }
            }
        }
    }
    fun removerModelo(name: String) {
        for (indice in modelo.indices) {
            if (compareWithInput(name, indice)) modelo.remove(getModelo(indice))
        }
    }
    fun imprimirModelo() {
        for (indice in modelo.indices) {
            println("# ${indice+1} - ${nomeDoModelo(indice)}")
        }
    }
    fun isEmpty():Boolean {return modelo.isEmpty()}
}