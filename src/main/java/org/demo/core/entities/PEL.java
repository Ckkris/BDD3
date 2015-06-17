package org.demo.core.entities;

import javax.persistence.*;

@Entity
@Table( name ="comptepel")

public class PEL extends Compte {

    //private static final long serialVersionUID = 1L;

    //constructeur par défaut
    public PEL(){
    }

    //constructeur avec paramètres
    /*public PEL(Long id, Date date, Long mont, Long plaf, String login)
    {
        super(id , mont , plaf, date, login);
    }*/

    public String toString(){
        return String.format("PEL[%s]",super.toString());
    }
}
