class Market implements MarketBehaviour {
    private QueueBehaviour queue;
    private String currentOrder;

    public Market(QueueBehaviour queue) {
        this.queue = queue;
    }

    @Override
    public void acceptOrder(String order) {
        System.out.println("Принят заказ: " + order);
        queue.enqueue(order);
    }

    @Override
    public String serveOrder() {
        currentOrder = queue.dequeue();
        System.out.println("Обслужен заказ: " + currentOrder);
        return currentOrder;
    }

    // Метод для обновления состояния магазина
    public void update() {
        System.out.println("Текущий заказ: " + currentOrder);
        System.out.println("Количество заказов в очереди: " + queue.size());
    }
}
