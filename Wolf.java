import java.security.PublicKey;

class Wolf {
    private String skincolor;
    private String name;
    private int age;
    private int time;

    protected Wolf(String skincolor, String name, int age) {
        this.skincolor = skincolor;
        this.name = name;
        this.age = age;
    }

    protected void info() {
        System.out.println("Колір шерсті: " + skincolor + " Ім'я: " + name + " Вік: " + age);
    }
    protected void zoo(){
        System.out.printf("Нашому вовку " + age + " роки, ");
    }

    protected void old() {
        if (age > 8) {
            System.out.printf(" він являється дорослою особою");
        } else {
            System.out.printf(" він являється молодою особою.");
        }
    }

    protected void diner() {
        if (time > 12) {
            System.out.printf("Настав час для годування");
        } else {
            System.out.printf("Ще не час для годування");
        }
    }
}
