package com.hengyi.fastim.packet;

/**
 * @author dongzp
 * 扩展消息包
 */
public class ExtraMsgType {
    /** 默认的扩展属性 */
    public final static int DEFALUT_EXTRA_TYPE = 0;
    /** 发起好友申请 */
    public final static int SEND_FRIENDS_APPLY = 1;
    /** 接收好友申请结果 */
    public final static int RECEIVE_FRIENDS_APPLY = 2;
    /** 图片消息 */
    public final static int MSG_IMAGE_TYPE = 3;
    /** 视频消息 */
    public final static int MSG_VIDEO_TYPE = 4;
    /** 文档消息 */
    public final static int MSG_DOC_TYPE = 5;
    /** 语音消息 */
    public final static int MSG_VOICE_TYPE = 6;
    /** 语音通话 */
    public final static int MSG_VOICE_CALL_TYPE = 7;
    /** 视频通话 */
    public final static int MSG_VIDEO_CALL_TYPE = 8;

}
