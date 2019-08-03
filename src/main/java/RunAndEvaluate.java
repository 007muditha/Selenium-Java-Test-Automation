

public class RunAndEvaluate{

    public void Evaluate(int TestStatus){
        try {
            if(TestStatus == 0){
                System.out.println("Test Failed With Issue");
            }else{
                System.out.println("Test Passed");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }








}
