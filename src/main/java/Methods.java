public class Methods extends BackgroundSetup implements TestTypes  {


    public void goToLink(String Link){
        super.driver.get(Link);
    }

    public int validateTitle(String Link, String Title){
        System.out.print("Validate Title: ");
        this.goToLink(Link);
        String ActualTitle = super.driver.getTitle();
        if(Title.equals(ActualTitle)){
            return 1;
        }else{
            return 0;
        }
    }

    public void inputData(String[][] data){
        System.out.print(data[0][0]);
        System.out.print(data[0][1]);
        System.out.print(data[0][2]);
    }



}

