package com.lestnica.releaseassistant.service.handler;


// import org.aspectj.bridge.Message;
// import org.jvnet.hk2.annotations.Service;
import org.springframework.stereotype.Service;
import org.telegram.telegrambots.meta.api.interfaces.BotApiObject;
import org.telegram.telegrambots.meta.api.methods.BotApiMethod;
import org.telegram.telegrambots.meta.api.objects.Message;

import com.lestnica.releaseassistant.bot.Bot;
import com.lestnica.releaseassistant.service.contract.AbstractHandler;


import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class MessageHandler extends AbstractHandler {
    

    @Override
    public BotApiMethod<?> answer(BotApiObject object, Bot bot) {
        var message = (Message) object;
        throw new UnsupportedOperationException("Unimplemented method 'answer'");
    }
}
