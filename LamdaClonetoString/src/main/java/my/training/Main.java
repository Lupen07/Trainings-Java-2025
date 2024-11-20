package my.training;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Tempo tempoPersona = new Tempo("Matteo", "Zanetti", 21, 7, 1982);

        String result = tempoPersona.toString();
        System.out.println(result);
    }
}