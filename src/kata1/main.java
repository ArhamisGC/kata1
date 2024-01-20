package kata1;

import java.time.LocalDate;

public class main {
    public static void main(String[] args) {
        LocalDate birth = LocalDate.parse("2003-03-13");
        person arhamis = new person("Arhamis",birth);
        System.out.println(arhamis.getName() + " tiene "+ arhamis.getAge()+ " años");
    }
}bygygh
