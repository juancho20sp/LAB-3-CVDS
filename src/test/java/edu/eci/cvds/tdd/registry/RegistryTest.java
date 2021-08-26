package edu.eci.cvds.tdd.registry;

import org.junit.Assert;
import org.junit.Test;

public class RegistryTest {
    private Registry registry = new Registry();

    @Test
    public void validateRegisteredPeople() {
        int prevLength = registry.registeredPeople.size();

        Person person = new Person("Harry Potter", 5785247, 35, Gender.MALE, true);

        RegisterResult result = registry.registerVoter(person);

        Assert.assertEquals(++prevLength, registry.registeredPeople.size());
    }

    @Test
    public void validateRegistryResult() {
        Person person = new Person("Laura Garcia", 2160640, 21, Gender.FEMALE, true);

        RegisterResult result = registry.registerVoter(person);

        Assert.assertEquals(RegisterResult.VALID, result);
    }

    @Test
    public void validateDeadPeopleRegister() {
        Person person = new Person("Valentina León", 9167644, 19, Gender.FEMALE, false);

        RegisterResult result = registry.registerVoter(person);

        Assert.assertEquals(RegisterResult.DEAD, result);
    }

    @Test
    public void validateUnderagePeopleRegister() {
        Person person = new Person("Benito Bunny", 444444469, 15, Gender.MALE, true);

        RegisterResult result = registry.registerVoter(person);

        Assert.assertEquals(RegisterResult.UNDERAGE, result);
    }

    @Test
    public void validateNegativeAgeRegister() {
        Person person = new Person("Bob Esponja", 3657840, -28, Gender.UNIDENTIFIED, true);

        RegisterResult result = registry.registerVoter(person);

        Assert.assertEquals(RegisterResult.INVALID_AGE, result);
    }

    @Test
    public void validateExtremelyBigAgeRegister() {
        Person person = new Person("Patricio Estrella", 8796584, 123, Gender.UNIDENTIFIED, true);

        RegisterResult result = registry.registerVoter(person);

        Assert.assertEquals(RegisterResult.INVALID_AGE, result);
    }

    @Test
    public void validateDuplicateRegister() {
        Person person = new Person("Juan Murillo", 2172577, 21, Gender.MALE, true);
        Person duplicate = new Person("Juan Murillo", 2172577, 21, Gender.MALE, true);

        RegisterResult result = registry.registerVoter(person);
        RegisterResult resultTwo = registry.registerVoter(duplicate);

        Assert.assertEquals(RegisterResult.DUPLICATED, resultTwo);
    }
}
