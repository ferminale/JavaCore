package HW1;

//28.02.2022
public class HW1 {
        public static void main(String[] args) {
            Runner runner1 = new Runner("Петя", 20);
            Runner runner2 = new Runner("Вася", 19);
            Runner runner3 = new Runner("Гена", 21);
            Runner runner4 = new Runner("Вова", 5);

            Human[] runners = {runner1, runner2, runner3, runner4};

            for (int i = 0; i < runners.length; i++) runners[i].run();
        }
    }
