/*Создать класс Героя (Hero), с приватными полями здоровье, урон и суперспособность.
 Написать 2 разных конструктора для создания объекта. В одном конструкторе задаются все поля,
  в другом только здоровье и урон.
Добавить в класс Hero геттеры для всех полей. Сеттеров быть не должно.*/
public class Hero {

    private int health;
    private int damage;
    private String superPowers;

    public int getHealth() {
        return this.health;
    }

    public int getDamage(){
        return this.damage;
    }
    public String getSuperPowers(){
        return this.superPowers;
    }

    public Hero(int health, int damage, String superPowers) {
        this.health = health;
        this.damage = damage;
        this.superPowers = superPowers;
    }

    public Hero(int health, int damage) {
        this.health = health;
        this.damage = damage;
    }

}
