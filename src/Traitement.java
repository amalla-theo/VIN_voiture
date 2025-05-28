public class Traitement {
    public static String identifierPays(String sContinent, String sVin, VinRegion saisieRegion ) {
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
}
