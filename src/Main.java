public class Main {
    public static void main(String[] args) {
        //Очередь, магазин
        QueueBehaviour queue = new Queue();
        MarketBehaviour market = new Market(queue);

        // Заказ - принятие
        market.acceptOrder("Заказ 1");
        market.acceptOrder("Заказ 2");

        // Обновление состояния магазина
        market.update();

        // Заказы - обслуживание
        market.serveOrder();
        market.serveOrder();

        // Обновление состояния магазина после обслуживания заказов
        market.update();
    }
}