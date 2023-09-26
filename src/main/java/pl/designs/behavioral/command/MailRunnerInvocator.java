package pl.designs.behavioral.command;

import java.util.ArrayList;

public class MailRunnerInvocator implements Runnable {


    private final ArrayList<Command> commandList;

    public MailRunnerInvocator() {
        this.commandList = new ArrayList<>();
    }

    @Override
    public void run() {

        while (true) {
            synchronized (commandList) {
                for (Command command : commandList) {
                    command.execute();
                    commandList.remove(command);
                }

                if (commandList.isEmpty()) {
                    try {
                        commandList.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }

    }


    public void addCommand(Command command) {
        synchronized (commandList) {
            commandList.add(command);
            commandList.notifyAll();
        }
    }
}
