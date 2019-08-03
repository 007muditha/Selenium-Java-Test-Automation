
public class Test {

    public static void main(String args[]){
        String TestUrl = "http://google.lk";
        RunAndEvaluate Runner = new RunAndEvaluate();
        TestTypes Run = new Methods();
        String[][] arr = new String[1][3];
        arr[0][0] = "a";
        arr[0][1] = "a";
        arr[0][2] = "a";

//        Runner.Evaluate(Run.validateTitle(TestUrl,"Google"));
        Run.inputData(arr);
    }



}
