import java.util.*

fun precioActual(preuCoche:Double, kmVeicle:Double, anysVeicle:Int, portaBici:Boolean, kmPneumatic: Float):Double{
    var resultat:Double=preuCoche
    if (portaBici) resultat+=250
    when(anysVeicle){
        in 0..5-> resultat *= 0.0001f * kmVeicle
        in 6..10-> resultat *= 0.0002f * kmVeicle
        else -> resultat *= 0.0004f * kmVeicle
    }
    if (kmPneumatic<5000){
        return resultat
    }else if(kmPneumatic>10000){
        resultat-=200
        return resultat
    }
    resultat-=300
    return resultat
}

fun llegirFloat(textoMenu:String):Float{
    val scan= Scanner(System.`in`)
    var numeroLlegit:Float=0.0f
    println(textoMenu)
    do {
        var valorCorrecte:Boolean=scan.hasNextFloat()
        if (!valorCorrecte){
            scan.nextLine()
            println("Introdueix un numero enter")
        }else{
            numeroLlegit=scan.nextFloat()
            scan.nextLine()
        }
    }while (!valorCorrecte)
    return numeroLlegit
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
fun llegirBoolean(textoMenu:String):Boolean{
    val scan= Scanner(System.`in`)
    var booleanLlegit:Boolean=false
    println(textoMenu)
    do {
        var valorCorrecte:Boolean=scan.hasNextBoolean()
        if (!valorCorrecte){
            scan.nextLine()
            println("Introdueix un numero enter")
        }else{
            booleanLlegit=scan.nextBoolean()
            scan.nextLine()
        }
    }while (!valorCorrecte)
    return booleanLlegit
}

