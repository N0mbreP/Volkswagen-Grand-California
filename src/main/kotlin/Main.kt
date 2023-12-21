fun main() {
    benvinGuda()
    var  model:Int = llegirInt("Si tens una Volkswagen Grand California escriu 1, si tens una Volkswagen Grand California Full Equip escriu 2.")
    var km:Double= llegirDouble("Introdueix el número de km que té el vehicle:")
    var kmPn:Float=llegirFloat("Introdueix el número de km que tenen els neumatics:")
    var portaBici:Boolean=llegirIntReturnBoolean("Introdueix si el teu veicle te un porta bicis (1 per indicar que si i 2 per indicar que no):",optionTrue = 1 )
    var anysVehicle:Int=llegirInt("Inrodueix els anys del teu veicle (amb numeros)")
    var preuFinal:Double
    preuFinal=preuF( kmVeicle = km, kmPneumatic = kmPn, anysVeicle = anysVehicle, portaBici = portaBici, model = model)


    println("El preu final tenint en compte que el vehicle te $km, és de $preuFinal€")

}

/**
 * It shows a whelcome message and the Volkswagen logo
 * @author pol.paredes (N0mbreP)
 * @since 21/12/2023
 */
fun benvinGuda(){
    println(BLUE_BOLD + "         wvwVWVWvwv\n" +
            "       vwvwVWVWVWVWvwvw\n" +
            "    vwVWVW          VWVWvw\n" +
            "   vwVW    /\\    /\\    VWvw\n" +
            "  wVW      \\ \\  / /      VWv\n" +
            " wVW  /\\    \\ \\/ /    /\\  VWv\n" +
            "wVW  /  \\    \\__/    /  \\  VWv\n" +
            "wVW  \\_  \\    __    /  _/  VWv\n" +
            "wVW   \\_  \\  /  \\  /  _/   VWv\n" +
            "wVW    \\_  \\/    \\/  _/    VWv\n" +
            " wVW    \\_    /\\    _/    VWv\n" +
            "  wVWV   \\_  /  \\  _/   WVWv\n" +
            "   vwVWV  \\_/    \\_/  WVWvw\n" +
            "     vwVWV          WVWvw\n" +
            "       vwVWVWVWVWVWVWvw")
    println()
    println("Benvingut a l'aplicació per calcular el valor de mercat.")

}

/**
 * preuF is used to determine the price of the model choosen
 * @author pol.paredes (N0mbreP)
 * @since 21/12/2023
 * @param preuCoche,reads the vehicle price (Reads a double)
 * @param anysVeicle, how old it is the van (Reads an Int)
 * @param kmVeicle,  the km for the vehicle (Reads a Double)
 * @param kmPneumatic, the wheels km (Reads a Float)
 * @param portaBici, reads if it have a bike rack (Reads a Boolean)
 * @return preuResultat , Output value (Double)
 */
fun preuF(kmVeicle:Double, anysVeicle:Int, portaBici:Boolean, kmPneumatic: Float, model:Int):Double{
    var preuResultat:Double=0.0
    if (model == 1) {
        var preuinicial:Double = 73490.0
        preuResultat = precioActual(preuCoche = preuinicial, kmVeicle = kmVeicle, kmPneumatic = kmPneumatic, anysVeicle = anysVeicle, portaBici = portaBici)
    } else if (model == 2) {
        var preuinicial:Double = 93490.0
        preuResultat = precioActual(preuCoche = preuinicial, kmVeicle = kmVeicle, kmPneumatic = kmPneumatic, anysVeicle = anysVeicle, portaBici = portaBici)

    } else {
        println("ERROR: Valor introduït incorrecte, reinicia l'aplicació")
        return 0.0
    }
    return preuResultat
}
