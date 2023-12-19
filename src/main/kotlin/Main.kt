/*
fun main() {
    benvinGuda()
    var model: Int
    var km:Double
    var kmPn:Float
    var portaBici:Boolean
    var anysVehicle:Int
    var preuFinal:Double

    model = llegirInt("Si tens una Volkswagen Grand California escriu 1, si tens una Volkswagen Grand California Full Equip escriu 2.")
    km = llegirDouble("Introdueix el número de km que té el vehicle:")
    kmPn=llegirFloat("Introdueix el número de km que tenen els neumatics:")
    portaBici=llegirBoolean("Introdueix si el teu veicle te un porta bicis (true per indicar que si i false per indicar que no):")
    anysVehicle=llegirInt("Inrodueix els anys del teu veicle (amb numeros)")
    do {
     preuFinal=preuF( kmVeicle = km, kmPneumatic = kmPn, anysVeicle = anysVehicle, portaBici = portaBici)
    }while (preuFinal!=-1.0)



    println("El preu final tenint en compte que el vehicle te $km, és de $preuFinal€")

}

fun benvinGuda(){
    println("         wvwVWVWvwv\n" +
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

fun preuF(kmVeicle:Double, anysVeicle:Int, portaBici:Boolean, kmPneumatic: Float):Double{
    var preuResultat:Double=0.0
    if (model == 1) {
        var preuinicial:Double = 73490.0
        preuResultat = precioActual(preuCoche = preuinicial, kmVeicle = km, kmPneumatic = kmPn, anysVeicle = anysVehicle, portaBici = portaBici)
    } else if (model == 2) {
        var preuinicial:Double = 93490.0
        preuResultat = precioActual(preuCoche = preuinicial, kmVeicle = km, kmPneumatic = kmPn, anysVeicle = anysVehicle, portaBici = portaBici)

    } else {
        println("ERROR: Valor introduït incorrecte")
        preuResultat=-1.0
    }
    return preuResultat
}*/
