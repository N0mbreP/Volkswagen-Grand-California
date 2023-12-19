fun main() {

    println("Benvingut a l'aplicació per calcular el valor de mercat.")

    var model: Int
    var km:Double
    var preufinal: Double = 0.0
    do {

        model = llegirInt("Si tens una Volkswagen Grand California escriu 1, si tens una Volkswagen Grand California Full Equip escriu 2.")
        km = llegirDouble("Introdueix el número de km que té el vehicle:")

        if (model == 1) {


            var preuinicial:Double = 73490.0
            preufinal = precioActual(preuinicial, km)


        } else if (model == 2) {

            var preuinicial:Double = 93490.0
            preufinal = precioActual(preuinicial, km)

        } else {
            println("ERROR: Valor introduït incorrecte")
        }

    } while (model != 1 && model != 2)
    var kmD:Double=km.toDouble()
    var preu:Double=preufinal.toDouble()
    preu=preuNeumatics(km=kmD, preuCoche = preu)

    println("El preu final tenint en compte que el vehicle te $km, és de $preu€")

}

