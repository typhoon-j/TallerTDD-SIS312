package tll.edu.ucb.SourcePackage;

public class Elevator {

    public int elevator = 1;

    public String firstPosition(){
        if (elevator == 1){
            return "Primer Piso";
        }
        return "No esta en el primer piso";
    }



    public String callElevator(int person){

        if (person != elevator && person >=1 && person <= 3) {
            elevator = person;
            System.out.println("Elevador: " + elevator);
            return "Elevador llego al piso";
        } else {
            System.out.println("Elevador en el piso");
            return "Elevador en el piso";
        }
    }

    public String destinationElevator(int destination){

        System.out.println(elevator);
        if (destination != elevator && destination >=1 && destination <= 3){
            elevator = destination;
            System.out.println("Elevador: " + elevator);
            return "Elevador en destino";
        } else{
            return "Destino inexistente o ya alcanzado";
        }

    }



}