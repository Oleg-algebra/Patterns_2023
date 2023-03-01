import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.security.spec.RSAOtherPrimeInfo;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> fileInput = new ArrayList<>();
        fileInput.add("task_3_1/input01.txt");
        fileInput.add("task_3_1/input02.txt");
        fileInput.add("task_3_1/input03.txt");
        Student student = new Student();

        student.solveTask(fileInput.get(0));

        ArrayList<Equation> copies = new ArrayList<>();
        ArrayList<Equation> original = student.getOneRoot();
        System.out.println("=======Original========");
        for(Equation equation : original){
            copies.add(equation.clone());
            System.out.println(equation);
        }
        System.out.println("=======Copies=======");
        for(Equation equation : copies){
            System.out.println(equation);
        }

        System.out.println("==========Some test========");
        original.get(0).setCoefficients(new ArrayList<>());   // delete coefficients of first original equation
        System.out.println("Original: "+original.get(0));
        System.out.println("Copy: "+copies.get(0));


    }

}

