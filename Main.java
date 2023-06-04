public class Main {
    public static void main(String[] args){
        People people1 = new People("Кремовий.", "Кирил.",17, 12);
        people1.info();
        people1.old();
        people1.worktime();
        people1.work();
        Monkey monkey1 = new Monkey("Коричневий.","Гаага.",4);
        monkey1.info();
        monkey1.zoo();
        monkey1.old();
        monkey1.dinertime();
        monkey1.diner();
        Wolf wolf1 = new Wolf("Сірий.","Норман.",2);
        wolf1.info();
        wolf1.zoo();
        wolf1.old();
    }
}
