public class Main {
    public static void main(String[] args) {
        Database database = new Database();
        Command deleteCommand= new DeleteCommand(database);
        Command selecteCommand = new SelectCommand(database);
        Command updateCommand = new UpdateCommand(database);
        WorkingWithDatabase workingWithDatabase = new WorkingWithDatabase(deleteCommand,selecteCommand,updateCommand);
        workingWithDatabase.deletInformation();
        workingWithDatabase.selectInformation();
        workingWithDatabase.updateInformation();

    }
}