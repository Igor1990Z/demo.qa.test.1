import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class secondTest {

    //@BeforeAll
    static void Configuration(){
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl="https://www.gismeteo.ru";
        Configuration.holdBrowserOpen=true;
    }
@Test
        void test () {open("https://www.gismeteo.ru");}
   //@Test
    void firstTest(){
        open("/catalog/russia/rostov-oblast/neklinovsky-district/");
    }
}
