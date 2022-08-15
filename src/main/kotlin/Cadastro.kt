import java.lang.Exception

class Cadastro {
    lateinit var marcaEscolhida : Marca
    lateinit var modeloEscolhido: Modelo
    var repositoriosDeMarcaGlobal: RepositorioMarca = RepositorioMarca()
    var repositoriosDeModeloGlobal: RepositorioModelo = RepositorioModelo()
    var repositoriosDeVeiculoGlobal: RepositorioVeiculo = RepositorioVeiculo()
    fun cadastrar() {
        println("Você deseja cadastrar:" +
                "\n1 - Marca" +
                "\n2 - Modelo" +
                "\n3 - Veiculo")
        resposta = readLine()?.toInt() ?: 0
        when(resposta) {
            1 -> cadastrarMarca()
            2 -> if (repositoriosDeMarcaGlobal.isEmpty()) {
                println("Primeiro cadastre uma Marca!")
                cadastrarMarca()
            } else cadastrarModelo()
            3 -> if (repositoriosDeMarcaGlobal.isEmpty()) {
                println("Primeiro cadastre uma Marca!")
                cadastrarMarca()
            } else if (repositoriosDeModeloGlobal.isEmpty()) {
                println("Primeiro cadastre um Modelo!")
            } else cadastrarVeiculo()
        }
    }
    fun cadastrarMarca() {
        try {
            println("Digite o nome da Marca:")
            val nomeMarca = readLine() ?: "Marca genérica"
            println("Digite o país de origem da Marca:")
            val paisDeOrigem = readLine() ?: "Pais genérico"
            println("Digite o país de produção da Marca:")
            val paisDeProducao = readLine() ?: "Pais genérico"

            repositoriosDeMarcaGlobal.adicionar(Marca(
                nomeMarca,
                paisDeOrigem,
                paisDeProducao))
            println("Marca cadastrada com sucesso!")
        } catch (e: Exception) {
            println("Erro: dados inválidos!")
        }
    }
    fun cadastrarModelo() {
        try {
            println("Digite o número correspondente da marca do veiculo:")
            repositoriosDeMarcaGlobal.imprimirMarcas()
            val marcaId = readLine()?.toInt() ?: 0
            marcaEscolhida = repositoriosDeMarcaGlobal.getMarca(marcaId - 1)
            println("Digite o nome do Modelo:")
            val nomeModelo = readLine() ?: "Modelo genérico"
            println("Digite o tipo do motor:")
            val motorizacao = readLine() ?: "Motor genérico"
            println("Digite o tipo de combustivel:")
            val tipoDeCombustivel = readLine() ?: "Gasolina"

            repositoriosDeModeloGlobal.adicionar(Modelo().Modelo(nomeModelo,
                motorizacao,
                tipoDeCombustivel,
                marcaEscolhida))
            println("Modelo cadastrado com sucesso!")
        } catch (e: Exception) {
            println("Erro: dados inválidos!")
        }
    }
    fun cadastrarVeiculo() {
        try {
        println("Digite um número correspondente do modelo do veiculo:")
        repositoriosDeModeloGlobal.imprimirModelo()
        val modeloId = readLine()?.toInt() ?: 0
        modeloEscolhido = repositoriosDeModeloGlobal.getModelo(modeloId - 1)
        println("Digte um id pro veiculo:")
        val id = readLine()
        println("Digite a cor do veiculo")
        val cor = readLine() ?: "cor genérica"
        println("Digite o ano do veiculo:")
        val ano = readLine()?.toInt()
        println("Digite a quilometragem do veiculo:")
        val quilometragem = readLine()?.toInt() ?: 0
        println("Digite o valor da dívida do veiculo:")
        val valorDaDivida = readLine()?.toDouble() ?: 0.0
        println("Digite o lance mínimo do veiculo:")
        val lanceMinimo = readLine()?.toDouble() ?: 0.0
        println("Descreva o estado de conservação do veiculo:")
        val descricao = readLine() ?: ""

        repositoriosDeVeiculoGlobal.anoDoVeiculo(Veiculo(
            cor,
            id,
            ano,
            quilometragem,
            valorDaDivida,
            lanceMinimo,
            descricao,
            modeloEscolhido))
        println("Veiculo cadastrado com sucesso!")
        } catch (e: Exception) {
            println("Erro: dados inválidos!")
        }
    }
}
