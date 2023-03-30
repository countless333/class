package march29class;

public class homework20 {

    public static void main(String[] args) {
for(jamsil z : jamsil.values()){
    System.out.println(z.toString());
}


    }


}

enum jamsil{
    김은석("천재", 33, "국비학원"), 원호연("병신", 31, "사실상 백수");
    String 별명;
    int 나이;
    String 현실;
    jamsil(String 별명, int 나이, String 현실){
        this.별명 = 별명;
        this.나이 = 나이;
        this.현실 = 현실;

    }

    public String get별명() {
        return 별명;
    }

    public int get나이() {
        return 나이;
    }

    public String get현실() {
        return 현실;
    }

    @Override
    public String toString() {
        return "jamsil{" +
                "별명='" + 별명 + '\'' +
                ", 나이=" + 나이 +
                ", 현실='" + 현실 + '\'' +
                '}';
    }
}