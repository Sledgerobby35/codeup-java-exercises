package warmup.company;

public class TeamLead implements TimeSheets, FirePower{

    @Override
    public void fillOutTimeSheets() {
        System.out.println("Team Lead is filling out Time Sheets");
    }

    @Override
    public void firePower() {
        System.out.println("You are fired, Later!");
    }
}
