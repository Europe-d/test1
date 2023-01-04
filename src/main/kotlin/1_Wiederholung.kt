fun main() {

    // TODO a: Befülle die Values
    var danke: String = "vielen Dank"
    println("welche ist dein Vorname:")
    var Vorname : String = readln()
    val nAME: String = "Helena"
    val fIRST_NAME: String = "Impraim"
    val lAST_NAME: String = "Mavridou"

    println("Bitte schreiben sie Ihre Familiename:")
    var name : String = readln()

    var eingabe3 = println("viele dank für die antworten")

    println("welche ist dein Essen:")
    var essen1 : String = readln()
    var eingabe1 = println("viele dank wir kochen das für dich")
    // TODO b: benenne die values
    val tELEFONUMMER : String = "0123 45678910"
    val fAVORITE_COLOR: String = "Blau"
    val eSSEN : String = "KALAMARIA"

    println("Bitte schreiben sie Ihre Tefenummer:")
    var tELEFON2 : String = readln()
    var eingabe4 = println("viele dank ich rüfe gleich an")
    // TODO c: Befülle die Variablen neu
    var country: String = "Spanien"
    country = "Griecheland"

    println("wo wohnen Sie;:")
    var ort : String = readln()

    var city: String = "Berlin"
    city = "Athens"
    
    // TODO d: Befülle die Variable mit einer Eingabe des Users


    // TODO e: Schlüsselwort var oder val einfügen
    var tIME: String = "09:00"
    var placeOfBirth: String = "München"
    val pET_NAME: String = "Brutus"
    var currentTVShow: String = "Breaking Bad"
    var lastVacation: String = "Tokyo"
    
    
    // TODO: Nutze Println um dem User eine kleine Textbeschreibung auszugeben


println("MY NAME IS $nAME  $fIRST_NAME $lAST_NAME UND MEINE TELEFONUMMER IST  $tELEFONUMMER konnen sie mir anrufen wenn die bestellung nicht genommen haben")

    println("wIR Sicken das essen um $tIME in Ihre straße")

   println("Ich bin in $placeOfBirth ich komme aus $lastVacation")


        val fruits: List<String> = listOf("Banane", "Apfel", "Birne")
        val fruit: String = fruits[fruits.size-3]
        println(fruit)


        /* hier wir haben eine liste mit name fruits und auf die liste gehort 2 allgemein ..(0,1,2,)
        wenn wir jetzt -3 auf size haben dann die bringt raus die banane
         */
        val programm : List<String> = listOf("Corel","photoshop","kotlin")
        val programm1 : String = programm[programm.size -2]

        println("das programm was auf die erste stelle komm ist das $programm1")
//dann komm photoshop

    }
