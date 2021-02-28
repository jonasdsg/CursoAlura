package br.com.alura.leilao;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
	private LoginPage loginPage;
		
	@BeforeEach
	public void before() {
		this.loginPage = new LoginPage();	
	}
	
	@AfterEach
	public void after() {
		this.loginPage.fechar();		
	}
	
	@Test
	public void testLoginValido() {
		this.loginPage.realizarLogin("fulano","pass");
		assertTrue(this.loginPage.isUsuarioLogado("fulano"));
	}
	
	@Test
	public void testaAcessoAPaginaPrivadaSemLogin() {
		this.loginPage.acessarCadastroDeLeilao();
		assertFalse(this.loginPage.isOnPageListagemDeLeiloes());
	}
}
