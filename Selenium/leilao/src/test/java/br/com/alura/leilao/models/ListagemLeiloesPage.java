package br.com.alura.leilao.models;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.function.BooleanSupplier;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ListagemLeiloesPage {
	private WebDriver browser;
	
	public static ListagemLeiloesPage obterListagemLeiloesPage(String usuario,String senha){
		return LoginPage.obterListagemLeiloesPage(usuario, senha);
	}
	
	public ListagemLeiloesPage(WebDriver browser) {
		this.browser = browser;
	}

	public void cadastrarLeilaoPara(String produto, Double valor) {
		String data = LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		this.browser.navigate().to("http://localhost:8080/leiloes/new");
		this.browser.findElement(By.id("nome")).sendKeys(produto);
		this.browser.findElement(By.id("valorInicial")).sendKeys(valor.toString());
		this.browser.findElement(By.id("dataAbertura")).sendKeys(data);
		this.browser.findElement(By.id("button-submit")).click();
	}

	public WebElement obterUltimoLeilaoCadastrado() {
		List<WebElement> trs = this.browser.findElements(By.tagName("tr"));
		Integer size = trs.size();
		return size>0 ? trs.get(size-1) : null;
	}

	public boolean checarSeUltimoCadastroPossui(String produto,Double valor) {
		List<WebElement> tds = this.obterUltimoLeilaoCadastrado().findElements(By.tagName("td"));
		return  tds.size()>0 ? 
				tds.get(0).getText().contains(produto) &&
				tds.get(2).getText().contains(valor.toString())
			  : false;
	}

	public void fechar() {
		this.browser.close();
	}

}
