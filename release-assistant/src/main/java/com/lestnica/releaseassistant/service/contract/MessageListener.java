package com.lestnica.releaseassistant.service.contract;

import org.telegram.telegrambots.meta.api.methods.BotApiMethod;
import org.telegram.telegrambots.meta.api.objects.Message;
import com.lestnica.releaseassistant.bot.Bot;

public interface MessageListener {
    BotApiMethod<?> answerMessage(Message message, Bot bot);
}
