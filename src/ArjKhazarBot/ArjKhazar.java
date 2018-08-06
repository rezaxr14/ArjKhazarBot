package ArjKhazarBot;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.telegram.telegrambots.api.methods.send.SendMessage;
import org.telegram.telegrambots.api.methods.send.SendPhoto;
import org.telegram.telegrambots.api.objects.PhotoSize;
import org.telegram.telegrambots.api.objects.Update;
import org.telegram.telegrambots.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.api.objects.replykeyboard.ReplyKeyboardRemove;
import org.telegram.telegrambots.api.objects.replykeyboard.buttons.KeyboardRow;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.exceptions.TelegramApiException;

public class ArjKhazar extends TelegramLongPollingBot {

    @Override
    public String getBotToken() {
        return "654268320:AAFuVWDR-XRuoqHB9ev4FBjW-7QW6TVQTBU";
    }

    @Override
    public void onUpdateReceived(Update update) {
        if (update.hasMessage() && update.getMessage().hasText()) {
            long chat_id = update.getMessage().getChatId();
            if (update.getMessage().getText().equals("/start")) {
                String message_text = "برای انتخاب محصول روی /mark_up بزنید!";
                SendMessage sendmessage = new SendMessage()
                        .setChatId(chat_id).setText(message_text);
                try {
                    sendMessage(sendmessage);
                } catch (TelegramApiException ex) {
                    Logger.getLogger(ArjKhazar.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else if (update.getMessage().getText().equals("/mark_up")) {
                ReplyKeyboardMarkup keyboardMarkup = new ReplyKeyboardMarkup();
                List<KeyboardRow> keyboard = new ArrayList<>();
                KeyboardRow row = new KeyboardRow();
                row.add("هود");
                row.add("اجاق گاز");
                keyboard.add(row);
                row = new KeyboardRow();
                row.add("ارتباط با ما");
                row.add("بستن");
                keyboard.add(row);
                keyboardMarkup.setKeyboard(keyboard);
                SendMessage sendmessage = new SendMessage()
                        .setText("لطفا محصول مورد نظر را انتخاب کنید!").setChatId(chat_id).setReplyMarkup(keyboardMarkup);
                try {
                    sendMessage(sendmessage);
                } catch (TelegramApiException ex) {
                    Logger.getLogger(ArjKhazar.class.getName()).log(Level.SEVERE, null, ex);
                }

            } else if (update.getMessage().getText().equals("هود")) {
                ReplyKeyboardMarkup keyboardMarkup = new ReplyKeyboardMarkup();
                List<KeyboardRow> keyboard = new ArrayList<>();
                KeyboardRow row = new KeyboardRow();
                row.add("هود جک دار (سفید) 201");
                row.add("هود جک دار 201");
                keyboard.add(row);
                row = new KeyboardRow();
                row.add("هود جک دار 202");
                row.add("بازگشت");
                keyboard.add(row);
                keyboardMarkup.setKeyboard(keyboard);
                SendMessage hood = new SendMessage()
                        .setText("دسته بندی هود" + "\n" + "لطفا محصول مورد نظر را انتخاب کنید!").setChatId(chat_id).setReplyMarkup(keyboardMarkup);
                try {
                    sendMessage(hood);
                } catch (TelegramApiException ex) {
                    Logger.getLogger(ArjKhazar.class.getName()).log(Level.SEVERE, null, ex);
                }

            } else if (update.getMessage().getText().equals("اجاق گاز")) {

                ReplyKeyboardMarkup keyboardMarkup = new ReplyKeyboardMarkup();
                List<KeyboardRow> keyboard = new ArrayList<>();
                KeyboardRow row = new KeyboardRow();
                row.add("اجاق گاز شیشه ای");
                keyboard.add(row);
                row = new KeyboardRow();
                row.add("اجاق گاز استیل");
                keyboard.add(row);
                row = new KeyboardRow();
                row.add("بازگشت");
                keyboard.add(row);
                keyboardMarkup.setKeyboard(keyboard);
                SendMessage ojag = new SendMessage()
                        .setText("دسته بندی اجاق گاز رومیزی" + "\n" + "لطفا محصول مورد نظر را انتخاب کنید!").setChatId(chat_id).setReplyMarkup(keyboardMarkup);
                try {
                    sendMessage(ojag);
                } catch (TelegramApiException ex) {
                    Logger.getLogger(ArjKhazar.class.getName()).log(Level.SEVERE, null, ex);
                }

            } else if (update.getMessage().getText().equals("ارتباط با ما")) {
                String message = "برای اگاهی از اخرین قیمت ها وسفارش میتوانید با ایدی ادمین ویا شمارهی ادمین در تماس باشد \n"
                        + "ایدی ادمین : @Abolfaz_na71\n"
                        + "شماره ی تلفن :09148469188  ";
                SendMessage sendMessage = new SendMessage()
                        .setText(message).setChatId(chat_id);
                try {
                    sendMessage(sendMessage);
                } catch (TelegramApiException ex) {
                    Logger.getLogger(ArjKhazar.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else if (update.getMessage().getText().equals("بستن")) {
                ReplyKeyboardRemove keyboardRemove = new ReplyKeyboardRemove();
                SendMessage bastan = new SendMessage().setChatId(chat_id).setReplyMarkup(keyboardRemove)
                        .setText("کیبورد برای شما بسته شد برای باز کردن مجدد /mark_up رو بفرستید");
                try {
                    sendMessage(bastan);
                } catch (TelegramApiException ex) {
                    Logger.getLogger(ArjKhazar.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else if (update.getMessage().getText().equals("بازگشت")) {
                ReplyKeyboardMarkup keyboardMarkup = new ReplyKeyboardMarkup();
                List<KeyboardRow> keyboard = new ArrayList<>();
                KeyboardRow row = new KeyboardRow();
                row.add("هود");
                row.add("اجاق گاز");
                keyboard.add(row);
                row = new KeyboardRow();
                row.add("ارتباط با ما");
                row.add("بستن");
                keyboard.add(row);
                keyboardMarkup.setKeyboard(keyboard);
                SendMessage sendmessage = new SendMessage()
                        .setText("لطفا محصول مورد نظر را انتخاب کنید!").setChatId(chat_id).setReplyMarkup(keyboardMarkup);
                try {
                    sendMessage(sendmessage);
                } catch (TelegramApiException ex) {
                    Logger.getLogger(ArjKhazar.class.getName()).log(Level.SEVERE, null, ex);
                }

            } else if (update.getMessage().getText().equals("هود جک دار 201")) {
                String caption = "هود جک دار 201 \n" + "قیمت : \n" + "برای بازگشت روی /mark_up بزمید";
                String image_id = "AgADBAADkawxG7CekVJWVBu09URYo_m4mxoABHEPeqeJ4tcIOCoDAAEC";
                SendPhoto hood = new SendPhoto().setCaption(caption).setPhoto(image_id).setChatId(chat_id);
                try {
                    sendPhoto(hood);
                } catch (TelegramApiException ex) {
                    Logger.getLogger(ArjKhazar.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else if (update.getMessage().getText().equals("هود جک دار 202")) {
                String caption = "هود جک دار 202 \n" + "قیمت : \n" + "برای بازگشت روی /mark_up بزمید";
                String image_id = "AgADBAAD4q0xGwSmqVIRvaglUc5WTB8cnRoABPV3RC0jA6MYgDUDAAEC";
                SendPhoto hood = new SendPhoto().setCaption(caption).setPhoto(image_id).setChatId(chat_id);
                try {
                    sendPhoto(hood);
                } catch (TelegramApiException ex) {
                    Logger.getLogger(ArjKhazar.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else if (update.getMessage().getText().equals("هود جک دار (سفید) 201")) {
                String caption = "هود جک دار (سفید) 201 \n" + "قیمت : \n" + "برای بازگشت روی /mark_up بزمید";
                String image_id = "AgADBAADjqwxG7CekVLxgkpeyQg9WrjtkBkABIi0pDZkTyuEk6oDAAEC";
                SendPhoto hood = new SendPhoto().setCaption(caption).setPhoto(image_id).setChatId(chat_id);
                try {
                    sendPhoto(hood);
                } catch (TelegramApiException ex) {
                    Logger.getLogger(ArjKhazar.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else if (update.getMessage().getText().equals("اجاق گاز شیشه ای")) {

                ReplyKeyboardMarkup keyboardMarkup = new ReplyKeyboardMarkup();
                List<KeyboardRow> keyboard = new ArrayList<>();
                KeyboardRow row = new KeyboardRow();
                row.add("اجاق گاز شیشه ای (پلولپز وسط)");
                row.add("اجاق گاز شیشه ای (پلولپز کنار)");
                keyboard.add(row);
                row = new KeyboardRow();
                row.add("اجاق گاز شیشه ای (پلولپز وسط دورنگ)");
                row.add("اجاق گاز شیشه ای (پلولپز وسط سفید)");
                keyboard.add(row);
                row = new KeyboardRow();
                row.add("اجاق گاز شیشه ای (4 شعله)");
                row.add("بازگشت");
                row.add("اجاق گاز شیشه ای (2 شعله)");
                keyboard.add(row);
                keyboardMarkup.setKeyboard(keyboard);
                SendMessage ojagsh = new SendMessage()
                        .setText("دسته بندی اجاق گاز شیشه ای" + "\n" + "لطفا محصول مورد نظر را انتخاب کنید!").setChatId(chat_id).setReplyMarkup(keyboardMarkup);
                try {
                    sendMessage(ojagsh);
                } catch (TelegramApiException ex) {
                    Logger.getLogger(ArjKhazar.class.getName()).log(Level.SEVERE, null, ex);
                }

            } else if (update.getMessage().getText().equals("اجاق گاز استیل")) {

                ReplyKeyboardMarkup keyboardMarkup = new ReplyKeyboardMarkup();
                List<KeyboardRow> keyboard = new ArrayList<>();
                KeyboardRow row = new KeyboardRow();
                row.add("اجاق گاز صفحه استیل طرح بوش پلوپز وسط");
                row.add("اجاق گاز صفحه استیل طرح بوش کنار");
                keyboard.add(row);
                row = new KeyboardRow();
                row.add("اجاق گاز صفحه استیل اپکس پلوپز وسط");
                row.add("اجاق گازصفحه استیل اپکس پلولپز کنار");
                keyboard.add(row);
                row = new KeyboardRow();
                row.add("اجاق گاز صفحه استیل خزر");
                row.add("بازگشت");
                row.add("اجاق گاز صفحه استیل فافا");
                keyboard.add(row);
                keyboardMarkup.setKeyboard(keyboard);
                SendMessage ojagsh = new SendMessage()
                        .setText("دسته بندی اجاق گاز استیل" + "\n" + "لطفا محصول مورد نظر را انتخاب کنید!").setChatId(chat_id).setReplyMarkup(keyboardMarkup);
                try {
                    sendMessage(ojagsh);
                } catch (TelegramApiException ex) {
                    Logger.getLogger(ArjKhazar.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else if (update.getMessage().getText().equals("اجاق گاز صفحه استیل طرح بوش پلوپز وسط")) {
                String Caption = "" + "\n برای بازگشت بر روی /mark_up کلیک کنید";
                String Image_Id = "AgADBAADmqwxG7CekVK9SAfDKSSjYa5VNBoABOxumQqqq8ptZLAEAAEC";
                SendPhoto sendPhoto = new SendPhoto().setCaption(Caption).setChatId(chat_id).setPhoto(Image_Id);
                try {
                    sendPhoto(sendPhoto);
                } catch (TelegramApiException ex) {
                    Logger.getLogger(ArjKhazar.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else if (update.getMessage().getText().equals("اجاق گاز صفحه استیل طرح بوش کنار")) {
                String Caption = "" + "\n برای بازگشت بر روی /mark_up کلیک کنید";
                String Image_Id = "AgADBAADm6wxG7CekVLvH8oGfu9GjsZ5mhoABNFIXPWxNYS4RycDAAEC";
                SendPhoto sendPhoto = new SendPhoto().setCaption(Caption).setChatId(chat_id).setPhoto(Image_Id);
                try {
                    sendPhoto(sendPhoto);
                } catch (TelegramApiException ex) {
                    Logger.getLogger(ArjKhazar.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else if (update.getMessage().getText().equals("اجاق گاز صفحه استیل اپکس پلوپز وسط")) {
                String Caption = "" + "\n برای بازگشت بر روی /mark_up کلیک کنید";
                String Image_Id = "AgADBAADmawxG7CekVKjPnZOoq0z0_31kBkABC1Ek_bq4ZDfX7EDAAEC";
                SendPhoto sendPhoto = new SendPhoto().setCaption(Caption).setChatId(chat_id).setPhoto(Image_Id);
                try {
                    sendPhoto(sendPhoto);
                } catch (TelegramApiException ex) {
                    Logger.getLogger(ArjKhazar.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else if (update.getMessage().getText().equals("اجاق گازصفحه استیل اپکس پلولپز کنار")) {
                String Caption = "" + "\n برای بازگشت بر روی /mark_up کلیک کنید";
                String Image_Id = "AgADBAADmKwxG7CekVJO97b6cKJAxAslnRoABOudFktYFbzDhSsDAAEC";
                SendPhoto sendPhoto = new SendPhoto().setCaption(Caption).setChatId(chat_id).setPhoto(Image_Id);
                try {
                    sendPhoto(sendPhoto);
                } catch (TelegramApiException ex) {
                    Logger.getLogger(ArjKhazar.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else if (update.getMessage().getText().equals("اجاق گاز صفحه استیل خزر")) {
                String Caption = "" + "\n برای بازگشت بر روی /mark_up کلیک کنید";
                String Image_Id = "AgADBAADnKwxG7CekVJBBcgC5FwbTLeYnRoABKEydtUj-sREvyQDAAEC";

                SendPhoto sendPhoto = new SendPhoto().setCaption(Caption).setChatId(chat_id).setPhoto(Image_Id);
                try {
                    sendPhoto(sendPhoto);
                } catch (TelegramApiException ex) {
                    Logger.getLogger(ArjKhazar.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else if (update.getMessage().getText().equals("اجاق گاز صفحه استیل فافا")) {
                String Caption = "" + "\n برای بازگشت بر روی /mark_up کلیک کنید";
                String Image_Id = "AgADBAADnawxG7CekVJ6SV0uWRzPT1OwoBoABI72F6kwtFkMRBYBAAEC";
                SendPhoto sendPhoto = new SendPhoto().setCaption(Caption).setChatId(chat_id).setPhoto(Image_Id);
                try {
                    sendPhoto(sendPhoto);
                } catch (TelegramApiException ex) {
                    Logger.getLogger(ArjKhazar.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else if (update.getMessage().getText().equals("اجاق گاز شیشه ای (پلولپز وسط)")) {
                String Caption = "" + "\n برای بازگشت بر روی /mark_up کلیک کنید";
                String Image_Id = "AgADBAADk6wxG7CekVI8pw_9ZdqBBvYKmhoABIFmN8ec1hajOSkDAAEC";
                SendPhoto sendPhoto = new SendPhoto().setCaption(Caption).setChatId(chat_id).setPhoto(Image_Id);
                try {
                    sendPhoto(sendPhoto);
                } catch (TelegramApiException ex) {
                    Logger.getLogger(ArjKhazar.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else if (update.getMessage().getText().equals("اجاق گاز شیشه ای (پلولپز کنار)")) {
                String Caption = "" + "\n برای بازگشت بر روی /mark_up کلیک کنید";
                String Image_Id = "AgADBAADkqwxG7CekVJfNSSBTnVtCp1UNBoABBJF5sgan_RCTbUEAAEC";
                SendPhoto sendPhoto = new SendPhoto().setCaption(Caption).setChatId(chat_id).setPhoto(Image_Id);
                try {
                    sendPhoto(sendPhoto);
                } catch (TelegramApiException ex) {
                    Logger.getLogger(ArjKhazar.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else if (update.getMessage().getText().equals("اجاق گاز شیشه ای (پلولپز وسط دورنگ)")) {
                String Caption = "" + "\n برای بازگشت بر روی /mark_up کلیک کنید";
                String Image_Id = "AgADBAADlKwxG7CekVKz--xbqw0mw8J5mhoABJPHkk7zf7U1uyQDAAEC";
                SendPhoto sendPhoto = new SendPhoto().setCaption(Caption).setChatId(chat_id).setPhoto(Image_Id);
                try {
                    sendPhoto(sendPhoto);
                } catch (TelegramApiException ex) {
                    Logger.getLogger(ArjKhazar.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else if (update.getMessage().getText().equals("اجاق گاز شیشه ای (پلولپز وسط سفید)")) {
                String Caption = "" + "\n برای بازگشت بر روی /mark_up کلیک کنید";
                String Image_Id = "AgADBAADlawxG7CekVJ3Ts2IeXgSkLJXkRoABGmdgLJQHutr7ckDAAEC";
                SendPhoto sendPhoto = new SendPhoto().setCaption(Caption).setChatId(chat_id).setPhoto(Image_Id);
                try {
                    sendPhoto(sendPhoto);
                } catch (TelegramApiException ex) {
                    Logger.getLogger(ArjKhazar.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else if (update.getMessage().getText().equals("اجاق گاز شیشه ای (4 شعله)")) {
                String Caption = "" + "\n برای بازگشت بر روی /mark_up کلیک کنید";
                String Image_Id = "AgADBAADlqwxG7CekVJL-RyO_U0zSnsmnRoABCzOIM5FuIF6KSsDAAEC";
                SendPhoto sendPhoto = new SendPhoto().setCaption(Caption).setChatId(chat_id).setPhoto(Image_Id);
                try {
                    sendPhoto(sendPhoto);
                } catch (TelegramApiException ex) {
                    Logger.getLogger(ArjKhazar.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else if (update.getMessage().getText().equals("اجاق گاز شیشه ای (2 شعله)")) {
                String Caption = "" + "\n برای بازگشت بر روی /mark_up کلیک کنید";
                String Image_Id = "AgADBAADl6wxG7CekVL7kksz-uWjo1X4mxoABFHugKObEDhY9ScDAAEC";
                SendPhoto sendPhoto = new SendPhoto().setCaption(Caption).setChatId(chat_id).setPhoto(Image_Id);
                try {
                    sendPhoto(sendPhoto);
                } catch (TelegramApiException ex) {
                    Logger.getLogger(ArjKhazar.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                try {
                    sendMessage( new SendMessage().setText("ورودی نامشخص برای راهنمای و بازدید از محصولات میتوانید از /mark_up استفاده کنید").setChatId(chat_id));
                } catch (TelegramApiException ex) {
                    Logger.getLogger(ArjKhazar.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            

        }
//            else if (update.hasMessage() && update.getMessage().hasPhoto()) {
//                long chat_id = update.getMessage().getChatId();
//            List<PhotoSize> photo = update.getMessage().getPhoto();
//            String f_id = photo.stream().sorted(Comparator.comparing(PhotoSize::getFileSize).reversed())
//                    .findFirst().orElse(null).getFileId();
//            String caption = "File id : " + f_id;
//          SendPhoto message = new SendPhoto()
//                    .setChatId(chat_id).setPhoto(f_id).setCaption(caption);
//            try {
//                sendPhoto(message);
//            } catch (Exception e) {
//            }
//
//        }
    }

    @Override
    public String getBotUsername() {
        return "arjkhazarbot";
    }

}
