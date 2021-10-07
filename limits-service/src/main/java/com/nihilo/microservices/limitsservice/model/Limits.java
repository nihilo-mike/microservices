package com.nihilo.microservices.limitsservice.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@AllArgsConstructor
@NoArgsConstructor
public class Limits {
    @Getter @Setter
    private int minimum;
    @Getter @Setter
    private int maximum;
 
    
}
