import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestA {


    @Parameters({"testType"})
    @Test(groups="smoke")
    public void smokeTest1(String testType) {
        Assert.assertEquals(testType, "smoke");
    }

    @Parameters({"testType"})
    @Test(groups = "nonsmoke")
    public void smokeTest2(String testType){
        Assert.assertEquals(testType, "smoke");
    }



}
