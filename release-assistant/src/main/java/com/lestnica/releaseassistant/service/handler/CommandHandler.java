package com.lestnica.releaseassistant.service.handler;

// import org.aspectj.bridge.Message;
// import org.jvnet.hk2.annotations.Service;
import org.springframework.stereotype.Service;
import org.telegram.telegrambots.meta.api.interfaces.BotApiObject;
import org.telegram.telegrambots.meta.api.methods.BotApiMethod;
import org.telegram.telegrambots.meta.api.objects.Message;

import com.lestnica.releaseassistant.bot.Bot;
import com.lestnica.releaseassistant.service.contract.AbstractHandler;
import com.lestnica.releaseassistant.service.manager.MainManager;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

@Service
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequiredArgsConstructor
public class CommandHandler extends AbstractHandler{
    MainManager mainManager;

    @Override
    public BotApiMethod<?> answer(BotApiObject object, Bot bot) {
        var message = (Message) object;
        if ("/start".equals(message.getText())) {
            return mainManager.answerCommand(message, bot);
        }
        throw new UnsupportedOperationException();
    }
}