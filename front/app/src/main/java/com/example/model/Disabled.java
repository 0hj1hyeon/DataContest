package com.example.model;

import java.math.BigInteger;

public class Disabled {
    private BigInteger disabled_id;
    private String disabled_type;
    private String is_severe;

    public Disabled(BigInteger disabled_id, String disabled_type, String is_severe) {
        this.disabled_id = disabled_id;
        this.disabled_type = disabled_type;
        this.is_severe = is_severe;
    }
}
