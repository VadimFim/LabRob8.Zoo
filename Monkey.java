import java.sql.Time;
import java.util.Random;

class Monkey {
    private String skincolor;
    private String name;
    private int age;
    private int time;
    Time time1 = new Time(System.currentTimeMillis());

protected Monkey(String skincolor, String name, int age){
        this.skincolor = skincolor;
        this.name = name;
        this.age = age;
        this.time = time;
    }
    protected void info(){
        System.out.println("Колір шерсті: "+skincolor+" Ім'я: "+name+" Вік: "+age);
    }
    protected void zoo(){
        System.out.printf("Нашомій мавпі " + age + " роки, ");
    }

    protected void old(){
    if (age > 12){
        System.out.printf("вона являється дорослою особою.");
    }else{
        System.out.printf("вона являється дорослою особою.");
    }
    }

    protected void dinertime(){
        System.out.println(" На таблі +" + time1 + " година,");
    }
   protected void diner(){
    if (time > 18){
        System.out.println(" настав час для годування.");
    }else{
        System.out.println(" ще не час для годування.");
    }
    }
}