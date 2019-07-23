package com.pluralsight.abstractfactory.validator;

import com.pluralsight.abstractfactory.entity.CreditCard;

public interface Validator {
    boolean isValid(CreditCard creditCard);
}
