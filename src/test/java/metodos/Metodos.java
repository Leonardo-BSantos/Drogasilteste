package metodos;


import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Metodos {

	WebDriver driver;

	/**
	 * @author tribo 6
	 * @param site
	 * metodo para abrir navegador
	 */
	public void abrirNavegador(String site) {
		
		try {
			
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
				
				driver = new ChromeDriver();
				driver.get(site);
				driver.manage().window().maximize();
								
			}catch (Exception e) {
				
				System.out.println(" ----- erro ao abrir navegador ----- " + e.getMessage());
			
			}
	}
	
	/**
	 * @author tribo 6
	 * @param site
	 * metodo para clicar no elemento
	 */
		
		public void clicar(By elemento) {
			
			try {
				
				driver.findElement(elemento).click();
				
			}catch (Exception e) {
				System.out.println(" ----- erro ao clicar no elemento ----- " + e.getMessage());
			}
			
		}
		
		/**
		 * @author tribo 6
		 * @param site
		 * metodo para escrever no elemento
		 */
		
		public void escrever(By elemento, String texto) {
			
			try {
				
					driver.findElement(elemento).sendKeys(texto);
					
			}catch (Exception e) {
				System.out.println(" ----- erro ao escrever no elemento ----- " + e.getStackTrace());
			}
		
		}
		
		/**
		 * @author tribo 6
		 * @param site
		 * metodo para submitar elemento
		 */
		
		public void submit(By elemento) {
			
			try {
				
			
			driver.findElement(elemento).submit();
			
			}catch (Exception e) {
				System.out.println(" ----- erro ao submit elemento ----- " + e.getStackTrace());
			}
		}
		
		/**
		 * @author tribo 6
		 * @param site
		 * metodo para pausar a automatização
		 */
		
		public void pausa(int tempo){
			
			try {
			Thread.sleep(tempo);
		}catch (Exception e) {
			System.out.println(" ----- erro ao pausar o elemento ----- " + e.getMessage());
		}
		}
		
		/**
		 * @author tribo 6
		 * @param site
		 * metodo para validar o teste
		 */
		
		public void validar(String texto, By elemento) {
			assertEquals(texto, elemento);
		}
	
	}


