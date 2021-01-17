package de.Leoo77.main;

import listeners.MessagesListener;
import org.javacord.api.DiscordApi;
import org.javacord.api.DiscordApiBuilder;
import config.BotProperties;

public class Main {

    public static void main(String[] args) throws Exception {

//        FallbackLoggerConfiguration.setTrace(true);
//        FallbackLoggerConfiguration.setDebug(true);

        DiscordApi api = new DiscordApiBuilder().setToken(BotProperties.getInstance().getToken()).login().join();

        api.addListener(new MessagesListener());

        System.out.println("Invite the Bot using following Link " + api.createBotInvite());

        api.updateActivity("!cap - BOY THATS CAP");

    }

}
