package com.hengyi.fastim.packet;

/**
 * @author dongzp
 * 扩展消息类型
 */
public class ExtraMsgType {
    /** 默认的扩展属性 */
    public final static int DEFALUT_EXTRA_TYPE = 0;
    /** 发起好友申请 */
    public final static int SEND_FRIENDS_APPLY = 1;
    /** 接收好友申请结果 */
    public final static int RECEIVE_FRIENDS_APPLY = 2;
    /** 文本消息 */
    public final static int MSG_TEXT_TYPE = 3;
    /** 图片消息 */
    public final static int MSG_IMAGE_TYPE = 4;
    /** 视频消息 */
    public final static int MSG_VIDEO_TYPE = 5;
    /** 文件消息 */
    public final static int MSG_FILE_TYPE = 6;
    /** 语音消息 */
    public final static int MSG_VOICE_TYPE = 7;
    /** 语音通话 */
    public final static int MSG_VOICE_CALL_TYPE = 8;
    /** 视频通话 */
    public final static int MSG_VIDEO_CALL_TYPE = 9;
    /** 位置消息 */
    public final static int MSG_LOCATION_TYPE = 10;
    /** 名片消息 */
    public final static int MSG_BUSINESS_CARD_TYPE = 11;
    /** 系统消息 */
    public final static int MSG_SYSTEM_TYPE = 12;

}
