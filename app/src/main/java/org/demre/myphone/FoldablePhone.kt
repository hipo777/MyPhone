package org.demre.myphone

class FoldablePhone(isScreenLightOn: Boolean = false) : Phone(isScreenLightOn) {

    var isFoldable : Boolean = false

    override fun switchOn() {
        if(!isFoldable){
            isScreenLightOn = true
        }
    }
    fun abrir(){
        isFoldable = true
    }
    fun cerrar(){
        isFoldable = false
    }
}
// ver funcionamiento
fun main(){
    val foldable = FoldablePhone()

    println(foldable.isFoldable)
    foldable.abrir()
    println(foldable.isFoldable)
}

// Tips sobre diferencias cuando tiene o no tiene val/var

/*
class Persona(nombre: String, val apellido: String)

fun main(){
    val p = Persona("Jose" , "Soto")
    p.
}
 */