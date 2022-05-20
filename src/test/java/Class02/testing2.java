package Class02;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testing2 {

    @BeforeSuite
    public void beforesuite(){
        System.out.println("I am another before suite");
    }
    @BeforeTest
    public  void beforetest2(){
        System.out.println("I am before test in another class");
    }
        @Test
        public  void Testb(){
            System.out.println("drive me to 9999999, drive me8888888 ");
        }
        @Test
        public void Testa(){
            System.out.println("drive me to 999999, drive me to 8888888");
        }
    }

