package com.scie.wechat.message.resp;
/**
 * 
 * @author Kyle
 * 
 */
public class BaseMessage {
	
	// ���շ��ʺţ��յ���OpenID�� 
	private String ToUserName;
	// ������΢�ź�
	private String FromUserName;
	// ��Ϣ����ʱ�� �����ͣ�
	private long CreateTime;
	// text
	private String MsgType;
	// λ0x0001����־ʱ���Ǳ���յ�����Ϣ  
//    private int FuncFlag;  

//	public int getFuncFlag() {
//		return FuncFlag;
//	}
//
//	public void setFuncFlag(int funcFlag) {
//		FuncFlag = funcFlag;
//	}

	public String getToUserName() {
		return ToUserName;
	}

	public void setToUserName(String toUserName) {
		ToUserName = toUserName;
	}

	public String getFromUserName() {
		return FromUserName;
	}

	public void setFromUserName(String fromUserName) {
		FromUserName = fromUserName;
	}

	public long getCreateTime() {
		return CreateTime;
	}

	public void setCreateTime(long createTime) {
		CreateTime = createTime;
	}

	public String getMsgType() {
		return MsgType;
	}

	public void setMsgType(String msgType) {
		MsgType = msgType;
	}

}