package service.impl;

import clases.BankAccount;
import clases.Market;
import clases.Persen;
import enums.Bank;
import enums.Product;
import service.MarketService.MarketService;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class MarketServiceImpl implements MarketService {
    List<Persen> clients = new ArrayList<>();
    List<Product> products = new ArrayList<>();
    List<Market> markets = new ArrayList<>();
    @Override
    public String creatClient() {
        try {
            System.out.println("REGISTER FOR A CARD.");
            System.out.println("Enter your name: ");
            String name = new Scanner(System.in).nextLine();
            System.out.println("Enter your id: ");
            long id = new Scanner(System.in).nextLong();
            System.out.println("Enter your password: ");
            String password = new Scanner(System.in).nextLine();
            System.out.println("Enter your age: ");
            int age = new Scanner(System.in).nextInt();
            System.out.println("Enter your BankAccount: ");
            String bank = new Scanner(System.in).nextLine();
            System.out.println("Enter your bankAccount money: ");
            double bankAccount = new Scanner(System.in).nextDouble();

            for (Persen client : clients) {
                if (client.getName().equals(name)) {
                    throw new Exception("Your name is incorrect!");
                }
                if (client.getId() == id) {
                    throw new Exception("Your id is incorrect!");
                }
                if (client.getPassword().equals(password)) {
                    throw new Exception("Your password is incorrect!");
                }
                if (client.getAge() < 16) {
                    throw new Exception("You are not old enough to get an card!");
                }
                if (bank.isEmpty()) {
                    throw new Exception("Your bank is incorrect!");
                }
                if (bankAccount < 0) {
                    throw new Exception("There is no money in your account, please replenish the money");
                }
            }
            BankAccount bankAccount1 = new BankAccount(Bank.valueOf(bank), bankAccount);
            Persen client = new Persen(name, id, password, age, bankAccount1);
            clients.add(client);
            return "Successfully!";

        } catch (Exception e) {
            System.out.println("You are not registered.");
        }
        return "You have successfully completed!";
    }

    @Override
    public List<Persen> getAllClient() {
        return clients;
    }

    @Override
    public String creatMarket() {
        System.out.println("Market tuzuu: ");
        System.out.println("Enter a market name: ");
        String name = new Scanner(System.in).nextLine();
        System.out.println("Enter your id: ");
        long id = new Scanner(System.in).nextLong();
        System.out.println("Enter a address market: ");
        String marAddress = new Scanner(System.in).nextLine();
        System.out.println("Product: ");


        return "\"Successfully!\"";
    }

    @Override
    public List<Market> getAllMarket() {
        return markets;
    }

    @Override
    public List<Product> getAllProducts() {
        return List.of(Product.values());
    }

    @Override
    public Market chooseMarketByName() {
        try {
            System.out.println("Enter a market name");
            String name = new Scanner(System.in).nextLine();
            for (Market market : markets) {
                if (market.getName().equals(name)) {
                    return market;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public String deleteProductFromMarket(String name, List<Market> markets) {
        for (Market market : markets) {
            if (market.getName().equals(name)) {
                markets.remove(name);
            }
        }
        return "Name deleted!! ";
    }

    @Override
    public void payMoney() {
        System.out.println("Enter your name: ");
        String name = new Scanner(System.in).nextLine();
        System.out.println("Enter your password: ");
        String password = new Scanner(System.in).nextLine();

        for (Persen client : clients) {
            if (client.getName().equals(name) && client.getPassword().equals(password)) {
                System.out.println("Enter a market name: ");
                String marName = new Scanner(System.in).nextLine();
                for (Market market : markets) {
                    if (market.getName().equals(marName)) {
                        System.out.println(client.getBankAccount());

                    }
                }
            }

        }
    }

    @Override
    public String getMarketAddress() {
        System.out.println("Enter a market name: ");
        String name = new Scanner(System.in).nextLine();
        for (Market market : markets) {
            if (market.getName().equals(name)) {
                return market.getAddress();
            }

        }
        return "Sorry, the address of the market was not found!";
    }


    @Override
    public List<Bank> getBank() {
        return List.of(Bank.values());
    }

    @Override
    public void sortByPrice() {
        products.sort(sortByPrice);
        System.out.println(products);
    }
    Comparator<Product> sortByPrice = new Comparator<>() {
        @Override
        public int compare(Product o1, Product o2) {
            return o1.getPrice() - o2.getPrice();
        }
    };
    @Override
    public void getProductMarket() {
        try {
            System.out.println("Enter a market name: ");
            String marketName = new Scanner(System.in).nextLine();

            for (Market market : markets) {
                if (market.getName().equals(marketName)) {
                    System.out.println(market.getProducts());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
