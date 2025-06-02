public class VinStockageDonnee {

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

   // public boolean vinAudiVolkswagenSA(String sVin) {return sVin.matches(regexAudiVolkswagenSA);}


    //Regex Fabricant

        private String regexAudiVolkswagenSA = "^AAA[A-Z0-9].*"; // Audi fabriqué par Volkswagen South Africa
        private String regexFAWVehicleManufacturersSA = "^AAK[A-Z0-9].*"; // FAW Vehicle Manufacturers South Africa
        private String regexMANAutomotiveSouthAfrica = "^AAM[A-Z0-9].*"; // MAN Automotive (VW Truck & Bus inclus)
        private String regexSAPVIN = "^AAP[A-Z0-9].*"; // VIN restampé par la police sud-africaine (SAPVIN ou AAPV)
        private String regexVolkswagenSouthAfrica = "^AAV[A-Z0-9].*"; // Volkswagen South Africa
        private String regexChallengerTrailerSA = "^AAW[A-Z0-9].*"; // Challenger Trailer Pty Ltd. (Afrique du Sud)
        private String regexTRTecSA = "^AA9[A-Z0-9].*"; // TR-Tec Pty Ltd. (Afrique du Sud)
        private String regexMitsubishiColtMercedesSA = "^ABJ[A-Z0-9].*"; // Mitsubishi Colt & Triton pickups (Mercedes-Benz SA)
        private String regexBMWSouthernAfrica = "^ABM[A-Z0-9].*"; // BMW Southern Africa
        private String regexIsuzuSouthAfrica = "^ACV[A-Z0-9].*"; // Isuzu Motors South Africa (depuis 2018)
        private String regexHyundaiSouthAfrica = "^AC5[A-Z0-9].*"; // Hyundai Automotive South Africa
        private String regexBeamishBeachBuggiesSA = "^AC9[A-Z0-9].*"; // Beamish Beach Buggies (Afrique du Sud)
        private String regexMercedesBenzSA = "^ADB[A-Z0-9].*"; // Mercedes-Benz South Africa
        private String regexUDTrucksSA = "^ADD[A-Z0-9].*"; // UD Trucks Southern Africa (Pty) Ltd.
        private String regexGMSouthAfrica = "^ADM[A-Z0-9].*"; // GM South Africa (incluant Isuzu jusqu'en 2018)
        private String regexNissanSouthAfrica = "^ADN[A-Z0-9].*"; // Nissan South Africa (Pty) Ltd.
        private String regexRenaultSanderoSA = "^ADR[A-Z0-9].*"; // Renault Sandero fabriqué par Nissan SA
        private String regexTataSouthAfrica = "^ADX[A-Z0-9].*"; // Tata Automobile Corporation South Africa Ltd.
        private String regexBackdraftRacingSA = "^AE9[A-Z0-9].*"; // Backdraft Racing (Afrique du Sud)
        private String regexFordSouthAfrica = "^AFA[A-Z0-9].*"; // Ford Motor Company of Southern Africa
        private String regexMazdaSouthAfrica = "^AFB[A-Z0-9].*"; // Mazda BT-50 fabriqué par Ford South Africa
        private String regexBAICSouthAfrica = "^AFD[A-Z0-9].*"; // BAIC Automotive South Africa
        private String regexFiatSouthAfrica = "^AFZ[A-Z0-9].*"; // Fiat Auto South Africa
        private String regexHinoSouthAfrica = "^AHH[A-Z0-9].*"; // Hino South Africa
        private String regexHondaBalladeSA = "^AHM[A-Z0-9].*"; // Honda Ballade fabriqué par Mercedes-Benz SA (1982–2000)
        private String regexToyotaSouthAfrica = "^AHT[A-Z0-9].*"; // Toyota South Africa Motors (Pty.) Ltd.
        private String regexKIBOMotorcyclesKenya = "^BF9[A-Z0-9].*"; // KIBO Motorcycles (Kenya)
        private String regexKiiraMotorsUganda = "^BUK[A-Z0-9].*"; // Kiira Motors Corporation (Ouganda)
        private String regexMercedesBenzAlgeria = "^BR1[A-Z0-9].*"; // Mercedes-Benz Algérie (SAFAV MB)
        private String regexFiatAlgeria = "^BRY[A-Z0-9].*"; // Fiat Algérie
        private String regexAurusMotorsRussia = "^EAA[A-Z0-9].*"; // Aurus Motors (Russie)
        private String regexEvoluteRussia = "^EAN[A-Z0-9].*"; // Evolute (Russie)
        private String regexGMUSA = "^1G[A-Z0-9].*"; // General Motors USA
        private String regexChryslerUSA = "^1C[A-Z0-9].*"; // Chrysler USA
        private String regexVolkswagenMexico = "^3VW[A-Z0-9].*"; // Volkswagen Mexique
        private String regexVolkswagenBrazil = "^9BW[A-Z0-9].*"; // Volkswagen Brésil
        private String regexChevroletBrazil = "^9BG[A-Z0-9].*"; // Chevrolet Brésil
        private String regexFiatArgentina = "^8AF[A-Z0-9].*"; // Fiat Argentine
        private String regexFordArgentina = "^8A1[A-Z0-9].*"; // Ford Argentine
        private String regexPlymouthMPVMitsubishi = "^JP4[A-Z0-9].*"; // Plymouth MPV/SUV fabriqué par Mitsubishi Motors
        private String regexPlymouthTruckMitsubishi = "^JP7[A-Z0-9].*"; // Plymouth truck fabriqué par Mitsubishi Motors
        private String regexIsuzuOasisHonda = "^JR2[A-Z0-9].*"; // Isuzu Oasis fabriqué par Honda
        private String regexSuzukiATV = "^JSA[A-Z0-9].*"; // Suzuki ATV & Kawasaki KFX400 ATV, Suzuki car/SUV hors N. America
        private String regexKawasakiSuzuki = "^JSK[A-Z0-9].*"; // Kawasaki KLX125/KLX125L motorcycle fabriqué par Suzuki
        private String regexSuzukiKFX400 = "^JSL[A-Z0-9].*"; // '04-'06 Kawasaki KFX400 ATV fabriqué par Suzuki
        private String regexSuzukiToyotaAcross = "^JST[A-Z0-9].*"; // Suzuki Across SUV fabriqué par Toyota
        private String regexSuzukiMotorcycle = "^JS1[A-Z0-9].*"; // Suzuki moto & Kawasaki KLX400S/KLX400SR moto fabriqué par Suzuki
        private String regexSuzukiCar = "^JS2[A-Z0-9].*"; // Suzuki voiture
        private String regexSuzukiSUV = "^JS3[A-Z0-9].*"; // Suzuki SUV
        private String regexSuzukiTruck = "^JS4[A-Z0-9].*"; // Suzuki camion
        private String regexToyotaBus = "^JTB[A-Z0-9].*"; // Toyota bus
        private String regexToyotaCar = "^JTD[A-Z0-9].*"; // Toyota voiture
        private String regexToyotaMPVSUV = "^JTE[A-Z0-9].*"; // Toyota MPV/SUV
        private String regexToyotaVanTruck = "^JTF[A-Z0-9].*"; // Toyota camion/van
        private String regexToyotaMPVBus = "^JTG[A-Z0-9].*"; // Toyota MPV/bus
        private String regexLexusCar = "^JTH[A-Z0-9].*"; // Lexus voiture
        private String regexLexusSUV = "^JTJ[A-Z0-9].*"; // Lexus SUV
        private String regexToyotaSUVSubaru = "^JTM[A-Z0-9].*"; // Toyota SUV, Subaru Solterra fabriqué par Toyota
        private String regexToyotaTruckVan = "^JT4[A-Z0-9].*"; // Toyota camion/van
        private String regexToyotaIncompleteVehicle = "^JT5[A-Z0-9].*"; // Toyota véhicule incomplet
       // private String regexLexusSUV = "^JT6[A-Z0-9].*"; // Lexus SUV
      //  private String regexLexusCar = "^JT8[A-Z0-9].*"; // Lexus voiture
        private String regexMitsubishiFuso = "^JW6[A-Z0-9].*"; // Mitsubishi Fuso division de Mitsubishi Motors (jusqu'à 2003)
        private String regexYamahaMotorcycle = "^JYA[A-Z0-9].*"; // Yamaha moto
        private String regexYamahaSnowmobile = "^JYE[A-Z0-9].*"; // Yamaha motoneige
        private String regexChevroletIsuzu = "^J81[A-Z0-9].*"; // Chevrolet/Geo voiture fabriqué par Isuzu
        private String regexPontiacIsuzu = "^J87[A-Z0-9].*"; // Pontiac/Asüna voiture fabriqué par Isuzu pour GM Canada
        private String regexChevroletTruckIsuzu = "^J8C[A-Z0-9].*"; // Chevrolet camion commercial fabriqué par Isuzu
        private String regexGMCTruckIsuzu = "^J8T[A-Z0-9].*"; // GMC camion commercial fabriqué par Isuzu
        private String regexChevroletLUVIsuzu = "^J8Z[A-Z0-9].*"; // Chevrolet LUV pickup fabriqué par Isuzu
        private String regexDaewooGMKorea = "^KL[A-Z0-9].*"; // Daewoo GM Korea (Chevrolet/Alpheon)
        private String regexHyundai = "^KM[A-Z0-9].*"; // Hyundai
        private String regexHyundaiTruck = "^KMC[A-Z0-9].*"; // Hyundai camion
        private String regexHyundaiSUV = "^KM8[A-Z0-9].*"; // Hyundai SUV
        private String regexKiaCar = "^KNA[A-Z0-9].*"; // Kia voiture
        private String regexKiaTruck = "^KNC[A-Z0-9].*"; // Kia camion
        private String regexSsangYongSUV = "^KPT[A-Z0-9].*"; // SsangYong/KG Mobility SUV/MPV


    private String regexAudiAllemagne = "^WAU[A-Z0-9].*"; // Audi Allemagne
    private String regexAudiHongrie = "^TRU[A-Z0-9].*"; // Audi Hongrie

    private String regexBMWAllemagne = "^(WBA|WBS)[A-Z0-9].*"; // BMW Allemagne
    private String regexBMWUSA = "^4US[A-Z0-9].*"; // BMW USA

    private String regexMercedesBenzAllemagne = "^WDB[A-Z0-9].*"; // Mercedes-Benz Allemagne
    private String regexMercedesBenzMcLaren = "^WDD[A-Z0-9].*"; // Mercedes-Benz McLaren
    private String regexMercedesBenzAlgerie = "^BR1[A-Z0-9].*"; // Mercedes-Benz Algérie
    private String regexMercedesBenzTurquie = "^NLE[A-Z0-9].*"; // Mercedes-Benz Camions Turquie

    private String regexFordAllemagne = "^WF0[A-Z0-9].*"; // Ford Allemagne
    private String regexFordEspagne = "^VS6[A-Z0-9].*"; // Ford Espagne
    private String regexFordUSA = "^(1FA|1FB|1FC|1FD|1FM|1FT)[A-Z0-9].*"; // Ford USA
    private String regexFordCanada = "^(2FA|2FB|2FC|2FM|2FT)[A-Z0-9].*"; // Ford Canada
    private String regexFordAustralie = "^6F[A-Z0-9].*"; // Ford Australie

    private String regexVolkswagenAllemagne = "^(WVW|WV1|WV2)[A-Z0-9].*"; // Volkswagen Allemagne
    private String regexVolkswagenEspagne = "^VWV[A-Z0-9].*"; // Volkswagen Espagne
    private String regexVolkswagenMexique = "^3VW[A-Z0-9].*"; // Volkswagen Mexique
    private String regexVolkswagenBrésil = "^9BW[A-Z0-9].*"; // Volkswagen Brésil

    private String regexRenaultFrance = "^VF1[A-Z0-9].*"; // Renault France
    private String regexRenaultRoumanie = "^UU1[A-Z0-9].*"; // Renault Dacia Roumanie
    private String regexRenaultArgentine = "^8A1[A-Z0-9].*"; // Renault Argentine
    private String regexRenaultColombie = "^9FB[A-Z0-9].*"; // Renault Colombie

    private String regexPeugeotFrance = "^VF3[A-Z0-9].*"; // Peugeot France
    private String regexPeugeotUK = "^SDB[A-Z0-9].*"; // Peugeot UK
    private String regexPeugeotArgentine = "^8AD[A-Z0-9].*"; // Peugeot Argentine
    private String regexPeugeotChili = "^8GD[A-Z0-9].*"; // Peugeot Chili

    private String regexToyotaJapon = "^(JT|JTB|JTD|JTE|JTF|JTG)[A-Z0-9].*"; // Toyota Japon
    private String regexToyotaUK = "^SB1[A-Z0-9].*"; // Toyota UK
    private String regexToyotaTurquie = "^NMT[A-Z0-9].*"; // Toyota Turquie
    private String regexToyotaFrance = "^VNK[A-Z0-9].*"; // Toyota France
    private String regexToyotaCanada = "^2T[A-Z0-9].*"; // Toyota Canada
    private String regexToyotaArgentine = "^8AJ[A-Z0-9].*"; // Toyota Argentine
    private String regexToyotaBrésil = "^93R[A-Z0-9].*"; // Toyota Brésil

    private String regexNissanJapon = "^JN[A-Z0-9].*"; // Nissan Japon
    private String regexNissanFrance = "^VNV[A-Z0-9].*"; // Nissan France
    private String regexNissanUK = "^SJN[A-Z0-9].*"; // Nissan UK
    private String regexNissanEspagne = "^VSG[A-Z0-9].*"; // Nissan Espagne
    private String regexNissanMexique = "^3N[A-Z0-9].*"; // Nissan Mexique
    private String regexNissanUSA = "^5N1[A-Z0-9].*"; // Nissan USA

    private String regexHondaJapon = "^JH[A-Z0-9].*"; // Honda Japon
    private String regexHondaUK = "^SHS[A-Z0-9].*"; // Honda UK
    private String regexHondaUSA = "^(1H|5F)[A-Z0-9].*"; // Honda USA
    private String regexHondaCanada = "^(2HG|2HK)[A-Z0-9].*"; // Honda Canada

    private String regexMazdaJapon = "^JMZ[A-Z0-9].*"; // Mazda Japon
    private String regexMazdaUSA = "^(1YV|4F)[A-Z0-9].*"; // Mazda USA
    private String regexMazdaMexique = "^3MD[A-Z0-9].*"; // Mazda Mexique

    private String regexHyundaiCoree = "^(KMH|KM8)[A-Z0-9].*"; // Hyundai Corée du Sud
    private String regexHyundaiCanada = "^2HM[A-Z0-9].*"; // Hyundai Canada
    private String regexHyundaiUSA = "^5NP[A-Z0-9].*"; // Hyundai USA

    private String regexKiaCoree = "^(KNA|KNB|KNC)[A-Z0-9].*"; // Kia Corée du Sud

    private String regexIsuzuJapon = "^JA[A-Z0-9].*"; // Isuzu Japon
    private String regexIsuzuChine = "^LZE[A-Z0-9].*"; // Isuzu Guangzhou, Chine

    private String regexMitsubishiJapon = "^JMB[A-Z0-9].*"; // Mitsubishi Japon
    private String regexMitsubishiAustralie = "^6MM[A-Z0-9].*"; // Mitsubishi Australie

    private String regexFiatItalie = "^ZFA[A-Z0-9].*"; // Fiat Italie
    private String regexFiatArgentine = "^8AP[A-Z0-9].*"; // Fiat Argentine
    private String regexFiatTurquie = "^NM4[A-Z0-9].*"; // Fiat Turquie
    private String regexFiatAlgerie = "^BRY[A-Z0-9].*"; // Fiat Algérie
    private String regexFiatBrésil = "^9BD[A-Z0-9].*"; // Fiat Brésil

    private String regexVolvoSuede = "^(YV1|YV2|YV3|YV4)[A-Z0-9].*"; // Volvo Suède

    private String regexScaniaSuede = "^YS2[A-Z0-9].*"; // Scania Suède

    private String regexDAFPaysBas = "^XLR[A-Z0-9].*"; // DAF Trucks Pays-Bas

    private String regexMANAllemagne = "^WMA[A-Z0-9].*"; // MAN Allemagne
    private String regexMANChine = "^LZM[A-Z0-9].*"; // MAN Chine

    private String regexTeslaUSA = "^5YJ[A-Z0-9].*"; // Tesla USA
    private String regexTeslaChine = "^LRW[A-Z0-9].*"; // Tesla (Gigafactory Shanghai)


    //Tests fabricant
        public boolean vinAudiVolkswagenSA(String sVin) {
            return sVin.matches(regexAudiVolkswagenSA);
        }
    public boolean vinFAWVehicleManufacturersSA(String sVin) {
        return sVin.matches(regexFAWVehicleManufacturersSA);
    }

    public boolean vinMANAutomotiveSouthAfrica(String sVin) {
        return sVin.matches(regexMANAutomotiveSouthAfrica);
    }

    public boolean vinSAPVIN(String sVin) {
        return sVin.matches(regexSAPVIN);
    }

    public boolean vinVolkswagenSouthAfrica(String sVin) {
        return sVin.matches(regexVolkswagenSouthAfrica);
    }

    public boolean vinChallengerTrailerSA(String sVin) {
        return sVin.matches(regexChallengerTrailerSA);
    }

    public boolean vinTRTecSA(String sVin) {
        return sVin.matches(regexTRTecSA);
    }
    public boolean vinMitsubishiColtMercedesSA(String sVin) {
        return sVin.matches(regexMitsubishiColtMercedesSA);
    }

    public boolean vinBMWSouthernAfrica(String sVin) {
        return sVin.matches(regexBMWSouthernAfrica);
    }

    public boolean vinIsuzuSouthAfrica(String sVin) {
        return sVin.matches(regexIsuzuSouthAfrica);
    }

    public boolean vinHyundaiSouthAfrica(String sVin) {
        return sVin.matches(regexHyundaiSouthAfrica);
    }

    public boolean vinBeamishBeachBuggiesSA(String sVin) {
        return sVin.matches(regexBeamishBeachBuggiesSA);
    }

    public boolean vinMercedesBenzSA(String sVin) {
        return sVin.matches(regexMercedesBenzSA);
    }

    public boolean vinUDTrucksSA(String sVin) {
        return sVin.matches(regexUDTrucksSA);
    }

    public boolean vinGMSouthAfrica(String sVin) {
        return sVin.matches(regexGMSouthAfrica);
    }

    public boolean vinNissanSouthAfrica(String sVin) {
        return sVin.matches(regexNissanSouthAfrica);
    }

    public boolean vinRenaultSanderoSA(String sVin) {
        return sVin.matches(regexRenaultSanderoSA);
    }

    public boolean vinTataSouthAfrica(String sVin) {
        return sVin.matches(regexTataSouthAfrica);
    }

    public boolean vinBackdraftRacingSA(String sVin) {
        return sVin.matches(regexBackdraftRacingSA);
    }

    public boolean vinFordSouthAfrica(String sVin) {
        return sVin.matches(regexFordSouthAfrica);
    }

    public boolean vinMazdaSouthAfrica(String sVin) {
        return sVin.matches(regexMazdaSouthAfrica);
    }

    public boolean vinBAICSouthAfrica(String sVin) {
        return sVin.matches(regexBAICSouthAfrica);
    }

    public boolean vinFiatSouthAfrica(String sVin) {
        return sVin.matches(regexFiatSouthAfrica);
    }

    public boolean vinHinoSouthAfrica(String sVin) {
        return sVin.matches(regexHinoSouthAfrica);
    }

    public boolean vinHondaBalladeSA(String sVin) {
        return sVin.matches(regexHondaBalladeSA);
    }

    public boolean vinToyotaSouthAfrica(String sVin) {
        return sVin.matches(regexToyotaSouthAfrica);
    }

    public boolean vinKIBOMotorcyclesKenya(String sVin) {
        return sVin.matches(regexKIBOMotorcyclesKenya);
    }

    public boolean vinKiiraMotorsUganda(String sVin) {
        return sVin.matches(regexKiiraMotorsUganda);
    }

    public boolean vinMercedesBenzAlgeria(String sVin) {
        return sVin.matches(regexMercedesBenzAlgeria);
    }

    public boolean vinFiatAlgeria(String sVin) {
        return sVin.matches(regexFiatAlgeria);
    }

    public boolean vinAurusMotorsRussia(String sVin) {
        return sVin.matches(regexAurusMotorsRussia);
    }

    public boolean vinEvoluteRussia(String sVin) {
        return sVin.matches(regexEvoluteRussia);
    }

    public boolean vinFordUSA(String sVin) {
        return sVin.matches(regexFordUSA);
    }

    public boolean vinGMUSA(String sVin) {
        return sVin.matches(regexGMUSA);
    }

    public boolean vinChryslerUSA(String sVin) {
        return sVin.matches(regexChryslerUSA);
    }

    public boolean vinTeslaUSA(String sVin) {
        return sVin.matches(regexTeslaUSA);
    }

    public boolean vinHondaCanada(String sVin) {
        return sVin.matches(regexHondaCanada);
    }

    public boolean vinToyotaCanada(String sVin) {
        return sVin.matches(regexToyotaCanada);
    }

    public boolean vinVolkswagenMexico(String sVin) {
        return sVin.matches(regexVolkswagenMexico);
    }

    public boolean vinVolkswagenBrazil(String sVin) {
        return sVin.matches(regexVolkswagenBrazil);
    }

    public boolean vinChevroletBrazil(String sVin) {
        return sVin.matches(regexChevroletBrazil);
    }

    public boolean vinFiatArgentina(String sVin) {
        return sVin.matches(regexFiatArgentina);
    }

    public boolean vinFordArgentina(String sVin) {
        return sVin.matches(regexFordArgentina);
    }

    public boolean vinPlymouthMPVMitsubishi(String sVin) {
        return sVin.matches(regexPlymouthMPVMitsubishi);
    }

    public boolean vinPlymouthTruckMitsubishi(String sVin) {
        return sVin.matches(regexPlymouthTruckMitsubishi);
    }

    public boolean vinIsuzuOasisHonda(String sVin) {
        return sVin.matches(regexIsuzuOasisHonda);
    }

    public boolean vinSuzukiATV(String sVin) {
        return sVin.matches(regexSuzukiATV);
    }

    public boolean vinKawasakiSuzuki(String sVin) {
        return sVin.matches(regexKawasakiSuzuki);
    }

    public boolean vinSuzukiKFX400(String sVin) {
        return sVin.matches(regexSuzukiKFX400);
    }

    public boolean vinSuzukiToyotaAcross(String sVin) {
        return sVin.matches(regexSuzukiToyotaAcross);
    }

    public boolean vinSuzukiMotorcycle(String sVin) {
        return sVin.matches(regexSuzukiMotorcycle);
    }

    public boolean vinSuzukiCar(String sVin) {
        return sVin.matches(regexSuzukiCar);
    }

    public boolean vinSuzukiSUV(String sVin) {
        return sVin.matches(regexSuzukiSUV);
    }

    public boolean vinSuzukiTruck(String sVin) {
        return sVin.matches(regexSuzukiTruck);
    }

    public boolean vinToyotaBus(String sVin) {
        return sVin.matches(regexToyotaBus);
    }

    public boolean vinToyotaCar(String sVin) {
        return sVin.matches(regexToyotaCar);
    }

    public boolean vinToyotaMPVSUV(String sVin) {
        return sVin.matches(regexToyotaMPVSUV);
    }

    public boolean vinToyotaVanTruck(String sVin) {
        return sVin.matches(regexToyotaVanTruck);
    }

    public boolean vinToyotaMPVBus(String sVin) {
        return sVin.matches(regexToyotaMPVBus);
    }

    public boolean vinLexusCar(String sVin) {
        return sVin.matches(regexLexusCar);
    }

    public boolean vinLexusSUV(String sVin) {
        return sVin.matches(regexLexusSUV);
    }

    public boolean vinToyotaSUVSubaru(String sVin) {
        return sVin.matches(regexToyotaSUVSubaru);
    }

    public boolean vinToyotaTruckVan(String sVin) {
        return sVin.matches(regexToyotaTruckVan);
    }

    public boolean vinToyotaIncompleteVehicle(String sVin) {
        return sVin.matches(regexToyotaIncompleteVehicle);
    }

    public boolean vinMitsubishiFuso(String sVin) {
        return sVin.matches(regexMitsubishiFuso);
    }

    public boolean vinYamahaMotorcycle(String sVin) {
        return sVin.matches(regexYamahaMotorcycle);
    }

    public boolean vinYamahaSnowmobile(String sVin) {
        return sVin.matches(regexYamahaSnowmobile);
    }

    public boolean vinChevroletIsuzu(String sVin) {
        return sVin.matches(regexChevroletIsuzu);
    }

    public boolean vinPontiacIsuzu(String sVin) {
        return sVin.matches(regexPontiacIsuzu);
    }

    public boolean vinChevroletTruckIsuzu(String sVin) {
        return sVin.matches(regexChevroletTruckIsuzu);
    }

    public boolean vinGMCTruckIsuzu(String sVin) {
        return sVin.matches(regexGMCTruckIsuzu);
    }

    public boolean vinChevroletLUVIsuzu(String sVin) {
        return sVin.matches(regexChevroletLUVIsuzu);
    }

    public boolean vinDaewooGMKorea(String sVin) {
        return sVin.matches(regexDaewooGMKorea);
    }

    public boolean vinHyundai(String sVin) {
        return sVin.matches(regexHyundai);
    }

    public boolean vinHyundaiTruck(String sVin) {
        return sVin.matches(regexHyundaiTruck);
    }

    public boolean vinHyundaiSUV(String sVin) {
        return sVin.matches(regexHyundaiSUV);
    }

    public boolean vinKiaCar(String sVin) {
        return sVin.matches(regexKiaCar);
    }

    public boolean vinKiaTruck(String sVin) {
        return sVin.matches(regexKiaTruck);
    }

    public boolean vinSsangYongSUV(String sVin) {
        return sVin.matches(regexSsangYongSUV);
    }

    public boolean vinHyundaiCoree(String sVin) {
        return sVin.matches(regexHyundaiCoree);
    }

    public boolean vinHyundaiCanada(String sVin) {
        return sVin.matches(regexHyundaiCanada);
    }

    public boolean vinHyundaiUSA(String sVin) {
        return sVin.matches(regexHyundaiUSA);
    }

    public boolean vinKiaCoree(String sVin) {
        return sVin.matches(regexKiaCoree);
    }

    public boolean vinMitsubishiJapon(String sVin) {
        return sVin.matches(regexMitsubishiJapon);
    }

    public boolean vinMitsubishiAustralie(String sVin) {
        return sVin.matches(regexMitsubishiAustralie);
    }

    public boolean vinIsuzuJapon(String sVin) {
        return sVin.matches(regexIsuzuJapon);
    }

    public boolean vinIsuzuChine(String sVin) {
        return sVin.matches(regexIsuzuChine);
    }

    public boolean vinNissanJapon(String sVin) {
        return sVin.matches(regexNissanJapon);
    }

    public boolean vinNissanFrance(String sVin) {
        return sVin.matches(regexNissanFrance);
    }

    public boolean vinNissanUK(String sVin) {
        return sVin.matches(regexNissanUK);
    }

    public boolean vinNissanEspagne(String sVin) {
        return sVin.matches(regexNissanEspagne);
    }

    public boolean vinNissanMexique(String sVin) {
        return sVin.matches(regexNissanMexique);
    }

    public boolean vinNissanUSA(String sVin) {
        return sVin.matches(regexNissanUSA);
    }

    public boolean vinMazdaJapon(String sVin) {
        return sVin.matches(regexMazdaJapon);
    }

    public boolean vinMazdaUSA(String sVin) {
        return sVin.matches(regexMazdaUSA);
    }

    public boolean vinMazdaMexique(String sVin) {
        return sVin.matches(regexMazdaMexique);
    }

    public boolean vinHondaJapon(String sVin) {
        return sVin.matches(regexHondaJapon);
    }

    public boolean vinHondaUK(String sVin) {
        return sVin.matches(regexHondaUK);
    }

    public boolean vinHondaUSA(String sVin) {
        return sVin.matches(regexHondaUSA);
    }

    public boolean vinToyotaJapon(String sVin) {
        return sVin.matches(regexToyotaJapon);
    }

    public boolean vinToyotaUK(String sVin) {
        return sVin.matches(regexToyotaUK);
    }

    public boolean vinToyotaTurquie(String sVin) {
        return sVin.matches(regexToyotaTurquie);
    }

    public boolean vinToyotaFrance(String sVin) {
        return sVin.matches(regexToyotaFrance);
    }

    public boolean vinToyotaArgentine(String sVin) {
        return sVin.matches(regexToyotaArgentine);
    }

    public boolean vinToyotaBrésil(String sVin) {
        return sVin.matches(regexToyotaBrésil);
    }

    public boolean vinVolkswagenAllemagne(String sVin) {
        return sVin.matches(regexVolkswagenAllemagne);
    }

    public boolean vinVolkswagenEspagne(String sVin) {
        return sVin.matches(regexVolkswagenEspagne);
    }

    public boolean vinVolkswagenMexique(String sVin) {
        return sVin.matches(regexVolkswagenMexique);
    }

    public boolean vinVolkswagenBrésil(String sVin) {
        return sVin.matches(regexVolkswagenBrésil);
    }

    public boolean vinRenaultFrance(String sVin) {
        return sVin.matches(regexRenaultFrance);
    }

    public boolean vinRenaultRoumanie(String sVin) {
        return sVin.matches(regexRenaultRoumanie);
    }

    public boolean vinRenaultArgentine(String sVin) {
        return sVin.matches(regexRenaultArgentine);
    }

    public boolean vinRenaultColombie(String sVin) {
        return sVin.matches(regexRenaultColombie);
    }

    public boolean vinPeugeotFrance(String sVin) {
        return sVin.matches(regexPeugeotFrance);
    }

    public boolean vinPeugeotUK(String sVin) {
        return sVin.matches(regexPeugeotUK);
    }

    public boolean vinPeugeotArgentine(String sVin) {
        return sVin.matches(regexPeugeotArgentine);
    }

    public boolean vinPeugeotChili(String sVin) {
        return sVin.matches(regexPeugeotChili);
    }

    public boolean vinFiatItalie(String sVin) {
        return sVin.matches(regexFiatItalie);
    }

    public boolean vinFiatArgentine(String sVin) {
        return sVin.matches(regexFiatArgentine);
    }

    public boolean vinFiatTurquie(String sVin) {
        return sVin.matches(regexFiatTurquie);
    }

    public boolean vinFiatAlgerie(String sVin) {
        return sVin.matches(regexFiatAlgerie);
    }

    public boolean vinFiatBrésil(String sVin) {
        return sVin.matches(regexFiatBrésil);
    }

    public boolean vinVolvoSuede(String sVin) {
        return sVin.matches(regexVolvoSuede);
    }

    public boolean vinScaniaSuede(String sVin) {
        return sVin.matches(regexScaniaSuede);
    }

    public boolean vinDAFPaysBas(String sVin) {
        return sVin.matches(regexDAFPaysBas);
    }

    public boolean vinMANAllemagne(String sVin) {
        return sVin.matches(regexMANAllemagne);
    }

    public boolean vinMANChine(String sVin) {
        return sVin.matches(regexMANChine);
    }



    public boolean vinTeslaChine(String sVin) {
        return sVin.matches(regexTeslaChine);
    }



}


