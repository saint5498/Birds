public class Kiwi extends Bird {
    public boolean eat;

    public Kiwi() {
        fly = false;
        soft = true;
        bald = false;
        sit = true;
        eat = true;
    }

    @Override
    public void fluffy() {

        super.fluffy();
        System.out.println("Больше - значит мягче");
    }

    @Override
    public void properties() {
        System.out.println("Вся та же птица, но больше ест");
    }

    @Override
    public void status() {
        System.out.println("Как курица");


    }

}
