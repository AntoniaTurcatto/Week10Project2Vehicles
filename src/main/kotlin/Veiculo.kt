abstract class Veiculo {

    private var modelo=""
    private var ano=0

    fun getModelo():String{
        return this.modelo
    }

    fun setModelo(modelo:String){
        this.modelo=modelo
    }

    fun getAno():Int{
        return this.ano
    }

    fun setAno(ano:Int){
        this.ano=ano
    }
}