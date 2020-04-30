import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class AssignmentGK {

    static ConcurrentHashMap<String, Integer> serverData = new ConcurrentHashMap();

    public static void main(String[] args) throws Exception {

        List<String> clients = new ArrayList<>();
        clients.add("AA");
        clients.add("AABB");
        clients.add("AA");
        clients.add("AA");
        clients.add("AA");
        clients.add("AA");
        clients.add("AA");
        clients.add("AA");
        clients.add("AA");
        clients.add("AA");

        for(String s : clients) {
            new Thread(writeData(s)).start();
        }
    }

    public synchronized static Runnable writeData(String data) {

        return new Runnable() {
            @Override
            public void run() {
                if (serverData.get(data) != null) {
                    serverData.put(data, serverData.get(data) + 1);
                } else {
                    serverData.put(data, 1);
                }

                synchronized(serverData) {
                    System.out.println(data + " -> " + serverData.get(data));
                }
            }
        };
    }


}