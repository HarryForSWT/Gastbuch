import java.util.ArrayList;
import java.util.List;

public class Paritätprüfen {
    private String eingabe;
    private Character p1;
    private Character p2;
    private Character p3;
    private Character p4;
    private Character p5;

    public void setEingabe(String eingabe) {
        this.eingabe = eingabe;
    }
    List<Character> codearray = new ArrayList<>();
    public List<Character> getCodearray() {
        return codearray;
    }
    public void split(String eingabe){
        for (int i=0; i<eingabe.length(); i++){
            Character ch = eingabe.charAt(i);
            codearray.add(ch);
            /*
             if(i==0){
                codearray.add(p1);
            }else if(i==1){
                codearray.add(p2) ;
            }else if(i==3){
                codearray.add(p3) ;
            }else if(i==7){
                codearray.add(p4) ;
            }
            else if(i==15){
                codearray.add(p5) ;
            }else {
                Character ch = eingabe.charAt(i);
                codearray.add(ch);
            }
             */
        }

    }
    public int getParitärs1(){
        //for p1:
        int prüfsumme=0;
        int result =0;
        for (int i =0; i<eingabe.length(); i++){

            Character y = codearray.get(i);
            if (i==0 && y=='1'){
                prüfsumme+=1;
            }else if (i==1 && y=='1'){
                prüfsumme+=1;
            }else if (i==3 && y=='1'){
                prüfsumme+=1;
            } else if (i==4 && y=='1'){
                prüfsumme+=1;
            }else if (i==6 && y=='1'){
                prüfsumme+=1;
            }else if (i==8 && y=='1'){
                prüfsumme+=1;
            }else if (i==10 && y=='1'){
                prüfsumme+=1;
            }else if (i==11 && y=='1'){
                prüfsumme+=1;
            }else if (i==13 && y=='1'){
                prüfsumme+=1;
            }else if (i==15 && y=='1'){
                prüfsumme+=1;
            }else if (i==17 && y=='1'){
                prüfsumme+=1;
            }else if (i==19 && y=='1'){
                prüfsumme+=1;
            }
        }
        if (prüfsumme %2 ==0){
            result=0;
        }else result =1;
        return result;
    }
    public int getParitärs2(){
        int prüfsumme=0;
        int result =0;
        for (int i =0; i<eingabe.length(); i++){

            Character y = codearray.get(i);
            if (i==0 && y=='1'){
                prüfsumme+=1;
            }else if (i==2 && y=='1'){
                prüfsumme+=1;
            }else if (i==3 && y=='1'){
                prüfsumme+=1;
            } else if (i==5 && y=='1'){
                prüfsumme+=1;
            }else if (i==6 && y=='1'){
                prüfsumme+=1;
            }else if (i==9 && y=='1'){
                prüfsumme+=1;
            }else if (i==10 && y=='1'){
                prüfsumme+=1;
            }else if (i==12 && y=='1'){
                prüfsumme+=1;
            }else if (i==13 && y=='1'){
                prüfsumme+=1;
            }else if (i==16 && y=='1'){
                prüfsumme+=1;
            }else if (i==17 && y=='1'){
                prüfsumme+=1;
            }
        }
        if (prüfsumme %2 ==0){
            result=0;
        }else result =1;
        return result;
    }
    public int getParitärs3(){
        int prüfsumme=0;
        int result =0;
        for (int i =0; i<eingabe.length(); i++){

            Character y = codearray.get(i);
            if (i==1 && y=='1'){
                prüfsumme+=1;
            }else if (i==2 && y=='1'){
                prüfsumme+=1;
            }else if (i==3 && y=='1'){
                prüfsumme+=1;
            } else if (i==7 && y=='1'){
                prüfsumme+=1;
            }else if (i==8 && y=='1'){
                prüfsumme+=1;
            }else if (i==9 && y=='1'){
                prüfsumme+=1;
            }else if (i==10 && y=='1'){
                prüfsumme+=1;
            }else if (i==14 && y=='1'){
                prüfsumme+=1;
            }else if (i==15 && y=='1'){
                prüfsumme+=1;
            }else if (i==16 && y=='1'){
                prüfsumme+=1;
            }else if (i==17 && y=='1'){
                prüfsumme+=1;
            }
        }
        if (prüfsumme %2 ==0){
            result=0;
        }else result =1;
        return result;
    }
    public int getParitärs4(){
        int prüfsumme=0;
        int result =0;
        for (int i =0; i<eingabe.length(); i++){

            Character y = codearray.get(i);
            if (i==4 && y=='1'){
                prüfsumme+=1;
            }else if (i==5 && y=='1'){
                prüfsumme+=1;
            }else if (i==6 && y=='1'){
                prüfsumme+=1;
            } else if (i==7 && y=='1'){
                prüfsumme+=1;
            }else if (i==8 && y=='1'){
                prüfsumme+=1;
            }else if (i==9 && y=='1'){
                prüfsumme+=1;
            }else if (i==10 && y=='1'){
                prüfsumme+=1;
            }else if (i==18 && y=='1'){
                prüfsumme+=1;
            }else if (i==19 && y=='1'){
                prüfsumme+=1;
            }else if (i==20 && y=='1'){
                prüfsumme+=1;
            }else if (i==21 && y=='1'){
                prüfsumme+=1;
            }
            else if (i==22 && y=='1'){
                prüfsumme+=1;
            }
            else if (i==23 && y=='1'){
                prüfsumme+=1;
            }
            else if (i==24 && y=='1'){
                prüfsumme+=1;
            }
            else if (i==25 && y=='1'){
                prüfsumme+=1;
            }
        }
        if (prüfsumme %2 ==0){
            result=0;
        }else result =1;
        return result;
    }
    public int getParitärs5(){
        int prüfsumme=0;
        int result =0;
        for (int i =0; i<eingabe.length(); i++){

            Character y = codearray.get(i);
            if (i==11 && y=='1'){
                prüfsumme+=1;
            }else if (i==12 && y=='1'){
                prüfsumme+=1;
            }else if (i==13 && y=='1'){
                prüfsumme+=1;
            } else if (i==14 && y=='1'){
                prüfsumme+=1;
            }else if (i==15 && y=='1'){
                prüfsumme+=1;
            }else if (i==16 && y=='1'){
                prüfsumme+=1;
            }else if (i==17 && y=='1'){
                prüfsumme+=1;
            }else if (i==18 && y=='1'){
                prüfsumme+=1;
            }else if (i==19 && y=='1'){
                prüfsumme+=1;
            }else if (i==20 && y=='1'){
                prüfsumme+=1;
            }else if (i==21 && y=='1'){
                prüfsumme+=1;
            }
            else if (i==22 && y=='1'){
                prüfsumme+=1;
            }
            else if (i==23 && y=='1'){
                prüfsumme+=1;
            }
            else if (i==24 && y=='1'){
                prüfsumme+=1;
            }
            else if (i==25 && y=='1'){
                prüfsumme+=1;
            }

        }
        if (prüfsumme %2 ==0){
            result=0;
        }else result =1;
        return result;
    }
}
