package jp.ac.uryukyu.ie.e225743;

public class LivingThing {
    private String name;
    private int hitPoint;
    private int attack;
    private boolean dead;

    public LivingThing(String name, int hitPoint, int attack) {
        this.name = name;
        this.hitPoint = hitPoint;
        this.attack = attack;
        this.dead = false; // dead変数の初期化
    }

    public boolean isDead(){
        return this.dead;
    }
    public String getName(){
        return this.name;
    }

    // ゲッターとセッター
    public int getHitPoint() {
        return this.hitPoint;
    }

    public void setHitPoint(int hitPoint) {
        this.hitPoint = hitPoint;
    }

    public int getAttack() {
        return this.attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public void setDead(boolean dead) {
        this.dead = dead;
    }

    public void attack(LivingThing opponent){
        int damage = (int)(Math.random() * attack);
        if (getHitPoint() > 0){
        System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, opponent.getName(), damage);
        opponent.wounded(damage);
        }
    }
    public void wounded(int damage){
        hitPoint -= damage;
        if (hitPoint <= 0) {
            dead = true;
            System.out.printf("%sは倒れた。\n", name);
        }
    }
}

