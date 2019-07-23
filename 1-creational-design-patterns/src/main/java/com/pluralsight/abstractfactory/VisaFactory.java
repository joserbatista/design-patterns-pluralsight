package com.pluralsight.abstractfactory;

import com.pluralsight.abstractfactory.entity.CardType;
import com.pluralsight.abstractfactory.entity.CreditCard;
import com.pluralsight.abstractfactory.validator.Validator;
import com.pluralsight.abstractfactory.validator.VisaValidator;

public class VisaFactory extends CreditCardFactory {

    @Override
    public CreditCard getCreditCard(CardType cardType) {

    }

    @Override
    public Validator getValidator(CardType cardType) {
        return new VisaValidator();
    }

}
