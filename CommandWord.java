/**
 * Representations for all the valid command words for the game
 * along with a string in a particular language.
 * 
 * @author  Ben Suarez
 * @version 2021.03.21
 */
public enum CommandWord
{
    // A value for each command word along with its
    // corresponding user interface string.
    GO("go"), QUIT("quit"), HELP("help"), UNKNOWN("?"), LOOK("look"), EAT("eat");
    
    // The command string.
    private String commandString;
    
    private static final String[] validCommands = 
    {"go", "quit", "help", "look", "eat"};
    
    /**
     * Initialise with the corresponding command string.
     * @param commandString The command string.
     */
    CommandWord(String commandString)
    {
        this.commandString = commandString;
    }
    
    /**
     * @return The command word as a string.
     */
    public String toString()
    {
        return commandString;
    }
    
    /**
     * This helps print out every command that is created.
     */
    public void showAll()
    {
        for(String command : validCommands)
        {
            System.out.print(command + " ");
        }
        System.out.println();
    }
}
