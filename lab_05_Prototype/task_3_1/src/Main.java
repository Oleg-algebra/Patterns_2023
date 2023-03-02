
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> fileInput = new ArrayList<>();
        fileInput.add("task_3_1/input01.txt");
        fileInput.add("task_3_1/input02.txt");
        fileInput.add("task_3_1/input03.txt");
        Student student = new Student();

        student.solveTask(fileInput.get(0));

        ArrayList<Equation> copies = new ArrayList<>();         // list of equation's copies
        ArrayList<Equation> original = student.getOneRoot();    // list of original equations with one root
        System.out.println("=======Original before test========");
        System.out.println(original.get(0));        // print first original equation
        for(Equation equation : original){          // make equation copies
            copies.add(equation.clone());
//            System.out.println(equation);
        }
        System.out.println("=======Copies before test=======");
        System.out.println(copies.get(0));
//        for(Equation equation : copies){
//            System.out.println(equation);
//        }

        System.out.println("==========After test========");          // we make some change in the first original equation
        original.get(0).setCoefficients(new ArrayList<>());          // delete coefficients of first original equation
        System.out.println("Original: "+original.get(0));
        System.out.println("Copy: "+copies.get(0));


    }

}

