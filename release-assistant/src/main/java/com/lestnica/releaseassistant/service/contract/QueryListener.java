package com.lestnica.releaseassistant.service.contract;

import org.telegram.telegrambots.meta.api.methods.BotApiMethod;
import org.telegram.telegrambots.meta.api.objects.CallbackQuery;
import com.lestnica.releaseassistant.bot.Bot;

public interface QueryListener {
    
    BotApiMethod<?> answerQuery(CallbackQuery query, Bot bot);
}
