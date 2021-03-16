public class Check {
    public static void main(String[] args) {
        Kiwi puf = new Kiwi();
        Bird tweet = new Bird();
        puf.fluffy();
        puf.status();
        puf.properties();
        tweet.fluffy();
        tweet.status();
        tweet.properties();

        System.out.println(puf instanceof Bird);
        System.out.println(puf.isBald());
        System.out.println(puf.isFly());
        System.out.println(puf.sit);
        System.out.println(puf.soft);
        System.out.println(puf.eat);
        System.out.println(tweet.isFly());
        System.out.println(tweet.sit);
        System.out.println(tweet.soft);
        System.out.println(tweet.bald);
        System.out.println("ООП - объектно ориентированное программирование");
        System.out.println("Инкапсуляция - сокрытие реализации класса, не напрямую, а через методы, а не как я делаю");
        System.out.println("Модификаторы доступа - public, private(только в классе), protected(пакете, производных),default(пакет)");
        System.out.println("final - используется к классам, методам, переменным, запрещает наследование");
        System.out.println("static - привязывает объект к текущему классу и к нему теперь можно обратится class.имя");
        System.out.println("Конструктор нужен, чтобы при создании класса сразузадать ему действия");
        System.out.println("Наследование существует для добавления нового и изменения старого у наследника и сокращает кол-во кода");
        System.out.println("Наследовать классы через extends, кроме private/final и default если пытаемся наследовать из другого пакета");
        System.out.println("Переопределить метод - это изменение свойств родителя у наследника");
        System.out.println("Полиморфизм и далее - спросить в четверг");

    }


}
