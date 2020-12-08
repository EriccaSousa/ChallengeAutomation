package testes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignTest {
	public void testRegisterSuccessfully() {
		System.setProperty("webdriver.chrome.driver", "/home/ericas/Área de trabalho/Driver/chromedriver");

		try {
			WebDriver navegador = new ChromeDriver();
			navegador.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);

			navegador.get("https://www.instagram.com/p/CH8qRWMH-Kb/");

			/*
			navegador.findElement(By.linkText("Cadastre-se")).click();
			navegador.findElement(By.name("email")).sendKeys("usuarioteste12346@gmail.com");
			navegador.findElement(By.name("password")).sendKeys("test123");
			navegador.findElement(By.name("passwordConfirmation")).sendKeys("test123");
			navegador.findElement(By.name("termsOfuse")).click();
			navegador.findElement(By.tagName("button")).click();

			String text = navegador.findElement(By.tagName("p")).getText();
			*/

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
