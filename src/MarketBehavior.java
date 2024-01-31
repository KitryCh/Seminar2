import java.util.LinkedList;

class Queue implements QueueBehaviour {
    private LinkedList<String> queue;

    public Queue() {
        queue = new LinkedList<>();
    }

    @Override
    public void enqueue(String person) {
        queue.add(person);
        System.out.println("Добавлен в очередь: " + person);
    }

    @Override
    public String dequeue() {
        if (!isEmpty()) {
            String person = queue.removeFirst();
            System.out.println("Удален из очереди: " + person);
            return person;
        } else {
            System.out.println("Очередь пуста");
            return null;
        }
    }

    @Override
    public int size() {
        return queue.size();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }
}
