import com.sun.jdi.PathSearchingVirtualMachine;

public class Main {
    public static void main(String[] args) {
        SimpleMath simpleMath = new SimpleMath();
        TrigMath trigmath = new TrigMath();

        System.out.println("sum = " + simpleMath.getSum(3, 5));
        System.out.println("circle square = " + trigmath.getCircleSquare(32));
    }
}