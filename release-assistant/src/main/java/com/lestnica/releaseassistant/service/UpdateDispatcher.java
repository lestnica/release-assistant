package com.lestnica.releaseassistant.service;

import org.springframework.stereotype.Service;
import org.telegram.telegrambots.meta.api.methods.BotApiMethod;
import org.telegram.telegrambots.meta.api.objects.Update;

import com.lestnica.releaseassistant.bot.Bot;
import com.lestnica.releaseassistant.service.handler.CallbackQueryHandler;
import com.lestnica.releaseassistant.service.handler.CommandHandler;
import com.lestnica.releaseassistant.service.handler.MessageHandler;
import com.lestnica.releaseassistant.repo.UserRepository;
import com.lestnica.releaseassistant.entity.User;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class UpdateDispatcher {
    MessageHandler messageHandler;
    CommandHandler commandHandler;
    CallbackQueryHandler queryHandler;

    public BotApiMethod<?> distribute(Update update, Bot bot) {
        
        if (update.hasCallbackQuery()) {
            
            return queryHandler.answer(update.getCallbackQuery(), bot);
        }
        if (update.hasMessage()) {
            var message = update.getMessage();
            if (message.hasText()) {
                if (message.getText().charAt(0) == '/') {
                    return commandHandler.answer(message, bot);
                }
                return messageHandler.answer(message, bot);
            }
        }

        log.warn("Unsupported update type " + update);
        return null;
    }
    
}
