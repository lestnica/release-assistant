package com.lestnica.releaseassistant.service.manager;

// import org.aspectj.bridge.Message;
// import org.jvnet.hk2.annotations.Service;
import org.springframework.stereotype.Service;
import org.telegram.telegrambots.meta.api.methods.BotApiMethod;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.CallbackQuery;
import org.telegram.telegrambots.meta.api.objects.Message;


import com.lestnica.releaseassistant.bot.Bot;
import com.lestnica.releaseassistant.service.contract.AbstractManager;
import com.lestnica.releaseassistant.service.contract.CommandListener;
import com.lestnica.releaseassistant.service.contract.QueryListener;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class MainManager extends AbstractManager implements CommandListener, QueryListener{
    
    @Override
    public BotApiMethod<?> mainMenu(Message message, Bot bot) {
        return null;
    }

    @Override
    public BotApiMethod<?> mainMenu(CallbackQuery query, Bot bot) {
        return null;
    }

    @Override
    public BotApiMethod<?> answerCommand(Message message, Bot bot) {
        return greetings(message.getChatId());
    }

    @Override
    public BotApiMethod<?> answerQuery(CallbackQuery query, Bot bot) {
        return null;
    }

    private BotApiMethod<?> greetings(Long chatId) {
        return SendMessage.builder()
                .chatId(chatId)
                .text("HUJ")
                .build();
    }

    
}
