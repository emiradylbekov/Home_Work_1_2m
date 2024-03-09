public class Father extends  GrandFather {
    private String work;

    public Father(String name, int age, Home home, HobbyEnum hobbyEnum, String work) {
        super(name, age, home, hobbyEnum);
        this.work = work;
    }

    public String getWork() {
        return work;
    }

    public final void goWork() {
        System.out.println("Идет на работу в 8 утра");
    }

    public final void goWork(String work) {
        System.out.println("Идет на работу в 8 утра" + work);
    }
    public String getInfo(){
        return super.getInfo() +
                "\nWork: " + work;
    }

}
