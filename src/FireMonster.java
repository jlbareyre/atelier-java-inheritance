class FireMonster extends Monster {

    public FireMonster(String name, int attack) {
        super(name, attack, MonsterType.FIRE);
    }

    @Override
    public boolean attack(Monster opponent) {
        int damage;
        if (opponent.getType().equals(MonsterType.AIR)) {
            damage = getAttack() * 2;
        } else {
            damage = getAttack();
        }
        opponent.setLife(opponent.getLife() - damage);
        return opponent.isKO();
    }
}