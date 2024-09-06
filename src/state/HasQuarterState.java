package state;

import java.util.Random;

public class HasQuarterState implements State {

    Random randomWinner = new Random(System.currentTimeMillis());

    GumBallMachine gumBallMachine;

    public HasQuarterState(GumBallMachine gumballMachine) {
        this.gumBallMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You can't insert another quarter");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Quarter returned");
        gumBallMachine.setState(gumBallMachine.getNoQuarterState());
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned...");
        int winner = randomWinner.nextInt(10);

        if ((winner == 0) && (gumBallMachine.getCount() > 1)) {
            gumBallMachine.setState(gumBallMachine.getWinnerState());
        } else {
            gumBallMachine.setState(gumBallMachine.getSoldState());
        }
    }

    @Override
    public void dispense() {
        System.out.println("No gumball dispensed");
    }

    @Override
    public void refill() {

    }
}
