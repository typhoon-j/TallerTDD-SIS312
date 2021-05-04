package tll.edu.ucb.TestPackage;


import org.junit.Test;
import org.junit.rules.ExpectedException;
import tll.edu.ucb.SourcePackage.Elevator;
import static org.junit.Assert.*;

public class ElevatorTest {


    private int person = 0;

    private void createPerson(){
        int max = 3;
        int min = 1;
        person = (int)Math.floor(Math.random()*(max-min+1)+min);
        System.out.println("Persona: " + person);
    }

    @Test
    public void verifyFirstPosition() {

        //Preparacion de la prueba
        Elevator elevator = new Elevator();

        //Logica de la prueba


        //Verificacion o Assert
        assertEquals("Primer Piso", elevator.firstPosition());
    }

    @Test
    public void CallandDestination(){

        //Preparacion de la prueba
        Elevator elevator = new Elevator();

        //Logica de la prueba

        //Verificacion o Assert
        createPerson();
        elevator.callElevator(person);
        elevator.destinationElevator(3);
    }




}