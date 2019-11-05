package com.hengyi.fastim.packet;
/*
 * 消息包类型
 */
public class MsgType {
    //登录请求
    public final static int LOGIN_REQUEST_TYPE = 1;
    //退出请求
    public final static int LOGOUT_REQUEST_TYPE = 2;
    //发送文本聊天
    public final static int CHAT_TEXT_REQUEST_TYPE = 3;
    //心跳包请求
    public final static int HERAT_REQUEST_TYPE = 4;
    //好友上线下线通知
    public final static int CONTACT_STATUS_CHANGE_TYPE = 5;
    //主动检查是否有离线消息
    public final static int CHECK_OUTLINE_MESSAGE_TYPE = 6;
    //添加好友请求
    public final static int ADD_CONTACT_REQUEST_TYPE = 7;
    //发送图片消息
    public final static int CHAT_IMAGE_REQUEST_TYPE = 8;
}