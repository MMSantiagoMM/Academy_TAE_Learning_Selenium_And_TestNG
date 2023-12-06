import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestB {


    @Parameters({"testType"})
    @Test(groups="regression")
    public void regressionTest1(String testType) {
        Assert.assertEquals(testType, "regression");
    }
}
