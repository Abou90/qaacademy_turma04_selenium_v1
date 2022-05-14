import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExerciciosSelenium {

    WebDriver driver = new ChromeDriver();


    @Test
    public void testeExercicosSelenium() {
        driver.get("file:///D:/Documentos/QA%20-%20AUTOMATIZA%C3%87%C3%83O/Paginas%20para%20testes/Register.html");
        driver.findElement(By.xpath("//body[@class='ng-scope']/section[@id='section']/div[@class='container center']/div[contains(@class,'row')]/div[@class='col-sm-6 col-md-6 col-xs-12']/form[@id='basicBootstrapForm']/div[1]/div[1]/input[1]"))
                .sendKeys("Flavio");
        driver.findElement(By.xpath("//body[@class='ng-scope']/section[@id='section']/div[@class='container center']/div[contains(@class,'row')]/div[@class='col-sm-6 col-md-6 col-xs-12']/form[@id='basicBootstrapForm']/div[@class='form-group']/div[2]/input[1]"))
                .sendKeys("Dias");
        driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("AV Paulista, 509");
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("teste@teste.com.br");
        driver.findElement(By.xpath(" //input[@type='tel']")).sendKeys("119773512");
        driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"checkbox2\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"msdd\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[7]/div/multi-select/div[2]/ul/li[8]/a")).click();
        driver.findElement(By.xpath("/html/body")).click();
        driver.findElement(By.xpath("//*[@id=\"Skills\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"Skills\"]/option[39]")).click();
        driver.findElement(By.xpath("//*[@id=\"countries\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"select2-country-container\"]")).click();

    }
}
