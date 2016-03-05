/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.io.Serializable;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.Registry;
import java.util.List;

/**
 *
 * @author bassem
 */
public interface IUser extends Serializable, Remote {

    Boolean add() throws RemoteException;

    Boolean addContact(String contactEmail) throws RemoteException;

    void addSession(Session s) throws RemoteException;

    Boolean changeStatus(String status) throws RemoteException;

    User completeInfo() throws RemoteException;

    public void connect(String host, Registry r) throws RemoteException;
    
    User findUser(String searchEmail) throws RemoteException;

    List<User> getContactList() throws RemoteException;

    String getEmail() throws RemoteException;

    String getGender() throws RemoteException;

    String getPassword() throws RemoteException;

    String getStatus()throws RemoteException;

    String getUsername() throws RemoteException;

    void initSession(List<User> users) throws RemoteException;

    Boolean isContact(String contactEmail) throws RemoteException;

    Boolean isExist(String searchEmail) throws RemoteException;

    Boolean login() throws RemoteException;

    void logout() throws RemoteException;

    void recieveMessage(Session s) throws RemoteException;

    void sendMessage(Session s) throws RemoteException;

    void setStatus(String status) throws RemoteException;
}