import clavier.In;


public class Ihm {
    public static void main(String[] args) {
        //Déclarations
        VinRegion saisie = new VinRegion();
        String sVin = new String("0");
        String sContinent = null;
        String sPays = null;
        String sAnnee = null;


        System.out.println("INTERFACE TEST\nVeuillez saisir un VIN: ");

        sVin = In.readString().toUpperCase();


        //Vérification via Regex
        if (saisie.vinCorrect(sVin) == false) {
            System.out.println("Le VIN est incorrect");
            main(args);
        }

        //Vérification de continent via Regex
        if (saisie.vinAfrique(sVin) == true) {
            sContinent = "Afrique";
        } else if (saisie.vinAsie(sVin) == true) {
            sContinent = "Asie";
        } else if (saisie.vinEurope(sVin) == true) {
            sContinent = "Europe";
        } else if (saisie.vinAmeriqueN(sVin) == true) {
            sContinent = "Amérique du Nord";
        } else if (saisie.vinAmeriqueS(sVin) == true) {
            sContinent = "Amérique du Sud";
        } else if (saisie.vinOceanie(sVin) == true) {
            sContinent = "Océanie";
        } else {
            sContinent = "Inconnu";
        }


        switch (sContinent){
            case "Afrique":

                if (saisie.vinAfriqueDuSud(sVin) == true){
                    sPays = "Afrique du Sud";
                } else if (saisie.vinCoteIvoire(sVin) == true) {
                    sPays = "Côte d'Ivoire";
                } else if (saisie.vinAngola(sVin) == true) {
                    sPays = "Angola";
                } else if (saisie.vinKenya(sVin)) {
                    sPays = "Kenya";
                } else if (saisie.vinTanzanie(sVin)) {
                    sPays = "Tanzanie";
                } else if (saisie.vinBenin(sVin)) {
                    sPays = "Bénin";
                } else if (saisie.vinMadagascar(sVin)) {
                    sPays = "Madagascar";
                } else if (saisie.vinTunisie(sVin)) {
                    sPays = "Tunisie";
                } else if (saisie.vinEgypte(sVin)) {
                    sPays = "Égypte";
                } else if (saisie.vinMaroc(sVin)) {
                    sPays = "Maroc";
                } else if (saisie.vinZambie(sVin)) {
                    sPays = "Zambie";
                } else if (saisie.vinEthiopie(sVin)) {
                    sPays = "Éthiopie";
                } else if (saisie.vinMozambique(sVin)) {
                    sPays = "Mozambique";
                } else if (saisie.vinGhana(sVin)) {
                    sPays = "Ghana";
                } else if (saisie.vinNigeria(sVin)) {
                    sPays = "Nigeria";
                }
                break;

            case "Asie":

                if (saisie.vinJapon(sVin)) {
                    sPays = "Japon";
                } else if (saisie.vinSriLanka(sVin)) {
                    sPays = "Sri Lanka";
                } else if (saisie.vinIsrael(sVin)) {
                    sPays = "Israël";
                } else if (saisie.vinCoreeDuSud(sVin)) {
                    sPays = "Corée du Sud";
                } else if (saisie.vinChine(sVin)) {
                    sPays = "Chine";
                } else if (saisie.vinInde(sVin)) {
                    sPays = "Inde";
                } else if (saisie.vinIndonesie(sVin)) {
                    sPays = "Indonésie";
                } else if (saisie.vinThailande(sVin)) {
                    sPays = "Thaïlande";
                } else if (saisie.vinPakistan(sVin)) {
                    sPays = "Pakistan";
                } else if (saisie.vinTurquie(sVin)) {
                    sPays = "Turquie";
                } else if (saisie.vinPhilippines(sVin)) {
                    sPays = "Philippines";
                } else if (saisie.vinSingapour(sVin)) {
                    sPays = "Singapour";
                } else if (saisie.vinMalaisie(sVin)) {
                    sPays = "Malaisie";
                } else if (saisie.vinEmiratsArabesUnis(sVin)) {
                    sPays = "Émirats Arabes Unis";
                } else if (saisie.vinTaiwan(sVin)) {
                    sPays = "Taiwan";
                } else if (saisie.vinVietnam(sVin)) {
                    sPays = "Vietnam";
                }

                break;
            case "Europe":

                if (saisie.vinGrandeBretagne(sVin)) {
                    sPays = "Grande-Bretagne";
                } else if (saisie.vinAllemagne(sVin)) {
                    sPays = "Allemagne";
                } else if (saisie.vinPologne(sVin)) {
                    sPays = "Pologne";
                } else if (saisie.vinSuisse(sVin)) {
                    sPays = "Suisse";
                } else if (saisie.vinRepubliqueTcheque(sVin)) {
                    sPays = "République Tchèque";
                } else if (saisie.vinHongrie(sVin)) {
                    sPays = "Hongrie";
                } else if (saisie.vinPortugal(sVin)) {
                    sPays = "Portugal";
                } else if (saisie.vinDanemark(sVin)) {
                    sPays = "Danemark";
                } else if (saisie.vinIrlande(sVin)) {
                    sPays = "Irlande";
                } else if (saisie.vinRoumanie(sVin)) {
                    sPays = "Roumanie";
                } else if (saisie.vinSlovaquie(sVin)) {
                    sPays = "Slovaquie";
                } else if (saisie.vinAutriche(sVin)) {
                    sPays = "Autriche";
                } else if (saisie.vinFrance(sVin)) {
                    sPays = "France";
                } else if (saisie.vinEspagne(sVin)) {
                    sPays = "Espagne";
                } else if (saisie.vinYougoslavie(sVin)) {
                    sPays = "Yougoslavie";
                } else if (saisie.vinCroatie(sVin)) {
                    sPays = "Croatie";
                } else if (saisie.vinEstonie(sVin)) {
                    sPays = "Estonie";
                } else if (saisie.vinBulgarie(sVin)) {
                    sPays = "Bulgarie";
                } else if (saisie.vinGrece(sVin)) {
                    sPays = "Grèce";
                } else if (saisie.vinPaysBas(sVin)) {
                    sPays = "Pays-Bas";
                } else if (saisie.vinRussie(sVin)) {
                    sPays = "Russie";
                } else if (saisie.vinLuxembourg(sVin)) {
                    sPays = "Luxembourg";
                } else if (saisie.vinBelgique(sVin)) {
                    sPays = "Belgique";
                } else if (saisie.vinFinlande(sVin)) {
                    sPays = "Finlande";
                } else if (saisie.vinMalte(sVin)) {
                    sPays = "Malte";
                } else if (saisie.vinSuede(sVin)) {
                    sPays = "Suède";
                } else if (saisie.vinNorvege(sVin)) {
                    sPays = "Norvège";
                } else if (saisie.vinBielorussie(sVin)) {
                    sPays = "Biélorussie";
                } else if (saisie.vinUkraine(sVin)) {
                    sPays = "Ukraine";
                } else if (saisie.vinItalie(sVin)) {
                    sPays = "Italie";
                } else if (saisie.vinSlovenie(sVin)) {
                    sPays = "Slovénie";
                } else if (saisie.vinLituanie(sVin)) {
                    sPays = "Lituanie";
                }

                break;
            case "Amérique du Nord":

                if (saisie.vinUSA(sVin)) {
                    sPays = "États-Unis";
                } else if (saisie.vinCanada(sVin)) {
                    sPays = "Canada";
                } else if (saisie.vinMexique(sVin)) {
                    sPays = "Mexique";
                } else if (saisie.vinCostaRica(sVin)) {
                    sPays = "Costa Rica";
                }

                break;
            case "Amérique du Sud:":

                if (saisie.vinArgentine(sVin)) {
                    sPays = "Argentine";
                } else if (saisie.vinChili(sVin)) {
                    sPays = "Chili";
                } else if (saisie.vinEquateur(sVin)) {
                    sPays = "Équateur";
                } else if (saisie.vinPerou(sVin)) {
                    sPays = "Pérou";
                } else if (saisie.vinVenezuela(sVin)) {
                    sPays = "Venezuela";
                } else if (saisie.vinBresil(sVin)) {
                    sPays = "Brésil";
                } else if (saisie.vinColombie(sVin)) {
                    sPays = "Colombie";
                } else if (saisie.vinParaguay(sVin)) {
                    sPays = "Paraguay";
                } else if (saisie.vinUruguay(sVin)) {
                    sPays = "Uruguay";
                } else if (saisie.vinTrinidadTobago(sVin)) {
                    sPays = "Trinidad & Tobago";
                }

                break;
            case "Océanie":
                if (saisie.vinAustralie(sVin)) {
                    sPays = "Australie";
                } else if (saisie.vinNouvelleZelande(sVin)) {
                    sPays = "Nouvelle-Zélande";
                }

                break;
            default:
                sPays = "Inconnu";
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
        System.out.println(sVin.substring(9,10));
        System.out.println(sAnnee);
        }
    }
