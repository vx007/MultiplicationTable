import java.util.Objects;

public class Task {
    private final int digit1;
    private final int digit2;
    private final int result;

    public Task(int digit1, int digit2) {
        this.digit1 = digit1;
        this.digit2 = digit2;
        this.result = digit1 * digit2;
    }

    @Override
    public String toString() {
        return String.format("%d * %d", digit1, digit2);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Task task = (Task) obj;
        return result == task.result;
    }

    @Override
    public int hashCode() {
        return Objects.hash(result);
    }
}
