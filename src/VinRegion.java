public class VinRegion {

    //Regex validité du VIN
    private String regexVin = "^[A-HJ-NPR-Z0-9]{17}$";

    //Test validité
    public boolean vinCorrect(String sVin){
        return sVin.matches(regexVin);
    }

    //Regex Continents
    private String regexAfrique = "^[A-H].*";
    private String regexAsie= "^[J-R].*";
    private String regexEurope= "^[S-Z].*";
    private String regexAmeriqueN= "^[1-5].*";
    private String regexAmeriqueS= "^[6-7].*";
    private String regexOceanie= "^[8-9].*";


    //Test continent
    public boolean vinAfrique(String sVin){
        return sVin.matches(regexAfrique);
    }
    public boolean vinAsie(String sVin){
        return sVin.matches(regexAsie);
    }
    public boolean vinEurope(String sVin){
        return sVin.matches(regexEurope);
    }
    public boolean vinAmeriqueN(String sVin){
        return sVin.matches(regexAmeriqueN);
    }
    public boolean vinAmeriqueS(String sVin){
        return sVin.matches(regexAmeriqueS);
    }
    public boolean vinOceanie(String sVin){
        return sVin.matches(regexOceanie);
    }

    //Pays d'Afrique
    private String regexAfriqueDuSud = "^A[A-H].*";
    private String regexCoteIvoire = "^A[J-N].*";
    private String regexAngola = "^B[A-E].*";
    private String regexKenya = "^B[F-K].*";
    private String regexTanzanie = "^B[L-R].*";
    private String regexBenin = "^C[A-E].*";
    private String regexMadagascar = "^(C[F-K]|F[F-K]).*$";
    private String regexTunisie = "^B[L-R].*";
    private String regexEgypte = "^D[A-E].*";
    private String regexMaroc = "^D[F-K].*";
    private String regexZambie = "^D[L-R].*";
    private String regexEthiopie = "^E[A-E].*";
    private String regexMozambique = "^E[F-K].*";
    private String regexGhana = "^F[A-E].*";
    private String regexNigeria = "^F[F-K].*";

    // Pays d'Asie
    private String regexJapon = "^J[A-Z0-9].*";
    private String regexSriLanka = "^K[A-E].*";
    private String regexIsrael = "^K[F-K].*";
    private String regexCoreeDuSud = "^K[L-R].*";
    private String regexChine = "^L[A-Z0-9].*";
    private String regexInde = "^M[A-E].*";
    private String regexIndonesie = "^M[F-K].*";
    private String regexThailande = "^M[L-R].*";
    private String regexPakistan = "^N[F-K].*";
    private String regexTurquie = "^N[L-R].*";
    private String regexPhilippines = "^P[A-E].*";
    private String regexSingapour = "^P[F-K].*";
    private String regexMalaisie = "^P[L-R].*";
    private String regexEmiratsArabesUnis = "^R[A-E].*";
    private String regexTaiwan = "^R[F-K].*";
    private String regexVietnam = "^R[L-R].*";


    // Pays d'Europe
    private String regexGrandeBretagne = "^S[A-M].*";
    private String regexAllemagne = "^S[N-T].*|^W[A-Z0-9].*";
    private String regexPologne = "^S[U-Z].*";
    private String regexSuisse = "^T[A-H].*";
    private String regexRepubliqueTcheque = "^T[J-P].*";
    private String regexHongrie = "^T[R-V].*";
    private String regexPortugal = "^T[W-Z0-1].*";
    private String regexDanemark = "^U[H-M].*";
    private String regexIrlande = "^U[N-T].*";
    private String regexRoumanie = "^U[U-Z].*";
    private String regexSlovaquie = "^U[5-7].*";
    private String regexAutriche = "^V[A-E].*";
    private String regexFrance = "^V[F-R].*";
    private String regexEspagne = "^V[S-W].*";
    private String regexYougoslavie = "^V[X-Z0-2].*";
    private String regexCroatie = "^V[3-5].*";
    private String regexEstonie = "^V[6-9].*";
    private String regexBulgarie = "^X[A-E].*";
    private String regexGrece = "^X[F-K].*";
    private String regexPaysBas = "^X[L-R].*";
    private String regexRussie = "^X[S-W].*|^X[3-9].*";
    private String regexLuxembourg = "^X[X-Z0-2].*";
    private String regexBelgique = "^Y[A-E].*";
    private String regexFinlande = "^Y[F-K].*";
    private String regexMalte = "^Y[L-R].*";
    private String regexSuede = "^Y[S-W].*";
    private String regexNorvege = "^Y[X-Z0-2].*";
    private String regexBielorussie = "^Y[3-5].*";
    private String regexUkraine = "^Y[6-9].*";
    private String regexItalie = "^Z[A-R].*";
    private String regexSlovenie = "^Z[X-Z0-2].*";
    private String regexLituanie = "^Z[3-5].*";

    // Pays d'Amérique du Nord
    private String regexUSA = "^(1[A-Z0-9]|4[A-Z0-9]|5[A-Z0-9]).*";
    private String regexCanada = "^2[A-Z0-9].*";
    private String regexMexique = "^3[A-W].*";
    private String regexCostaRica = "^3[X-Z0-7].*";

    //Pays d'Océanie
    private String regexAustralie = "^6[A-W].*";
    private String regexNouvelleZelande = "^7[A-E].*";

    //Pays d'Amérique du Sud
    private String regexArgentine = "^8[A-E].*";
    private String regexChili = "^8[F-K].*";
    private String regexEquateur = "^8[L-R].*";
    private String regexPerou = "^8[S-W].*";
    private String regexVenezuela = "^8[X-Z0-2].*";
    private String regexBresil = "^9[A-E].*|^9[3-9].*";
    private String regexColombie = "^9[F-K].*";
    private String regexParaguay = "^9[L-R].*";
    private String regexUruguay = "^9[S-W].*";
    private String regexTrinidadTobago = "^9[X-Z0-2].*";



    // Test pays d'Afrique
    public boolean vinAfriqueDuSud(String sVin) {
        return sVin.matches(regexAfriqueDuSud);
    }
    public boolean vinCoteIvoire(String sVin) {
        return sVin.matches(regexCoteIvoire);
    }
    public boolean vinAngola(String sVin) {
        return sVin.matches(regexAngola);
    }
    public boolean vinKenya(String sVin) {
        return sVin.matches(regexKenya);
    }
    public boolean vinTanzanie(String sVin) {
        return sVin.matches(regexTanzanie);
    }
    public boolean vinBenin(String sVin) {
        return sVin.matches(regexBenin);
    }
    public boolean vinMadagascar(String sVin) {
        return sVin.matches(regexMadagascar);
    }
    public boolean vinTunisie(String sVin) {
        return sVin.matches(regexTunisie);
    }
    public boolean vinEgypte(String sVin) {
        return sVin.matches(regexEgypte);
    }
    public boolean vinMaroc(String sVin) {
        return sVin.matches(regexMaroc);
    }
    public boolean vinZambie(String sVin) {
        return sVin.matches(regexZambie);
    }
    public boolean vinEthiopie(String sVin) {
        return sVin.matches(regexEthiopie);
    }
    public boolean vinMozambique(String sVin) {
        return sVin.matches(regexMozambique);
    }
    public boolean vinGhana(String sVin) {
        return sVin.matches(regexGhana);
    }
    public boolean vinNigeria(String sVin) {
        return sVin.matches(regexNigeria);
    }

    // Test pays d'Asie
    public boolean vinJapon(String sVin) {
        return sVin.matches(regexJapon);
    }
    public boolean vinSriLanka(String sVin) {
        return sVin.matches(regexSriLanka);
    }
    public boolean vinIsrael(String sVin) {
        return sVin.matches(regexIsrael);
    }
    public boolean vinCoreeDuSud(String sVin) {
        return sVin.matches(regexCoreeDuSud);
    }
    public boolean vinChine(String sVin) {
        return sVin.matches(regexChine);
    }
    public boolean vinInde(String sVin) {
        return sVin.matches(regexInde);
    }
    public boolean vinIndonesie(String sVin) {
        return sVin.matches(regexIndonesie);
    }
    public boolean vinThailande(String sVin) {
        return sVin.matches(regexThailande);
    }
    public boolean vinPakistan(String sVin) {
        return sVin.matches(regexPakistan);
    }
    public boolean vinTurquie(String sVin) {
        return sVin.matches(regexTurquie);
    }
    public boolean vinPhilippines(String sVin) {
        return sVin.matches(regexPhilippines);
    }
    public boolean vinSingapour(String sVin) {
        return sVin.matches(regexSingapour);
    }
    public boolean vinMalaisie(String sVin) {
        return sVin.matches(regexMalaisie);
    }
    public boolean vinEmiratsArabesUnis(String sVin) {
        return sVin.matches(regexEmiratsArabesUnis);
    }
    public boolean vinTaiwan(String sVin) {
        return sVin.matches(regexTaiwan);
    }
    public boolean vinVietnam(String sVin) {
        return sVin.matches(regexVietnam);
    }


    // Test pays d'Europe
    public boolean vinGrandeBretagne(String sVin) {
        return sVin.matches(regexGrandeBretagne);
    }
    public boolean vinAllemagne(String sVin) {
        return sVin.matches(regexAllemagne);
    }
    public boolean vinPologne(String sVin) {
        return sVin.matches(regexPologne);
    }
    public boolean vinSuisse(String sVin) {
        return sVin.matches(regexSuisse);
    }
    public boolean vinRepubliqueTcheque(String sVin) {
        return sVin.matches(regexRepubliqueTcheque);
    }
    public boolean vinHongrie(String sVin) {
        return sVin.matches(regexHongrie);
    }
    public boolean vinPortugal(String sVin) {
        return sVin.matches(regexPortugal);
    }
    public boolean vinDanemark(String sVin) {
        return sVin.matches(regexDanemark);
    }
    public boolean vinIrlande(String sVin) {
        return sVin.matches(regexIrlande);
    }
    public boolean vinRoumanie(String sVin) {
        return sVin.matches(regexRoumanie);
    }
    public boolean vinSlovaquie(String sVin) {
        return sVin.matches(regexSlovaquie);
    }
    public boolean vinAutriche(String sVin) {
        return sVin.matches(regexAutriche);
    }
    public boolean vinFrance(String sVin) {
        return sVin.matches(regexFrance);
    }
    public boolean vinEspagne(String sVin) {
        return sVin.matches(regexEspagne);
    }
    public boolean vinYougoslavie(String sVin) {
        return sVin.matches(regexYougoslavie);
    }
    public boolean vinCroatie(String sVin) {
        return sVin.matches(regexCroatie);
    }
    public boolean vinEstonie(String sVin) {
        return sVin.matches(regexEstonie);
    }
    public boolean vinBulgarie(String sVin) {
        return sVin.matches(regexBulgarie);
    }
    public boolean vinGrece(String sVin) {
        return sVin.matches(regexGrece);
    }
    public boolean vinPaysBas(String sVin) {
        return sVin.matches(regexPaysBas);
    }
    public boolean vinRussie(String sVin) {
        return sVin.matches(regexRussie);
    }
    public boolean vinLuxembourg(String sVin) {
        return sVin.matches(regexLuxembourg);
    }
    public boolean vinBelgique(String sVin) {
        return sVin.matches(regexBelgique);
    }
    public boolean vinFinlande(String sVin) {
        return sVin.matches(regexFinlande);
    }
    public boolean vinMalte(String sVin) {
        return sVin.matches(regexMalte);
    }
    public boolean vinSuede(String sVin) {
        return sVin.matches(regexSuede);
    }
    public boolean vinNorvege(String sVin) {
        return sVin.matches(regexNorvege);
    }
    public boolean vinBielorussie(String sVin) {
        return sVin.matches(regexBielorussie);
    }
    public boolean vinUkraine(String sVin) {
        return sVin.matches(regexUkraine);
    }
    public boolean vinItalie(String sVin) {
        return sVin.matches(regexItalie);
    }
    public boolean vinSlovenie(String sVin) {
        return sVin.matches(regexSlovenie);
    }
    public boolean vinLituanie(String sVin) {
        return sVin.matches(regexLituanie);
    }

    // Test pays d'Amérique du Nord
    public boolean vinUSA(String sVin) {
        return sVin.matches(regexUSA);
    }
    public boolean vinCanada(String sVin) {
        return sVin.matches(regexCanada);
    }
    public boolean vinMexique(String sVin) {
        return sVin.matches(regexMexique);
    }
    public boolean vinCostaRica(String sVin) {
        return sVin.matches(regexCostaRica);
    }


    // Test pays d'Océanie
    public boolean vinAustralie(String sVin) {
        return sVin.matches(regexAustralie);
    }
    public boolean vinNouvelleZelande(String sVin) {
        return sVin.matches(regexNouvelleZelande);
    }

    // Test pays d'Amérique du Sud
    public boolean vinArgentine(String sVin) {
        return sVin.matches(regexArgentine);
    }
    public boolean vinChili(String sVin) {
        return sVin.matches(regexChili);
    }
    public boolean vinEquateur(String sVin) {
        return sVin.matches(regexEquateur);
    }
    public boolean vinPerou(String sVin) {
        return sVin.matches(regexPerou);
    }
    public boolean vinVenezuela(String sVin) {
        return sVin.matches(regexVenezuela);
    }
    public boolean vinBresil(String sVin) {
        return sVin.matches(regexBresil);
    }
    public boolean vinColombie(String sVin) {
        return sVin.matches(regexColombie);
    }
    public boolean vinParaguay(String sVin) {
        return sVin.matches(regexParaguay);
    }
    public boolean vinUruguay(String sVin) {
        return sVin.matches(regexUruguay);
    }
    public boolean vinTrinidadTobago(String sVin) {
        return sVin.matches(regexTrinidadTobago);
    }

}

