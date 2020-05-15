class Arena {

    public static void main(String[] args) {
        System.out.println("FIGHT!");
        Monster m1 = new WaterMonster("carapuce", 12);
        Monster m2 = new FireMonster("salameche", 14);

        int i = 0;
        while (!m1.isKO() && !m2.isKO()) {
            System.out.println("turn> " + i + " " + m1.getName() + " (" + m1.getLife() + ")" +
                    " VS " + m2.getName() + " (" + m2.getLife() + ")");
            m1.attack(m2);
            m2.attack(m1);
            i++;
        }
        if (m1.isKO()) System.out.println(m2.getName() + " WINS!");
        else System.out.println(m1.getName() + " WINS!");

    }
}
