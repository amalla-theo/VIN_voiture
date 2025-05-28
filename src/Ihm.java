import clavier.In;


public class Ihm {
    public static void main(String[] args) {
        //Déclarations

        VinRegion saisieRegion = new VinRegion();
        VinFabricant saisieFabricant = new VinFabricant();
        String sVin = new String("0");
        String sContinent = null;
        String sPays = null;
        String sAnnee = null;
        String sSerie = null;
        String sFabricant = null;


        System.out.println("INTERFACE TEST\n/!\\Notez que la liste de fabriquand peut être incomplète/!\\\nVeuillez saisir un VIN: ");

        sVin = In.readString().toUpperCase();


        //Vérification via Regex
        if (saisieRegion.vinCorrect(sVin) == false) {
            System.out.println("Le VIN est incorrect");
            main(args);
        }

        //Vérification de continent via Regex
        if (saisieRegion.vinAfrique(sVin) == true) {
            sContinent = "Afrique";
        } else if (saisieRegion.vinAsie(sVin) == true) {
            sContinent = "Asie";
        } else if (saisieRegion.vinEurope(sVin) == true) {
            sContinent = "Europe";
        } else if (saisieRegion.vinAmeriqueN(sVin) == true) {
            sContinent = "Amérique du Nord";
        } else if (saisieRegion.vinAmeriqueS(sVin) == true) {
            sContinent = "Amérique du Sud";
        } else if (saisieRegion.vinOceanie(sVin) == true) {
            sContinent = "Océanie";
        } else {
            sContinent = "Inconnu";
        }



        switch (sVin.substring(9,10)){
            case "A":
                sAnnee = "1980 ou 2010";
                break;
            case "B":
                sAnnee = "1981 ou 2011";
                break;
            case "C":
                sAnnee = "1982 ou 2012";
                break;
            case "D":
                sAnnee = "1983 ou 2013";
                break;
            case "E":
                sAnnee = "1984 ou 2014";
                break;
            case "F":
                sAnnee = "1985 ou 2015";
                break;
            case "G":
                sAnnee = "1986 ou 2016";
                break;
            case "H":
                sAnnee = "1987 ou 2017";
                break;
            case "J":
                sAnnee = "1988 ou 2018";
                break;
            case "K":
                sAnnee = "1989 ou 2019";
                break;
            case "L":
                sAnnee = "1990 ou 2020";
                break;
            case "M":
                sAnnee = "1991 ou 2021";
                break;
            case "N":
                sAnnee = "1992 ou 2022";
                break;
            case "P":
                sAnnee = "1993 ou 2023";
                break;
            case "R":
                sAnnee = "1994 ou 2024";
                break;
            case "S":
                sAnnee = "1995 ou 2025";
                break;
            case "T":
                sAnnee = "1996 ou 2026";
                break;
            case "V":
                sAnnee = "1997 ou 2027";
                break;
            case "W":
                sAnnee = "1998 ou 2028";
                break;
            case "X":
                sAnnee = "1999 ou 2029";
                break;
            case "Y":
                sAnnee = "2000 ou 2030";
                break;
            case "1":
                sAnnee = "2001 ou 2031";
                break;
            case "2":
                sAnnee = "2002 ou 2032";
                break;
            case "3":
                sAnnee = "2003 ou 2033";
                break;
            case "4":
                sAnnee = "2004 ou 2034";
                break;
            case "5":
                sAnnee = "2005 ou 2035";
                break;
            case "6":
                sAnnee = "2006 ou 2036";
                break;
            case "7":
                sAnnee = "2007 ou 2037";
                break;
            case "8":
                sAnnee = "2008 ou 2038";
                break;
            case "9":
                sAnnee = "2009 ou 2039";
                break;
            default:
                sAnnee = "Année inconnue";
        }

        if (saisieFabricant.vinAudiSouthAfrica(sVin)==true){
            System.out.println("ok");
        }

        sPays = Traitement.identifierPays(sContinent, sVin, saisieRegion);
        System.out.println("Pays identifié : " + sPays);
        sSerie = sVin.substring(12,17);

        System.out.println("Continent: " + sContinent);
        System.out.println("Pays: " + sPays);
        System.out.println("Année: " + sAnnee);
        System.out.println("Numéro de série: " + sSerie);
        }
    }
