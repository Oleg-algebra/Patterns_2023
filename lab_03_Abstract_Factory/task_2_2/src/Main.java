import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        final int A = 10;           // закупити A автобусів
        final int T = 15;          // закупити T трамваїв
        final int Tr = 20;        // закупити Tr – тролейбусів
        final int N = 200_000;   // орієнтований пробіг експлуатації
        Contract contract = new Contract();
        contract.finalizeContract(A,T,Tr,N);


    }
}
