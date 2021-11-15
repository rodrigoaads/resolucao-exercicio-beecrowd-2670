/*
Resolução exercicio beecrowd | 2670

Máquina de Café
Por Maratona de Programção da SBC, ACM ICPC 2017 Brazil

O novo prédio da Sociedade Brasileira de Computação (SBC) possui 3 andares. Em determinadas épocas do ano, os funcionários da SBC bebem muito café. Por conta disso, a presidência da SBC decidiu presentear os funcionários com uma nova máquina de expresso.
Esta máquina deve ser instalada em um dos 3 andares, mas a instalação deve ser feita de forma que as pessoas não percam muito tempo subindo e descendo escadas.
Cada funcionário da SBC bebe 1 café expresso por dia. Ele precisa ir do andar onde trabalha até o andar onde está a máquina e voltar para seu posto de trabalho.
Todos os funcionários levam 1 minuto para subir ou descer um andar. Como a SBC se importa muito com a eficiência, ela quer posicionar a máquina de forma a minimizar o tempo total gasto subindo e descendo escadas.
Sua tarefa é ajudar a diretoria a posicionar a máquina de forma a minimizar o tempo total gasto pelos funcionários subindo e descendo escadas.

Entrada
A entrada consiste em 3 números, A1 , A2 , A3 (0 ≤ A1 , A2 , A3 ≤ 1000), um por linha, onde Ai representa o número de pessoas que trabalham no i-ésimo andar.

Saída
Seu programa deve imprimir uma única linha, contendo o número total de minutos a serem gastos com o melhor posicionamento possível da máquina.
 */

fun main() {

    val a = readLine().toString().toInt()
    val b = readLine().toString().toInt()
    val c = readLine().toString().toInt()

    val list: List<Int> = listOf(a, b, c)
    exec(list)

}

fun exec(list: List<Int>) {
    val listProb = calcProb(list)

    var mValue = listProb[0]
    listProb.forEach {
        if (it < mValue){
            mValue = it
        }
    }
    println(mValue)

}

fun calcProb(list: List<Int>): List<Int> {
    val prob1 = (list[0] * 4) + (list[1] * 2)
    val prob2 = (list[2] * 4) + (list[1] * 2)
    val prob3 = (list[0] * 2) + (list[2] * 2)

    return mutableListOf(prob1, prob2, prob3)
}
