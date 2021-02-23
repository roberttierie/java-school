package com.lambdaschool.usermodel.services;
import com.lambdaschool.javaschool.models;
import java.util.List;

public interface HelperFunctions
{
    List<ValidationError> getConstraintViolation(Throwable cause);
}