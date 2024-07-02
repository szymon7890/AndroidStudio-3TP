fun main() {
    // Deklaracja zmiennej date z wartością "3.3"
    val date = "3.3"

    // Rozdzielenie zmiennej date na dwie części po kropce i przypisanie wynikowej listy do zmiennej splitedDate
    val splitedDate = date.split(".")

    // Utworzenie obiektu StringBuilder, który będzie używany do budowania wynikowego stringa
    val builder = StringBuilder()

    // Sprawdzenie wartości pierwszego elementu splitedDate (dzień) i odpowiednie działania
    if(splitedDate.elementAt(0) == "1") {
        // Jeśli pierwszy element to "1", dodaj do buildera "Poniedzialek"
        builder.append("Poniedzialek")
    } else if(splitedDate.elementAt(0) == "2") {
        // Jeśli pierwszy element to "2", wypisz "Wtorek"
        println("Wtorek")
    } else if(splitedDate.elementAt(0) == "3") {
        // Jeśli pierwszy element to "3", wypisz "Sroda"
        println("Sroda")
    } else if(splitedDate.elementAt(0) == "4") {
        // Jeśli pierwszy element to "4", wypisz "Czwartek"
        println("Czwartek")
    } else if(splitedDate.elementAt(0) == "5") {
        // Jeśli pierwszy element to "5", wypisz "Piatek"
        println("Piatek")
    } else if(splitedDate.elementAt(0) == "6") {
        // Jeśli pierwszy element to "6", wypisz "Sobota"
        println("Sobota")
    } else if(splitedDate.elementAt(0) == "7") {
        // Jeśli pierwszy element to "7", wypisz "Niedziela"
        println("Niedziela")
    }

    // Sprawdzenie wartości drugiego elementu splitedDate (miesiąc) i odpowiednie działania
    if(splitedDate.elementAt(1) == "1") {
        // Jeśli drugi element to "1", dodaj do buildera " Styczen"
        builder.append(" Styczen")
    } else if(splitedDate.elementAt(1) == "2") {
        // Jeśli drugi element to "2", wypisz "Luty"
        println("Luty")
    } else if(splitedDate.elementAt(1) == "3") {
        // Jeśli drugi element to "3", wypisz "Marzec"
        println("Marzec")
    } else if(splitedDate.elementAt(1) == "4") {
        // Jeśli drugi element to "4", wypisz "Kwiecien"
        println("Kwiecien")
    } else if(splitedDate.elementAt(1) == "5") {
        // Jeśli drugi element to "5", wypisz "Maj"
        println("Maj")
    } else if(splitedDate.elementAt(1) == "6") {
        // Jeśli drugi element to "6", wypisz "Czerwiec"
        println("Czerwiec")
    } else if(splitedDate.elementAt(1) == "7") {
        // Jeśli drugi element to "7", wypisz "Lipiec"
        println("Lipiec")
    } else if(splitedDate.elementAt(1) == "8") {
        // Jeśli drugi element to "8", wypisz "Sierpien"
        println("Sierpien")
    } else if(splitedDate.elementAt(1) == "9") {
        // Jeśli drugi element to "9", wypisz "Wrzesien"
        println("Wrzesien")
    } else if(splitedDate.elementAt(1) == "10") {
        // Jeśli drugi element to "10", wypisz "Pazdziernik"
        println("Pazdziernik")
    } else if(splitedDate.elementAt(1) == "11") {
        // Jeśli drugi element to "11", wypisz "Listopad"
        println("Listopad")
    } else if(splitedDate.elementAt(1) == "12") {
        // Jeśli drugi element to "12", wypisz "Grudzien"
        println("Grudzien")
    }

    // Wypisanie zawartości buildera, który zawiera dzień tygodnia i miesiąc
    println(builder)
}
