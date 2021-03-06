package com.mphasis.cui;

import java.io.*;
import java.net.Socket;



public class Client {

    // This class represents the initial LOCAL running client.

    // methods
    /*
     *  1.  connect to server and passes  clientID, type EXEC
     *
     *  	1a.  make a NEW ClientGateway object passing client ID
     *  	 the com.mphasis.cui.Main.Client gateway reader is a SECOND SOCKET, and it
     *         listens for messages from gateway.
     *
     *  2.  send orders to server -> wait for stdin, or show menu etc.
     *
     *
     *
     *  3. send order cancelleations
     *
     *  4. request market data.
     *
     *
     *
     */
    //private String clientID;
    //private ClientConnectionType connectionType;



    //Args from client  args[clientID, connectionType]
    public static void main(String args[]) throws IOException
    {
        String clientID = args[0];
        String connectionType = args[1];
        int port = Integer.parseInt(args[2]);
        port=54655;

        switch(connectionType){

            case "FEED":
                System.out.println("Starting feed method call...");
                startFeed(clientID, port);
                //	new Thread(	new ClientGatewayReader()).start();



                break;

            case "EXEC":
                //create exec connection
                startExec(clientID, port);

                //new Thread(	new ClientGatewayExec()).start();


                break;

            default:
                System.out.println("Could not read connection type. Exiting...");

        }



    }

    public static void startExec(String clientID, int port) throws IOException{

        //read args from user input.
        //open socket connection to server.
        Socket connExchange = new Socket("localhost", port);
        BufferedReader input = new BufferedReader(new InputStreamReader(connExchange.getInputStream()));
        PrintWriter output = new PrintWriter(connExchange.getOutputStream(), true);


        // send initial message to server to identify connection type.  array[clientID, Type]
        String initExec = clientID + "|" +  "EXEC";
        System.out.println("Sending client Id and exec feed to exchange...");

        output.println(initExec);

        boolean isRunning = true;
        //Loop asking for user input, sending orders etc.


        // format for exchange exec messages
        // New orders =  clientID + '|' + messageType + '|' + [orderType] + '|' + [quantity]+ '|' + [price]
        // Cancel Orders = clientID + '|' + messageType + '|' + [orderID]
        // request for market data = clientID + '|' + messageType
        Console c = System.console();
        while(isRunning)
        {
            printMenu();

            String command = c.readLine();
            int action = Integer.parseInt(command);
            switch(action){
                case 1:
                    //creat order
                    System.out.println("Order Entry:  [BUY/SELL] | [quantity] | [price]");
                    String order = c.readLine();
                    String[] orderArray = order.split("\\|");
                    System.out.println("Making Order, field1: " + orderArray[0]);
                    System.out.println("Making Order, field2: " + orderArray[1]);
                    System.out.println("Making Order, field3: " + orderArray[2]);


                    System.out.println("Sending order...");
                    output.println(clientID + "|" + "NewOrder" + "|" + orderArray[0] + "|" + orderArray[1] + "|" + orderArray[2]);


                    break;

                case 2:
                    //cancel order
                    String cancelID = c.readLine("Enter Order ID to Cancel");
                    System.out.println("Sending Cancellation to exchange...");

                    output.println(clientID + "|" + "CancelOrder" + "|" + cancelID );

                    break;

                case 3:
                    //request market data
                    System.out.println("Requesting market data...");
                    output.println(clientID + "|" + "MarketData");


                    break;
                case 4:
                    //exit
                    isRunning = false;
                    break;

                default:
                    System.out.println("Not a valid option");
                    break;

            }
            System.out.println("com.mphasis.cui.Main.Client exiting...");


        }


    }
    public static void printMenu(){
        System.out.println("You are connected to the exchange as an EXEC Feed:");
        System.out.println("1 : Create Order" );
        System.out.println("2 : Cancel Order" );
        System.out.println("3 : Request Market Data");
        System.out.println("4 : Quit");


    }

    public static void startFeed(String clientID, int port) throws IOException{

        Socket connFeedExchange = new Socket("localhost", port);
        BufferedReader input = new BufferedReader(new InputStreamReader(connFeedExchange.getInputStream()));
        PrintWriter output = new PrintWriter(connFeedExchange.getOutputStream(), true);


        // send initial message to server to identify connection type.  array[clientID, Type]
        String initExec = clientID + "|" +  "FEED";
        System.out.println("Sending ID and feed request to server " + clientID );
        output.println(initExec);

        boolean isRunning = true;

        while(isRunning)
        {
            System.out.println("Feed is ready! Waiting for lines from exchange....");
            String feed = input.readLine();
            System.out.println("Message from gateway received!");
            System.out.println(feed);
        }

    }


}

