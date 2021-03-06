package com.gantao.jfinal.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseBank<M extends BaseBank<M>> extends Model<M> implements IBean {

	public void setBId(java.lang.String bId) {
		set("b_id", bId);
	}
	
	public java.lang.String getBId() {
		return getStr("b_id");
	}

	public void setBankName(java.lang.String bankName) {
		set("bank_name", bankName);
	}
	
	public java.lang.String getBankName() {
		return getStr("bank_name");
	}

}
