package br.com.merlofd.facade;

public class ApartamentService implements IApartamentService{
    public void verifyAp(){
        System.out.println("Verificando o apartamento...");
    }
    public void apKey(){
        System.out.println("O apartamento está vazio, aqui está a chave!");
    }
    public void payment(){
        System.out.println("Processando pagamento...");
    }
    public void okTransfer(){
        System.out.println("Tudo certo! boa estadia!!!");
    }

    @Override
    public void alugarApartamento() {
        verifyAp();
        apKey();
        payment();
        okTransfer();
    }
}
