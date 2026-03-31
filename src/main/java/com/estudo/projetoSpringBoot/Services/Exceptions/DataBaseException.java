package com.estudo.projetoSpringBoot.Services.Exceptions;

public class DataBaseException extends RuntimeException{
    public DataBaseException(String msg){
        super(msg);
    }
}
