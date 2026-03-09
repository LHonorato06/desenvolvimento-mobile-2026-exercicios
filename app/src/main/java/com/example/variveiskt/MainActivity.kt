package com.example.variveiskt

import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    fun main() {
        var idade = 19
        var altura = 1.80
        var nome: String? = "lucas"
        nome = null

        val tamanho = nome?.length

        println("Meu nome é $nome, eu tenho $altura de altura e tenho $idade")
    }
    fun calculadora(numero1: Double, numero2: Double, operacao:String): Double{
        if (operacao=="+"){
            return numero1 + numero2
        }
        else if (operacao=="-"){
            return numero1 - numero2
        }
        else if (operacao=="*"){
            return numero1 * numero2
        }
        else if (operacao=="/"){
            return numero1 / numero2
        }
        return 0.0
    }
    fun classificarTemperatura(temperatura: Int): String {
        return when {
            temperatura <= 0 -> "Muito frio"
            temperatura in 1..15 -> "Frio"
            temperatura in 16..25 -> "Agradável"
            temperatura in 26..35 -> "Quente"
            else -> "Muito quente"
        }
    }
}
class Aluno(
    var nome: String,
    var idade: Int,
    var nota1: Double,
    var nota2: Double
) {

    fun calcularMedia(): Double {
        return (nota1 + nota2) / 2
    }

    fun verificarSituacao(): String {
        val media = calcularMedia()
        return if (media >= 6) {
            "Aprovado"
        } else {
            "Reprovado"
        }
    }

    fun apresentarAluno() {
        println("Aluno: $nome")
        println("Idade: $idade")
        println("Média: ${calcularMedia()}")
        println("Situação: ${verificarSituacao()}")
    }
}
data class Produto(
    val nome: String,
    var preco: Double,
    var estoque: Int
) {

    fun vender(quantidade: Int) {
        if (quantidade <= estoque) {
            estoque -= quantidade
            println("Venda realizada: $quantidade unidade(s) de $nome")
        } else {
            println("Estoque insuficiente para $nome")
        }
    }

    fun repor(quantidade: Int) {
        estoque += quantidade
        println("Estoque de $nome atualizado. Novo estoque: $estoque")
    }

    fun exibirInfo() {
        println("=== Produto ===")
        println("Nome: $nome")
        println("Preço: R$ $preco")
        println("Estoque: $estoque")
    }
}


