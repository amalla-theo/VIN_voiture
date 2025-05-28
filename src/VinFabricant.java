public class VinFabricant {

    //Regex Fabricant
    private String regexAudiSouthAfrica =  "^AAA.*";
    public boolean vinAudiSouthAfrica(String sVin){
        return sVin.matches(regexAudiSouthAfrica);
    }
}
