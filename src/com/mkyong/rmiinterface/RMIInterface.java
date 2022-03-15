package com.mkyong.rmiinterface;

import java.rmi.Remote;
import java.rmi.RemoteException;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RMIInterface extends Remote {

    public String helloTo(String name) throws RemoteException;

    public String result(int name) throws RemoteException;

}