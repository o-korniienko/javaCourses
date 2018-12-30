package les_13_casting;

public class TestCasting {
    public static void main(String[] args) {
        Worker[] workers = new Worker[5];
        workers[0] = new Manager("Sam", 22, 12);
        workers[1] = new Worker("Lee", 10);
        workers[2] = new Manager("Terry", 10, 3);
        workers[3] = new Worker("Ted", 10);
        workers[4] = new Manager("Tom", 10, 3);

        for (Worker w : workers) {
            System.out.println(w.toString());
        }

        System.out.println(getAveragesalary(workers));
        System.out.println(getAveragebonus(workers));
    }

    static double getAveragesalary(Worker[] workers) {
        double sum = 0;
        for (Worker w : workers) {
            sum += w.getSalary();
        }
        return sum / workers.length;
    }

    static double getAveragebonus(Worker[] workers) {
        double sum = 0;
        int count = 0;
        for (Worker w : workers) {
            //if (w.getClass() == Manager.class)
            if (w instanceof Manager) {    // перевірка належності до класу
                Manager m = (Manager) w;  //DOWNCASTING - ПРИВЕСТИ ДО КЛАСУ Manager
                sum += m.getBonus();
                count++;
                //sum+= ((Manager) w).getBonus();
            }
        }
        return sum / count;
    }
}
