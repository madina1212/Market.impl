import clases.Market;
import enums.Product;
import service.impl.MarketServiceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
            List<Market> markets = new ArrayList<>();
            MarketServiceImpl service = new MarketServiceImpl();
            System.out.println("<<<<which methods you choose>>>>");
            System.out.println("""
                1 -> creatClient,
                2 -> getAllClient,
                3 -> getAllProducts,
                4 -> chooseMarketByName,
                5 -> deleteProductFormatMarket,
                6 -> payMoney,
                7 -> getMarketAddress,
                8 -> getRegion,
                9 -> getBank,
                10 -> sortByPrice
                11 -> getProduct
                12 -> getProductMarket
                13 -> creatMarket,
                14 -> getAllMarket
                """);
            while (true){
                int num = scanner.nextInt();
                switch (num) {
                    case 1 -> System.out.println(service.creatClient());
                    case 2 -> System.out.println(service.getAllClient());
                    case 3 -> {
                        for (Product allProduct : service.getAllProducts()) {
                            System.out.printf("%s - price: %d sale: %1f\n", allProduct, allProduct.getPrice(), allProduct.getSale() );
                        }
                    }
                    case 4 -> System.out.println(service.chooseMarketByName());
                    case 5 -> {
                        System.out.println("Enter a product name: ");
                        String name = new Scanner(System.in).nextLine();
                        System.out.println(service.deleteProductFromMarket(name, markets));
                    }
                    case 6 -> service.payMoney();
                    case 7 -> System.out.println(service.getMarketAddress());
                    case 8 -> System.out.println(service.getBank());
                    case 9 -> service.sortByPrice();
                    case 10 -> service.getAllProducts();
                    case 11 -> service.getProductMarket();
                    case 12 -> service.creatMarket();
                    case 13 -> service.getAllMarket();
                }
            }
    }
}