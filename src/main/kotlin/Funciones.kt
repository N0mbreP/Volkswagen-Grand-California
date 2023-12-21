import java.util.*

/**
 * This function is used for calculate the vehicle price
 *@author pol.paredes
 *@since 21/12/2023
 *@param preuCoche,reads the vehicle price (Reads a double)
 *@param anysVeicle, how old it is the van (Reads an Int)
 *@param kmVeicle,  the km for the vehicle (Reads a Double)
 *@param kmPneumatic, the wheels km (Reads a Float)
 *@param portaBici, reads if it have a bike rack (Reads a Boolean)
 *@return resultat , Output value (Double)
 */
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

/**
 * llegirFloat is used to read a Float using the Scanner and returns the read Float
 * @author pol.paredes
 * @since 21/12/2023
 * @param textMostrar , It shows a String (Usually what the user have to do)
 * @return numeroLlegit , Output value (Float)
 */
fun llegirFloat(textMostrar:String):Float{
    val scan= Scanner(System.`in`)
    var numeroLlegit:Float=0.0f
    println(textMostrar)
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

/**
 * llegirInt is used to read a Int using the Scanner and returns the read Int
 * @author pol.paredes
 * @since 21/12/2023
 * @param textMostrar , It shows a String (Usually what the user have to do)
 * @return numeroLlegit , Output value (Int)
 */
fun llegirInt(textMostrar:String):Int{
    val scan= Scanner(System.`in`)
    var numeroLlegit:Int=0
    println(textMostrar)
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

/**
 * llegirDouble is used to read a Double using the Scanner and returns the read Double
 * @author pol.paredes
 * @since 21/12/2023
 * @param textMostrar , It shows a String (Usually what the user have to do)
 * @return numeroLlegit , Output value (Double)
 */
fun llegirDouble(textMostrar:String):Double{
    val scan= Scanner(System.`in`)
    var numeroLlegit:Double=0.0
    println(textMostrar)
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

/**
 * llegirLong is used to read a Long using the Scanner and returns the read Long
 * @author pol.paredes
 * @since 21/12/2023
 * @param textMostrar , It shows a String (Usually what the user have to do)
 * @return numeroLlegit , Output value (Long)
 */
fun llegirLong(textMostrar:String):Long{
    val scan= Scanner(System.`in`)
    var numeroLlegit:Long=0
    println(textMostrar)
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

/**
 * llegirBoolean is used to read a Boolean using the Scanner and returns the read Boolean
 * @author pol.paredes
 * @since 21/12/2023
 * @param textMostrar , It shows a String (Usually what the user have to do)
 * @return booleanLlegit , Output value (Boolean)
 */
fun llegirBoolean(textMostrar:String):Boolean{
    val scan= Scanner(System.`in`)
    var booleanLlegit:Boolean=false
    println(textMostrar)
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

/**
 * llegirIntReturnBoolean is used to read a Int using the Scanner and returns the read Float
 * @author pol.paredes
 * @since 21/12/2023
 * @param textMostrar , It shows a String (Usually what the user have to do)
 * @param optionTrue , It defines the number it will return true (Int)
 * @return numeroLlegit , Output value (Float)
 */
fun llegirIntReturnBoolean(textMostrar:String, optionTrue:Int=1):Boolean{
    val scan= Scanner(System.`in`)
    var numeroLlegit:Int=0
    var trueFlase:Boolean=false
    println(textMostrar)
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

    if (numeroLlegit==optionTrue){
        trueFlase=true
        return trueFlase
    }
    return trueFlase
}

/**
 * This function creates a String of characters
 * @author pol.paredes (N0mbreP)
 * @since 21/12/2023
 * @param repes , determines how many times the character repeats (Reads Int)
 * @param caracter , is the character that will repeat in a straight line (Reads Char)
 * @return retornar , Output value (String)
 */
fun lineaSeparadora(repes:Int, caracter:Char):String{
    var contador:Int=0
    var retornar:String=""
    do {
        retornar+=caracter.toString()
        contador++
    }while (contador!=repes)

    return retornar
}
