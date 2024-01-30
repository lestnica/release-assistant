package com.lestnica.releaseassistant.service.contract;

// import org.aspectj.bridge.Message;
import org.telegram.telegrambots.meta.api.methods.BotApiMethod;
import org.telegram.telegrambots.meta.api.objects.CallbackQuery;
import org.telegram.telegrambots.meta.api.objects.Message;

import com.lestnica.releaseassistant.bot.Bot;

public abstract class AbstractManager {
    
    public abstract BotApiMethod<?> mainMenu(Message message, Bot bot);
    public abstract BotApiMethod<?> mainMenu(CallbackQuery query, Bot bot);


}
