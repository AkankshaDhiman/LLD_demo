package com.example.Low.Level.design.factory.problem;

import com.example.Low.Level.design.factory.solution.Transportfactory;

import java.util.Scanner;

public class TransportService {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter transport type:");
        String transportType = sc.nextLine();

        Transport transport = Transportfactory.getTransport(transportType);
        if (transport != null) {
            transport.run();
        }else{
            System.out.println("Transport type not found");
        }
    }
}
