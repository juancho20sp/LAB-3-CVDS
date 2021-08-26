package edu.eci.cvds.tdd.registry;

import java.util.ArrayList;

public class Registry {

    public ArrayList<Person> registeredPeople = new ArrayList<Person>();

    public RegisterResult registerVoter(Person p) {
        /**
         * Solo se registrarán votantes válidos
         * Solo se permite una inscripción por número de documento
         * DEAD, UNDERAGE, INVALID_AGE, VALID, DUPLICATED;
         */

        if (!p.isAlive()){
            return RegisterResult.DEAD;
        }

        if (p.getAge() >= 0 && p.getAge() < 18){
            return RegisterResult.UNDERAGE;
        }

        if (p.getAge() < 0 || p.getAge() > 122){
            return RegisterResult.INVALID_AGE;
        }

        for (Person registeredPerson : registeredPeople){
            if (p.getId() == registeredPerson.getId()){
                return RegisterResult.DUPLICATED;
            }
        }

        registeredPeople.add(p);

        return RegisterResult.VALID;
    }
}
