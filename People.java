class People{
    private String skincolor;
    private String name;
    private int age;
    private int work;

    protected People(String skincolor, String name, int age, int work){
        this.skincolor = skincolor;
        this.name = name;
        this.age = age;
        this.work = work;
    }
    protected void info(){
        System.out.println("Колір шкіри: "+skincolor+" Ім'я: "+name+" Вік: "+age);
    }
    protected void old(){
        if (age > 30){
            System.out.printf("Він чоловік середнього віку");
        }else {
            System.out.printf("Він ще молодий, ");
        }
    }

    protected void worktime(){
        System.out.printf("він працює у піцерії " + work + " років, ");
    }
    protected void work(){
        if (work > 10){
            System.out.println("у нього великий досвід праці. ");
        }else {
            System.out.println("він ще не досвідчений. ");
        }
    }

}