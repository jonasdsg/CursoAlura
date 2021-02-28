package br.com.alura.leilao;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

	private static final String URL_LIST_LEILOES = "http://localhost:8080/leiloes/2";
	private static final String URL_LOGIN = "http://localhost:8080/login";
	private WebDriver browser;

	LoginPage() {
		System.setProperty("webdriver.chrome.driver","drivers/chromedriver");		
		this.browser = new ChromeDriver();	
	}
	
	public void fechar() {
		this.browser.close();
	}

	public void realizarLogin(String usuario,String senha) {
		browser.navigate().to(URL_LOGIN);
		browser.findElement(By.name("username")).sendKeys(usuario);
		browser.findElement(By.name("password")).sendKeys(senha);
		browser.findElement(By.id("login-form")).submit();		
	}

	public boolean isUsuarioLogado(String usuario) {
		return !this.browser.getCurrentUrl().contains(URL_LOGIN) && this.browser.getPageSource().contains(usuario);
	}

	public void acessarCadastroDeLeilao() {
		browser.navigate().to(URL_LIST_LEILOES);		
	}

	public boolean isOnPageListagemDeLeiloes() {
		return URL_LIST_LEILOES.contains(this.browser.getCurrentUrl());
	}	
}
