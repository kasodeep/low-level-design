package state;

public class WinnerState implements State {

    GumBallMachine gumBallMachine;

    public WinnerState(GumBallMachine gumBallMachine) {
        this.gumBallMachine = gumBallMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Please wait, we're already giving you a Gumball");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Please wait, we're already giving you a Gumball");
    }

    @Override
    public void turnCrank() {
        System.out.println("Turning again doesn't get you another gumball!");
    }

    @Override
    public void dispense() {
        gumBallMachine.releaseBall();

        if (gumBallMachine.getCount() == 0) {
            gumBallMachine.setState(gumBallMachine.getSoldOutState());
        } else {
            gumBallMachine.releaseBall();
            System.out.println("YOU'RE A WINNER! You got two gumBalls for your quarter");
            if (gumBallMachine.getCount() > 0) {
                gumBallMachine.setState(gumBallMachine.getNoQuarterState());
            } else {
                System.out.println("Oops, out of gumBalls!");
                gumBallMachine.setState(gumBallMachine.getSoldOutState());
            }
        }
    }

    @Override
    public void refill() {

    }
}
