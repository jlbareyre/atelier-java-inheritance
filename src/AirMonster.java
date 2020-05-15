class AirMonster extends Monster {

    public AirMonster(String name, int attack) {
        super(name, attack, MonsterType.AIR);
    }

    @Override
    public boolean attack(Monster opponent) {
        int damage;
        if (opponent.getType().equals(MonsterType.WATER)) {
            damage = getAttack() * 2;
        } else {
            damage = getAttack();
        }
        opponent.setLife(opponent.getLife() - damage);
        return opponent.isKO();
    }
}