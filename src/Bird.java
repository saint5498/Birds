public class Bird {

    public boolean fly;
    public boolean soft;
    public boolean bald;
    public boolean sit;


    public Bird() {
        fly = true;
        soft = true;
        bald = false;
        sit = false;
    }


    public boolean isFly() {
        return fly;
    }

    public boolean isSoft() {
        return soft;
    }

    public boolean isBald() {
        return bald;
    }

    public boolean isSit() {
        return sit;
    }


    public void fluffy() {
        if (isBald() && isSoft()) {
            soft = true;
            System.out.println("Мягкий птиц");

        }
    }

    public void status() {
        if (isFly() && isSit()) {
            fly = true;
            System.out.println("Как самолёт");
        }
    }

    public void properties() {
        if (isBald()) {
            bald = false;
            soft = true;
        }
    }


}
