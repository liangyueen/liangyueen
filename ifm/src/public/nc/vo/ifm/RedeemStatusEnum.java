package nc.vo.ifm;

import nc.md.model.impl.MDEnum;
import nc.md.model.IEnumValue;
	
public class RedeemStatusEnum extends MDEnum{
	public RedeemStatusEnum(IEnumValue enumvalue){
		super(enumvalue);
	}
	public final static RedeemStatusEnum ���ύ = MDEnum.valueOf(RedeemStatusEnum.class,  Integer.valueOf(0));//���ύ
	public final static RedeemStatusEnum ����� = MDEnum.valueOf(RedeemStatusEnum.class,  Integer.valueOf(1));//������
	public final static RedeemStatusEnum ȫ����� = MDEnum.valueOf(RedeemStatusEnum.class,  Integer.valueOf(2));//ȫ�����
	public final static RedeemStatusEnum ������� = MDEnum.valueOf(RedeemStatusEnum.class,  Integer.valueOf(3));//�������
	//public final static RedeemStatusEnum FINISHED = MDEnum.valueOf(RedeemStatusEnum.class, 5);//�ѽ���
	//public final static RedeemStatusEnum FROZEN = MDEnum.valueOf(RedeemStatusEnum.class, 6);//�Ѷ���
	
} 