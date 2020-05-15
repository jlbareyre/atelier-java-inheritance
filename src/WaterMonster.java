class WaterMonster extends Monster {

    public WaterMonster(String name, int attack) {
        super(name, attack, MonsterType.WATER);
    }

    @Override
    public boolean attack(Monster opponent) {

        int damage;
        if (opponent.getType().equals(MonsterType.FIRE)) {
            damage = getAttack() * 2;
        } else {
            damage = getAttack();
        }
        opponent.setLife(opponent.getLife() - damage);
        return opponent.isKO();
    }
}