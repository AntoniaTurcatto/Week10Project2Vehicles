//2. Crie uma classe abstrata chamada "Veículo" com propriedades abstratas "modelo"
//e "ano". Crie duas classes derivadas de "Veículo" chamadas "Carro" e "Moto" que
//implementam as propriedades "modelo" e "ano". Em seguida, crie objetos das
//classes "Carro" e "Moto" e exiba suas informações.

fun main() {
    val moto1=Moto("Yamaha",2015)
    val carro1=Carro("HB20",2016)

    println("moto1:\nmodelo: ${moto1.getModelo()}\nano: ${moto1.getAno()} \n")
    println("carro1:\nmodelo: ${carro1.getModelo()}\nano: ${carro1.getAno()}")
}