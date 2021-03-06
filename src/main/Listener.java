package main;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Listener implements Runnable {

    private Socket clientSocket;
    private PrintWriter out;
    private BufferedReader in;
    private Boolean connectionStatus =true;
    private String serverIp= "192.168.43.20";
    public int serverPort=1337;
    
    // Response Counter 
    @Override
    public void run(){
        startConnection(serverIp,serverPort);
        while(connectionStatus){
            try{
                in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                System.out.println(in.readLine());
            }catch (Exception e){

            }
        }
    }
    
    
    public void recieveHeartbeat() {
    	
    }
    
    public void startConnection(String ip, int port) {
        try {
            clientSocket = new Socket(ip, port);


        }catch(Exception e){

        }

    }

    public void close() {
        try{
            in.close();
            clientSocket.close();
        } catch (Exception e){

        }

    }

    public int aggregateVoteResponses(Message msg) {
    	
    	switch (msg.getType()) {
        case Vote:  
                 break;
        case RequestVoteForMe:  
                 break;
        case AlreadyVoted:  
                 break;
        default: 
        			System.out.println("Something is wrong with this Vote");
                 break;
    }
    	return 1;
    }
    public int aggregateHeartbeatResponses() {
    	
    	return 1;
    }
}
