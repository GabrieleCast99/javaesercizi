# Project exclude paths
        /out/


class Customer {
    private int id;
    private String name;
    private String surname;
    private String city;
    private String address;

    public Customer(int id, String name, String surname, String city, String address) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.city = city;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getCity() {
        return city;
    }

    public String getAddress() {
        return address;
    }
}

class Product {
    private int id;
    private String type;
    private double price;
    private String description;
    private int stockedAmount;

    public Product(int id, String type, double price, String description, int stockedAmount) {
        this.id = id;
        this.type = type;
        this.price = price;
        this.description = description;
        this.stockedAmount = stockedAmount;
    }

    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public int getStockedAmount() {
        return stockedAmount;
    }
}

class Database {
    private List<Customer> customers;
    private List<Product> products;

    public Database() {
        customers = new ArrayList<>();
        products = new ArrayList<>();
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public List<Product> getProducts() {
        return products;
    }
}