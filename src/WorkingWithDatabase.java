public class WorkingWithDatabase {
    private Command delet;
    private Command select;
    private Command update;

    public WorkingWithDatabase(Command delet, Command select, Command update) {
        this.delet = delet;
        this.select = select;
        this.update = update;
    }

    void deletInformation() {
        delet.execute();
    }
    void selectInformation() {
        select.execute();
    }

    void updateInformation() {
        update.execute();
    }
}
