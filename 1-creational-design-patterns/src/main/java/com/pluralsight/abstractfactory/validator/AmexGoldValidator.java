package com.pluralsight.abstractfactory.validator;

import com.pluralsight.abstractfactory.entity.CreditCard;

public class AmexGoldValidator implements Validator {

    @Override
    public boolean isValid(CreditCard creditCard) {

        return false;
    }

}
