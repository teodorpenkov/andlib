package com.anddevbg.servercommunication;

/**
 * 
 * @author anddevbg@gmail.com
 * 
 */
public interface ServerRequestExecutorListener<T> {

	public void onExecute(T response);

	public void onExecuteFailed();
}

