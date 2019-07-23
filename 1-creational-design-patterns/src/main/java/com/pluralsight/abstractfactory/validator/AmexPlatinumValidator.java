package com.pluralsight.abstractfactory.validator;

import com.pluralsight.abstractfactory.entity.CreditCard;

public class AmexPlatinumValidator implements Validator {

    @Override
    public boolean isValid(CreditCard creditCard) {

        return false;
    }

}
