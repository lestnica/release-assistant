package com.lestnica.releaseassistant.service.contract;

import org.telegram.telegrambots.meta.api.interfaces.BotApiObject;
import org.telegram.telegrambots.meta.api.methods.BotApiMethod;
import com.lestnica.releaseassistant.bot.Bot;

public abstract class AbstractHandler {
    
    public abstract BotApiMethod<?> answer(BotApiObject object, Bot bot);
}
