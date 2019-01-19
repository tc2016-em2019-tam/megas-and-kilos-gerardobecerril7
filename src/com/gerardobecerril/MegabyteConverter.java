package com.gerardobecerril;

public class MegabyteConverter {

    private int kilobytes = 0;

    public MegabyteConverter(int kilobytes) throws Exception {
        if (kilobytes < 0) {
            throw new Exception("Kilobytes have to be positive.");
        }
        this.kilobytes = kilobytes;
    }

    public int getKilobytes() {
        return kilobytes;
    }

    public void setKilobytes(int kilobytes) throws Exception {
        if (kilobytes < 0) {
            throw new Exception("Kilobytes have to be positive.");
        }
        this.kilobytes = kilobytes;
    }

    public static void printMegaBytesAndKiloBytes(int kilobytes) throws Exception {
        if (kilobytes <= 0) {
            throw new Exception("Kilobytes have to be greater than 0.");
        }

        int remKilobytes = kilobytes % 1024;

        if (remKilobytes > 0) {
            System.out.println(kilobytes + " KB = " + kilobytes / 1024 + " MB and " + remKilobytes + " KB");
        } else{
            System.out.println(kilobytes + " KB = " + kilobytes / 1024 + " MB");
        }
    }

}
