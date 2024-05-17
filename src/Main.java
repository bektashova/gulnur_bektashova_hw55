public class Main {
    public static void main(String[] args) {
     /*В классе Main создать 1 экземпляр босса и задать ему все свойства (значения полям).
     Затем распечатать всю информацию о боссе.*/
        Boss myBoss = new Boss();
        myBoss.setHealth(3);
        myBoss.setDamage(4);
        myBoss.setDefenceType("Physical");
        System.out.println("Boss: " + myBoss.getHealth() + " Damage: " + myBoss.getDamage() + " DefenceType: " + myBoss.getDefenceType());

        for (Hero hero : createHeroes()) {
            System.out.println("Здоровье: " + hero.getHealth() + " Урон: " + hero.getDamage() + " Суперспособность: " + (hero.getSuperPowers() != null ? hero.getSuperPowers() :
                    "Нет"));
        }

    }

    /*Добавить метод в классе Main, который называется createHeroes, в теле метода необходимо создать 3-х героев с помощью класса
     Hero,используя при этом разные варианты конструкторов (либо первый либо второй).
     Затем поместить созданные экземпляры героев в массив
    и вернуть его с помощью команды return, как возвращаемый результат метода createHeroes. (-------Hero[ ]--------)*/
    public static Hero[] createHeroes() {

        Hero Heroes1 = new Hero(50, 29, "Magic");
        Hero Heroes2 = new Hero(69, 64);
        Hero Heroes3 = new Hero(170, 84, "Physical");
        Hero[] heroes = {Heroes1, Heroes2, Heroes3};
        return heroes;
        /*Затем вызвать только 1 раз метод createHeroes в методе main и распечатать информацию о всех героях массива через цикл.*/

    }
}





