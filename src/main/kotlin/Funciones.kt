import java.util.*

fun precioActual(preuCoche:Double, km:Double, anys:Int, portaBici:Boolean):Double{
    var resultat:Double=preuCoche
    if (portaBici) resultat+=250
    when(anys){
        in 0..5-> resultat = resultat*0.0001f * km
        in 6..10->resultat = resultat*0.0002f * km
        else ->resultat = resultat*0.0004f * km
    }
    return resultat
}


fun llegirInt(textoMenu:String):Int{
    val scan= Scanner(System.`in`)
    var numeroLlegit:Int=0
    println(textoMenu)
    do {
        var valorCorrecte:Boolean=scan.hasNextInt()
        if (!valorCorrecte){
            scan.nextLine()
            println("Introdueix un numero enter")
        }else{
            numeroLlegit=scan.nextInt()
            scan.nextLine()
        }
    }while (!valorCorrecte)
    return numeroLlegit
}

fun llegirDouble(textoMenu:String):Double{
    val scan= Scanner(System.`in`)
    var numeroLlegit:Double=0.0
    println(textoMenu)
    do {
        var valorCorrecte:Boolean=scan.hasNextDouble()
        if (!valorCorrecte){
            scan.nextLine()
            println("Introdueix un numero enter")
        }else{
            numeroLlegit=scan.nextDouble()
            scan.nextLine()
        }
    }while (!valorCorrecte)
    return numeroLlegit
}
fun llegirLong(textoMenu:String):Long{
    val scan= Scanner(System.`in`)
    var numeroLlegit:Long=0
    println(textoMenu)
    do {
        var valorCorrecte:Boolean=scan.hasNextLong()
        if (!valorCorrecte){
            scan.nextLine()
            println("Introdueix un numero enter")
        }else{
            numeroLlegit=scan.nextLong()
            scan.nextLine()
        }
    }while (!valorCorrecte)
    return numeroLlegit
}

fun preuNeumatics(km:Double, preuCoche: Double):Double{
    var preuFinal:Double=preuCoche
    if (km<5000){
        return preuFinal
    }else if(km>10000){
        preuFinal-=200
        return preuFinal
    }
    preuFinal-=300
    return preuFinal
}
