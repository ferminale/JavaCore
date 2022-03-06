package HW1;

import java.util.Random;

//28.02.2022

public abstract class Human {

    public static Random random = new Random();

        protected String name;
        private int stamina;

        Human(String name, int stamina) {
            this.name = name;
            this.stamina = stamina;
        }



        String getName() {
            return this.name;
        }

        int getStamina() {
            return this.stamina;
        }

        protected void run() {
            int[] track = new int[5];
            int sumObstacles = 0;
            for (int i = 0; i < track.length; i++) {
                track[i] = random.nextInt(5);
            }
            for (int i = 0; i < track.length; i++) {
                sumObstacles = sumObstacles + track[i];
            }
            if (sumObstacles <= stamina) {
                System.out.println(name + " пробежал дистанцию за " + (20-(stamina-sumObstacles)) + "c.");
            } else {
                System.out.println(name + " не смог пробежать дистанцию, потому что выдохся");
            }
        }

}

