private var repositoriosDeMarcaGlobal: RepositorioMarca = RepositorioMarca()
private var repositoriosDeModeloGlobal: RepositorioModelo = RepositorioModelo()
private var repositoriosDeVeiculoGlobal: RepositorioVeiculo = RepositorioVeiculo()
class RepositorioVeiculo: Veiculo() {
    private lateinit var modeloEscolhido: Modelo

    fun adicionarVeiculo(v: Veiculo) {veiculo.add(v)}

    fun procurarVeiculo(id: String) {
        for (indice in veiculo.indices) {
            if (compareWithInput(id, indice)) {
                println("Veiculo: $indice")
                println("ID: ${idDoVeiculo(indice)}")
                println("${repositoriosDeMarcaGlobal.nomeDaMarca(indice)} " +
                        "${repositoriosDeModeloGlobal.nomeDoModelo(indice)} Cor: ${corDoVeiculo(indice)}")
                println("Ano: ${anoDoVeiculo(indice)} Quilometragem: ${quilometragemDoVeiculo(indice)} " +
                        "Km Rodados: ${quilometragemDoVeiculo(indice)}")
                println("País de fabricação: ${repositoriosDeMarcaGlobal.paisDeOrigemDaMarca(indice)} " +
                        "País de produção: ${repositoriosDeMarcaGlobal.paisDeProducaoDaMarca(indice)}")
                println("Motor: ${repositoriosDeModeloGlobal.motorizacaoDoModelo(indice)} " +
                        "Tipos de combustivel: ${repositoriosDeModeloGlobal.tipoDeCombustivelDoModelo(indice)}")
                println("Valor da Divida: R$ ${dividaDoVeiculo(indice)}" +
                        "Lance Minimo: R$ ${lanceMinimoDoVeiculo(indice)}")
                println("Estado de conservação: ${descricaoDoVeiculo(indice)}")
                println()
            } else println("Veiculo não encontrado!")
        }
    }
    fun editarVeiculo(id: String) {
        for (indice in veiculo.indices) {
            try {
                if (compareWithInput(id, indice)) {
                    println("O que deseja alterar?" +
                            "\n1 - Cor" +
                            "\n2 - Ano" +
                            "\n3 - Quilometragem" +
                            "\n4 - Valor da divida" +
                            "\n5 - Lance mínimo" +
                            "\n6 - Estado de econservação" +
                            "\n7 - Modelo" +
                            "\n8 - Id do veículo")
                    when(readLine()?.toInt() ?: 0) {
                        1 -> {
                            println("Escolha uma cor:")
                            val novaCor = readLine() ?: "Cor genérica"
                            veiculo[indice].setCor(novaCor)
                            println("Cor alterada para $novaCor com sucesso!")
                        }
                        2 -> {
                            println("Escolha um novo ano:")
                            val novoAno = readLine()?.toInt() ?: 2000
                            veiculo[indice].setAno(novoAno)
                            println("Ano alterado para $novoAno com sucesso!")
                        }
                        3 -> {
                            println("Escolha uma nova quilometragem:")
                            val novaQuilometragem = readLine()?.toInt() ?: 0
                            veiculo[indice].setQuilometragem(novaQuilometragem)
                            println("Quilometragem alterada para $novaQuilometragem com sucesso!")
                        }
                        4 -> {
                            println("Digite um novo valor da dívida:")
                            val novaDivida = readLine()?.toDouble() ?: 0.0
                            veiculo[indice].setValorDivida(novaDivida)
                            println("Valor da dívida alterado para $novaDivida com sucesso!")
                        }
                        5 -> {
                            println("Digite um novo lance mínimo:")
                            val novoLanceMinimo = readLine()?.toDouble() ?: 0.0
                            veiculo[indice].setLanceMinimo(novoLanceMinimo)
                            println("Lance mínimo alterado para $novoLanceMinimo com sucesso!")
                        }
                        6 -> {
                            println("Digite um novo estado de conservação:")
                            val novaDescricao = readLine() ?: ""
                            veiculo[indice].setDescricao(novaDescricao)
                            println("Descrição alterada com sucesso!")
                        }
                        7 -> {
                            println("Digite o número correspondente do novo modelo do veiculo: ")
                            repositoriosDeModeloGlobal.imprimirModelo()
                            val modeloId = readLine()?.toInt() ?: 0
                            modeloEscolhido = repositoriosDeModeloGlobal.getModelo(modeloId-1)
                            repositoriosDeVeiculoGlobal.getVeiculo(indice).setModelo(modeloEscolhido)
                        }
                        8 -> {
                            println("Escolha o novo id do veiculo:")
                            val novoId = readLine() ?: ""
                            veiculo[indice].setId(novoId)
                        }
                        else -> println("Opção não disponivel!")
                    }
                } else println("Veiculo não encontrado!")
            } catch (e: Exception) {
                println("Erro: Dados inválidos!")
            }
        }
    }

    fun removerVeiculo(id: String) {
        for (indice in veiculo.indices) {
            if (compareWithInput(id, indice)) {
                veiculo.remove(getVeiculo(indice))
                println("Veiculo removido com sucesso!")
            }
        }
    }

    fun imprimirVeiculo() {
        for (indice in veiculo.indices) {
            println("##########")
            println("Veiculo: ${indice+1}")
            println("ID: ${idDoVeiculo(indice)}")
            println("Veiculo: ${repositoriosDeMarcaGlobal.nomeDaMarca(indice)} " +
                    repositoriosDeModeloGlobal.nomeDoModelo(indice)
            )
            println("Valor da dívida: R$ ${dividaDoVeiculo(indice)} " +
                    "Lance Minimo: R$ ${lanceMinimoDoVeiculo(indice)} \n")
        }
    }
    fun isEmpty():Boolean {return veiculo.isEmpty()}
}