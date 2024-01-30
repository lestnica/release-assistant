package com.lestnica.releaseassistant.service.handler;

// import org.jvnet.hk2.annotations.Service;
import org.springframework.stereotype.Service;
import org.telegram.telegrambots.meta.api.interfaces.BotApiObject;
import org.telegram.telegrambots.meta.api.methods.BotApiMethod;
import org.telegram.telegrambots.meta.api.objects.CallbackQuery;

import com.lestnica.releaseassistant.bot.Bot;
import com.lestnica.releaseassistant.service.contract.AbstractHandler;
import com.lestnica.releaseassistant.service.manager.MainManager;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class CallbackQueryHandler extends AbstractHandler{
    MainManager mainManager;

    @Override
    public BotApiMethod<?> answer(BotApiObject object, Bot bot) {
    var query = (CallbackQuery) object;
    throw new UnsupportedOperationException();
    }
}
