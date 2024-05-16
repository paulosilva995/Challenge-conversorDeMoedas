import java.io.IOException;
import java.util.Scanner;

public class Menu {
    private int typeOption;
    private double typeValue;

    public void menuInicial() throws IOException, InterruptedException {
        Api api = new Api();
        Message msg = new Message();
        Scanner type = new Scanner(System.in);
        Convert conversor = new Convert();

        System.out.println(msg.messageInicial());
        setTypeOption(type.nextInt());
        while (getTypeOption() != 7){
            System.out.println(msg.messageChoiced(getTypeOption()));
            switch (getTypeOption()){
                case 1:
                    //Valor digitado
                    setTypeValue(type.nextDouble());
                    conversor.setValueTyped(getTypeValue());
                    //Valor da cotação
                    conversor.setValueRate(api.convertCoin("USD", "EUR"));
                    conversor.convertido();
                    //Mensagem do valor convertido
                    System.out.println(msg.messageConvertido(conversor.getValueTyped(), conversor.convertido(), "USD", "EUR"));
                    menuInicial();
                    break;
                case 2:
                    //Valor digitado
                    setTypeValue(type.nextDouble());
                    conversor.setValueTyped(getTypeValue());
                    //Valor da cotação
                    conversor.setValueRate(api.convertCoin("EUR", "USD"));
                    conversor.convertido();
                    //Mensagem do valor convertido
                    System.out.println(msg.messageConvertido(conversor.getValueTyped(), conversor.convertido(), "EUR", "USD"));
                    menuInicial();
                    break;
                case 3:
                    //Valor digitado
                    setTypeValue(type.nextDouble());
                    conversor.setValueTyped(getTypeValue());
                    //Valor da cotação
                    conversor.setValueRate(api.convertCoin("USD", "BRL"));
                    conversor.convertido();
                    //Mensagem do valor convertido
                    System.out.println(msg.messageConvertido(conversor.getValueTyped(), conversor.convertido(), "USD", "BRL"));
                    menuInicial();
                    break;
                case 4:
                    //Valor digitado
                    setTypeValue(type.nextDouble());
                    conversor.setValueTyped(getTypeValue());
                    //Valor da cotação
                    conversor.setValueRate(api.convertCoin("BRL", "USD"));
                    conversor.convertido();
                    //Mensagem do valor convertido
                    System.out.println(msg.messageConvertido(conversor.getValueTyped(), conversor.convertido(), "BRL", "USD"));
                    menuInicial();
                    break;
                case 5:
                    //Valor digitado
                    setTypeValue(type.nextDouble());
                    conversor.setValueTyped(getTypeValue());
                    //valor da cotação
                    conversor.setValueRate(api.convertCoin("USD", "RUB"));
                    conversor.convertido();
                    //Mensagem do valor convertido
                    System.out.println(msg.messageConvertido(conversor.getValueTyped(), conversor.convertido(), "USD", "RUB"));
                    menuInicial();
                    break;
                case 6:
                    //Valor digitado
                    setTypeValue(type.nextDouble());
                    conversor.setValueTyped(getTypeValue());
                    //Valor da cotação
                    conversor.setValueRate(api.convertCoin("RUB", "USD"));
                    conversor.convertido();
                    //Mensagem do valor convertido
                    System.out.println(msg.messageConvertido(conversor.getValueTyped(), conversor.convertido(), "RUB", "USD"));
                    menuInicial();
                    break;
                case 7:
                    break;
            }
        }
    }

    public void setTypeValue(double typeValue) {
        this.typeValue = typeValue;
    }

    public void setTypeOption(int typeOption) {
        this.typeOption = typeOption;
    }

    public int getTypeOption() {
        return typeOption;
    }

    public double getTypeValue() {
        return typeValue;
    }
}
