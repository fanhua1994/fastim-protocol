package com.hengyi.fastim.packet;
/**
 * @author dongzp
 * 消息包类型
 */
public class MsgType {
    /** 登录请求 */
    public final static int LOGIN_TYPE = 1000;
    /** 退出请求 */
    public final static int LOGOUT_TYPE = 2000;
    /** 发送文本聊天 */
    public final static int CHAT_TEXT_TYPE = 3000;
    /** 发送附件消息 */
    public final static int CHAT_ACCESSORY_TYPE = 4000;
    /** 通话消息（语音、视频） */
    public final static int CHAT_CALL_TYPE = 10000;
    /** 心跳包请求 */
    public final static int HERAT_TYPE = 5000;
    /** 好友上线下线通知 */
    public final static int CONTACT_STATUS_CHANGE_TYPE = 6000;
    /** 主动检查是否有离线消息 */
    public final static int CHECK_OUTLINE_MESSAGE_TYPE = 7000;
    /** 添加好友请求 */
    public final static int ADD_CONTACT_REQUEST_TYPE = 8000;
    /**（文本、附件）消息发送回执消息 */
    public final static int MSG_ACK_TYPE = 9000;

}