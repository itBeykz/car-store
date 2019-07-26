package bg.sofia.uni.fmi.mjt.carstore.enums;

import java.util.Random;

public enum Region {
    SOFIA("CB"),
    BURGAS("A"),
    VARNA("B"),
    PLOVDIV("PB"),
    RUSE("P"),
    GABROVO("EB"),
    VIDIN("BH"),
    VRATSA("BP");

    private String prefix;
    private int registrationNumber=1000;

    Region(String prefix) {
        this.prefix = prefix;
    }

    public String getPrefix() {
        return prefix;
    }

    public String createRegistrationNumber(){

        return String.format("%s%d%c%c",prefix,registrationNumber++,randomChar(),randomChar());
    }

    private char randomChar(){
        Random random = new Random();
        return (char) (random.nextInt(26) + 'A');
    }


}
