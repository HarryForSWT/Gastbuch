public class HammingCodeApplication {
    private int wortlang;
    public static void main(String[] args) {
        System.out.println("Hallo Welt");
        HammingCodeApplication h1 = new HammingCodeApplication();
        h1.setWortlang(16);
/*
        for (int i = 1; i <= 50; i++) {
            h1.setWortlang(i);
            int kon = h1.cal_controll(i);
            System.out.println("Für Wortlänge " + i + " beträgt die Länge der Kontrollestelle " + kon);
        }*/
        // System.out.println(h1.kon_7());
        Paritätprüfen p1 = new Paritätprüfen();
        String eingabe ="0100001011011011";
        p1.setEingabe(eingabe);
        p1.split(eingabe);
        System.out.println("p1: "+ p1.getParitärs1());
        System.out.println("p2: "+ p1.getParitärs2());
        System.out.println("p3: "+ p1.getParitärs3());
        System.out.println("p4: "+ p1.getParitärs4());
        System.out.println("p5: "+ p1.getParitärs5());
    }
    public void setWortlang(int wortlang) {
        this.wortlang = wortlang;
    }
    public int cal_controll(int wortlang){
        int ks=0; // Kontrollstelle
        for (int i=0; i<wortlang; i++){
            double y = Math.log(wortlang+i+1)/Math.log(2);
            if(i>= y){
                ks=i;
                break;
            }
        }
        return ks;
    }
    public int kon_7 (){
        int result=0;
        for (int i=50; i<10000; i++){
            if (cal_controll(i)==13){

                result = i;
                break;
            }
        }
        return result;
    }

}
