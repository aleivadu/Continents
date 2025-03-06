public class Continents {
    // este programa muetra la ciudad mas grande del continente elegido
    String continentName;
    String largestCity;
    public Continents(int continent){


      switch (continent){
        case 1:
            continentName = "north america";
            largestCity = "mexico city";
            break;
        case 2:
            continentName = "South america: , brazil";
            largestCity = "sou paulo, brazil";
            break;
        case 3:
            continentName = "Europe : , Russia";
            largestCity = "Moscow, Russia";
            break;
        case 4:
            continentName = "africa: , nigeria";
            largestCity = "lagos, nigeria";
            break;
        case 5:
            continentName = "asia: , china";
            largestCity = "shanghai, china";
            break;
        case 6:
            continentName= "australia";
            largestCity = "sydney, australia";
            break;
        case 7:
            continentName = "antartica";
            largestCity = "mcmurdo, station, us";

            break;
        default:
        continentName = "undefined continent";
        largestCity = "undefined city";
      }
    }
    public String toString(){
        return "Continent Name: " + continentName + "\nLargest City: " + largestCity;
    }
}