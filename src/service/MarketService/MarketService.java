package service.MarketService;

import clases.Market;
import clases.Persen;
import enums.Bank;
import enums.Product;

import java.util.List;

public interface MarketService {
    String creatClient();
    List<Persen> getAllClient();
    String creatMarket();
    List<Market> getAllMarket();
    List<Product> getAllProducts();
    Market chooseMarketByName();
    String deleteProductFromMarket(String name, List<Market> markets);
    void payMoney();
    String getMarketAddress();
    List<Bank> getBank();
    void sortByPrice();
    void getProductMarket();

}
