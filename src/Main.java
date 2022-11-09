import java.util.HashSet;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        HashSet<Task> tasks = new HashSet<>(15);
        Random random = new Random();

        while (tasks.size() < 15) {
            tasks.add(new Task(random.nextInt(1, 9), random.nextInt(1, 9)));
        }

        for (Task task : tasks) {
            System.out.println(task);
        }
    }
}
