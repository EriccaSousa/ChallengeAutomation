package testes;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignTest {
	@Test
	public void testRegisterSuccessfully() {
		System.setProperty("webdriver.chrome.driver", "/home/ericas/Área de trabalho/Driver/chromedriver");

		WebDriver navegador = new ChromeDriver();

		navegador.get("https://www.organizze.com.br/");

		navegador.findElement(By.linkText("Cadastre-se")).click();
		navegador.findElement(By.name("email")).sendKeys("ericausuarioteste@gmail.com");
		navegador.findElement(By.name("password")).sendKeys("testaut2020");
		navegador.findElement(By.name("passwordConfirmation")).sendKeys("test123");
		navegador.findElement(By.name("termsOfuse")).click();
		navegador.findElement(By.tagName("button")).click();

	}
}
