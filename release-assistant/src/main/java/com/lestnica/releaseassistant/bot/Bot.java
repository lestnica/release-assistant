package com.lestnica.releaseassistant.bot;

import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramWebhookBot;
import org.telegram.telegrambots.meta.api.methods.BotApiMethod;
import org.telegram.telegrambots.meta.api.objects.Update;

import com.lestnica.releaseassistant.config.TelegramProperties;
import com.lestnica.releaseassistant.service.UpdateDispatcher;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

@Component
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public final class Bot extends TelegramWebhookBot{

    TelegramProperties telegramProperties;
    UpdateDispatcher updateDispatcher;

    public Bot(TelegramProperties telegramProperties, UpdateDispatcher updateDispatcher) {
        super(telegramProperties.getToken());
        this.updateDispatcher = updateDispatcher;
        this.telegramProperties = telegramProperties;
    }


    @Override
    public BotApiMethod<?> onWebhookUpdateReceived(Update update) {
        
        return updateDispatcher.distribute(update, this);
    }

    @Override
    public String getBotPath() {
        return telegramProperties.getUrl();
    }

    @Override
    public String getBotUsername() {
        return telegramProperties.getName();
    }
    
}
