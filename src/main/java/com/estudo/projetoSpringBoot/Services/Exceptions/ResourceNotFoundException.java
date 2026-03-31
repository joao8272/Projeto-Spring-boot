package com.estudo.projetoSpringBoot.Services.Exceptions;

public class ResourceNotFoundException extends RuntimeException{
    public ResourceNotFoundException(Object id){
        super("Resource not found. Id " + id);
    }
}
