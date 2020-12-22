import org.testng.annotations.*;

import static org.testng.Assert.*;

public class FirstClassTest {
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("this is beforesuite!");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("this is aftersuite!");
    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("this is beforeteest!");
    }
    @AfterTest

    public void afterTest(){
        System.out.println("this is afterTest!");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("beforeClass!");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("afterClass!");
    }
    @BeforeGroups(groups = {"g1"})
    public void beforeGroup1(){
        System.out.println("before Group1");
    }
    @AfterGroups(groups = {"g1"})
    public void afterGroup1(){
        System.out.println("after Group1");
    }
    @BeforeGroups(groups = {"g2"})
    public void beforeGroup2(){
        System.out.println("before Group2");
    }
    @AfterGroups(groups = {"g2"})
    public void afterGroup2(){
        System.out.println("after Group2");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("beforeMethod");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("afterMethod");
    }
    @Test(groups = {"g1"})
    public void init(){
        System.out.println("this is test1!");
    }
    @Test(groups = {"g2"})
    public void init2(){
        System.out.println("this is test2!");
    }
    @Test(groups = {"g2","g1"})
    public void init3(){
        System.out.println("this is test3!");
    }
    @DataProvider(name = "data")
    public Object[][] dataProvider1(){
        return new Object[][]{
                {"null account","right pw","login failed!"},{"right account","right pw","login sucess"}
        };

    }
    @Test(dataProvider ="data" )
    public void login(String username,String password,String prompt){
        System.out.println("如果输入"+username+" "+password+",提示"+prompt);
    }

}