package Steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Environment {
    private static WebDriver driver;
    // exista3 modificatori de acces: privat(limiteaza accesul metodei sau variabilei doar la clasa curenta)
    // protected - limiteaza ccesul metodei sau variabilei doar la pachetul curent
    // public - variabila sau metoda poate fi accesat de oriunde
    //am definit variabila driver care sa ne stocheze instanta in care va rula driverul
    //am folosit keywordul static pt a putea accesa variabila driver prin intermediul clasei
    @Before
    // keywordul Before inseamna ca instructiunile care urmeaza vor fi executate inainte de fiecare scenariu
    public void setup(){
        WebDriverManager.chromedriver().setup();// am solicitat descarcarea de pe web a driver-ului de chrome
        driver=new ChromeDriver();// in varibila driver definita la linia 10 am stocat un nou obiect al clasei Chrome Driver

    }
    @After
    // keywordul After inseamna ca instructiunile care urmeaza vor fi executate dupa fiecare scenariu
    public void tearDown(){
        driver.quit();
    }
    public static WebDriver getDriver(){
        return driver;// se trimite catre exterior variabila driver care a fost definita la linia 10 si initializata la linia 20
    }
}