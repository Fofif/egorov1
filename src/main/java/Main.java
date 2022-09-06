public class Main {
    public static void main(String[] args) {
        String auto1 = "ВАЗ2101";
        String auto2 = "FORD";
        String auto3 = "SHKODA";
        String proverka = "ВАЗ2101";
        System.out.println(auto1 + " " + auto2 + " " + auto3);
        if(auto1.indexOf(proverka) != -1) {
            System.out.println("ВАЗ2101 есть");
        } else {
            if(auto2.indexOf(proverka) != -1) {
                System.out.println("ВАЗ2101 есть");
            } else {
                if(auto3.indexOf(proverka) != -1) {
                    System.out.println("ВАЗ2101 есть");
                } else{
                    System.out.println("ВАЗ2101 нет");
                }
            }
        }
    }
}

