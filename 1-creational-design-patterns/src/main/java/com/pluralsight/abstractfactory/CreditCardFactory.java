package com.pluralsight.abstractfactory;

import com.pluralsight.abstractfactory.entity.CardType;
import com.pluralsight.abstractfactory.entity.CreditCard;
import com.pluralsight.abstractfactory.validator.Validator;

//AbstractFactory
public abstract class CreditCardFactory {

    public static CreditCardFactory getCreditCardFactory(int creditScore) {

    }

    public abstract CreditCard getCreditCard(CardType cardType);

    public abstract Validator getValidator(CardType cardType);
}
