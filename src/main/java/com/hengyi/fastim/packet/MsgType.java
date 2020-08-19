package com.hengyi.fastim.packet;
/**
 * @author dongzp
 * 消息类型
 */
public class MsgType {
    /** 登录请求 */
    public final static int LOGIN_TYPE = 10;
    /** 退出请求 */
    public final static int LOGOUT_TYPE = 20;
    /** 聊天消息 */
    public final static int CHAT_TYPE = 30;
    /** 心跳包请求 */
    public final static int HERAT_TYPE = 40;
    /** 服务端强制下线客户端 */
    public final static int FORCE_OFFLINE_CLIENT_TYPE = 50;
    /** 主动拉取离线消息 */
    public final static int PULL_OUTLINE_MESSAGE_TYPE = 60;
    /** 离线消息收到回执 */
    public final static int OUTLINE_MESSAGE_ACK_TYPE = 100;
    /** 添加联系人请求 */
    public final static int ADD_CONTACT_REQUEST_TYPE = 70;
    /**（文本、附件）消息发送回执消息 */
    public final static int MSG_SNED_ACK_TYPE = 80;
    /**（文本、附件）消息已读回执消息 */
    public final static int MSG_READ_ACK_TYPE = 90;

}