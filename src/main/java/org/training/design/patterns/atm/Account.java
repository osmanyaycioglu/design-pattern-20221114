package org.training.design.patterns.atm;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;

@Getter
@Setter
@Builder(setterPrefix = "with")
@ToString
public class Account {
    private EAccountType accountType;
    private String name;
    private BigDecimal amount;
    private String accountNumber;

}
