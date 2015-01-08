package at.erceg_kritzl.pi_calculator.service;

import at.erceg_kritzl.pi_calculator.components.Balancer;
import at.erceg_kritzl.pi_calculator.components.Calculator;

import java.net.URI;
import java.rmi.AlreadyBoundException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.List;

public interface Service {

	/**
	 * Fuegt einen neuen Server in die Registry ein
	 *
	 * @param name Name des Servers
	 * @param calc Objectreferenz auf den Server
	 */
	public void addServer(String name, Calculator calc) throws RemoteException, AlreadyBoundException;

	/**
	 * Loescht einen Server aus der Registry.
	 *
	 * @param name Name des zu loeschenden Servers
	 */
	public void removeServer(String name) throws RemoteException, NotBoundException;

	/**
	 * Gibt die Referenz auf eine Serverreferenz zurueck.
	 *
	 * @param name Name des Servers
	 * @return Server
	 */
	public abstract Calculator getServer(String name) throws RemoteException, NotBoundException;

	/**
	 * Gibt eine Liste der Namen der eingetragenen Server zurueck.
	 *
	 * @return Liste der Namen der Server
	 */
	public List<String> getServerNames();

	/**
	 * Gibt die URI des Balancers und damit auch der Registry zurueck.
	 *
	 * @return URI des Balancers

	public abstract URI getUri();
	*/

}
