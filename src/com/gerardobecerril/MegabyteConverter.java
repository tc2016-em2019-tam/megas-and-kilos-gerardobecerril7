package com.gerardobecerril;

public class MegabyteConverter {

    private int kilobytes = 0;

    public MegabyteConverter(int kilobytes) throws Exception {
        
        if (kilobytes < 0) {
            throw new Exception("Kilobytes can't be negative.");
        }
        this.kilobytes = kilobytes;
        
    }

    public int getKilobytes() {
        return kilobytes;
    }

    public void setKilobytes(int kilobytes) throws Exception {
        
        if (kilobytes < 0) {
            throw new Exception("Kilobytes can't be negative.");
        }
        this.kilobytes = kilobytes;
        
    }

    public static void printMegaBytesAndKiloBytes(int kilobytes) throws Exception {
        
        int kb = kilobytes / 1024;
        int remainder = kilobytes % 1024;

        if (remKilobytes > 0) {
            System.out.println(kilobytes + " KB = " + kb + " MB and " + remainder + " KB");
        } else {
            System.out.println(kilobytes + " KB = " + kb + " MB");
        }
    }

}
