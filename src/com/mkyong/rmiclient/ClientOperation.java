package com.mkyong.rmiclient;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import javax.swing.JOptionPane;

import com.mkyong.rmiinterface.RMIInterface;

public class ClientOperation {

    private static RMIInterface look_up;

    public static void main(String[] args)
            throws MalformedURLException, RemoteException, NotBoundException {

        look_up = (RMIInterface) Naming.lookup("//localhost/MyServer");
        int number = Integer.parseInt(JOptionPane.showInputDialog("Cuanto es 2 + 2?"));

        String response = look_up.result(number);
        JOptionPane.showMessageDialog(null, response);

    }

}
