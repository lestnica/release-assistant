package com.lestnica.releaseassistant.service.contract;

// import org.aspectj.bridge.Message;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.methods.BotApiMethod;
import com.lestnica.releaseassistant.bot.Bot;

public interface CommandListener {

    BotApiMethod<?> answerCommand(Message message, Bot bot);
    
} 