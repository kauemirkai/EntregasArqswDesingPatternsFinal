package ChainOfResponsibility.SlotMachine;
/**
 * 
 * @author Kaue victor Paz Garcia Mirkai.
 * Ra:81613004
 * Professor:Bonato
 * 			
 *
 */
public class Slot10Cent implements Chain{
	private Chain nextInChain;

	@Override
	public void setNextChain(Chain nextChain) {
		this.nextInChain = nextChain;
		
	}

	@Override
	public void debita(ValorProd valorProd, ValorMoeda valorMoeda) {
		if (valorMoeda.getValorDaMoeda() == 0.10) {
			valorProd.setValorAtual(valorProd.getValorAtual()-0.10);
			System.out.println("Valor do produto:" + valorProd.getValorAtual());
			
		}
		else {
			
			nextInChain.debita(valorProd, valorMoeda);
			
		}
	}

}
