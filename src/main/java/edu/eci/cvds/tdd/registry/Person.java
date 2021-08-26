package edu.eci.cvds.tdd.registry;

/**
 * Person representation Class
 */
public class Person {

    /**
     * Person's name
     */
    private String name;

    /**
     * A person's identification number
     */
    private int id;

    /**
     * Person's age
     */
    private int age;

    /**
     * Person's gender
     */
    private Gender gender;

    /**
     * Flag to specify if a person is alive
     */
    private boolean alive;

    /**
     * The class' default constructor
     */
    public Person() {
        // TODO: Revisar por qué hay un super()
        super();
    }

    /**
     * A person constructor with all the information
     *
     * @param name the name
     * @param id the identification number
     * @param age the age
     * @param gender the gender
     * @param alive if the person is alive
     */
    public Person(String name, int id, int age, Gender gender, boolean alive) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.gender = gender;
        this.alive = alive;
    }

    /**
     * Returns the person name
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the person identification number
     *
     * @return the identification Number
     */
    public int getId() {
        return id;
    }

    /**
     * Returns this person's age
     *
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * Returns the gender
     *
     * @return the gender
     */
    public Gender getGender() {
        return gender;
    }

    /**
     * Returns if the person is alive
     *
     * @return the alive
     */
    public boolean isAlive() {
        return alive;
    }

    /**
     * Sets the person name
     *
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets the person identification number
     *
     * @param id the identification Number to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Sets the person age
     *
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Sets the person gender
     *
     * @param gender the gender to set
     */
    public void setGender(Gender gender) {
        this.gender = gender;
    }

    /**
     * Sets the flag to specify if this person is alive
     *
     * @param alive the alive to set
     */
    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    /**
     * @{inheritdoc}
     */
    @Override
    public String toString() {
        return "Person [name=" + name + ", id=" + id + ", age=" + age + ", gender=" + gender + ", alive=" + alive + "]";
    }

}
