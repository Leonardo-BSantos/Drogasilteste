package elementos;

import org.openqa.selenium.By;

public class Elementos {

	private By campoPesquisa = By.cssSelector("#searchHeader");
	private By btnProc = By.cssSelector(
			"#fixed-container-styles > header > div > form > button");
	private By btnProduto = By.cssSelector(
			"#__next > main > div > div:nth-child(3) > div > div.sc-fGoNRK.haWMoQ.rd-col-13 > div.sc-kLntdL.VlbWj > div:nth-child(1) > div > div.sc-hiCivh.fkyjVH.price-box > div");
	private By btnComprar = By.cssSelector(
			"#__next > main > div > div:nth-child(3) > div > div.sc-fGoNRK.haWMoQ.rd-col-13 > div.sc-kLntdL.VlbWj > div:nth-child(1) > div > button");
	
	private By chatOnline = By.id("open-converse");
	private By campoChat = By.id("user-input");
	private By btnFechar = By.cssSelector("#chat-window > div.chat-header > div.chat-header-btn.close");
	private By btnEntercht = By.cssSelector("#chat-window > form > button");
	private By btnCookies = By.cssSelector("#onetrust-close-btn-container > button");


	public By getCampoPesquisa() {
		return campoPesquisa;

	}

	public By getBtnProduto() {
		return btnProduto;

	}


	public By getBtnProc() {
		return btnProc;

	}

	public By getBtnComprar() {
		return btnComprar;
	}

	public By getChatOnline() {
		return chatOnline;
	}

	public By getEscreverChat() {
		return campoChat;
	}

	public By getBtnFechar() {
		return btnFechar;
	}

	public By getBtnEntercht() {
		return btnEntercht;
	}

	public By getBtnCookies() {
		return btnCookies;
	}

}
