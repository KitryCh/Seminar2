interface QueueBehaviour {
    void enqueue(String person);  // Добавить человека в очередь
    String dequeue();  // Удалить и вернуть первого человека из очереди
    int size();  // Получить размер очереди
}
