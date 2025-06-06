public class Traitement {

    public static String identifierContinent(String sVin, VinStockageDonnee saisieRegion) {
        String sContinent = "inconnu";

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
        return sContinent;
    }

    public static String identifierPays(String sContinent, String sVin, VinStockageDonnee saisieRegion) {
        String sPays = "Inconnu";

        switch (sContinent) {
            case "Afrique":
                if (saisieRegion.vinAfriqueDuSud(sVin)) {
                    sPays = "Afrique du Sud";
                } else if (saisieRegion.vinCoteIvoire(sVin)) {
                    sPays = "Côte d'Ivoire";
                } else if (saisieRegion.vinAngola(sVin)) {
                    sPays = "Angola";
                } else if (saisieRegion.vinKenya(sVin)) {
                    sPays = "Kenya";
                } else if (saisieRegion.vinTanzanie(sVin)) {
                    sPays = "Tanzanie";
                } else if (saisieRegion.vinBenin(sVin)) {
                    sPays = "Bénin";
                } else if (saisieRegion.vinMadagascar(sVin)) {
                    sPays = "Madagascar";
                } else if (saisieRegion.vinTunisie(sVin)) {
                    sPays = "Tunisie";
                } else if (saisieRegion.vinEgypte(sVin)) {
                    sPays = "Égypte";
                } else if (saisieRegion.vinMaroc(sVin)) {
                    sPays = "Maroc";
                } else if (saisieRegion.vinZambie(sVin)) {
                    sPays = "Zambie";
                } else if (saisieRegion.vinEthiopie(sVin)) {
                    sPays = "Éthiopie";
                } else if (saisieRegion.vinMozambique(sVin)) {
                    sPays = "Mozambique";
                } else if (saisieRegion.vinGhana(sVin)) {
                    sPays = "Ghana";
                } else if (saisieRegion.vinNigeria(sVin)) {
                    sPays = "Nigeria";
                }
                break;

            case "Asie":
                if (saisieRegion.vinJapon(sVin)) {
                    sPays = "Japon";
                } else if (saisieRegion.vinSriLanka(sVin)) {
                    sPays = "Sri Lanka";
                } else if (saisieRegion.vinIsrael(sVin)) {
                    sPays = "Israël";
                } else if (saisieRegion.vinCoreeDuSud(sVin)) {
                    sPays = "Corée du Sud";
                } else if (saisieRegion.vinChine(sVin)) {
                    sPays = "Chine";
                } else if (saisieRegion.vinInde(sVin)) {
                    sPays = "Inde";
                } else if (saisieRegion.vinIndonesie(sVin)) {
                    sPays = "Indonésie";
                } else if (saisieRegion.vinThailande(sVin)) {
                    sPays = "Thaïlande";
                } else if (saisieRegion.vinPakistan(sVin)) {
                    sPays = "Pakistan";
                } else if (saisieRegion.vinTurquie(sVin)) {
                    sPays = "Turquie";
                } else if (saisieRegion.vinPhilippines(sVin)) {
                    sPays = "Philippines";
                } else if (saisieRegion.vinSingapour(sVin)) {
                    sPays = "Singapour";
                } else if (saisieRegion.vinMalaisie(sVin)) {
                    sPays = "Malaisie";
                } else if (saisieRegion.vinEmiratsArabesUnis(sVin)) {
                    sPays = "Émirats Arabes Unis";
                } else if (saisieRegion.vinTaiwan(sVin)) {
                    sPays = "Taiwan";
                } else if (saisieRegion.vinVietnam(sVin)) {
                    sPays = "Vietnam";
                }
                break;
            case "Europe":

                if (saisieRegion.vinGrandeBretagne(sVin)) {
                    sPays = "Grande-Bretagne";
                } else if (saisieRegion.vinAllemagne(sVin)) {
                    sPays = "Allemagne";
                } else if (saisieRegion.vinPologne(sVin)) {
                    sPays = "Pologne";
                } else if (saisieRegion.vinSuisse(sVin)) {
                    sPays = "Suisse";
                } else if (saisieRegion.vinRepubliqueTcheque(sVin)) {
                    sPays = "République Tchèque";
                } else if (saisieRegion.vinHongrie(sVin)) {
                    sPays = "Hongrie";
                } else if (saisieRegion.vinPortugal(sVin)) {
                    sPays = "Portugal";
                } else if (saisieRegion.vinDanemark(sVin)) {
                    sPays = "Danemark";
                } else if (saisieRegion.vinIrlande(sVin)) {
                    sPays = "Irlande";
                } else if (saisieRegion.vinRoumanie(sVin)) {
                    sPays = "Roumanie";
                } else if (saisieRegion.vinSlovaquie(sVin)) {
                    sPays = "Slovaquie";
                } else if (saisieRegion.vinAutriche(sVin)) {
                    sPays = "Autriche";
                } else if (saisieRegion.vinFrance(sVin)) {
                    sPays = "France";
                } else if (saisieRegion.vinEspagne(sVin)) {
                    sPays = "Espagne";
                } else if (saisieRegion.vinYougoslavie(sVin)) {
                    sPays = "Yougoslavie";
                } else if (saisieRegion.vinCroatie(sVin)) {
                    sPays = "Croatie";
                } else if (saisieRegion.vinEstonie(sVin)) {
                    sPays = "Estonie";
                } else if (saisieRegion.vinBulgarie(sVin)) {
                    sPays = "Bulgarie";
                } else if (saisieRegion.vinGrece(sVin)) {
                    sPays = "Grèce";
                } else if (saisieRegion.vinPaysBas(sVin)) {
                    sPays = "Pays-Bas";
                } else if (saisieRegion.vinRussie(sVin)) {
                    sPays = "Russie";
                } else if (saisieRegion.vinLuxembourg(sVin)) {
                    sPays = "Luxembourg";
                } else if (saisieRegion.vinBelgique(sVin)) {
                    sPays = "Belgique";
                } else if (saisieRegion.vinFinlande(sVin)) {
                    sPays = "Finlande";
                } else if (saisieRegion.vinMalte(sVin)) {
                    sPays = "Malte";
                } else if (saisieRegion.vinSuede(sVin)) {
                    sPays = "Suède";
                } else if (saisieRegion.vinNorvege(sVin)) {
                    sPays = "Norvège";
                } else if (saisieRegion.vinBielorussie(sVin)) {
                    sPays = "Biélorussie";
                } else if (saisieRegion.vinUkraine(sVin)) {
                    sPays = "Ukraine";
                } else if (saisieRegion.vinItalie(sVin)) {
                    sPays = "Italie";
                } else if (saisieRegion.vinSlovenie(sVin)) {
                    sPays = "Slovénie";
                } else if (saisieRegion.vinLituanie(sVin)) {
                    sPays = "Lituanie";
                }

                break;
            case "Amérique du Nord":

                if (saisieRegion.vinUSA(sVin)) {
                    sPays = "États-Unis";
                } else if (saisieRegion.vinCanada(sVin)) {
                    sPays = "Canada";
                } else if (saisieRegion.vinMexique(sVin)) {
                    sPays = "Mexique";
                } else if (saisieRegion.vinCostaRica(sVin)) {
                    sPays = "Costa Rica";
                }

                break;
            case "Amérique du Sud:":

                if (saisieRegion.vinArgentine(sVin)) {
                    sPays = "Argentine";
                } else if (saisieRegion.vinChili(sVin)) {
                    sPays = "Chili";
                } else if (saisieRegion.vinEquateur(sVin)) {
                    sPays = "Équateur";
                } else if (saisieRegion.vinPerou(sVin)) {
                    sPays = "Pérou";
                } else if (saisieRegion.vinVenezuela(sVin)) {
                    sPays = "Venezuela";
                } else if (saisieRegion.vinBresil(sVin)) {
                    sPays = "Brésil";
                } else if (saisieRegion.vinColombie(sVin)) {
                    sPays = "Colombie";
                } else if (saisieRegion.vinParaguay(sVin)) {
                    sPays = "Paraguay";
                } else if (saisieRegion.vinUruguay(sVin)) {
                    sPays = "Uruguay";
                } else if (saisieRegion.vinTrinidadTobago(sVin)) {
                    sPays = "Trinidad & Tobago";
                }

                break;
            case "Océanie":
                if (saisieRegion.vinAustralie(sVin)) {
                    sPays = "Australie";
                } else if (saisieRegion.vinNouvelleZelande(sVin)) {
                    sPays = "Nouvelle-Zélande";
                }

                break;
            default:
                sPays = "Inconnu";
        }
        return sPays;
    }


    public static String identifierAnnee(String sVin, VinStockageDonnee saisieRegion) {
        String sAnnee = "Inconnu";

        switch (sVin.substring(9, 10)) {
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
        return sAnnee;
    }

    public static String identifierFabricant(String sVin, VinStockageDonnee saisieRegion) {
        String sFabricant = "inconnu";

        //Vérification de Fabricant via Regex
        if (saisieRegion.vinAudiVolkswagenSA(sVin) == true) {
            sFabricant = "AudiSouthAfrica";
        } else if (saisieRegion.vinFAWVehicleManufacturersSA(sVin) == true) {
            sFabricant = "FAWVehiculeManufacturersSA";
        } else if (saisieRegion.vinMANAutomotiveSouthAfrica(sVin) == true) {
            sFabricant = "MANAutomotiveSouthAfrica";
        }else if (saisieRegion.vinSAPVIN(sVin) == true) {
            sFabricant = "SAPVIN";
        } else if (saisieRegion.vinVolkswagenSouthAfrica(sVin) == true) {
            sFabricant = "VolkswagenSouthAfrica";
        } else if (saisieRegion.vinChallengerTrailerSA(sVin) == true) {
            sFabricant = "ChallengerTrailerSA";
        } else if (saisieRegion.vinTRTecSA(sVin) == true) {
            sFabricant = "TRTecSA";
        } else if (saisieRegion.vinMitsubishiColtMercedesSA(sVin) == true) {
            sFabricant = "MitsubishiColtMercedesSA";
        } else if (saisieRegion.vinBMWSouthernAfrica(sVin) == true) {
            sFabricant = "BMWSouthernAfrica";
        } else if (saisieRegion.vinIsuzuSouthAfrica(sVin) == true) {
            sFabricant = "IsuzuSouthAfrica";
        } else if (saisieRegion.vinHyundaiSouthAfrica(sVin) == true) {
            sFabricant = "HyundaiSouthAfrica";
        } else if (saisieRegion.vinBeamishBeachBuggiesSA(sVin) == true) {
            sFabricant = "BeamishBeachBuggiesSA";
        } else if (saisieRegion.vinMercedesBenzSA(sVin) == true) {
            sFabricant = "MercedesBenzSA";
        } else if (saisieRegion.vinUDTrucksSA(sVin) == true) {
            sFabricant = "UDTrucksSA";
        } else if (saisieRegion.vinGMSouthAfrica(sVin) == true) {
            sFabricant = "GMSouthAfrica";
        } else if (saisieRegion.vinNissanSouthAfrica(sVin) == true) {
            sFabricant = "NissanSouthAfrica";
        } else if (saisieRegion.vinRenaultSanderoSA(sVin) == true) {
            sFabricant = "RenaultSanderoSA";
        } else if (saisieRegion.vinTataSouthAfrica(sVin) == true) {
            sFabricant = "TataSouthAfrica";
        } else if (saisieRegion.vinBackdraftRacingSA(sVin) == true) {
            sFabricant = "BackdraftRacingSA";
        } else if (saisieRegion.vinFordSouthAfrica(sVin) == true) {
            sFabricant = "FordSouthAfrica";
        } else if (saisieRegion.vinMazdaSouthAfrica(sVin) == true) {
            sFabricant = "MazdaSouthAfrica";
        } else if (saisieRegion.vinBAICSouthAfrica(sVin) == true) {
            sFabricant = "BAICSouthAfrica";
        } else if (saisieRegion.vinFiatSouthAfrica(sVin) == true) {
            sFabricant = "FiatSouthAfrica";
        } else if (saisieRegion.vinHinoSouthAfrica(sVin) == true) {
            sFabricant = "HinoSouthAfrica";
        } else if (saisieRegion.vinHondaBalladeSA(sVin) == true) {
            sFabricant = "HondaBalladeSA";
        } else if (saisieRegion.vinToyotaSouthAfrica(sVin) == true) {
            sFabricant = "ToyotaSouthAfrica";
        }else if (saisieRegion.vinKIBOMotorcyclesKenya(sVin) == true) {
            sFabricant = "KIBOMotorcyclesKenya";
        } else if (saisieRegion.vinKiiraMotorsUganda(sVin) == true) {
            sFabricant = "KiiraMotorsUganda";
        } else if (saisieRegion.vinMercedesBenzAlgeria(sVin) == true) {
            sFabricant = "MercedesBenzAlgeria";
        } else if (saisieRegion.vinFiatAlgeria(sVin) == true) {
            sFabricant = "FiatAlgeria";
        } else if (saisieRegion.vinAurusMotorsRussia(sVin) == true) {
            sFabricant = "AurusMotorsRussia";
        } else if (saisieRegion.vinEvoluteRussia(sVin) == true) {
            sFabricant = "EvoluteRussia";
        } else if (saisieRegion.vinFordUSA(sVin) == true) {
            sFabricant = "FordUSA";
        } else if (saisieRegion.vinGMUSA(sVin) == true) {
            sFabricant = "GMUSA";
        } else if (saisieRegion.vinChryslerUSA(sVin) == true) {
            sFabricant = "ChryslerUSA";
        } else if (saisieRegion.vinTeslaUSA(sVin) == true) {
            sFabricant = "TeslaUSA";
        } else if (saisieRegion.vinHondaCanada(sVin) == true) {
            sFabricant = "HondaCanada";
        } else if (saisieRegion.vinToyotaCanada(sVin) == true) {
            sFabricant = "ToyotaCanada";
        } else if (saisieRegion.vinVolkswagenMexico(sVin) == true) {
            sFabricant = "VolkswagenMexico";
        } else if (saisieRegion.vinVolkswagenBrazil(sVin) == true) {
            sFabricant = "VolkswagenBrazil";
        } else if (saisieRegion.vinChevroletBrazil(sVin) == true) {
            sFabricant = "ChevroletBrazil";
        } else if (saisieRegion.vinFiatArgentina(sVin) == true) {
            sFabricant = "FiatArgentina";
        } else if (saisieRegion.vinFordArgentina(sVin) == true) {
            sFabricant = "FordArgentina";
        } else if (saisieRegion.vinPlymouthMPVMitsubishi(sVin) == true) {
            sFabricant = "PlymouthMPVMitsubishi";
        } else if (saisieRegion.vinPlymouthTruckMitsubishi(sVin) == true) {
            sFabricant = "PlymouthTruckMitsubishi";
        } else if (saisieRegion.vinIsuzuOasisHonda(sVin) == true) {
            sFabricant = "IsuzuOasisHonda";
        } else if (saisieRegion.vinSuzukiATV(sVin) == true) {
            sFabricant = "SuzukiATV";
        } else if (saisieRegion.vinKawasakiSuzuki(sVin) == true) {
            sFabricant = "KawasakiSuzuki";
        } else if (saisieRegion.vinSuzukiKFX400(sVin) == true) {
            sFabricant = "SuzukiKFX400";
        } else if (saisieRegion.vinSuzukiToyotaAcross(sVin) == true) {
            sFabricant = "SuzukiToyotaAcross";
        } else if (saisieRegion.vinSuzukiMotorcycle(sVin) == true) {
            sFabricant = "SuzukiMotorcycle";
        } else if (saisieRegion.vinSuzukiCar(sVin) == true) {
            sFabricant = "SuzukiCar";
        } else if (saisieRegion.vinSuzukiSUV(sVin) == true) {
            sFabricant = "SuzukiSUV";
        } else if (saisieRegion.vinSuzukiTruck(sVin) == true) {
            sFabricant = "SuzukiTruck";
        } else if (saisieRegion.vinToyotaBus(sVin) == true) {
            sFabricant = "ToyotaBus";
        } else if (saisieRegion.vinToyotaCar(sVin) == true) {
            sFabricant = "ToyotaCar";
        } else if (saisieRegion.vinToyotaMPVSUV(sVin) == true) {
            sFabricant = "ToyotaMPVSUV";
        } else if (saisieRegion.vinToyotaVanTruck(sVin) == true) {
            sFabricant = "ToyotaVanTruck";
        } else if (saisieRegion.vinToyotaMPVBus(sVin) == true) {
            sFabricant = "ToyotaMPVBus";
        } else if (saisieRegion.vinLexusCar(sVin) == true) {
            sFabricant = "LexusCar";
        } else if (saisieRegion.vinLexusSUV(sVin) == true) {
            sFabricant = "LexusSUV";
        } else if (saisieRegion.vinToyotaSUVSubaru(sVin) == true) {
            sFabricant = "ToyotaSUVSubaru";
        } else if (saisieRegion.vinToyotaTruckVan(sVin) == true) {
            sFabricant = "ToyotaTruckVan";
        } else if (saisieRegion.vinToyotaIncompleteVehicle(sVin) == true) {
            sFabricant = "ToyotaIncompleteVehicle";
        } else if (saisieRegion.vinMitsubishiFuso(sVin) == true) {
            sFabricant = "MitsubishiFuso";
        } else if (saisieRegion.vinYamahaMotorcycle(sVin) == true) {
            sFabricant = "YamahaMotorcycle";
        } else if (saisieRegion.vinYamahaSnowmobile(sVin) == true) {
            sFabricant = "YamahaSnowmobile";
        } else if (saisieRegion.vinChevroletIsuzu(sVin) == true) {
            sFabricant = "ChevroletIsuzu";
        } else if (saisieRegion.vinPontiacIsuzu(sVin) == true) {
            sFabricant = "PontiacIsuzu";
        } else if (saisieRegion.vinChevroletTruckIsuzu(sVin) == true) {
            sFabricant = "ChevroletTruckIsuzu";
        } else if (saisieRegion.vinGMCTruckIsuzu(sVin) == true) {
            sFabricant = "GMCTruckIsuzu";
        } else if (saisieRegion.vinChevroletLUVIsuzu(sVin) == true) {
            sFabricant = "ChevroletLUVIsuzu";
        } else if (saisieRegion.vinDaewooGMKorea(sVin) == true) {
            sFabricant = "DaewooGMKorea";
        } else if (saisieRegion.vinHyundai(sVin) == true) {
            sFabricant = "Hyundai";
        } else if (saisieRegion.vinHyundaiTruck(sVin) == true) {
            sFabricant = "HyundaiTruck";
        } else if (saisieRegion.vinHyundaiSUV(sVin) == true) {
            sFabricant = "HyundaiSUV";
        } else if (saisieRegion.vinKiaCar(sVin) == true) {
            sFabricant = "KiaCar";
        } else if (saisieRegion.vinKiaTruck(sVin) == true) {
            sFabricant = "KiaTruck";
        } else if (saisieRegion.vinSsangYongSUV(sVin) == true) {
            sFabricant = "SsangYongSUV";
        } else if (saisieRegion.vinMitsubishiJapon(sVin) == true) {
        sFabricant = "MitsubishiJapon";
        } else if (saisieRegion.vinMitsubishiAustralie(sVin) == true) {
            sFabricant = "MitsubishiAustralie";
        } else if (saisieRegion.vinIsuzuJapon(sVin) == true) {
            sFabricant = "IsuzuJapon";
        } else if (saisieRegion.vinIsuzuChine(sVin) == true) {
            sFabricant = "IsuzuChine";
        } else if (saisieRegion.vinNissanJapon(sVin) == true) {
            sFabricant = "NissanJapon";
        } else if (saisieRegion.vinNissanFrance(sVin) == true) {
            sFabricant = "NissanFrance";
        } else if (saisieRegion.vinNissanUK(sVin) == true) {
            sFabricant = "NissanUK";
        } else if (saisieRegion.vinNissanEspagne(sVin) == true) {
            sFabricant = "NissanEspagne";
        } else if (saisieRegion.vinNissanMexique(sVin) == true) {
            sFabricant = "NissanMexique";
        } else if (saisieRegion.vinNissanUSA(sVin) == true) {
            sFabricant = "NissanUSA";
        } else if (saisieRegion.vinMazdaJapon(sVin) == true) {
            sFabricant = "MazdaJapon";
        } else if (saisieRegion.vinMazdaUSA(sVin) == true) {
            sFabricant = "MazdaUSA";
        } else if (saisieRegion.vinMazdaMexique(sVin) == true) {
            sFabricant = "MazdaMexique";
        } else if (saisieRegion.vinHondaJapon(sVin) == true) {
            sFabricant = "HondaJapon";
        } else if (saisieRegion.vinHondaUK(sVin) == true) {
            sFabricant = "HondaUK";
        } else if (saisieRegion.vinHondaUSA(sVin) == true) {
            sFabricant = "HondaUSA";
        } else if (saisieRegion.vinHondaCanada(sVin) == true) {
            sFabricant = "HondaCanada";
        } else if (saisieRegion.vinToyotaJapon(sVin) == true) {
            sFabricant = "ToyotaJapon";
        } else if (saisieRegion.vinToyotaUK(sVin) == true) {
            sFabricant = "ToyotaUK";
        } else if (saisieRegion.vinToyotaTurquie(sVin) == true) {
            sFabricant = "ToyotaTurquie";
        } else if (saisieRegion.vinToyotaFrance(sVin) == true) {
            sFabricant = "ToyotaFrance";
        } else if (saisieRegion.vinToyotaCanada(sVin) == true) {
            sFabricant = "ToyotaCanada";
        } else if (saisieRegion.vinToyotaArgentine(sVin) == true) {
            sFabricant = "ToyotaArgentine";
        } else if (saisieRegion.vinToyotaBrésil(sVin) == true) {
            sFabricant = "ToyotaBrésil";
        } else if (saisieRegion.vinVolkswagenAllemagne(sVin) == true) {
            sFabricant = "VolkswagenAllemagne";
        } else if (saisieRegion.vinVolkswagenEspagne(sVin) == true) {
            sFabricant = "VolkswagenEspagne";
        } else if (saisieRegion.vinVolkswagenMexique(sVin) == true) {
            sFabricant = "VolkswagenMexique";
        } else if (saisieRegion.vinVolkswagenBrésil(sVin) == true) {
            sFabricant = "VolkswagenBrésil";
        } else if (saisieRegion.vinRenaultFrance(sVin) == true) {
            sFabricant = "RenaultFrance";
        } else if (saisieRegion.vinRenaultRoumanie(sVin) == true) {
            sFabricant = "RenaultRoumanie";
        } else if (saisieRegion.vinRenaultArgentine(sVin) == true) {
            sFabricant = "RenaultArgentine";
        } else if (saisieRegion.vinRenaultColombie(sVin) == true) {
            sFabricant = "RenaultColombie";
        } else if (saisieRegion.vinPeugeotFrance(sVin) == true) {
            sFabricant = "PeugeotFrance";
        } else if (saisieRegion.vinPeugeotUK(sVin) == true) {
            sFabricant = "PeugeotUK";
        } else if (saisieRegion.vinPeugeotArgentine(sVin) == true) {
            sFabricant = "PeugeotArgentine";
        } else if (saisieRegion.vinPeugeotChili(sVin) == true) {
            sFabricant = "PeugeotChili";
        } else if (saisieRegion.vinFiatItalie(sVin) == true) {
            sFabricant = "FiatItalie";
        } else if (saisieRegion.vinFiatArgentine(sVin) == true) {
            sFabricant = "FiatArgentine";
        } else if (saisieRegion.vinFiatTurquie(sVin) == true) {
            sFabricant = "FiatTurquie";
        } else if (saisieRegion.vinFiatAlgerie(sVin) == true) {
            sFabricant = "FiatAlgerie";
        } else if (saisieRegion.vinFiatBrésil(sVin) == true) {
            sFabricant = "FiatBrésil";
        } else if (saisieRegion.vinVolvoSuede(sVin) == true) {
            sFabricant = "VolvoSuede";
        } else if (saisieRegion.vinScaniaSuede(sVin) == true) {
            sFabricant = "ScaniaSuede";
        } else if (saisieRegion.vinDAFPaysBas(sVin) == true) {
            sFabricant = "DAFPaysBas";
        } else if (saisieRegion.vinMANAllemagne(sVin) == true) {
            sFabricant = "MANAllemagne";
        } else if (saisieRegion.vinMANChine(sVin) == true) {
            sFabricant = "MANChine";
        } else if (saisieRegion.vinTeslaUSA(sVin) == true) {
            sFabricant = "TeslaUSA";
        } else if (saisieRegion.vinTeslaChine(sVin) == true) {
            sFabricant = "TeslaChine";
        }


        return sFabricant;
    }
}