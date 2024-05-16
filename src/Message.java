import java.util.*;

public class Message {
    public String messageConvertido(double valor, double valorConvertido, String baseCode, String targetCode){
        return """
                %s %s é igual a %s %s
                """.formatted(valor, codeToName(baseCode), valorConvertido, codeToName(targetCode));
    }

    public String codeToName(String code){
        Map<String, String> listCode = new HashMap<>();
        listCode.put("USD", "dólares americano");
        listCode.put("BRL", "reais brasileiro");
        listCode.put("EUR", "euros");
        listCode.put("RUB", "rublos russo");
        if (listCode.containsKey(code)){
            return listCode.get(code);
        }
        // Retorna null ou uma string vazia se o código não for encontrado
        return null;
    }

    public String messageInicial(){
        return """
                =========================================
                Seja bem-vindo/a ao Conversor de Moedas
                =========================================
                Escolha uma opção
                
                1) Dólar americano => Euro
                2) Euro => Dólar americano
                3) Dólar americano => Real brasileiro
                4) Real brasileiro => Dólar americano
                5) Dólar americano => Rublo russo
                6) Rublo russo => Dólar americano
                7) Sair
                
                Escolha uma opção válida:
                =========================================
                """;
    }
    public String messageChoiced(int option){
        switch (option){
            case 1:
                return "Converter Dólar($) em Euro(€)";
            case 2:
                return "Converter Euro(€) em Dólar($)";
            case 3:
                return "Converter Dólar($) em Real Brasileiro(R$)";
            case 4:
                return "Converter Real Brasileiro(R$) em Dólar($)";
            case 5:
                return "Converter Dólar($) em Rublo Russo(р.)";
            case 6:
                return "Converter Rublo Russo(р.) em Dólar($)";
        }
        return "";
    }
}
