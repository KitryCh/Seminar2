interface MarketBehaviour {
    void acceptOrder(String order);  // Принять заказ
    String serveOrder();  // Обслужить заказ и вернуть его
    void update();
}
