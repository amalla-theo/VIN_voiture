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



        sContinent = Traitement.identifierContinent(sVin, saisieRegion);
        sPays = Traitement.identifierPays(sContinent, sVin, saisieRegion);
        sAnnee = Traitement.identifierAnnee(sVin, saisieRegion);
        sSerie = sVin.substring(12,17);

        System.out.println("Continent: " + sContinent);
        System.out.println("Pays: " + sPays);
        System.out.println("Année: " + sAnnee);
        System.out.println("Numéro de série: " + sSerie);
        }
    }
