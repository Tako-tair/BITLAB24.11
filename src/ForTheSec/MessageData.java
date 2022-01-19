package ForTheSec;

import java.io.Serializable;
import java.util.Date;

public class MessageData implements Serializable {
    String userName;
    String messageText;
    Date sentDate;

    public MessageData() {
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getMessageText() {
        return messageText;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }

    public MessageData(String userName, String messageText) {
        this.userName = userName;
        this.messageText = messageText;

    }
}
